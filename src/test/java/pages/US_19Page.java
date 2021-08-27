package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class US_19Page {

    public US_19Page(){
        PageFactory.initElements(Driver.getDriver(),this);
    }


    @FindBy(xpath = "//input[contains(@id,'username')]")
    public WebElement username;

    @FindBy(xpath = "//input[contains(@id,'password')]")
    public WebElement password;

    @FindBy(xpath = "//div[@role='alert']")
    public WebElement allert;




}
