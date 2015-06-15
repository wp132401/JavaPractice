/**
 * 
 */
package org.dimigo.oop;

/**
 * <pre>
 * org.dimigo.oop
 *   |_ PiggyBank
 * 
 * 1. 개요 :
 * 2. 작성일 : 2015. 6. 15.
 * </pre>
 * @author		:고기현
 * @version		:1.0
 */
public class PiggyBank {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	private static int balance;
	public static void putMoney(FamilyMember member , int amount) {
		System.out.println(member.getMemeberName() + amount + "원 넣음");
		balance += amount;
	}
	
	public static void printBalance() {
		System.out.println("돼지 저금통 총 금액 : " + balance + "원");
	}
}
