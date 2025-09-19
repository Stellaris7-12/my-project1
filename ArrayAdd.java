import java.util.Scanner;
/*
数组扩容
可以自定义添加的元素（int类型）
*/
public class ArrayAdd {
	public static void main(String[ ] args) {
		Scanner myScanner = new Scanner(System.in);
		//初始化原有数组
		int [ ] arrayOld = {1,2,3};
		char userDecision = 'y'; 
		//使用循坏做到连续添加新元素
		while(userDecision == 'y') {
			System.out.println("请输入需要添加到数组的元素：");
			int newElement = myScanner.nextInt();
			//初始化新数组（扩容）
			int [ ] arrayNew = new int[arrayOld.length + 1];
			//将元素进行迁移
			for(int i = 0; i < arrayOld.length; i++) {
				arrayNew[i] = arrayOld[i];
			}
			arrayNew[arrayOld.length] = newElement;
			//将原数组引用到新数组的地址
			arrayOld = arrayNew;
			System.out.println("添加成功！");
			System.out.println("目前的数组如下：");
			for(int j = 0; j < arrayOld.length; j++) {
				System.out.print(arrayOld[j] + " ");
			}
			System.out.println("输入y继续添加，输入n退出");
			userDecision = myScanner.next().charAt(0);
		}
		if(userDecision == 'n') {
			System.out.println("扩容结束，退出程序");
		}
	}
}