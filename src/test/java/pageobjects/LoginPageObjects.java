package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPageObjects {

	public WebDriver driver;

	public LoginPageObjects(WebDriver driver) {
		this.driver = driver;
	}

	By userNameTxtBox = By.name("username");
	By pwdTxtBox = By.name("password");
	By loginButton = By.xpath("//button[@type=\"submit\"]");

	public void setUsername(String username) {
		driver.findElement(userNameTxtBox).sendKeys(username);
	}

	public void setPassword(String pwd) {
		driver.findElement(pwdTxtBox).sendKeys(pwd);
	}

	public void clickLogin() {
		driver.findElement(loginButton).click();
	}

}
