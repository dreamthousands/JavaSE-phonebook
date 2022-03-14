/** 
 * projectName: phonebook 
 * fileName: deleteList.java 
 * packageName: operate 
 * date: 2022年3月14日下午8:52:16 
 * copyright(c)
 */
package operate;

import java.util.List;

import phonebook.Person;
import phonebook.TelNoteRagex;

/**   
 * title: deleteList.java
 * description: 删除数据类 
 * @author: jxq
 * @since: 2022年3月14日 下午8:52:16 
 * @version: V1.0   
*/
public class DeleteRecord {

	/**
	 * title: deleteAllOperation 
	 * description: 删除全部数据
	 * @param list
	 * @return: 返回列表
	 */
	public static List<Person> deleteAllOperation(List<Person> list) {
		list.clear();
		System.out.println("清空成功！");
		return list;
	}

	/**
	 * title: deleteOperation 
	 * description: 删除 list 中的数据
	 * @param list
	 * @return: 返回列表
	 */
	public static List<Person> deleteOperation(List<Person> list) {
		TelNoteRagex telNoteRagex = new TelNoteRagex();
		int id = telNoteRagex.menuItemValidate(1, list.size(), false);
		list.remove(id - 1);
		// 重新为记录设置新的序号
		for (int i = id - 1; i < list.size(); i++) {
			list.get(i).setId(i + 1);
		}
		System.out.println("删除成功！");
		return list;
	}
}
