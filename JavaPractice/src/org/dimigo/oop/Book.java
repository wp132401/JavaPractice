/**
 * 
 */
package org.dimigo.oop;

public class Book {
	private String title = "미생";
	private String author = "윤태호";
	private int page = 1000;
	
	public String getTitle() {
		return title;
	}
	
	public String getAuthor() {
		return author;
	}
	
	public int getPage() {
		return page;
	}
	
	public void setTitle(String newTitle) {
		title = newTitle;
	}
	
	public void  setAuthor(String newAuthor) {
		author = newAuthor;
	}
	
	public void setPage(int newPage) {
		if(newPage >= 1){
			page = newPage;
		}
	}
}