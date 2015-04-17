package com.plat.selenium;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class JunitTest extends BaseTest {
	
	private final static Logger logger = LoggerFactory.getLogger(JunitTest.class);

	private WebDriver driver;
	
	@Before
	public void setUp() throws Exception {
		driver = getLogin();
	}
	
	@Test
	public void testPaymentClaim() {
		logger.info("===============testPaymentClaim==================");
		(new WebDriverWait(driver, 2)).until(new ExpectedCondition<Boolean>() {
			public Boolean apply(WebDriver d) {
				return true;
			}
		});
		WebElement element = driver.findElement(By.id("href_eacctarManager"));
		element.click();
		(new WebDriverWait(driver, 2)).until(new ExpectedCondition<Boolean>() {
			public Boolean apply(WebDriver d) {
				return true;
			}
		});
		element = driver.findElement(By.name("eacctArPageList"));
		element.click();
		
		element = driver.findElement(By.id("tradeStartDate"));
		element.clear();
		element.sendKeys("2015-01-03");//
		element = driver.findElement(By.id("tradeEndDate"));
		element.clear();
		element.sendKeys("2015-04-01");//

		Select select = new Select(driver.findElement(By.id("deptCode")));
		select.selectByValue("755Y"); 
		select = new Select(driver.findElement(By.id("corpCode")));
		select.selectByValue("C102"); 
		element = driver.findElement(By.id("search_btn"));
		element.click();
		
		element = driver.findElement(By.id("editing851745"));
		element.click();
	}
}
