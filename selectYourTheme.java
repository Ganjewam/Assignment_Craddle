package com.cardddle.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class selectYourTheme {
	WebDriver driver
	//ldriver = rdriver;

	public selectYourTheme(WebDriver driver)
	{

		this.driver;
		PageFactory.initElements(driver,this);
	}
	//Activate to Show View Count
	@FindBy(xpath= "//*[@id=\\\"animatingH1\\\"]/div[1]/div/div[2]/label")
	WebElement showViewCount;
	
	// upload profile image
	(xpath = "*[@id=\\\"Profile_image_card_1\\\"]/span")
	WebElement profileImage;
	
	// upload background image
	
	@FindBy(xpath = "//*[@id=\\\"Profile_image_card_1\\\"]/span/text()")
	WebElement backgroundImage;
	
	
public void showViewCount() {
	showViewCount.click();
}

public void profileImage() {
	profileImage.click();
}
public void backgroundImage() {
	backgroundImage.click();
}
    
    
}
