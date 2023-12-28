package com.javaex.ex01pr;

public class Ex07pr {
	
	public static void main(String[] args) {
		
		int var00 = 4+5;
		System.out.println(var00);
		
		
		int a = 4;
		float b = 5.5f;
		
		double var01 = a+b;  // 정수+실수 일 경우 실수로 자동변환후 계산
		System.out.println(var01);
		
		
		double var02 = 4+5.5;
		System.out.println(var02);
		
		
		
		float v01 = 123.1234f;
		int v02 = (int)v01;
		
		System.out.println(v02);
		
		
		int v03 = 1234;
		byte v04 = (byte)v03;
		// 축소 형변환에서 값이 달라진 경우, int의 범위가 byte범위보다 커서?
		
		System.out.println(v04);
		
		int v05 = 100;
		byte v06 = (byte)v05;
		
		System.out.println(v06);
		// 축소 형변환이지만 변환하는 값이 byte 범위내라 그대로 ?
		
		byte v07 = 100;
		int v08 = (int)v07;
		
		System.out.println(v08);
		
		byte v09 = -128;
		int v10 = (int)v09;
		
		System.out.println(v10);
		
		// 확대 형변환의 경우 변환하려는 값이 범위가 넓은쪽의 형 변환으로 이루어져
		// 별문제없음. 그대로 변환됨
		
		
		
		double v11 = 7.54;
		int v12 = (int)v11;
		
		System.out.println(v12);
		
		int v13 = 4;
		double v14 = (double)v13;
		
		System.out.println(v14);
		
		
		
		
		
	}

}
