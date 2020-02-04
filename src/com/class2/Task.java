package com.class2;

import org.openqa.selenium.By;
import org.testng.annotations.BeforeMethod;

import com.utils.CommonMethods;
import com.utils.Constants;

/*
 * TC 1: HRMS Add Employee: 
Open chrome browser
Go to “http://166.62.36.207/humanresources/symfony/web/index.php/auth/login”
Login into the application
Click on Add Employee
Verify labels: Full Name, Employee Id, Photograph are displayed
Provide Employee First and Last Name
Verify Employee has been added successfully
Close the browser
 */
public class Task extends CommonMethods{
	@BeforeMethod
	public void open() {
		setUp("chrome",Constants.HRMS_URL);
		
			driver.findElement(By.id("txtUsername")).sendKeys("admin");
			driver.findElement(By.id("txtPassword")).sendKeys("Hum@nhrm123");
			driver.findElement(By.id("btnLogin")).click();
	}

	
}
