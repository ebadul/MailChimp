package com.mailchimp.automation.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DashboardPage extends PageBase {

	public DashboardPage() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath="//span[contains(@class,'inline-block freddicon menu-down margin--lv1 !margin-top-bottom--lv0 !margin-right--lv0')]")
	WebElement userButton;

	@FindBy(linkText="Log Out")
	WebElement logOutButton;

	@FindBy(xpath = "//*[@id=\"uniqName_3_0\"]/div/nav[1]/ul/li[5]/a")
	WebElement listsButton;

	@FindBy(xpath = "//*[@id=\"uniqName_3_0\"]/div/nav[1]/ul/li[4]/a")
	WebElement templatesButton;

	@FindBy(xpath = "//*[@id=\"uniqName_3_0\"]/div/nav[1]/ul/li[3]/a")
	WebElement campaignsButton;

	@FindBy(xpath = "//*[@id=\"freddielink\"]/img")
	WebElement homeImgButton;
	
	@FindBy(xpath = "//*[@id=\"uniqName_3_0\"]/div/nav[2]/ul/li[3]/a/div[2]/span[1]")
	WebElement currntUser;

	public void clickUser() {
		userButton.click();
	}

	public void clickHome() {
		homeImgButton.click();
	}

	public void clickCampaign() {
		campaignsButton.click();
	}

	public void clickTemplate() {
		templatesButton.click();
	}

	public CreateListPage clickOnCreateNewList() {
		listsButton.click();
		return new CreateListPage();
	}

	public LogoutPage logOutAction() {
		clickUser();
		logOutButton.click();
		return new LogoutPage();
	}

	public void clickBack() {
		driver.navigate().back();
	}


	public String getUser() {
		return currntUser.getText();
	}

}
