package com.mahmud.logicalPrograms;

import java.util.Scanner;

public class FibonacciWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the limit of Serious:");
		Scanner read = new Scanner(System.in);
		int n = read.nextInt();
		int prev=0, next=1, result = 0;
		int i=1;
		while(i<n) {
			System.out.print(prev+" ");
			result = prev+next;
			prev=next;
			next=result;
			i++;
		}

	}

}
