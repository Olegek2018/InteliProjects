package Pages;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AdminLogin extends BasePage { //WebDriver driver, String username, String password

    public AdminLogin(WebDriver driver) {
        super(driver);
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(css = "[type='submit']")
    private WebElement submitButton;

    @FindBy(name = "username")
    private WebElement loginField;

    @FindBy(name = "password")
    private WebElement passwordField;

    public MainAdminPage login(String username, String password) {
        loginField.sendKeys(username);
        passwordField.sendKeys(password);
        submitButton.click();
        return new MainAdminPage(driver);
    }


}


