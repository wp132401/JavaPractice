/**
 * 
 */
package org.dimigo.oop;

/**
 * <pre>
 * org.dimigo.oop
 *   |_ BookTest
 * 
 * 1. 개요 :
 * 2. 작성일 : 2015. 4. 10.
 * </pre>
 * @author		:고기현
 * @version		:1.0
 */
public class BookTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book book = new Book();
		Book book2 = new Book();
		
		System.out.println(book);
		System.out.println(book2);
		
		System.out.println(book.getTitle());
		System.out.println(book.getAuthor());
		System.out.println(book.getPage());
		System.out.println();
		
		book.setTitle("자바를 잡아라");
		book.setAuthor("김자바");
		book.setPage(2000);
		
		System.out.println(book2.getTitle());
		System.out.println(book2.getAuthor());
		System.out.println(book2.getPage());
	}

}
