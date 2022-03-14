/** 
 * projectName: phonebook 
 * fileName: ClearScreen.java 
 * packageName: operate 
 * date: 2022年3月14日下午10:18:32 
 * copyright(c)
 */
package operate;

import java.io.IOException;

/**   
 * title: ClearScreen
 * description: 清屏类 
 * @author: jxq
 * @since: 2022年3月14日 下午10:18:32 
 * @version: V1.0   
*/

public class ClearScreen {

	/**
	 * title: clear 
	 * description: 清屏命令(在命令行下才会运行，在 Console 中不生效)  
	 */
	public static void clear() {
		try {
			// 新建一个 ProcessBuilder，其要执行的命令是 cmd.exe，参数是 /c 和 cls
			new ProcessBuilder("cmd", "/c", "cls")
					// 将 ProcessBuilder 对象的输出管道和 Java 的进程进行关联，这个函数的返回值也是一个 ProcessBuilder
					.inheritIO()
					// 开始执行 ProcessBuilder 中的命令
					.start()
					// 等待 ProcessBuilder 中的清屏命令执行完毕。如果不等待则会出现清屏代码后面的输出被清掉的情况
					.waitFor();
		} catch (InterruptedException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
