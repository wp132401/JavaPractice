package org.dimigo.basic;

public class PrimitiveDataType {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name = "아이유";	//이름
		int age = 23;	//나이
		double hight = 161.8;	//키
		float weight = (float) 44.3;	//몸무게
		char bloodtype = 'A';	//혈액형
		String gender1 = "";	//성별
		boolean gender;
		gender = true;
		if(gender){
			gender1 = "여자";
		}
		
		System.out.println("<< 아이유 프로필 >>\n");
		System.out.println("이름 : "+name);
		System.out.println("성별 : "+ gender1);
		System.out.printf("나이 : %d세\n", age);
		System.out.printf("키 : %.1fcm\n", hight);
		System.out.printf("몸무게 : %.1fkg\n", weight);
		System.out.printf("혈액형 : %c형\n", bloodtype);
	}

}
