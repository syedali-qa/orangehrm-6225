package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePageObjects {

	public WebDriver driver;

	public HomePageObjects(WebDriver driver) {
		this.driver = driver;
	}

	By dashboardHeader = By.xpath("//h6[text()='Dashboard']");
	By adminModule = By.xpath("//span[text()='Admin']");
	By recruitmentModule = By.xpath("//span[text()='Recruitment']");

	public void clickAdminModule() {
		driver.findElement(adminModule).click();
	}

	public void clickRecuritmentModule() {
		driver.findElement(recruitmentModule).click();
	}

	public void verifyLoginSuccessfull() {
		try {
			WebElement dashBoard = driver.findElement(By.xpath("//h6[text()='Dashboard']"));
			if (dashBoard.isDisplayed()) {
				System.out.println("=======Login Successfull========");
			}
		} catch (Exception e) {
			System.out.println("=======Login Failed======");
			e.printStackTrace();
		}
	}

	public void verifyDashBoardPresent() {
		try {
			WebElement dashBoard = driver.findElement(By.xpath("//h6[text()='Dashboard']"));
			if (dashBoard.isDisplayed()) {
				System.out.println("=======User is on DashBoard========");
			}
		} catch (Exception e) {
			System.out.println("=======User not on DashBoard======");
			e.printStackTrace();
		}

	}

}
