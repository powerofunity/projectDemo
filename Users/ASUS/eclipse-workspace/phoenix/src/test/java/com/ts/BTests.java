package com.ts;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class BTests {
@BeforeMethod	
public void	m3(){
	System.out.println("Before Class");
}		
@BeforeTest	
public void m4() {
	System.out.println("Before Test");	
}
@BeforeSuite
public void m5() {
	System.out.println("Before Suite");
	
	
}
@Test
public void m6() {
System.out.println("TestCase of BTest");	
}
}