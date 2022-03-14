/** 
 * projectName: phonebook 
 * fileName: Menu.java 
 * packageName: phonebook 
 * date: 2022年3月14日下午8:52:04 
 * copyright(c)
 */

package phonebook;

/**   
 * title: Menu
 * description: 电话本中的菜单类 
 * @author: jxq
 * @since: 2022年3月14日 下午10:01:33 
 * @version: V1.0   
*/
public class Menu {

	/**
	 * title: mainMenu 
	 * description: TODO
	 */
	public void mainMenu() {
		System.out.println("******************************************");
		System.out.println("**\t\t 1 添加记录 \t\t**");
		System.out.println("**\t\t 2 查找记录 \t\t**");
		System.out.println("**\t\t 3 修改记录 \t\t**");
		System.out.println("**\t\t 4 删除记录 \t\t**");
		System.out.println("**\t\t 5 排序记录 \t\t**");
		System.out.println("**\t\t 6 退出系统 \t\t**");
		System.out.println("******************************************");
	}

	/**
	 * title: addMenu 
	 * description: 添加菜单界面    
	 */
	public void addMenu() {
		System.out.println("******************************************");
		System.out.println("**\t\t 1 添加新记录 \t\t**");
		System.out.println("**\t\t 2 查看全记录 \t\t**");
		System.out.println("**\t\t 3 返回上一级 \t\t**");
		System.out.println("******************************************");
	}

	/**
	 * title: searchMenu 
	 * description: 搜索菜单界面   
	 */
	public void searchMenu() {
		System.out.println("******************************************");
		System.out.println("**\t\t 1 按姓名查找 \t\t**");
		System.out.println("**\t\t 2 按年龄查找 \t\t**");
		System.out.println("**\t\t 3 按性别查找 \t\t**");
		System.out.println("**\t\t 4 按号码查找 \t\t**");
		System.out.println("**\t\t 5 按地址查找 \t\t**");
		System.out.println("**\t\t 6 查看全记录 \t\t**");
		System.out.println("**\t\t 7 返回上一级 \t\t**");
		System.out.println("******************************************");
	}

	/**
	 * title: modifyMenu 
	 * description: 修改菜单界面 
	 */
	public void modifyMenu() {
		System.out.println("******************************************");
		System.out.println("**\t\t 1 查看全记录 \t\t**");
		System.out.println("**\t\t 2 修改指定记录\t\t**");
		System.out.println("**\t\t 3 返回上一级  \t\t**");
		System.out.println("******************************************");
	}

	/**
	 * title: subModifyMenu 
	 * description: 修改菜单子界面    
	 */
	public void subModifyMenu() {
		System.out.println("***************************************");
		System.out.println("**\t\t 1 修改姓名   \t\t**");
		System.out.println("**\t\t 2 修改年龄   \t\t**");
		System.out.println("**\t\t 3 修改性别   \t\t**");
		System.out.println("**\t\t 4 修改号码   \t\t**");
		System.out.println("**\t\t 5 修改住址    \t\t**");
		System.out.println("**\t\t 6 修改年龄    \t\t**");
		System.out.println("**\t\t 7 返回上一级\t\t**");
		System.out.println("***************************************");
	}

	/**
	 * title: deleteMenu 
	 * description: 删除菜单界面 
	 */
	public void deleteMenu() {
		System.out.println("******************************************");
		System.out.println("**\t\t 1 查看全记录  \t\t**");
		System.out.println("**\t\t 2 删除指定记录\t\t**");
		System.out.println("**\t\t 3 删除全部记录\t\t**");
		System.out.println("**\t\t 4 返回上一级  \t\t**");
		System.out.println("******************************************");

	}

	/**
	 * title: orderMenu 
	 * description: 排序菜单界面    
	 */
	public void orderMenu() {
		System.out.println("******************************************");
		System.out.println("**\t\t 1 按姓名排序  \t\t**");
		System.out.println("**\t\t 2 按年龄排序  \t\t**");
		System.out.println("**\t\t 3 按性别排序  \t\t**");
		System.out.println("**\t\t 4 查看全记录  \t\t**");
		System.out.println("**\t\t 5 返回上一级  \t\t**");
		System.out.println("******************************************");
	}
}
