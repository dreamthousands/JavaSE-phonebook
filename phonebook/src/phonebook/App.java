/** 
 * projectName: phonebook 
 * fileName: App.java 
 * packageName: phonebook 
 * date: 2022年3月14日下午8:52:04 
 * copyright(c)
 */

package phonebook;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import operate.ClearScreen;

/**   
 * title: App
 * description: main 函数所在的类 
 * @author: jxq
 * @since: 2022年3月14日 下午9:27:19 
 * @version: V1.0   
*/
public class App {

	// @Fields scanner: 静态的 Scanner 对象
	public static Scanner scanner = new Scanner(System.in);
	// @Fields list: 放 Person 类的列表
	public List<Person> list;

	/**   
	 * title: App   
	 * description: App 的构造方法    
	 */
	public App() {
		this.list = new ArrayList<Person>();
	}

	/**
	 * title: main 
	 * description: 主函数-程序入口
	 * @param args
	 */
	public static void main(String[] args) {
		App app = new App();
		app.start();
		scanner.close();
	}

	/**
	 * title: start 
	 * description: 控制主菜单  
	 */
	public void start() {
		// 创建一个文件用于保存数据
		DataSave.createFile();
		try {
			// 读取文件中的内容，并将其放入列表中
			list = DataSave.readFile();
		} catch (IOException e) {
			e.printStackTrace();
		}
		Menu menu = new Menu();
		TelNoteRagex telNoteRagex = new TelNoteRagex();
		Operate operate = new Operate(list);
		while (true) {
			// 显示主界面
			menu.mainMenu();
			// 输入你的选项
			int item = telNoteRagex.menuItemValidate(1, 6, true);
			ClearScreen.clear();
			switch (item) {
			case 1:
				operate.addLogic();
				break;
			case 2:
				operate.searchLogic();
				break;
			case 3:
				operate.modifyLogic();
				break;
			case 4:
				operate.deleteLogic();
				break;
			case 5:
				operate.orderLogic();
				break;
			case 6:
				// 结束当前运行的项目
				System.exit(0);
				break;
			default:
				break;
			}
		}
	}
}
