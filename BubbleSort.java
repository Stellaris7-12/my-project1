public class BubbleSort {
	/*
	冒泡排序
	*/
	public static void main(String[ ] args) {
		double [ ] arrayToBeSorted = {1,-10.9, 38.5, 105.3, 21, 0};
		int sortRoundLeft = arrayToBeSorted.length - 1;
		while(sortRoundLeft > 0) {//使用while循环控制排序轮数
			for(int i = 0; i < sortRoundLeft; i++) {//使用for循环进行单轮排序，确定目前最大数
				if(arrayToBeSorted[i] > arrayToBeSorted[i+1]) {//若前面的数大则交换位置
					double temp = arrayToBeSorted[i+1];
					arrayToBeSorted[i+1] = arrayToBeSorted[i];
					arrayToBeSorted[i] = temp;
				}
			}
			sortRoundLeft--;
		}
		System.out.println("排序后的数组如下：");
		for(int j = 0; j < arrayToBeSorted.length; j++) {
			System.out.print(arrayToBeSorted[j] + " ");
		}
	}	
}