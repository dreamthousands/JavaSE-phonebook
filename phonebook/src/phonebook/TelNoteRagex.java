/** 
 * projectName: phonebook 
 * fileName: TelNoteRagex.java 
 * packageName: phonebook 
 * date: 2022年3月14日下午8:52:04 
 * copyright(c)
 */

package phonebook;

/**   
 * title: TelNoteRagex
 * description: 数据校验类 
 * @author: jxq
 * @since: 2022年3月14日 下午10:10:43 
 * @version: V1.0   
*/
public class TelNoteRagex {

	/**
	 * title: menuItemValidate 
	 * description: TODO
	 * @param min: 输入选项的最小值
	 * @param max: 输入选项的最大值
	 * @param flag: 根据 flag 输出不同的内容
	 * @return: 返回你输入的合法选项  
	 */
	public int menuItemValidate(int min, int max, boolean flag) {
		String regex = "[1-9]{1,}";
		while (true) {
			if (flag) {
				System.out.println("请输入你的选项：");
			} else {
				System.out.println("请输入记录的序号：");
			}
			String input = App.scanner.nextLine();
			if (input.matches(regex)) {
				int num = Integer.parseInt(input);
				if ((num >= min) && (num <= max)) {
					return num;
				} else {
					System.out.println("输入的数字不合法！");
				}
			} else {
				System.out.println("输入的数字不合法！");
			}
		}
	}

	/**
	 * title: nameValidate 
	 * description: 对用户输入姓名的验证
	 * @return: 返回你输入的合法名字 
	 */
	public String nameValidate() {
		String regex = "[a-zA-Z0-9\u4e00-\u9fa5]{3,12}";

		while (true) {
			System.out.println("请输入你的名字：");
			String input = App.scanner.nextLine();
			if (input.matches(regex)) {
				return input;
			} else {
				System.out.println("你输入的名字不合法！");
			}
		}
	}

	/**
	 * title: ageValidate 
	 * description: 对用户输入年龄的验证
	 * @return: 返回你输入的合法年龄 
	 */
	public int ageValidate() {
		String regex = "[1-9]{1}[0-9]{1}";

		while (true) {
			System.out.println("请输入你的年龄：");
			String input = App.scanner.nextLine();
			if (input.matches(regex)) {
				return Integer.parseInt(input);
			} else {
				System.out.println("你输入的年龄不合法！");
			}
		}
	}

	/**
	 * title: sexValidate 
	 * description: 对用户输入性别的验证
	 * @return: 返回你输入的合法性别 
	 */
	public String sexValidate() {
		String regex = "[0|1]";

		while (true) {
			System.out.println("请输入你的性别：(0：女；1：男)");
			String input = App.scanner.nextLine();
			if (input.matches(regex)) {
				if (input.equals("0")) {
					input = "男";
				} else {
					input = "女";
				}
				return input;
			} else {
				System.out.println("你输入的内容不合法！");
			}
		}
	}

	/**
	 * title: telNumValidate 
	 * description: 对用户输入电话号码的验证
	 * @return: 返回你输入的合法电话号码  
	 */
	public String telNumValidate() {
		String regex = "(\\d{3}-\\d{8})|(\\d{4}-\\d{7})|([1]\\d{10})";
		while (true) {
			System.out.println("请输入你的电话号码：");
			String input = App.scanner.nextLine();
			if (input.matches(regex)) {
				return input;
			} else {
				System.out.println("你输入的电话号码不合法！");
			}
		}
	}

	/**
	 * title: addressValidate 
	 * description: 对用户输入地址的验证
	 * @return: 返回你输入的合法地址  
	 */
	public String addressValidate() {
		String regex = "[a-zA-Z0-9\u4e00-\u9fa5]{3,50}";

		while (true) {
			System.out.println("请输入你的地址：");
			String input = App.scanner.nextLine();
			if (input.matches(regex)) {
				return input;
			} else {
				System.out.println("你输入的地址不合法！");
			}
		}
	}
}
