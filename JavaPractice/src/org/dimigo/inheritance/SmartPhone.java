/**
 * 
 */
package org.dimigo.inheritance;

/**
 * <pre>
 * org.dimigo.inheritance
 *   |_ SmartPhone
 * 
 * 1. 개요 :
 * 2. 작성일 : 2015. 8. 25.
 * </pre>
 * @author		:고기현
 * @version		:1.0
 */
public class SmartPhone {
	
	private String model;
	private String company;
	private int price;
	
	SmartPhone() {
		
	}
	
	public SmartPhone(String model, String company, int price) {
		this.model = model;
		this.company = company;
		this.price = price;
	}
	
	public void turnOn() {
		System.out.println(model +  "의 전원을 켭니다.");
	}
	
	public void turnOff() {
		System.out.println(model + " 의 전원을 끕니다.");
	}
	
	public void pay() {
		System.out.println(company + "페이로 결제 합니다.");
	}
	
	public void useSpecialFunction(SmartPhone phone) {
		if(phone instanceof IPhone) {
			IPhone i = (IPhone) phone;
			i.useSpecialFunction();
		} else {
			Galaxy g = (Galaxy) phone;
			g.useSpecialFunction();
		}
	}
	
	public String toString() {
		return "모델명 : " + model + "제조사 : " + company + "가격 : " + price;
	}
}
