package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AdminPageObjects {

	public WebDriver driver;

	public AdminPageObjects(WebDriver driver) {
		this.driver = driver;
	}

	By adminHeader = By.xpath("//h6[text()='User Management']");

	public void verifyAdminPagePresent() {
		try {
			WebElement admin = driver.findElement(By.xpath("//h6[text()='User Management']"));
			if (admin.isDisplayed()) {
				System.out.println("=======User is on AdminPage========");
			}
		} catch (Exception e) {
			System.out.println("=======User is not on AdminPage======");
			e.printStackTrace();
		}
	}
}
