package com.phone;

public class OperatingSystemFactory {

	public OperatingSystem getOperatingSystem(String type) {
		if(type.equals("Samsung"))
			return new  Android();
		else if(type.equals("Apple"))
			return new  IOS();
		else
			return new  Windows();
	}
}
