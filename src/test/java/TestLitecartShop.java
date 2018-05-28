import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TestLitecartShop {

    WebDriver driver;
    public WebDriverWait wait;


    @Before
    public void setup() {

        System.setProperty("webdriver.chrome.driver", "C:/Users/Oleg/Downloads/chromedriver_win32/chromedriver.exe");
        driver = new ChromeDriver();

    }

    @Before
    public void open() {
        driver.get("http://localhost/litecart/en");
    }



  /*  @Before
    public void login (String username, String password) throws InterruptedException {
        //for pop up window with login form (chrome)


        driver.findElement(By.name("username")).sendKeys(username);
        driver.findElement(By.name("password")).sendKeys(password);
        driver.findElement(By.cssSelector("[type='submit']")).click();

    }*/



}


