package Pages;


import TestsAdmin.TestLitecartAdmin;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

//AdminLogin;


public class AdminLogin { //WebDriver driver, String username, String password

    WebDriver driver;
            //this.driver = driver;
        //WebDriver driver;


    public AdminLogin(WebDriver driver) {
        this.driver = driver;
        //PageFactory.initElements(driver,this);
    }

    //@FindBy(css = "[type='submit']")



//    public AdminLogin(WebDriver driver){
//
//        //this.driver=driver;
//        }
////        PageFactory.initElements(driver,this)

public TestLitecartAdmin login (String username, String password){

        driver.findElement(By.name("username")).sendKeys(username);
        driver.findElement(By.name("password")).sendKeys(password);
        driver.findElement(By.cssSelector("[type='submit']")).click();

        return new TestLitecartAdmin();

        }
 public void logout(){

                WebDriverWait wait = new WebDriverWait(driver, 2);
                wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector(".fa.fa-sign-out.fa-lg")));
                driver.findElement(By.cssSelector(".fa.fa-sign-out.fa-lg")).click();

     //logoutButton.click();



}
}



//private void Appearance()throws InterruptedException{
//        driver.findElement(By.xpath(".//*[@id='app-']/a/span[2]")).click();// Appearance
//        Thread.sleep(1000);
//        }


