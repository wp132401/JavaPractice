/**
 * 
 */
package org.dimigo.inheritance;

/**
 * <pre>
 * org.dimigo.inheritance
 *   |_ SmartPhoneTest
 * 
 * 1. 개요 :
 * 2. 작성일 : 2015. 8. 25.
 * </pre>
 * @author		:고기현
 * @version		:1.0
 */
public class SmartPhoneTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IPhone ip = new IPhone("iPhone 6", "애플", 700000);
		Galaxy gp = new Galaxy("갤럭시 S6", "삼성", 650000);
		
		System.out.println(ip);
		ip.turnOn();
		ip.pay();
		ip.useSpecialFunction();
		ip.turnOff();
		
		System.out.println(gp);
		gp.turnOn();
		gp.pay();
		gp.useSpecialFunction();
		gp.turnOff();
		
	}

}
