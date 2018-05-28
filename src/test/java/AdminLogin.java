import org.openqa.selenium.By;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


//AdminLogin


public class AdminLogin (WebDriver driver, String username, String password) {

    this.driver = driver;
    PageFactory.initElements(driver, this)


    //Webdriver driver;


     driver.findElement(By.name("username")).sendKeys(username);
        driver.findElement(By.name("password")).sendKeys(password);
        driver.findElement(By.cssSelector("[type='submit']")).click();


private void Appearance() throws InterruptedException {
        driver.findElement(By.xpath(".//*[@id='app-']/a/span[2]")).click();// Appearance
        Thread.sleep(1000);
}
