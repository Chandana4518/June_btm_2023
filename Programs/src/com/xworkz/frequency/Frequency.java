package com.xworkz.frequency;

import java.util.Scanner;

public class Frequency {

	public static void main(String[] args) {
		int[] array = { 7, 7, 4, 3, 3, 2 };
		System.out.println("Enter a number to find its frequency");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int count = 0;
		for (int i = 0; i < array.length; i++) {
			if (array[i] == num) {
				count++;
			}
		}
		System.out.println(count);
	}

}
