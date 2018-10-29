package com.prototype;

import java.util.ArrayList;
import java.util.List;

public class BookShop implements Cloneable{
	
	private String shopName;	
	private List<Book> books = new ArrayList<Book>();
	public String getShopName() {
		return shopName;
	}
	public void setShopName(String shopName) {
		this.shopName = shopName;
	}
	public List<Book> getBooks() {
		return books;
	}
	public void setBooks(List<Book> books) {
		this.books = books;
	}
	
	public void loadBooks() {
		//Costly DB operation or complex business logic for setting the properties
		for(int i=0;i<10;i++) {
			Book book = new Book();
			book.setBookId(i);
			book.setBookName("Book "+i);
			getBooks().add(book);
		}
	}
	
	
	
	@Override
	public Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
	
	@Override
	public String toString() {
		return "BookShop [shopName=" + shopName + ", books=" + books + "]";
	}
	
	
}
