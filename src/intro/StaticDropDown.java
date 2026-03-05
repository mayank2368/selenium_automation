package intro;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class StaticDropDown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");

//		WebElement staticDropdown = driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
//		Select dropdown = new Select(staticDropdown);
//		dropdown.selectByIndex(3);
//		System.out.println(dropdown.getFirstSelectedOption().getText());
//		dropdown.selectByVisibleText("AED");
//		System.out.println(dropdown.getFirstSelectedOption().getText());
//		dropdown.selectByValue("INR");
//		System.out.println(dropdown.getFirstSelectedOption().getText());
//
		driver.findElement(By.id("divpaxinfo")).click();
		Thread.sleep(2000);
//		int i = 1;
//		while (i < 5) {
//			driver.findElement(By.id("hrefIncAdt")).click();
//			i++;
//		}
		System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
		for (int i = 1; i < 5; i++) {
			driver.findElement(By.id("hrefIncAdt")).click();
		}

		driver.findElement(By.id("btnclosepaxoption")).click();
		Assert.assertEquals(driver.findElement(By.id("divpaxinfo")).getText(), "5 Adult");
		System.out.println(driver.findElement(By.id("divpaxinfo")).getText());

		// Count the number of check boxes

		System.out.println(driver.findElements(By.cssSelector("input[type='checkbox']")).size());

		//
		Assert.assertFalse(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());
//		Assert.assertFalse(false);
//
//		System.out.println(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());

		driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).click();

		System.out.println(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());
		Assert.assertTrue(true);
		Thread.sleep(2000);
		driver.close();

	}

}
