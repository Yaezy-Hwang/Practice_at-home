package com.javahw.at_home;

import java.util.Scanner;

public class Hw03 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("점수를 입력하세요");
		System.out.print("점수: ");
		int score = sc.nextInt();
		
		if(score>=90) {
			System.out.println("점수가 100 ~ 90 입니다.");
			System.out.println("등급은 A입니다.");
		} else if(score>=80){
			System.out.println("점수가 90 ~ 80 입니다.");
			System.out.println("등급이 B입니다.");
		} else if(score>=70){
			System.out.println("점수가 80 ~ 70 입니다.");
			System.out.println("등급이 C입니다.");
		} else {
			System.out.println("점수가 70 미만입니다.");
			System.out.println("등급이 D입니다.");
		}
		
		sc.close();
	}
}
