package com.crm.contactTest;

import org.testng.annotations.Test;

public class ContactTest {
	
	@Test
	public void createContactTest() {
		
		System.out.println("execute createContactTest... ");
		
		String URL = System.getProperty("url");
		System.out.println(URL);
	String BROWSER = System.getProperty("browser");
	System.out.println(BROWSER);
		}
	
	
	@Test
	public void editContactTest() {
		System.out.println("execute editContactTest");
	}
	
	
	@Test
	public void deleteContactTest() {
		System.out.println("execute deleteContactTest");
	}

}
