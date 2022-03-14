/** 
 * projectName: phonebook 
 * fileName: OrderRecord.java 
 * packageName: operate 
 * since: 2022年3月14日下午9:16:30 
 * copyright(c)
 */
package operate;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import phonebook.DataSave;
import phonebook.Person;

/**   
 * title: OrderRecord.java
 * description: 排列数据类 
 * @author: jxq
 * @since: 2022年3月14日 下午9:16:30 
 * @version: V1.0   
*/

public class OrderRecord {

	/**   
	 * title: OrderByName
	 * description: 按名字排序类，实现 Comparator 接口 
	 * @author: jxq
	 * @since: 2022年3月14日 下午9:57:59 
	 * @version: V1.0   
	*/
	class OrderByName implements Comparator<Person> {

		/**   
		 * title: compare
		 * description: 重新 compare 方法，根据名字比较
		 * @param o1
		 * @param o2
		 * @return   
		 * @see java.util.Comparator#compare(java.lang.Object, java.lang.Object)     
		 */
		@Override
		public int compare(Person o1, Person o2) {

			return o1.getName().compareTo(o2.getName());
		}
	}

	/**   
	 * title: OrderByAge
	 * description: 按年龄排序类，实现 Comparator 接口
	 * @author: jxq
	 * @since: 2022年3月14日 下午9:57:14 
	 * @version: V1.0   
	*/
	class OrderByAge implements Comparator<Person> {

		/**   
		 * title: compare
		 * description: 重写 compare 方法，根据年龄比较
		 * @param o1
		 * @param o2
		 * @return   
		 * @see java.util.Comparator#compare(java.lang.Object, java.lang.Object)     
		 */
		@Override
		public int compare(Person o1, Person o2) {
			int age1 = o1.getAge();
			int age2 = o2.getAge();
			if (age1 > age2) {
				return 1;
			} else if (age1 == age2) {
				return 0;
			} else {
				return -1;
			}
		}
	}

	/**   
	 * title: OrderBySex
	 * description: 按性别排序类，实现 Comparator 接口
	 * @author: jxq
	 * @since: 2022年3月14日 下午9:56:25 
	 * @version: V1.0   
	*/
	class OrderBySex implements Comparator<Person> {

		/**   
		 * title: compare
		 * description: 重写 compare 方法，根据性别比较
		 * @param o1
		 * @param o2
		 * @return   
		 * @see java.util.Comparator#compare(java.lang.Object, java.lang.Object)     
		 */
		@Override
		public int compare(Person o1, Person o2) {

			return o1.getSex().compareTo(o2.getSex());
		}
	}

	/**
	 * title: orderName 
	 * description: 按名字排列
	 * @param list: 列表
	 * @return: 返回列表
	 */
	public List<Person> orderName(List<Person> list) {
		Collections.sort(list, new OrderByName());
		for (int i = 0; i < list.size(); i++) {
			list.get(i).setId(i + 1);
		}
		DataSave.writeFile(list);
		return list;
	}

	/**
	 * title: orderAge 
	 * description: 按年龄排列
	 * @param list: 列表
	 * @return: 返回列表
	 */
	public List<Person> orderAge(List<Person> list) {
		Collections.sort(list, new OrderByAge());
		for (int i = 0; i < list.size(); i++) {
			list.get(i).setId(i + 1);
		}
		DataSave.writeFile(list);
		return list;
	}

	/**
	 * title: orderSex 
	 * description: 按性别排列
	 * @param list: 列表
	 * @return: 返回列表
	 */
	public List<Person> orderSex(List<Person> list) {
		Collections.sort(list, new OrderBySex());
		for (int i = 0; i < list.size(); i++) {
			list.get(i).setId(i + 1);
		}
		DataSave.writeFile(list);
		return list;
	}

}
