package com.practice.interview;

import java.util.Scanner;

public class TechnicalRoundDemo2 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		// Question 1
		System.out.print("Enter a string: ");
		String str = sc.nextLine();
//		String str = "StRinG";
		// convert up-> low & low-> up
		StringBuilder result = new StringBuilder();
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (Character.isUpperCase(ch)) {
				result.append(Character.toLowerCase(ch));
			} else if (Character.isLowerCase(ch)) {
				result.append(Character.toUpperCase(ch));
			} else {
				result.append(ch);
			}
		}
		System.out.println(result);

		// Question 2 - count digits in a number
		System.out.println("Enter a number : ");
		int num = sc.nextInt();
		System.out.println("Enter the digit : ");
		int d = sc.nextInt();
		int count = 0;
		int temp = Math.abs(num);
		if (temp == 0 && d == 0) {
			count = 1;
		}
		while (temp > 0) {
			int rem = temp % 10;
			if (rem == d) {
				count++;
			}
			temp = temp / 10;
		}
		System.out.println("Digit " + d + " occurs " + count + " times.");
		sc.close();
	}
}
