/**
 * 
 */
package org.dimigo.collection;

import java.util.ArrayList;
import java.util.List;

/**
 * <pre>
 * org.dimigo.collection
 *   |_ MelonChart
 * 
 * 1. 개요 :
 * 2. 작성일 : 2015. 9. 23.
 * </pre>
 * @author		:고기현
 * @version		:1.0
 */
public class MelonChart {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Music> list = new ArrayList<Music>();
		list.add(new Music("내 첫사랑", "베리굿"));
		list.add(new Music("보통인생", "박경"));
		list.add(new Music("취향저격", "iKON"));
		
		System.out.println("-- << 멜론 챠트 >> --");
		printList(list);
		
		System.out.println("-- << 2위 곡 추가 >> --");
		list.add(1, new Music("레옹", "이유갓지않은이유"));
		printList(list);
		
		System.out.println("-- << 3위 곡 변경 >> --");
		list.set(2, new Music("맙소사", "황태지"));
		printList(list);
		
		System.out.println("-- << 4위 곡 삭제 >> --");
		list.remove(3);
		printList(list);
		
		System.out.println("-- << 전체 리스트 삭제 >> --");
		list.clear();
		
		
		
	}
	
	public static void printList(List<Music> list) {
		for(Music value : list) {
			System.out.println(value);
		}
	}

}
