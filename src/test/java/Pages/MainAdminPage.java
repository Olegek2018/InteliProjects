package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MainAdminPage extends AdminLogin {
    public MainAdminPage(WebDriver driver) {
        super(driver);
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(css = ".fa.fa-sign-out.fa-lg")
    private WebElement logoutButton;

    @FindBy(css = "a[href*=reports]")
    private WebElement reportsSidebarLink;

    @FindBy(css = "h1")
    private WebElement headerTitle;

    public WebElement getReportsSidebarLink() {
        return reportsSidebarLink;
    }

    public WebElement getMonthlySalesLink() {

        return monthlySalesLink;
    }

    public WebElement getMostSoldProductsLink() {
        return mostSoldProductsLink;
    }

    public WebElement getMostShoppingCustomersLink() {
        return mostShoppingCustomersLink;
    }

    @FindBy (css = "#doc-monthly_sales a[href*=monthly_sales]")
    private WebElement monthlySalesLink;

    @FindBy(css = "#doc-most_sold_products")
    private WebElement mostSoldProductsLink;

    @FindBy(css = "#doc-most_shopping_customers")
    private WebElement mostShoppingCustomersLink;


    public String getHeaderText(){
        return headerTitle.getText();
    }

    public void clickOnLink(WebElement element){
        element.click();
    }


    public void logout() {
        WebDriverWait wait = new WebDriverWait(driver, 2);
        wait.until(ExpectedConditions.visibilityOf(logoutButton));
        logoutButton.click();
    }
}
