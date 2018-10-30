package com.phone;

public class Shop {

	public static void main(String[] args) {
		
		PhoneBuilder pb = new PhoneBuilder();
		pb.setBattery(3100);
		pb.setOs("Android");
		Phone p2 = pb.getPhone();
		System.out.println(p2.toString());
	}

}
