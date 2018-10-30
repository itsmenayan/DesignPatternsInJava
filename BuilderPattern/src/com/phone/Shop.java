package com.phone;

public class Shop {

	public static void main(String[] args) {
		
		/*Phone p = new Phone("IOS",2,"Qualcomm",5.5,3000);
		System.out.println(p.toString());*/
		
		PhoneBuilder pb = new PhoneBuilder();
		pb.setBattery(3100);
		pb.setOs("Android");
		Phone p2 = pb.getPhone();
		System.out.println(p2.toString());
	}

}
