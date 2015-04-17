package com.plat.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.Select;

public class CbeTest extends BaseTest {

	public void testing() {
		WebDriver driver = getLogin();
		
		//href_eacctarManager
		WebElement element = driver.findElement(By.id("href_eacctarManager"));
		element.click();
		//eacctArPageList
		element = driver.findElement(By.name("eacctArPageList"));
		element.click();
		
		element = driver.findElement(By.id("tradeStartDate"));
		element.clear();
		element.sendKeys("2015-01-01");//
		element = driver.findElement(By.id("tradeEndDate"));
		element.clear();
		element.sendKeys("2015-04-01");//

		Select select = new Select(driver.findElement(By.id("deptCode")));
		select.selectByValue("755Y"); 
		select = new Select(driver.findElement(By.id("corpCode")));
		select.selectByValue("C102"); 
		element = driver.findElement(By.id("search_btn"));
		element.click();
		
		//editing
		element = driver.findElement(By.id("editing851745"));
		element.click();
		//element = driver.findElement(By.id("reverse851745"));
		//element.click();
		//cancel-Chargebtn
		//element = driver.findElement(By.id("cancel-Chargebtn"));
		//element.click();
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		/*WebDriver driver = new InternetExplorerDriver();

		// 让浏览器访问 Baidu
		driver.get("http://127.0.0.1:9081");
		//password
		// 通过 id 找到 input 的 DOM
		WebElement element = driver.findElement(By.id("username"));
		element.sendKeys("000021");
		element = driver.findElement(By.id("password"));
		element.sendKeys("active.123");
		element = driver.findElement(By.className("logn_btn"));
		// 提交 input 所在的 form
		element.click();*/
		
		CbeTest test = new CbeTest();
		test.testing();
	}

}
