/** 
 * projectName: phonebook 
 * fileName: Search.java 
 * packageName: operate 
 * date: 2022年3月14日下午8:47:31 
 * copyright(c)
 */

package operate;

import java.util.ArrayList;
import java.util.List;

import phonebook.Person;

/**   
 * title: SearchRecord
 * description: 搜索数据类 
 * @author: jxq
 * @since: 2022年3月14日 下午10:14:59 
 * @version: V1.0   
*/
public class SearchRecord {

	// @Fields list: 创建一个列表
	private List<Person> list = new ArrayList<>();

	/**   
	 * title: SearchRecord   
	 * description: SearchRecord 的构造方法
	 * @param list  
	 */
	public SearchRecord(List<Person> list) {
		this.list = list;
	}

	/**
	 * title: searchByAddress 
	 * description: 按地址搜索
	 * @param address
	 */
	public void searchByAddress(String address) {
		boolean flag = true;
		// 遍历 list，找到相对应地址的记录
		for (int i = 0; i < list.size(); i++) {
			if (address.equals(list.get(i).getAddress())) {
				System.out.println(list.get(i));
				flag = false;
			}
		}
		if (flag) {
			System.out.println("没有此人的信息");
		}
	}

	/**
	 * title: searchByTelNum 
	 * description: 按电话搜索
	 * @param telNum
	 */
	public void searchByTelNum(String telNum) {
		boolean flag = true;
		for (int i = 0; i < list.size(); i++) {
			if (telNum.equals(list.get(i).getTelNum())) {
				System.out.println(list.get(i));
				flag = false;
			}
		}
		if (flag) {
			System.out.println("没有此人的信息");
		}
	}

	/**
	 * title: searchBySex 
	 * description: 按性别搜索
	 * @param sex
	 */
	public void searchBySex(String sex) {
		boolean flag = true;
		for (int i = 0; i < list.size(); i++) {
			if (sex.equals(list.get(i).getSex())) {
				System.out.println(list.get(i));
				flag = false;
			}
		}
		if (flag) {
			System.out.println("没有此人的信息");
		}
	}

	/**
	 * title: searchByAge 
	 * description: 按年龄搜索
	 * @param age
	 */
	public void searchByAge(int age) {
		boolean flag = true;
		for (int i = 0; i < list.size(); i++) {
			if (age == list.get(i).getAge()) {
				System.out.println(list.get(i));
				flag = false;
			}
		}
		if (flag) {
			System.out.println("没有此人的信息");
		}
	}

	/**
	 * title: searchByName 
	 * description: 按名字搜索
	 * @param name
	 */
	public void searchByName(String name) {
		boolean flag = true;
		for (int i = 0; i < list.size(); i++) {
			if (name.equals(list.get(i).getName())) {
				System.out.println(list.get(i));
				flag = false;
			}
		}
		if (flag) {
			System.out.println("没有此人的信息");
		}
	}
}
