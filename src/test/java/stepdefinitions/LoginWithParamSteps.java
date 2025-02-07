//package stepdefinitions;
//
//import java.time.Duration;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.WebDriverWait;
//
//import io.cucumber.java.en.Given;
//import io.cucumber.java.en.Then;
//import io.cucumber.java.en.When;
//
//public class LoginWithParamSteps {
//
//	public WebDriver driver;
//	public WebDriverWait wait;
//
//	@Given("User is navigated to orange hrm login page")
//	public void user_is_navigated_to_orange_hrm_login_page() throws InterruptedException {
//		// saving the project path - where my project is in my current system
//		String projectPath = System.getProperty("user.dir");
//		// setting the webdriver path
//		System.setProperty("webdriver.chrome.driver", projectPath + "/src/test/resources/Drivers/chromedriver.exe");
//		// invoking the chrome driver and maximizing the driver
//		driver = new ChromeDriver();
//		driver.manage().window().maximize();
//		// navigating to orange hrm application
//		driver.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
//		Thread.sleep(10000);
//		// waiting for login button to appear
//		wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//		WebElement loginButton = driver.findElement(By.xpath("//button[@type=\"submit\"]"));
//		wait.until(ExpectedConditions.visibilityOf(loginButton));
//	}
//	
//	//Examples => <id>,<pwd> => GherkinStep => method param
//	
//	@When("^User enter valid (.+) and (.+)$")
//	public void user_enter_valid_id_and_pwd(String id, String pwd) {
//		// finding the username txt box and entering the username
//		driver.findElement(By.name("username")).sendKeys(id);
//		// finding the pwd txt box entering the password
//		driver.findElement(By.name("password")).sendKeys(pwd);
//	}
//
//	@When("click on login")
//	public void click_on_login() throws InterruptedException {
//		// finding the login button and clicking on it
//		driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
//		Thread.sleep(5000);
//	}
//
//	@Then("Verify user should be navigated to orange hrm home page")
//	public void verify_user_should_be_navigated_to_orange_hrm_home_page() throws InterruptedException {
//		try {
//			// verifying the user entered home page by looking at dashboard
//			WebElement dashboard = driver.findElement(By.xpath("//h6[text()='Dashboard']"));
//			if (dashboard.isDisplayed()) {
//				System.out.println("=====This User has Successfully logged into the application=====");
//			}
//			// if user had not entered the home page the get me the page url where he is
//		} catch (Exception e) {
//			Thread.sleep(5000);
//			e.printStackTrace();
//			System.out.println("=====This User has Failed to log into the application=====");
//			String url = driver.getCurrentUrl();
//			System.out.println("User is on this url : " + url);
//		} finally {
//			driver.quit();
//		}
//	}
//
//}
