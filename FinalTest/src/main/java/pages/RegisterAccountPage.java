package pages;

import base.BasePage;
import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import utils.Browser;

public class RegisterAccountPage extends BasePage {

    @FindBy(id = "input-firstname")
    private static WebElement firstNameFiled;

    @FindBy(id = "input-lastname")
    private static WebElement lastNameField;

    @FindBy(id = "input-email")
    private static WebElement emailField;

    @FindBy(id = "input-telephone")
    private static WebElement telephoneField;

    @FindBy(id = "input-password")
    private static WebElement passField;

    @FindBy(id = "input-confirm")
    private static WebElement confirmPassField;

    @FindBy(xpath = "//input[@type=\"checkbox\"]")
    private static WebElement checkBox;

    @FindBy(xpath = "//input[@type=\"submit\"]")
    private static WebElement buttonContinue;

    @FindBy(xpath = "//div[@id= \"content\"]/h1")
    private static WebElement createdAccount;

    static {
        PageFactory.initElements(Browser.driver, RegisterAccountPage.class);
    }
    public static void typeIntoFirstNameFiled(){
        String firstname = RandomStringUtils.randomAlphabetic(8);
        firstNameFiled.sendKeys(firstname);

    }
    public static void typeIntoLastNameFiled(){
        String lastname = RandomStringUtils.randomAlphabetic(8);
        lastNameField.sendKeys(lastname);

    }

    public static void typeIntoEmailField(){
        String prefix = RandomStringUtils.randomAlphabetic(7);
        String domainPrefix = RandomStringUtils.randomAlphabetic(5);
        String mainDomain = RandomStringUtils.randomAlphabetic(3);
        String emailAddres = prefix +  "@" + domainPrefix + "." + mainDomain;
        emailField.sendKeys(emailAddres);

    }

    public static void typeIntoTelephoneFiled(String numbersToType){
        telephoneField.sendKeys(numbersToType);
    }

    public static void typeIntoPasswordField(String textToType){
        passField.sendKeys(textToType);
    }

    public static void typeIntoConfirmPassField(String textToConfirm){
        confirmPassField.sendKeys(textToConfirm);
    }

    public static void clickOnCheckBox(){
        if(!checkBox.isSelected()){
            checkBox.click();
        }
    }

    public static void clickOnButtonContinue(){
        click(buttonContinue);
    }

    public static void verifyNewAccount(String expectedText){
        Assert.assertEquals(createdAccount.getText(),expectedText);

    }
}
