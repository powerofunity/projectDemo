package com.ts;

import org.testng.annotations.DataProvider;

import org.testng.annotations.Test;

import com.agastya.base.TestBase;
import com.mv.dataproviders.DataSet;

public class ATests{
	
		 
	 
	 @Test(dataProvider="pincode data", dataProviderClass=DataSet.class)
	 public void m2(String pincode) {
		 System.out.println("Pincode: "+pincode); 
	 }
	 
	 public void m1() {
		 String dir = System.getProperty("user.dir");
		 System.out.println(dir);
	 }
	 
	 
}
