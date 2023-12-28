package com.javaex.ex01pr;

public class Ex09pr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//연산자 중 대입연산자
		// 대입연산자는 = 로 표시
		
		int a = 7, b = 3;
		
		// 산술연산자 + - * / %
		
		System.out.println(a+b);
		System.out.println(a-b);
		System.out.println(a*b);
		System.out.println(a/b);
		System.out.println(a%b);
		
		//  나누기( / ) 는 나누기 한 후 몫이 출력됨
		//  나누기( % ) 는 나누기 한 후 나머지가 출력됨
		System.out.println("---------------");
		
		System.out.println(7/3);
		System.out.println(7.0/3);
		System.out.println(7%3);
		System.out.println(7.0%3);
		
		// 정수인지 실수인지에 따라 나오는 표기값이 다름.
		// ( / ) 와 ( % ) 는 각각 나머지와 몫을 보여줌 
		
		System.out.println("---------------");
		
		// 부호연산자 ( + ), ( - )
		
		int var = -3;
		int pVar = +var;
		int mVar = -var;
		
		System.out.println(pVar);
		System.out.println(mVar);
		
		
		
		
		
		
		

	}

}
