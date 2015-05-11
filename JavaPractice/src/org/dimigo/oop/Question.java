/**
 * 
 */
package org.dimigo.oop;

import java.util.Scanner;

/**
 * <pre>
 * org.dimigo.oop
 *   |_ Question
 * 
 * 1. 개요 :
 * 2. 작성일 : 2015. 5. 11.
 * </pre>
 * @author		:고기현
 * @version		:1.0
 */
public class Question {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("가장 좋아하는 가수는?!");
		String answer = scanner.nextLine();
		if("IU".equalsIgnoreCase(answer)) {
			System.out.println("정답");
		}
		else {
			System.out.println("오답");
		}
		
		System.out.println("가장 좋아하는 과목은?!");
		String answer1 = scanner.nextLine();
		if("화학".equals(answer1)) {
			System.out.println("정답");
		}
		else {
			System.out.println("오답");
		}
		
		System.out.println("가장 좋아하는 배우는?!");
		String answer2 = scanner.nextLine();
		if("신민아".equalsIgnoreCase(answer2)) {
			System.out.println("정답");
		}
		else {
			System.out.println("오답");
		}
	}

}
