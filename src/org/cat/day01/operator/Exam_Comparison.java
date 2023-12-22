package org.cat.day01.operator;

public class Exam_Comparison {
	public static void main(String [] args) {
		System.out.println("비교연산자 예제");
		int num1 = 50;
		int num2 = 30;
		boolean result;
		result = (num1 > num2);
		result = (num1 < num2);
		result = (num1 == num2); // 값이 같으면 true
		result = (num1 != num2); // 값이 틀리면 false
		System.out.println("result :" + result);
		
	}
}
