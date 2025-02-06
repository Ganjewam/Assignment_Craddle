package com.cardddle.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class cardsPage {

	WebDriver driver
	//ldriver = rdriver;

	public cardsPage(WebDriver driver)
	{

		this.driver;
		PageFactory.initElements(driver,this);
	}
	@FindBy(xpath= "//*[@id=\\\"cards_create\\\"]/span")
	WebElement cards;
	
	@FindBy(xpath= "//*[@id=\\\"allcarddemo\\\"]/div/div/div/div[2]/a/button")
	WebElement createBtn;
	
	@FindBy(css= "\"#Contenetop > div > div.row > div > div > div > div > div > div:nth-child(1) > div > div:nth-child(2) > div > div > button\"")
	WebElement createBtnTheme;
	
	@FindBy(id= "modalLabel")
	WebElement modalLabel;
	
	@FindBy(id = "card_name")
	WebElement cardname;
	
	@FindBy(id = "profile_data")
	WebElement profileDataBtn;
	


public void clickOnCards(){
	cards.click();
	
}
public void clickOncreateBtnTheme() {
	createBtnTheme.click();
}
public void modalLabel() {
driver.switchTo().alert();
}
public void entercardName() {
	cardName.sendkeys("Kalpana G");
}
public void clickOnprofileDataBtn() {
	profileDataBtn.click();
}
}