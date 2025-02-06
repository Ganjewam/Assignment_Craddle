package com.cardddle.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.FindBy;

public class LoginPage { //pageobjects

	WebDriver driver
	//ldriver = rdriver;

	public LoginPage(WebDriver driver)
	{

		this.driver;
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(xpath = "/html/body/div[1]/nav/div[1]/div/div[3]/div[2]/a")
	WebElement LoginButton;
	
	@FindBy(id = "id(\"email\"))")
	WebElement userEmail;
	
	@FindBy(id= "password")
	WebElement userPassword;
	
	@FindBy(xpath= "//*[@id=\\\"cards_create\\\"]/span")
	WebElement cards;
	
	
	public void LoginButton()
	{
		LoginButton.click();
	}
	
	public void enterUserEmail()
	{
		userEmail.sendKeys("kalpana@gmail.com");
	}
	public void enterUserPassword()
	{
		
	userPassword.sendKeys("Test@123");
	}
	public  void clickOnCards()
	{
		cards.click();
	}
}
