import base.BaseTest;
import org.testng.annotations.Test;
import pages.RegisterAccountPage;
import pages.YourStorePage;

public class YourStoreRegisterTest extends BaseTest{

    @Test
    public void testYourStorePage(){

        YourStorePage.goTo();
        YourStorePage.clickOnMyAccount();
        YourStorePage.clickOnRegister();
        RegisterAccountPage.typeIntoFirstNameFiled();
        RegisterAccountPage.typeIntoLastNameFiled();
        RegisterAccountPage.typeIntoEmailField();
        RegisterAccountPage.typeIntoTelephoneFiled("0885695");
        RegisterAccountPage.typeIntoPasswordField("123456");
        RegisterAccountPage.typeIntoConfirmPassField("123456");
        RegisterAccountPage.clickOnCheckBox();
        RegisterAccountPage.clickOnButtonContinue();
        RegisterAccountPage.verifyNewAccount("Your Account Has Been Created!");
    }



}
