package lab14;

import java.util.Arrays;

public class lab14_2 {
	public static void main(String[] args) {
		int[] list1 = { 2, 4, 6 };
		int[] list2 = { 1, 2, 3, 4, 5, 6 };
		int[] list3 = new int[list1.length + list2.length];
		int[] list4 = new int[list1.length + list2.length];
		list3 = append(list1, list2);
		list4 = append(list2, list1);
		for (int a=0; a<list3.length; a++) {
			if (a == list3.length - 1) {
				System.out.print(list3[a]);
			} else {
				System.out.print(list3[a] + ", ");
			}
		}
		System.out.println();
		for (int a=0; a<list4.length; a++) {
			if (a == list4.length-1) {
				System.out.print(list4[a]);
			} else {
				System.out.print(list4[a] + ", ");
			}
		}

	}

	public static int[] append(int[] list1, int[] list2) {
		int[] list3 = new int[list1.length + list2.length];

		for (int i = 0; i < list1.length; i++) {
			list3[i] = list1[i];
		}

		for (int i = 0; i < list2.length; i++) {
			list3[list1.length + i] = list2[i];
		}

		return list3;
	}

}