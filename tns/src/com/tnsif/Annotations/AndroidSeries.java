package com.tnsif.Annotations;
//Program to demonstrate class to use user defined annotations
@SmartTV(os = "android", height = 40, width = 50)
@SmartPhone(os = "iphone", version = 12)
class AndroidSeries {
	String model;
	int screenSize;
	//parameterized constructed
	public AndroidSeries(String model, int screenSize) {
		this.model = model;
		this.screenSize = screenSize;
	}
}