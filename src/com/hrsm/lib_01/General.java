package com.hrsm.lib_01;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Reporter;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class General extends Global {
	@BeforeTest
	public void open_application() throws InterruptedException {
		System.setProperty("webdriver.gecko.driver",
				"C:\\Users\\tech\\Selenium_Drivers\\geckodriver-v0.32.2-win32\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.navigate().to(link);
		System.out.println("application opened");
		Reporter.log("application opened");
		Thread.sleep(3000);

	}

	@AfterTest
	public void close_application() throws InterruptedException {
		driver.close();
		System.out.println("application closed");
		Reporter.log("application closed");
		Thread.sleep(3000);
	}

	public void login_application() throws InterruptedException {
		driver.findElement(By.name(txt_userName)).sendKeys(user_Name);
		driver.findElement(By.name(txt_password)).sendKeys(password);
		driver.findElement(By.name(btn_submit)).click();
		System.out.println("login done");
		Reporter.log("login done");
		Thread.sleep(3000);
	}

	public void logout_application() throws InterruptedException {
		driver.findElement(By.linkText(link_logout)).click();
		System.out.println("logout done");
		Reporter.log("logout done");
		Thread.sleep(3000);
	}

	public void mouseOver() throws InterruptedException {
		Actions mouse = new Actions(driver);
		mouse.moveToElement(driver.findElement(By.linkText(mouse_link))).perform();
		driver.findElement(By.linkText(addemp_link)).click();
		System.out.println("mouseover done");
		Reporter.log("mouseover done");
		Thread.sleep(3000);
	}

	public void switchtoFrame() throws InterruptedException {
		driver.switchTo().frame(frame_info);
		System.out.println("frame enter done");
		Reporter.log("frame enter done");
		Thread.sleep(3000);
	}

	public void frameExit() throws InterruptedException {
		driver.switchTo().defaultContent();
		System.out.println("frame exit done");
		Reporter.log("frame exit done");
		Thread.sleep(3000);
	}

	public void addEmp() throws InterruptedException {
		driver.findElement(By.name(txt_lastName)).sendKeys(last_Nmae);
		driver.findElement(By.name(txt_firstName)).sendKeys(first_Name);
		driver.findElement(By.xpath(btn_save)).click();
		driver.findElement(By.xpath(btn_back)).click();
		System.out.println("add emp done");
		Reporter.log("add emp done");
		Thread.sleep(3000);
	}

	public void searchemp() throws InterruptedException {
		Select drpdwn = new Select(driver.findElement(By.name(drdwn_info)));
		drpdwn.selectByIndex(drpdwn_Value);
		driver.findElement(By.name(txt_search)).sendKeys(search_Value);
		driver.findElement(By.xpath(btn_search)).click();
		System.out.println("dropdwn done");
		Reporter.log("dropdwn done");
		Thread.sleep(3000);
	}

	public void delEmp() throws InterruptedException {
		driver.findElement(By.name(ckbx_info)).click();
		driver.findElement(By.xpath(btn_delete)).click();
		System.out.println("delemp done");
		Reporter.log("delemp done");
		Thread.sleep(3000);
	}

}
