package com.basic.problems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SmallestMissingNumber {

	public static void main(String[] args) {
		int[] inputArray0 = { 0, 3, 6, 9 };
		int[] inputArray1 = { 1, 1, 1, 1 };
		int[] inputArray2 = { 0, 1, -2, 4, 8, 6, 9 };
		int[] inputArray3 = { 9, 8, 3, 6, 1, 2 };

		List<int[]> listArray = new ArrayList<int[]>();
		listArray.add(inputArray0);
		listArray.add(inputArray1);
		listArray.add(inputArray2);
		listArray.add(inputArray3);

		for (int[] arr : listArray) {
			Arrays.sort(arr);
//			for (int i = 0; i < arr.length; i++)
//				System.out.println(arr[i]);
			int leastNumber = findSmallestNuumber2(arr);
			System.out.println("Smallest missing number in a given array is: " + leastNumber);
		}
	}

	public static int findSmallestNuumber(int[] inputArray) {
		int difference, leastNum = 1;

		if (inputArray[0] > 1)
			return leastNum;
		else {
			for (int i = 0; i < inputArray.length - 1; i++) {
				if (inputArray[i] < 0)
					continue;

				difference = inputArray[i + 1] - inputArray[i];

				if (difference > 1) {
					leastNum = inputArray[i] + 1;
					break;
				}
			}
			return leastNum;
		}
	}

	// Dev in Progress
	public static int findSmallestNuumber2(int[] inputArray) {
		int i = 0, maxNum, difference, leastNum = 0;
		do {
			if(inputArray[i] >= 0) {
				difference = inputArray[i + 1] - inputArray[i];
				if (difference > 1) {
					leastNum = inputArray[i] + 1;
					break;
				}
			}
			i++;
		}while(i < inputArray.length-1);
		return leastNum;
	}
}
