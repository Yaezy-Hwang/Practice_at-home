package com.javahw.at_home;

import java.util.Scanner;

public class Hw09 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("점수를 입력하세요");
		System.out.print("점수: ");
		int score = sc.nextInt();
		
		System.out.print("등급은 ");
		
		if(score<70) {
			System.out.print("D");
		} else if(score<80){
			System.out.print("C");
		} else if(score<90){
			System.out.print("B");
		} else {
			System.out.print("A");
		}
		
		System.out.println(" 입니다.");
		
		sc.close();
	}
}
