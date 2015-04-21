/**
 * 
 */
package org.dimigo.oop;

/**
 * <pre>
 * org.dimigo.oop
 *   |_ Car2
 * 
 * 1. 개요 :
 * 2. 작성일 : 2015. 4. 7.
 * </pre>
 * @author		:고기현
 * @version		:1.0
 */
public class Car2 {
	private String company;		// 회사명
	private String model;		// 모델명
	private String color;		// 색상
	private int maxSpeed;		// 최대속도
	private int price;			// 가격
	
	// 기본 생성자
	public Car2() {
	}
	
	// 매개변수 5개짜리 생성자
	public Car2(String newCompany, String newModel, String newColor, int newMaxSpeed, int newPrice) {
		company = newCompany;
		model = newModel;
		color = newColor;
		maxSpeed = newMaxSpeed;
		price = newPrice;
	}
	
	
	public String getCompany() {
		return company;
	}	

	
	public String getModel() {
		return model;
	}

	
	public String getColor() {
		return color;
	}

	
	public int getMaxSpeed() {
		return maxSpeed;
	}

		public int getPrice() {
		return price;
	}	
		
}
