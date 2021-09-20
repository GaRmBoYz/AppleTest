package pages;

import base.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ApplePage extends BasePage{
    private WebDriver driver;

    public ApplePage(WebDriver driver){
        super(driver);
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//li[@class='ac-gn-item ac-gn-item-menu ac-gn-iphone']")
    public WebElement iPhoneBtn;
}