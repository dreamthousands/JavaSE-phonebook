/** 
 * projectName: phonebook 
 * fileName: DataSave.java 
 * packageName: phonebook 
 * date: 2022年3月14日下午8:52:04 
 * copyright(c)
 */

package phonebook;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/**   
 * title: DataSave
 * description: 将电话本中的数据保存到 txt 文件中
 * @author: jxq
 * @since: 2022年3月14日 下午10:07:59 
 * @version: V1.0   
*/
public class DataSave {
	// @Fields directoryName: 文件夹
	private static final String directoryName = "./data/";

	// @Fields fileName: 文件名
	private static final String fileName = "data/phonebook.txt";

	/**
	 * title: createFile 
	 * description: 创建 txt 文件
	 */
	public static void createFile() {
		File directory = new File(directoryName);
		File file = new File(fileName);
		// 判断文件夹是否存在
		if (!directory.exists()) {
			directory.mkdir();
		}
		// 判断文件是否存在
		if (!file.exists()) {
			try {
				file.createNewFile();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	/**
	 * title: readFile 
	 * description: 读取文件并将文件内容放到 List 中
	 * @return: 返回列表
	 * @throws IOException
	 */
	public static List<Person> readFile() throws IOException {
		ArrayList<Person> list = new ArrayList<Person>();
		InputStreamReader isr = new InputStreamReader(new FileInputStream(fileName));
		BufferedReader br = new BufferedReader(isr);
		String line = null;
		try {
			while ((line = br.readLine()) != null) {
				Person obj = new Person();
				// 将读到的字符串分割
				String[] arr = line.split(",");
				if (arr.length == 6) {
					// 将读到的字符串分割，并得到相关数据
					obj.setId(Integer.parseInt(arr[0].split("=")[1]));
					obj.setName(arr[1].split("=")[1]);
					obj.setAge(Integer.parseInt(arr[2].split("=")[1]));
					obj.setSex(arr[3].split("=")[1]);
					obj.setTelNum(arr[4].split("=")[1]);
					obj.setAddress(arr[5].split("=")[1]);
					// 将数据添加到 list 中
					list.add(obj);
				}

			}
		} catch (NumberFormatException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return list;
	}

	/**
	 * title: writeFile 
	 * description: 将 List 中的数据写到文件中
	 * @param list
	 */
	public static void writeFile(List<Person> list) {
		BufferedWriter bw = null;
		try {
			bw = new BufferedWriter(new FileWriter(fileName));
			for (int i = 0; i < list.size(); i++) {
				bw.write(list.get(i).toString());
				bw.newLine();
			}
			bw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
