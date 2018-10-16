package com.prototype;
public class Demo {

	public static void main(String[] args) throws CloneNotSupportedException {

		BookShop shop1 = new BookShop();
		shop1.setShopName("Shop 1");
		shop1.loadBooks();
		System.out.println(shop1.toString());
		
		/*BookShop shop2 = new BookShop();
		shop2.setShopName("Shop 2");
		shop2.loadBooks();
		System.out.println(shop2.toString());*/
		
		BookShop shop3 = (BookShop) shop1.clone();
		shop3.setShopName("Shop 3");
		//shop3.loadBooks();
		System.out.println(shop3.toString());
		
		
		

	}

}
