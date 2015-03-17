package org.dimigo.basic;

public class Promotion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long month_pay = 1700000; 	//평균 월급
		int worker = 3;	//직원수
		int store_num = 1500;	//점포수
		
		long year_pay = month_pay * 12 * worker * store_num;	//연간 인건비
		
		System.out.println("<< 디미베네 연간 인건비 >>");
		System.out.println("월 평균 급여 :" + String.format("%,d", month_pay) + "원");
		System.out.println("점포 내 직원 수 :" + worker + "명");
		System.out.println("점포 수 :" + String.format("%,d", store_num) + "개");
		System.out.println("\n");
		
		System.out.println("연간 인건비 :" + String.format("%,d", year_pay) + "원");
	}

}
