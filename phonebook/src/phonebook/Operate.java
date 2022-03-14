/** 
 * projectName: phonebook 
 * fileName: Operate.java 
 * packageName: phonebook 
 * date: 2022年3月14日下午8:52:04 
 * copyright(c)
 */

package phonebook;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import operate.AddRecord;
import operate.ClearScreen;
import operate.DeleteRecord;
import operate.ModifyRecord;
import operate.OrderRecord;
import operate.SearchRecord;

/**   
 * title: Operate
 * description: Operate类
 * @author: jxq
 * @since: 2022年3月14日 下午9:46:13 
 * @version: V1.0   
*/
public class Operate {

	// @Fields list: 新建一个 list
	private List<Person> list = new ArrayList<>();

	/**   
	 * title: Operate   
	 * description: Operate 的构造方法
	 * @param list  
	 */
	public Operate(List<Person> list) {
		// 将 App 中创建的 list 赋值给 Operate 中的 list
		this.list = list;
	}

	/**
	 * title: addLogic 
	 * description: 添加记录业务逻辑控制
	 */
	public void addLogic() {
		Menu menu = new Menu();
		TelNoteRagex telNoteRagex = new TelNoteRagex();
		while (true) {
			// 显示添加界面
			menu.addMenu();
			int item = telNoteRagex.menuItemValidate(1, 3, true);
			switch (item) {
			case 1:
				// 将数据添加到 List 中
				this.list = AddRecord.addOperation(list);
				// 写入文件
				DataSave.writeFile(list);
				break;
			case 2:
				showAll();
				break;
			case 3:
				// 清屏
				ClearScreen.clear();
				return;
			default:
				break;
			}
		}
	}

	/**
	 * title: searchLogic 
	 * description: 查询记录业务逻辑控制      
	 */
	public void searchLogic() {
		Menu menu = new Menu();
		SearchRecord sr = new SearchRecord(list);
		TelNoteRagex telNoteRagex = new TelNoteRagex();
		while (true) {
			// 显示添加子菜单
			menu.searchMenu();
			int item = telNoteRagex.menuItemValidate(1, 7, true);
			switch (item) {
			case 1:
				String name = telNoteRagex.nameValidate();
				sr.searchByName(name);
				break;
			case 2:
				int age = telNoteRagex.ageValidate();
				sr.searchByAge(age);
				break;
			case 3:
				String sex = telNoteRagex.sexValidate();
				sr.searchBySex(sex);
				break;
			case 4:
				String telNum = telNoteRagex.telNumValidate();
				sr.searchByTelNum(telNum);
				break;
			case 5:
				String address = telNoteRagex.addressValidate();
				sr.searchByAddress(address);
				break;
			case 6:
				showAll();
				break;
			case 7:
				ClearScreen.clear();
				return;
			default:
				break;
			}
		}
	}

	/**
	 * title: modifyLogic 
	 * description: 修改记录业务逻辑控制      
	 */
	public void modifyLogic() {
		Menu menu = new Menu();
		TelNoteRagex telNoteRagex = new TelNoteRagex();
		while (true) {
			// 显示添加子菜单
			menu.modifyMenu();
			int item = telNoteRagex.menuItemValidate(1, 3, true);
			switch (item) {
			case 1:
				showAll();
				break;
			case 2:
				this.list = ModifyRecord.modifyOperation(list);
				DataSave.writeFile(list);
				break;
			case 3:
				ClearScreen.clear();
				return;
			default:
				break;
			}
		}
	}

	/**
	 * title: deleteLogic 
	 * description: 删除记录业务逻辑控制  
	 */
	public void deleteLogic() {
		Menu menu = new Menu();
		TelNoteRagex telNoteRagex = new TelNoteRagex();
		while (true) {
			// 显示删除界面
			menu.deleteMenu();
			int item = telNoteRagex.menuItemValidate(1, 4, true);
			switch (item) {
			case 1:
				showAll();
				break;
			case 2:
				this.list = DeleteRecord.deleteOperation(list);
				DataSave.writeFile(list);
				break;
			case 3:
				this.list = DeleteRecord.deleteAllOperation(list);
				DataSave.writeFile(list);
				break;
			case 4:
				ClearScreen.clear();
				return;
			default:
				break;
			}
		}
	}

	/**
	 * title: orderLogic 
	 * description: 排序记录业务逻辑控制
	 */
	public void orderLogic() {
		Menu menu = new Menu();
		OrderRecord orderRecord = new OrderRecord();
		TelNoteRagex telNoteRagex = new TelNoteRagex();
		while (true) {
			// 显示排序界面
			menu.orderMenu();
			int item = telNoteRagex.menuItemValidate(1, 5, true);
			switch (item) {
			case 1:
				this.list = orderRecord.orderName(list);
				DataSave.writeFile(list);
				break;
			case 2:
				this.list = orderRecord.orderAge(list);
				DataSave.writeFile(list);
				break;
			case 3:
				this.list = orderRecord.orderSex(list);
				DataSave.writeFile(list);
				break;
			case 4:
				showAll();
				break;
			case 5:
				ClearScreen.clear();
				return;
			default:
				break;
			}
		}
	}

	/**
	 * title: showAll 
	 * description: 显示全部数据
	 */
	private void showAll() {
		if (list.size() == 0) {
			System.out.println("电话本为空！");
		} else {
			Iterator<Person> iterator = list.iterator();
			// 使用迭代器遍历整个list
			while (iterator.hasNext()) {
				System.out.println(iterator.next());
			}
		}
	}
}
