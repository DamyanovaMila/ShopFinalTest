package pages;

import base.BasePage;
import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import utils.Browser;

public class YourStorePage extends BasePage {

    private static String url = "http://shop.pragmatic.bg/";

    @FindBy(xpath = "//i[@class='fa fa-user']/..")
    private static WebElement myAccount;

    @FindBy(xpath = "//ul[@class='dropdown-menu dropdown-menu-right']//li/a")
    private static WebElement register;



    static {
        PageFactory.initElements(Browser.driver, YourStorePage.class);
    }

    public static void goTo(){
        Browser.driver.get(url);
    }

    public static void clickOnMyAccount(){
        click(myAccount);
    }

    public static void clickOnRegister(){
        click(register);
    }

}
