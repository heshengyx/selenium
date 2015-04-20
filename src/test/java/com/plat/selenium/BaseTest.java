package com.plat.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.ie.InternetExplorerDriver;

public abstract class BaseTest {

	public WebDriver getLogin() {
		WebDriver driver = new InternetExplorerDriver();

		// 让浏览器访问 Baidu
		driver.get("http://10.118.243.68:8086");
		//password
		// 通过 id 找到 input 的 DOM
		WebElement element = driver.findElement(By.id("username"));
		element.sendKeys("000021");
		element = driver.findElement(By.id("password"));
		element.sendKeys("active.123");
		element = driver.findElement(By.className("logn_btn"));
		// 提交 input 所在的 form
		element.click();
		return driver;
	}
	
	public WebDriver getShiroLogin() {
		WebDriver driver = new InternetExplorerDriver();

		// 让浏览器访问 Baidu
		driver.get("http://127.0.0.1:8080/login.jsp");
		//password
		// 通过 id 找到 input 的 DOM
		WebElement element = driver.findElement(By.id("userName"));
		element.sendKeys("admin");
		element = driver.findElement(By.id("password"));
		element.sendKeys("123456");
		element = driver.findElement(By.id("submit"));
		// 提交 input 所在的 form
		element.click();
		return driver;
	}
}
