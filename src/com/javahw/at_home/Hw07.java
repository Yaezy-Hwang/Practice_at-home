package com.javahw.at_home;

import java.util.Scanner;

public class Hw07 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("등급을 입력해 주세요: ");
		String grade = sc.nextLine();
		
		switch(grade) {
			case "A" :
			case "a" :
				System.out.println("우수 회원입니다.");
				break;
				
			case "B" :
			case "b" :
				System.out.println("일반 회원입니다.");
				break;
				
			default :
				System.out.println("우수 회원입니다.");
				break;
		}
		
		System.out.println("감사합니다.");
		
		sc.close();
	}

}
