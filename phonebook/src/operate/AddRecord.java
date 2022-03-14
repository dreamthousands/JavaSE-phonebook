/** 
 * projectName: phonebook 
 * fileName: AddRecord.java 
 * packageName: operate 
 * date: 2022年3月14日下午8:52:04 
 * copyright(c)
 */

package operate;

import java.util.List;

import phonebook.Person;
import phonebook.TelNoteRagex;

/**   
 * title: AddRecord
 * description: 添加数据类
 * @author: jxq
 * @since: 2022年3月14日 下午8:52:04 
 * @version: V1.0   
*/
public class AddRecord {

	/**
	 * title: addOperation 
	 * description: 将数据添加到 List 中
	 * @param list
	 * @return: 返回列表
	 */
	public static List<Person> addOperation(List<Person> list) {
		TelNoteRagex telNoteRagex = new TelNoteRagex();
		String name = telNoteRagex.nameValidate();
		int age = telNoteRagex.ageValidate();
		String sex = telNoteRagex.sexValidate();
		String telNum = telNoteRagex.telNumValidate();
		String address = telNoteRagex.addressValidate();
		Person person = new Person(name, age, sex, telNum, address);
		// 将创建的对象加入到 List 中
		list.add(person);
		person.setId(list.size());
		System.out.println("添加成功！");
		return list;
	}
}
