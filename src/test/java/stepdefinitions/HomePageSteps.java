package stepdefinitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import pageobjects.AdminPageObjects;
import pageobjects.HomePageObjects;
import pageobjects.LoginPageObjects;
import pageobjects.RecruitmentPageObjects;

public class HomePageSteps {

	public WebDriver driver;
	public LoginPageObjects lo;
	public HomePageObjects ho;
	public AdminPageObjects ao;
	public RecruitmentPageObjects ro;

	@Given("User opens chrome browser")
	public void user_opens_chrome_browser() {
		WebDriverManager.edgedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();

	}

	@When("User enter orangehrm and login with valid credentials")
	public void user_enter_orangehrm_and_login_with_valid_credentials() throws InterruptedException {
		driver.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(5000);
		lo = new LoginPageObjects(driver);
		lo.setUsername("Admin");
		lo.setPassword("admin123");
		lo.clickLogin();
		Thread.sleep(3000);
		ho = new HomePageObjects(driver);
		ho.verifyLoginSuccessfull();
	}

	@Then("User navigated to home page dashboard module")
	public void user_navigated_to_home_page_dashboard_module() throws InterruptedException {
		Thread.sleep(3000);
		ho.verifyDashBoardPresent();
	}

	@Then("verify user able to see Dashboard Page")
	public void verify_user_able_to_see_dashboard_page() throws InterruptedException {
		Thread.sleep(3000);
		ho.verifyDashBoardPresent();
	}

	@When("User click on the Admin at sidebar")
	public void user_click_on_the_admin_at_sidebar() throws InterruptedException {
		Thread.sleep(3000);
		ho.clickAdminModule();
	}

	@Then("User is navigated to Admin page")
	public void user_is_navigated_to_admin_page() throws InterruptedException {
		Thread.sleep(3000);
		ao = new AdminPageObjects(driver);
		ao.verifyAdminPagePresent();
	}

	@When("User click on the Recruitment at sidebar")
	public void user_click_on_the_recruitment_at_sidebar() throws InterruptedException {
		Thread.sleep(3000);
		ho.clickRecuritmentModule();
	}

	@Then("User is navigated to Recruitment page")
	public void user_is_navigated_to_recruitment_page() throws InterruptedException {
		Thread.sleep(3000);
		ro = new RecruitmentPageObjects(driver);
		ro.verifyAdminPagePresent();

	}

	@After
	public void closeBrowser() {
		if (driver != null) {
			driver.quit();
		}
	}

}
