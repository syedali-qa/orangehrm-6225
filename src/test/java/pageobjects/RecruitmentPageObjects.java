package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RecruitmentPageObjects {

	public WebDriver driver;

	public RecruitmentPageObjects(WebDriver driver) {
		this.driver = driver;
	}

	By recruitmentHeader = By.xpath("//h6[text()='Recruitment']");

	public void verifyAdminPagePresent() {
		try {
			WebElement recruitment = driver.findElement(By.xpath("//h6[text()='Recruitment']"));
			if (recruitment.isDisplayed()) {
				System.out.println("=======User is on Recuitment Page========");
			}
		} catch (Exception e) {
			System.out.println("=======User is not on Recruitment Page======");
			e.printStackTrace();
		}
	}
}
