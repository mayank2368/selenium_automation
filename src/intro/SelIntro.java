package intro;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.WebDriver;

public class SelIntro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Invoking Browser
		
		//Firefox Launch
		//Gecko driver
        //WebDriver driver =  new FirefoxDriver();
		//System.setProperty("webdriver.gecko.driver", "/Users/mayank-admin/selenium-automation/geckodriver.exe");
		
		
		//Microsoft Edge Launch
		//Edge driver
//		WebDriver driver = new EdgeDriver();
//		System.setProperty("webdriver.gecko.driver", "/Users/mayank-admin/selenium-automation/edgedriver.exe");
				

//		System.setProperty("webdriver.chrome.driver", "/Users/mayank-admin/selenium-automation/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com");
		System.out.println(driver.getTitle()); // driver.getTitle();
		System.out.println(driver.getCurrentUrl());
		driver.close();
		driver.quit();
		}

}
