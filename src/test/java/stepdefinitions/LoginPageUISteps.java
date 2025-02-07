package stepdefinitions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.After;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginPageUISteps {

	public WebDriver driver;
	public WebDriverWait wait;

	@Given("User opens the chrome browser")
	public void user_opens_the_chrome_browser() throws InterruptedException {
		// saving the project path - where my project is in my current system
		String projectPath = System.getProperty("user.dir");
		// setting the webdriver path
		System.setProperty("webdriver.chrome.driver", projectPath + "/src/test/resources/Drivers/chromedriver.exe");
		// invoking the chrome driver and maximizing the driver
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		// navigating to orange hrm application
		driver.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(10000);
	}

	@When("User is on orange hrm login page")
	public void user_is_on_orange_hrm_login_page() {
		String loginUrl = "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
		if (driver.getCurrentUrl().equals(loginUrl)) {
			System.out.println("User is on Login Page");
		} else {
			System.out.println("User is on this url: " + driver.getCurrentUrl());
		}
	}

	@When("wait for Orangehrm branding")
	public void wait_for_orangehrm_branding() {
		wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		WebElement companyLogo = driver.findElement(By.xpath("//img[@alt=\"company-branding\"]"));
		wait.until(ExpectedConditions.visibilityOf(companyLogo));
	}

	@Then("User should see Orangehrm branding on the login page")
	public void user_should_see_orangehrm_branding_on_the_login_page() {
		WebElement companyLogo = driver.findElement(By.xpath("//img[@alt=\"company-branding\"]"));
		if (companyLogo.isDisplayed() == true) {
			System.out.println("=====Company Branding Displayed Successfully======");
		} else {
			System.out.println("=====Failed to display Company Branding=====");
		}
	}

	@When("wait for login button")
	public void wait_for_login_button() {
		wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		WebElement loginButton = driver.findElement(By.xpath("//button[@type=\"submit\"]"));
		wait.until(ExpectedConditions.visibilityOf(loginButton));

	}

	@Then("User should see login button on the login page")
	public void user_should_see_login_button_on_the_login_page() {
		WebElement loginButton = driver.findElement(By.xpath("//button[@type=\"submit\"]"));
		if (loginButton.isDisplayed() == true) {
			System.out.println("=====Login Button Displayed Successfully======");
		} else {
			System.out.println("=====Failed to display Login Button=====");
		}

	}

	@When("wait for forgot password link")
	public void wait_for_forgot_password_link() {
		wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		WebElement forgotPwd = driver.findElement(By.xpath("//p[text()='Forgot Your Password? ']"));
		wait.until(ExpectedConditions.visibilityOf(forgotPwd));
	}

	@Then("User should see forgot password link on the login page")
	public void user_should_see_forgot_password_link_on_the_login_page() {
		WebElement forgotPwd = driver.findElement(By.xpath("//p[text()='Forgot Your Password? ']"));
		if (forgotPwd.isDisplayed() == true) {
			System.out.println("=====Forgot Pwd Link Displayed Successfully======");
		} else {
			System.out.println("=====Failed to display Forgot Pwd link=====");
		}

	}

	@When("wait for forgot copyright symbol")
	public void wait_for_forgot_copyright_symbol() {
		wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		WebElement copyRightSymbol = driver.findElement(By.xpath("//p[text()='© 2005 - 2025 ']"));
		wait.until(ExpectedConditions.visibilityOf(copyRightSymbol));

	}

	@Then("User should see copyright symbol on the login page")
	public void user_should_see_copyright_symbol_on_the_login_page() {

		WebElement copyRightSymbol = driver.findElement(By.xpath("//p[text()='© 2005 - 2025 ']"));
		if (copyRightSymbol.isDisplayed() == true) {
			System.out.println("=====copyRightSymbol Displayed Successfully======");
		} else {
			System.out.println("=====Failed to display copyRightSymbol=====");
		}
	}

	@After
	public void closeBrowser() {
		driver.quit();
	}

}
