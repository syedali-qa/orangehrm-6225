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
import io.github.bonigarcia.wdm.WebDriverManager;
import pageobjects.LoginPageObjects;

public class LoginPageSteps {

	public WebDriver driver;
	WebDriverWait wait;
	public LoginPageObjects lo;

	@Given("User opens chrome")
	public void user_opens_chrome() throws InterruptedException {
		// old way of setting webdriver path
//		String projectPath = System.getProperty("user.dir");
//		System.setProperty("webdriver.chrome.driver", projectPath + "src/test/resources/Drivers/chromedriver.exe");

		// new way of setting the webdriver path
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		lo = new LoginPageObjects(driver);
		Thread.sleep(3000);
	}

	@Given("navigates to orange hrm app")
	public void navigates_to_orange_hrm_app() throws InterruptedException {
		driver.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(5000);
	}

	@When("^User enter valid (.+) and (.+)$")
	public void user_enter_valid_id_and_pwd(String id, String pwd) {
		// finding the username txt box and entering the username
//		driver.findElement(By.name("username")).sendKeys(id);
		lo.setUsername(id);

		// finding the pwd txt box entering the password
//		driver.findElement(By.name("password")).sendKeys(pwd);
		lo.setPassword(pwd);
	}

	@When("User click on login")
	public void user_click_on_login() throws InterruptedException {
//		driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
		lo.clickLogin();
		Thread.sleep(5000);
	}

	@Then("User should be navigated to home page")
	public void user_should_be_navigated_to_home_page() throws InterruptedException {
		try {
			// verifying the user entered home page by looking at dashboard
			WebElement dashboard = driver.findElement(By.xpath("//h6[text()='Dashboard']"));
			if (dashboard.isDisplayed()) {
				System.out.println("=====This User has Successfully logged into the application=====");
			}
			// if user had not entered the home page the get me the page url where he is
		} catch (Exception e) {
			Thread.sleep(5000);
			e.printStackTrace();
			System.out.println("=====This User has Failed to log into the application=====");
			String url = driver.getCurrentUrl();
			System.out.println("User is on this url : " + url);
		}
	}

	@After
	public void closeBrowser() {
		if (driver != null) {
			driver.quit();
		}
	}

}
