/** 
 * projectName: phonebook 
 * fileName: ModifyRecord.java 
 * packageName: operate 
 * date: 2022年3月14日下午8:53:48 
 * copyright(c)
 */
package operate;

import java.util.List;

import phonebook.Menu;
import phonebook.Person;
import phonebook.TelNoteRagex;

/**   
 * title: ModifyRecord.java
 * description: 修改数据类  
 * @author: jxq
 * @since: 2022年3月14日 下午8:53:48 
 * @version: V1.0   
*/

public class ModifyRecord {

	/**
	 * title: modifyOperation 
	 * description: 修改 list 中的数据
	 * @param list
	 * @return: 返回列表
	 */
	public static List<Person> modifyOperation(List<Person> list) {
		Menu menu = new Menu();
		TelNoteRagex telNoteRagex = new TelNoteRagex();
		int id = telNoteRagex.menuItemValidate(1, list.size(), false);
		Person person = list.get(id - 1);
		ClearScreen.clear();
		// 显示修改子菜单
		menu.subModifyMenu();
		System.out.println(person);
		int item = telNoteRagex.menuItemValidate(1, 6, true);
		switch (item) {
		case 1:
			String name = telNoteRagex.nameValidate();
			person.setName(name);
			break;
		case 2:
			int age = telNoteRagex.ageValidate();
			person.setAge(age);
			break;
		case 3:
			String sex = telNoteRagex.sexValidate();
			person.setSex(sex);
			break;
		case 4:
			String telNum = telNoteRagex.telNumValidate();
			person.setTelNum(telNum);
			break;
		case 5:
			String address = telNoteRagex.addressValidate();
			person.setAddress(address);
			break;
		case 6:
			ClearScreen.clear();
		default:
			break;
		}
		System.out.println("修改成功！");
		return list;
	}
}
