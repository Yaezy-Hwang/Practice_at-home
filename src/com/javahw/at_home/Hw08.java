package com.javahw.at_home;

import java.util.Scanner;

public class Hw08 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("직급: ");
		String grade = sc.nextLine();
		
		switch(grade) {
			case "부장" :
				System.out.println("700만원");
				break;
				
			case "과장" :
				System.out.println("500만원");
				break;
				
			default :
				System.out.println("300만원");
				break;
		}
		
		sc.close();
	}

}
