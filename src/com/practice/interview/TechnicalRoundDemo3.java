package com.practice.interview;

import java.util.Arrays;

public class TechnicalRoundDemo3 {
	public static void main(String[] args) {
		// 1. function to find sum of all elements in an array
		int[] arr = { 3, 4, 7, 2, 8, 9 };
		System.out.println(sumOfAray(arr));

		// 2. function to find largest number in an array
		int[] arr2 = { 33, 56, 45, 99, 31, 42 };
		int lnum = findLargestNumber(arr2);
		System.out.println(lnum);

		// 3. function to find largest number in an array //doubt
		int[] arr3 = { 33, 56, 45, 99, 31, 42 };
		int slnum = findSecondLargest(arr3);
		System.out.println(slnum);

		// 4. merge two array in a single sorted array
		int[] arr4 = { 1, 4, 2, 5, 67, 7 };
		int[] arr5 = { 87, 34, 6, 1, 3, 55, 57 };
		int[] sarr = mergeAndSort(arr4, arr5);
		System.out.println(Arrays.toString(sarr));

		// 5. write a function returning reverse of a string
		String str = "Hello World";
		StringBuilder reversed = new StringBuilder();
		for (int i = str.length() - 1; i >= 0; i--) {
			reversed.append(str.charAt(i));
		}
		System.out.println(reversed);
		int[] arr6 = { 53, 67, 33, 87, 1, 43, 74 };
		int[] rarr = reverseArray(arr6);
		System.out.println(Arrays.toString(rarr));

		// 6. function to check whether a given string is a palindrome or not
		String str2 = "level";
		boolean result = palindromeCheck(str2);
		System.out.println(result ? "Yes" : "No");

		// 7. check whether two strings are anagrams or not

		// 8. calculate the factorial of a number

		// 9. calculate fibonnacci sequence up to a given sequence

		// 10. sort an array of number in ascending order (bubble sort)

		// 11. search an element in any array(binary search

	}

	public static int sumOfAray(int[] arr) {
		int sum = 0;
		for (int i : arr) {
			sum += i;
		}
		return sum;
	}

	public static int findLargestNumber(int[] arr) {
		int num = arr[0];
		for (int i : arr) {
			if (num < i) {
				num = i;
			}
		}
		return num;
	}

	public static int findSecondLargest(int[] arr) {
		int largest = Integer.MIN_VALUE;
		int secondLargest = Integer.MIN_VALUE;
		for (int i : arr) {
			int num = i;
			if (largest < num) {
				secondLargest = largest;
				largest = num;
			} else if (num > secondLargest && num != largest) {
				secondLargest = num;
			}
		}
		return secondLargest;
	}

	public static int[] mergeAndSort(int[] arr1, int[] arr2) {
		int[] finalArray = new int[arr1.length + arr2.length];
		for (int i = 0; i < arr1.length; i++) {
			finalArray[i] = arr1[i];
		}
		for (int i = 0; i < arr2.length; i++) {
			finalArray[arr1.length + i] = arr2[i];
		}
		Arrays.sort(finalArray);
		return finalArray;
	}

	public static int[] reverseArray(int[] arr) {
		int[] rarr = new int[arr.length];
		for (int i = 0; i < arr.length; i++) {
			rarr[arr.length - 1 - i] = arr[i];
		}
		return rarr;
	}

	public static boolean palindromeCheck(String str) {
		StringBuilder result = new StringBuilder();
		for (int i = str.length() - 1; i >= 0; i--) {
			result.append(str.charAt(i));
		}
		if (str.equals(result.toString())) {
			return true;
		} else {
			return false;
		}

	}
}
