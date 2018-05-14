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


public class TestLitecartAdmin {

    WebDriver driver;
    public WebDriverWait wait;
    //private WebDriverWait;

    @BeforeClass// @BeforeMethod

    @Before
    public void setup() {
        // driver = new ChromeDriver();
        // driver = new FirefoxDriver();

//delete 2 files (*.pswg...)
        System.setProperty("webdriver.chrome.driver", "C:/Users/Oleg/Downloads/chromedriver_win32/chromedriver.exe");//input in parameterized..
        driver = new ChromeDriver();


        //driver.get("http://localhost/litecart/admin");

    }
    /*//ChromeDriverManger.getInstance().setup();

            driver.manage().window().maximize();
}*/

    @Before
    public void open() {driver.get("http://localhost/litecart/admin");}

    @Before
    public void login (String username, String password) throws InterruptedException {
        //for pop up window with login form (chrome)

    /*driver.switchTo().alert();
//Selenium-WebDriver Java Code for entering Username & Password as below: - for pop-up
    driver.findElement(By.id("username")).sendKeys(username);
    driver.findElement(By.id("password")).sendKeys(password);
    driver.switchTo().alert().accept();
    driver.switchTo().defaultContent();*/

        driver.findElement(By.name("username")).sendKeys(username);
        driver.findElement(By.name("password")).sendKeys(password);
        driver.findElement(By.cssSelector("[type='submit']")).click();

    }

    @Test
    public void testCanLoginAsAdmin() throws InterruptedException {//"InterruptedException" added because of Thread.sleep - command
        open();
        Thread.sleep(2000);//to see login form
        login("admin", "mysql");
        Thread.sleep(2000);
        //clickall();

        //driver.get("http://localhost/litecart/admin");

        //testCheckAlertMessageForEmptyUserData();
    }

    @Test
    public void testCheckAlertMessageForEmptyUserData() throws InterruptedException {
        open();
        String alertText;
        Thread.sleep(2000);
        driver.findElement(By.cssSelector("[type='submit']")).click();
        WebDriverWait wait = new WebDriverWait(driver, 3);
        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.cssSelector(".alert.alert-danger")));
        //Thread.sleep(2000);
        alertText = driver.findElement(By.cssSelector(".alert.alert-danger")).getText();
        //Assert.assertEquals(alertText, "x"+ "\n" + "You must provide a username");
        Assert.assertEquals(alertText,"×" + "\n" +"You must provide a username");

    }

    @Test
    public void testadminAppearance() throws InterruptedException {//"InterruptedException" added because of Thread.sleep - command
        Thread.sleep(1000);
        //driver.findElement(By.tagName("h1"));

        //WebElement header1 = driver.findElement(By.tagName("h1"));
        //wait.until(Element)
        // add H1 check
        WebDriverWait wait = new WebDriverWait(driver, 3);
        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//li[@id='app-']/a/span[2]")));//fa-stack icon-wrapper

        driver.findElement(By.xpath(".//*[@id='app-']/a/span[2]")).click();// Appearance
        Thread.sleep(1000);
        driver.findElement(By.xpath(".//*[@id='doc-template']/a/span")).click();
        wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("h1")));
        //Thread.sleep(1000);
        driver.findElement(By.xpath(".//*[@id='doc-logotype']/a/span")).click();
        Thread.sleep(2000);
        WebElement element = wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("h1")));
    }

        @Test
        public void testadminCatalog() throws InterruptedException {//"InterruptedException" added because of Thread.sleep - command
        WebDriverWait wait = new WebDriverWait(driver, 3);

        driver.findElement(By.xpath(".//*[@id='app-']/a/span[2]")).click();//.//*[@id='app-']/a/span[2]   Catalog
        //Thread.sleep(2000);
            wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("h1"))); // "null pointer exception" - if "wait" not declared
        //driver.findElement(By.cssSelector("fa-stack fa-lg icon-wrapper")).click();// Catalog by CSS?
        driver.findElement(By.xpath("(//li[@id='app-']/a/span[2])[2]")).click();//Why brackets?? ("(...)")
            wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("h1")));
        driver.findElement(By.xpath("//li[@id='doc-catalog']/a/span")).click();//catalog inside of Catalog
            wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("h1")));
        driver.findElement(By.cssSelector("#doc-product_groups > a > span.name")).click();
            wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("h1")));
        driver.findElement(By.cssSelector("#doc-option_groups > a > span.name")).click();
            wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("h1")));
        driver.findElement(By.cssSelector("#doc-manufacturers > a > span.name")).click();
            wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("h1")));
        driver.findElement(By.cssSelector("#doc-suppliers > a > span.name")).click();
            wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("h1")));
        driver.findElement(By.cssSelector("#doc-delivery_statuses > a > span.name")).click();
            wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("h1")));
        driver.findElement(By.cssSelector("#doc-sold_out_statuses > a > span.name")).click();
            wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("h1")));
        driver.findElement(By.cssSelector("#doc-quantity_units > a > span.name")).click();
            wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("h1")));
        driver.findElement(By.cssSelector("#doc-csv > a > span.name")).click();
        wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("h1")));

        }
    @Test
    public void testadminCountries() throws InterruptedException {//"InterruptedException" added because of Thread.sleep - command
        WebDriverWait wait = new WebDriverWait(driver, 4);
        driver.findElement(By.xpath("(//li[@id='app-']/a/span[2])[3]")).click();//Countries
            wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("h1")));
    }
    @Test
    public void testadminCurrencies() throws InterruptedException {//"InterruptedException" added because of Thread.sleep - command
        WebDriverWait wait = new WebDriverWait(driver, 3);
        driver.findElement(By.xpath("(//li[@id='app-']/a/span[2])[4]")).click();//Currencies
        wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("h1")));
    }
    @Test
    public void testadminCustomers() throws InterruptedException {//"InterruptedException" added because of Thread.sleep - command
        WebDriverWait wait = new WebDriverWait(driver, 2);
        driver.findElement(By.xpath("(//li[@id='app-']/a/span[2])[5]")).click();//Customers
        wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("h1")));
        driver.findElement(By.cssSelector("#doc-customers > a > span.name")).click();
        wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("h1")));
        driver.findElement(By.cssSelector("#doc-csv > a > span.name")).click();
        wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("h1")));
        driver.findElement(By.cssSelector("#doc-newsletter > a > span.name")).click();
        wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("h1")));
    }
    @Test
    public void testadminGeoZones() throws InterruptedException {//"InterruptedException" added because of Thread.sleep - command
        WebDriverWait wait = new WebDriverWait(driver, 2);
        driver.findElement(By.xpath("(//li[@id='app-']/a/span[2])[6]")).click();//Geo Zones
        wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("h1")));

    }
    @Test
    public void testadminLanguages() throws InterruptedException {//"InterruptedException" added because of Thread.sleep-command
        WebDriverWait wait = new WebDriverWait(driver, 3);
        driver.findElement(By.xpath("(//li[@id='app-']/a/span[2])[7]")).click();//Languages
        wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("h1")));
        driver.findElement(By.cssSelector("#doc-languages > a > span.name")).click();
        wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("h1")));
        driver.findElement(By.cssSelector("#doc-storage_encoding > a > span.name")).click();
        wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("h1")));
    }

    @Test
    public void testadminModules() throws InterruptedException {//"InterruptedException" added because of Thread.sleep-command
        WebDriverWait wait = new WebDriverWait(driver, 4);
        driver.findElement(By.xpath("(//li[@id='app-']/a/span[2])[8]")).click();//Modules
        wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("h1")));
        driver.findElement(By.cssSelector("#doc-customer > a > span.name")).click();
        wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("h1")));
        driver.findElement(By.cssSelector("#doc-shipping > a > span.name")).click();
        wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("h1")));
        driver.findElement(By.cssSelector("#doc-payment > a > span.name")).click();
        wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("h1")));
        driver.findElement(By.cssSelector("#doc-order > a > span.name")).click();
        wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("h1")));
        driver.findElement(By.cssSelector("#doc-order_total > a > span.name")).click();
        wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("h1")));
        driver.findElement(By.cssSelector("#doc-jobs > a > span.name")).click();
    }

    @Test
    public void testadminOrders() throws InterruptedException {//"InterruptedException" added because of Thread.sleep-command
        WebDriverWait wait = new WebDriverWait(driver, 4);
        driver.findElement(By.xpath("(//li[@id='app-']/a/span[2])[9]")).click();//Orders
        wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("h1")));
        driver.findElement(By.cssSelector("#doc-orders > a > span.name")).click();
        wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("h1")));
        driver.findElement(By.cssSelector("#doc-order_statuses > a > span.name")).click();
        wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("h1")));
    }
    @Test
    public void testadminPages() throws InterruptedException {//"InterruptedException" added because of Thread.sleep-command
        WebDriverWait wait = new WebDriverWait(driver, 3);
        driver.findElement(By.xpath("(//li[@id='app-']/a/span[2])[10]")).click();//Pages
        wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("h1")));
        driver.findElement(By.cssSelector("#doc-pages > a > span.name")).click();
        wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("h1")));
        driver.findElement(By.cssSelector("#doc-csv > a > span.name")).click();
        wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("h1")));
    }

    @Test
    public void testadminReports() throws InterruptedException {//"InterruptedException" added because of Thread.sleep-command
        WebDriverWait wait = new WebDriverWait(driver, 2);
        driver.findElement(By.xpath("(//li[@id='app-']/a/span[2])[11]")).click();//Reports
        wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("h1")));
        driver.findElement(By.cssSelector("#doc-monthly_sales > a > span.name")).click();
        wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("h1")));
        driver.findElement(By.cssSelector("#doc-most_sold_products > a > span.name")).click();
        wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("h1")));
        driver.findElement(By.cssSelector("#doc-most_shopping_customers > a > span.name")).click();
        wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("h1")));
    }

    @Test
    public void testadminSettings() throws InterruptedException {//"InterruptedException" added because of Thread.sleep-command
        WebDriverWait wait = new WebDriverWait(driver, 5);
        driver.findElement(By.xpath("(//li[@id='app-']/a/span[2])[12]")).click();//Settings
        wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("h1")));
        driver.findElement(By.cssSelector("#doc-store_info > a > span.name")).click();
        wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("h1")));
        driver.findElement(By.cssSelector("#doc-defaults > a > span.name")).click();
        wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("h1")));
        driver.findElement(By.cssSelector("#doc-email > a > span.name")).click();
        wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("h1")));
        driver.findElement(By.cssSelector("#doc-listings > a > span.name")).click();
        wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("h1")));
        driver.findElement(By.cssSelector("#doc-images > a > span.name")).click();
        wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("h1")));
        driver.findElement(By.cssSelector("#doc-checkout > a > span.name")).click();
        wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("h1")));
        driver.findElement(By.cssSelector("#doc-advanced > a > span.name")).click();
        wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("h1")));
        driver.findElement(By.cssSelector("#doc-security > a > span.name")).click();
        wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("h1")));
    }

    @Test
    public void testadminSlides() throws InterruptedException {//"InterruptedException" added because of Thread.sleep-command
        WebDriverWait wait = new WebDriverWait(driver, 1);
        driver.findElement(By.xpath("(//li[@id='app-']/a/span[2])[13]")).click();//Slides
        wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("h1")));
    }

    @Test
    public void testadminTax() throws InterruptedException {//"InterruptedException" added because of Thread.sleep-command
        WebDriverWait wait = new WebDriverWait(driver, 2);
        driver.findElement(By.xpath("(//li[@id='app-']/a/span[2])[14]")).click();//Tax
        wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("h1")));
        driver.findElement(By.cssSelector("#doc-tax_rates > a > span.name")).click();
        wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("h1")));
        driver.findElement(By.cssSelector("#doc-tax_classes > a > span.name")).click();
        wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("h1")));
    }

    @Test
    public void testadminTranslations() throws InterruptedException {//"InterruptedException" added because of Thread.sleep-command
        WebDriverWait wait = new WebDriverWait(driver, 2);
        driver.findElement(By.xpath("(//li[@id='app-']/a/span[2])[15]")).click();//Translations
        wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("h1")));
        driver.findElement(By.cssSelector("#doc-search > a > span.name")).click();
        wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("h1")));
        driver.findElement(By.cssSelector("#doc-scan > a > span.name")).click();
        wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("h1")));
        driver.findElement(By.cssSelector("#doc-csv > a > span.name")).click();
        wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("h1")));
    }
    @Test
    public void testadminUsers() throws InterruptedException {//"InterruptedException" added because of Thread.sleep-command
        WebDriverWait wait = new WebDriverWait(driver, 1);
        driver.findElement(By.xpath("(//li[@id='app-']/a/span[2])[16]")).click();//Users
        wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("h1")));
    }

    @Test
    public void testadminvQmods() throws InterruptedException {//"InterruptedException" added because of Thread.sleep-command
        WebDriverWait wait = new WebDriverWait(driver, 1);
        driver.findElement(By.xpath("(//li[@id='app-']/a/span[2])[17]")).click();//vQmods
        wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("h1")));
    }


        //Thread.sleep(1000);
        //driver.findElement(By.cssSelector("doc-catalog > a > span.name")).click();
        //css=#doc-catalog > a > span.name
        //driver.findElement(By.xpath(".//*[@id='doc-catalog']/a/span")).click();




    @After
    public void logout() {driver.findElement(By.cssSelector(".fa.fa-sign-out.fa-lg")).click();}

}