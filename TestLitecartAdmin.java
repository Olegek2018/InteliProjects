import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestLitecartAdmin {

WebDriver driver;

@BeforeClass// @BeforeMethod
    public void setup() {
   // driver = new ChromeDriver();
   // driver = new FirefoxDriver();

//delete 2 files (*.pswg...)
    System.setProperty("webdriver.chrome.driver", "C:/Users/Oleg/Downloads/chromedriver_win32/chromedriver.exe");//input in parameterized..
            driver = new ChromeDriver();
}
    /*//ChromeDriverManger.getInstance().setup();

            driver.manage().window().maximize();
}*/

@Test
    public void testCanLoginAsAdmin() throws InterruptedException {
    open();
    Thread.sleep(2000);
    login("", "mysql");
    Thread.sleep(2000);
    clickall();



    //driver.get("https://mam+amia.ua");
}

@Test
    public void testCheckAlertMessageForEmptyUserData() throws InterruptedException {
    open();
    String alertText;
    driver.findElement(By.cssSelector("[type='submit']")).click();
    Thread.sleep(2000);
    alertText = driver.findElement(By.cssSelector(".alert.alert-danger")).getText();
    Thread.sleep(2000);
    Assert.assertEquals(alertText, "x"+ "\n" + "Provide a username");

}

public void login (String username, String password) throws InterruptedException {
    //for pop up window with login form (chrome)

    /*driver.switchTo().alert();
//Selenium-WebDriver Java Code for entering Username & Password as below:
    driver.findElement(By.id("username")).sendKeys(username);
    driver.findElement(By.id("password")).sendKeys(password);
    driver.switchTo().alert().accept();
    driver.switchTo().defaultContent();*/



    driver.findElement(By.name("username")).sendKeys(username);
    driver.findElement(By.name("password")).sendKeys(password);
    driver.findElement(By.cssSelector("[type='submit']")).click();


}


    public void clickall () throws InterruptedException {
//        Thread.sleep(2000);
//        driver.findElement(By.cssSelector("fa-stack fa-lg icon-wrapper")).click();
        Thread.sleep(4000);
        driver.findElement(By.xpath("//a[text() = 'Appearance']")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//a[text() = 'Template']")).click();

    }

    public void logout() {driver.findElement(By.cssSelector(".fa.fa-sign-out.fa-lg")).click();}

public void open() {driver.get("http://localhost/litecart/admin");}


}
