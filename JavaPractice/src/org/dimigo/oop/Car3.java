/**
 * 
 */
package org.dimigo.oop;

/**
 * <pre>
 * org.dimigo.oop
 *   |_ Car3
 * 
 * 1. 개요 :
 * 2. 작성일 : 2015. 4. 21.
 * </pre>
 * @author		:고기현
 * @version		:1.0
 */
public class Car3 {
	private String company;	
	private String model;		
	private String color;		
	private int maxSpeed;		
	private int price;			
	
	// 기본 생성자
	public Car3() {
	}
	
	// 5개짜리
	public Car3(String company, String model, String color, int maxSpeed, int price) {
		this.company = company;
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
		this.price = price;
	}	
	
	//  4개짜리
	public Car3(String company, String model, String color, int maxSpeed) {
		// 바로 위 생성자 호출
		this(company, model, color, maxSpeed, 0);
	}

	//  3개짜리 
	public Car3(String company, String model, String color) {
		// 바로 위 생성자 호출
		this(company, model, color, 0);
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
