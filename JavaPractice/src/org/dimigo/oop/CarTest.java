/**
 * 
 */
package org.dimigo.oop;

/**
 * <pre>
 * org.dimigo.oop
 *   |_ CarTest
 * 
 * 1. 개요 :
 * 2. 작성일 : 2015. 4. 13.
 * </pre>
 * @author		:고기현
 * @version		:1.0
 */
public class CarTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("<< 자동차 목록 >>");
		
		// 기본 생성자를 이용한 객체 생성
		Car genesis = new Car();
		genesis.setCompany("현대자동차");
		genesis.setModel("제네시스");
		genesis.setColor("검정색");
		genesis.setMaxSpeed(225);
		genesis.setPrice(50000000);
		
		Car k7 = new Car();
		k7.setCompany("기아자동차");
		k7.setModel("K7");
		k7.setColor("흰색");
		k7.setMaxSpeed(246);
		k7.setPrice(40000000);
			
		Car sm7 = new Car();
		sm7.setCompany("삼성자동차");
		sm7.setModel("SM7");
		sm7.setColor("회색");
		sm7.setMaxSpeed(200);
		sm7.setPrice(38000000);
		
		System.out.println("제조사명 : " + genesis.getCompany());
		System.out.println("모델명 : " + genesis.getModel());
		System.out.println("색상 : " + genesis.getColor());
		System.out.println("최대속도 : " + genesis.getMaxSpeed() + "km");
		System.out.println("가격 : " + String.format("%,d", genesis.getPrice()) + "원");
		System.out.println();
		
		System.out.println("제조사명 : " + k7.getCompany());
		System.out.println("모델명 : " + k7.getModel());
		System.out.println("색상 : " + k7.getColor());
		System.out.println("최대속도 : " + k7.getMaxSpeed() + "km");
		System.out.println("가격 : " + String.format("%,d", k7.getPrice()) + "원");
		System.out.println();
		
		System.out.println("제조사명 : " + sm7.getCompany());
		System.out.println("모델명 : " + sm7.getModel());
		System.out.println("색상 : " + sm7.getColor());
		System.out.println("최대속도 : " + sm7.getMaxSpeed() + "km");
		System.out.println("가격 : " + String.format("%,d", sm7.getPrice()) + "원");
		System.out.println();
		
	}

}
