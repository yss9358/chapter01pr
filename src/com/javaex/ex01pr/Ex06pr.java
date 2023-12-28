package com.javaex.ex01pr;

public class Ex06pr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double pi = 3.14;
		double circlearea = pi*5*5; // r = 5
		
		System.out.println(circlearea);
		
		pi = 3.141592; // 설정한 값 변경시 바로 변수와 수정할 값 입력
		double result = pi*5*5; // r = 5
		
		System.out.println(result);
		
		
		final double Pi = 3.14;
		double result2 = Pi*5*5; // r = 5
		System.out.println(result2);
		
		

	}

}
