/** 
 * projectName: phonebook 
 * fileName: Person.java 
 * packageName: phonebook 
 * date: 2022年3月14日下午8:52:04 
 * copyright(c)
 */

package phonebook;

/**   
 * title: Person
 * description: 实体类 
 * @author: jxq
 * @since: 2022年3月14日 下午10:06:30 
 * @version: V1.0   
*/
public class Person {
	// @Fields id: 序号
	private int id;
	// @Fields name: 名字
	private String name;
	// @Fields age: 年龄
	private int age;
	// @Fields sex: 性别
	private String sex;
	// @Fields telNum: 电话号码
	private String telNum;
	// @Fields address: 地址
	private String address;

	/**   
	 * title: Person   
	 * description: Person 的有参构造方法  
	 * @param name: 名字
	 * @param age: 年龄
	 * @param sex: 性别
	 * @param telNum: 电话
	 * @param address: 地址
	 */
	public Person(String name, int age, String sex, String telNum, String address) {
		super();
		this.name = name;
		this.age = age;
		this.sex = sex;
		this.telNum = telNum;
		this.address = address;
	}

	/**   
	 * title: Person   
	 * description: Person 的无参构造方法   
	 */
	public Person() {

	}

	/**  
	 * title: getId
	 * description: 获得序号
	 * @return: 返回序号
	 */
	public int getId() {
		return id;
	}

	/**  
	 * title: setId
	 * description: 设置序号
	 * @param id: 序号
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**  
	 * title: getName
	 * description: 获得名字
	 * @return: 返回名字
	 */
	public String getName() {
		return name;
	}

	/**  
	 * title: setName
	 * description: 设置名字
	 * @param name: 名字
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**  
	 * title: getAge
	 * description: 获得年龄
	 * @return: 返回年龄
	 */
	public int getAge() {
		return age;
	}

	/**  
	 * title: setAge
	 * description: 设置年龄
	 * @param age: 年龄
	 */
	public void setAge(int age) {
		this.age = age;
	}

	/**  
	 * title: getSex
	 * description: 获得性别
	 * @return: 返回性别
	 */
	public String getSex() {
		return sex;
	}

	/**  
	 * title: setSex
	 * description: 设置性别
	 * @param sex: 性别
	 */
	public void setSex(String sex) {
		this.sex = sex;
	}

	/**  
	 * title: getTelNum
	 * description: 获得电话
	 * @return: 返回电话
	 */
	public String getTelNum() {
		return telNum;
	}

	/**  
	 * title: setTelNum
	 * description: 设置电话
	 * @param telNum: 电话
	 */
	public void setTelNum(String telNum) {
		this.telNum = telNum;
	}

	/**  
	 * title: getAddress
	 * description: 获取地址
	 * @return: 返回地址
	 */
	public String getAddress() {
		return address;
	}

	/**  
	 * title: setAddress
	 * description: 设置地址
	 * @param address: 地址
	 */
	public void setAddress(String address) {
		this.address = address;
	}

	/**   
	 * title: toString
	 * description: 重写 toString 方法
	 * @return: 返回拼接好的字符串  
	 * @see java.lang.Object#toString()     
	 */
	@Override
	public String toString() {
		return "id=" + id + ", name=" + name + ", age=" + age + ", sex=" + sex + ", telNum=" + telNum + ", address="
				+ address;
	}
}
