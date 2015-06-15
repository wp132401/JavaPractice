/**
 * 
 */
package org.dimigo.oop;

/**
 * <pre>
 * org.dimigo.oop
 *   |_ FamilyMember
 * 
 * 1. 개요 :
 * 2. 작성일 : 2015. 6. 15.
 * </pre>
 * @author		:고기현
 * @version		:1.0
 */
public class FamilyMember {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	private static int memberCnt;
	private String memeberName;
	
	public FamilyMember(String memberName) {
		this.memeberName = memberName;
		memberCnt ++;
	}
	
	
	public int getMemberCnt() {
		return memberCnt;
	}

	public void setMemberCnt(int memberCnt) {
		this.memberCnt = memberCnt;
	}

	public String getMemeberName() {
		return memeberName;
	}

	
	public void setMemeberName(String memeberName) {
		this.memeberName = memeberName;
	}
	
	public static void printMemberCnt() {
		System.out.println("가족 총 인원 수 : " + memberCnt + "명");	
	}
	
}
