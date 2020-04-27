package com.atguigu.java;

import java.util.Arrays;

/*
 *  1.姹傛暟缁勫厓绱犵殑鏈�ぇ鍊笺�鏈�皬鍊笺�骞冲潎鏁般�鎬诲拰绛�

 2.鏁扮粍鐨勫鍒躲�鍙嶈浆

 3.鏁扮粍鍏冪礌鐨勬帓搴�

 */
public class TestArray3 {

	public static void main(String[] args) {
		int[] arr = new int[] { 12, 43, 9, 0, -65, -99, 100, 9 };

		// 鏈�ぇ鍊�
		int max = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if (max < arr[i]) {
				max = arr[i];
			}
		}
		System.out.println("鏁扮粍鐨勬渶澶у�涓猴細" + max);

		// 鏈�皬鍊�
		int min = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if (min > arr[i]) {
				min = arr[i];
			}
		}
		System.out.println("鏁扮粍鐨勬渶灏忓�涓猴細" + min);

		// 鎬诲拰
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		System.out.println("鎬诲拰涓猴細" + sum);

		// 骞冲潎鏁�
		int avg = 0;
		avg = sum / arr.length;
		System.out.println("" + avg);

		// 鏁扮粍鐨勫鍒�
		int[] arr1 = new int[arr.length];
		for (int i = 0; i < arr1.length; i++) {
			arr1[i] = arr[i];
		}
		// 鏁扮粍鍏冪礌鐨勫弽杞�
		// for(int i = 0;i < arr.length/2;i++){
		// int temp = arr[i];
		// arr[i] = arr[arr.length-1 - i];
		// arr[arr.length - 1 - i] = temp;
		// }
		for (int x = 0, y = arr.length - 1; x < y; x++, y--) {
			int temp = arr[x];
			arr[x] = arr[y];
			arr[y] = temp;
		}
		//System.out.println("鍙嶈浆浠ュ悗锛�);
		// 閬嶅巻
		
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + "\t");
		}
//		// 浣跨敤鍐掓场鎺掑簭浣挎暟缁勫厓绱犱粠灏忓埌澶ф帓鍒�
//		for (int i = 0; i < arr.length - 1; i++) {
//			for (int j = 0; j < arr.length - 1 - i; j++) {
//				if (arr[j] > arr[j + 1]) {
//					int temp = arr[j];
//					arr[j] = arr[j + 1];
//					arr[j + 1] = temp;
//				}
//			}
//		}
//		//浣跨敤鐩存帴閫夋嫨鎺掑簭浣挎暟缁勫厓绱犱粠灏忓埌澶ф帓鍒�
//		for(int i = 0; i < arr.length - 1; i++){
//			int t = i;//榛樿i澶勬槸鏈�皬鐨�
//			for(int j = i;j < arr.length;j++){
//				//涓�棪鍦╥鍚庡彂鐜板瓨鍦ㄦ瘮鍏跺皬鐨勫厓绱狅紝灏辫褰曢偅涓厓绱犵殑涓嬭鏍�
//				if(arr[t] > arr[j]){
//					t = j;
//				}
//			}
//			if(t != i){
//				int temp = arr[t];
//				arr[t] = arr[i];
//				arr[i] = temp;
//			}
//		}
		Arrays.sort(arr);
		
		//System.out.println("鎺掑簭浠ュ悗锛�);
		// 閬嶅巻
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + "\t");
		}
		
	}
}
