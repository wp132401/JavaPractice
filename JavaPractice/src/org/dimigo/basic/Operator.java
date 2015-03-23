package org.dimigo.basic;

public class Operator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float s1 = (float) ((float) (9 + 10) * 5.8 / 2);
		float s2 = (float) (9 * 5.4);
		
		System.out.println("<< 도형 넓이 비교 >>");
		System.out.println("사다리꼴 넓이 : " + s1);
		System.out.println("평행사변형 넓이 : " + s2);
		System.out.println("사다리꼴이 평행사변형 보다" + (s1-s2) + "만큼 더 큽니다.");
	}

}
