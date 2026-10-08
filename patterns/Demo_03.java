package com.patterns;

public class Demo_03 {
//Inverted right angled triangle
	public static void main(String[] args) {
		for(int i=5;i>=1;i--) {
			for(int j=1;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
