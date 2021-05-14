package StepDefnitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class LoginSteps {

	WebDriver driver = null;

@Given("^Launch a web page in the browser$")
public void launch_a_web_page_in_the_browser(){
  System.setProperty("webdriver.chrome.driver","C:/Drivers/chromedriver_win32/chromedriver.exe");
  driver = new ChromeDriver();
  driver.get("http://demo.guru99.com/test/login.html");
  //driver.manage().window().maximize();
  
}
@Then("Enter the username and password")
public void enter_the_username_and_password()  {
	// Enter email id 
  WebElement email = driver.findElement(By.xpath("//input[@id='email']"));
  email.sendKeys("india123@gmail.com");
  
  //Enter password
  WebElement pass = driver.findElement(By.xpath("//input[@id='passwd']"));
  pass.sendKeys("123456789");
    }

@Then("^Click on submit button$")
public void click_on_submit_button()  {
    
	WebElement submit = driver.findElement(By.xpath("//i[@class='icon-lock left']"));
	  submit.click();
}

@Then("^Check if home page is displayed$")
public void check_if_home_page_is_displayed() {
	WebElement mess = driver.findElement(By.xpath("//div[@class='error-copy']"));
	if(mess.getText().contains("Successfully Logged in..."))
	{
    System.out.println("Successfully Logged in...");
}
	else {
		System.out.println("Login Unsucessful");
	}
	}


}
