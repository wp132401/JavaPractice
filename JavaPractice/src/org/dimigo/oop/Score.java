/**
 * 
 */
package org.dimigo.oop;

import java.util.Scanner;

/**
 * <pre>
 * org.dimigo.oop
 *   |_ Score
 * 
 * 1. 개요 :
 * 2. 작성일 : 2015. 5. 12.
 * </pre>
 * @author		:고기현
 * @version		:1.0
 */
public class Score {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("국어점수 입력 => ");
		int kor = scanner.nextInt();
		System.out.println("수학점수 입력 => ");
		int math = scanner.nextInt();
		System.out.println("영어점수 입력 => ");
		int english = scanner.nextInt();
		
		System.out.println("<< 점수출력 >>");
		String sb = new StringBuilder("국어점수 => ")
			.append(kor)
			.append("\n")
			.append("수학점수 => ")
			.append(math)
			.append("\n")
			.append("영어점수 => ")
			.append(english)
			.append("\n")
			.append("평균 => ")
			.append(String.format("%.1f",(kor+math+english)/3.0)).toString();
		
		System.out.println(sb);
	}

}
