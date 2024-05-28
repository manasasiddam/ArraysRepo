package com.array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class ArrayCreation {

	public static void main(String[] args) throws IOException {
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		
		System.out.println("Enter length");
		String str=br.readLine();
		int len=Integer.parseInt(str);
		
		int[] number=new int[len];
		System.out.println(number.length);
		for (int i=0;i<number.length;i++) {
			System.out.println("enter value: ");
			String str1=br.readLine();
			int val=Integer.parseInt(str1);
			number[i]=val;
			
		}
		System.out.println(Arrays.toString(number));

	}

}
