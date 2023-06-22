package day09;

import java.util.Scanner;

public class TestClass {
	public String name, grade;
	public int kor, eng, math, sum;
	public double avg;
	
	public String inputName() {
		Scanner sc = new Scanner(System.in);
		System.out.print("이름을 입력하세요. : ");
		name = sc.next();
		return name;
	}
	public int inputKor() {
		Scanner sc = new Scanner(System.in);
		System.out.print("국어 점수를 입력하세요. : ");
		kor = sc.nextInt();
		return kor;
	}
	public int inputEng() {
		Scanner sc = new Scanner(System.in);
		System.out.print("영어 점수를 입력하세요. : ");
		eng = sc.nextInt();
		return eng;
	}
	public int inputMath() {
		Scanner sc = new Scanner(System.in);
		System.out.print("수학 점수를 입력하세요. : ");
		math = sc.nextInt();
		return math;
	}

	public int sum(int kor, int eng, int math) {
		int sum = kor + eng + math;	
		return sum;
	}
	
	public double avg(int sum) {
		double avg = sum / 3;
		
		return avg;
	}
	
	public String grade(double acg) {

		if(100 >= avg &&avg >= 90) {
			grade = "A";
		}else if (90 > avg && avg >= 80) {
			grade = "B";
		}else {
			grade = "C";
		}
		return grade;
	}
		
	public void output(int sum, double avg, String grade) {
		System.out.println("국,영,수의 합 : " + sum + ", 평균값 : " + avg + ", 등급 : " +grade);
	}
}
