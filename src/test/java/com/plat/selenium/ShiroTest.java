package com.plat.selenium;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

public class ShiroTest extends BaseTest {

	private WebDriver driver;
	
	@Before
	public void setUp() throws Exception {
		driver = getShiroLogin();
	}
	
	@Test
	public void testShiro() {
		System.out.println("=======testShiro========");
	}
}
