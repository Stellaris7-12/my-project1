import java.util.Scanner;
public class AscendingArray {
	public static void main(String[ ] args) {
		Scanner myScanner = new Scanner(System.in);
		//声明并初始化数组
		int [] originalArray = {10, 12, 45, 90};
		char userDecision = 'y';
		while(userDecision == 'y') {
			System.out.println("请输入需要插入数组的元素（int）：");
			//使用Scanner接受用户插入的元素
			int newElement = myScanner.nextInt();
			//声明并初始化新的数组
			int[] newArray = new int[originalArray.length + 1];
			//记录新元素排序后的索引
			int sequenceNew = 0;
			//使用for循环进行排序
			for (int i = 0; i < originalArray.length; i++) {
				if (newElement < originalArray[i]) { //若新元素比当前元素小则占用当前元素索引
					sequenceNew = i;
					break;
				} else {
					sequenceNew++;
				}
			}
			//将排序好的元素迁移到新数组
			newArray[sequenceNew] = newElement;//先确定新元素

			for (int j = sequenceNew + 1; j < newArray.length; j++) {//比新元素大的索引+1
				newArray[j] = originalArray[j - 1];
			}
			for (int m = sequenceNew - 1; m >= 0; m--) {//比新元素小的索引不变
				newArray[m] = originalArray[m];
			}

			//原数组引用新数组的地址
			originalArray = newArray;

			System.out.println("目前的数组为：");
			for (int p = 0; p < originalArray.length; p++) {
				System.out.print(originalArray[p] + " ");
			}
			System.out.println("是否继续向数组添加新元素？（y/n）");
			userDecision = myScanner.next().charAt(0);
		}
		System.out.println("添加结束~");
	}
}