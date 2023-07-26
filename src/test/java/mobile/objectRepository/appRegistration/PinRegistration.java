package mobile.objectRepository.appRegistration;

import com.onekosmos.kernel.blockid.performaction.autoweb.Element;
import com.onekosmos.kernel.blockid.performaction.autoweb.Verify;
import com.onekosmos.kernel.blockid.performaction.autoweb.Wait;
import org.openqa.selenium.WebDriver;

public class PinRegistration {
    public WebDriver driver = null;
    Verify verify = null;
    Wait wait = null;
    Element element = null;
    public PinRegistration(WebDriver driver) {
        this.driver = driver ;
        verify = new Verify (driver);
        wait = new Wait (driver);
        element = new Element (driver);

    }
    public void clickOnUserAgreementLink () {
        wait.waitUntilElementIsVisible("verifyUserAgreementLink");
        wait.waitUntilElementIsClickable("verifyUserAgreementLink");
        element.click("verifyUserAgreementLink");
    }
    public void clickOnBackButtonOf1cosmosAgreement () {
        wait.waitUntilElementIsVisible("verifyBackButtonOf1cosmosAgreement");
        wait.waitUntilElementIsVisible("verifyBackButtonOf1cosmosAgreement");
        element.click("verifyBackButtonOf1cosmosAgreement");
    }

    public void clickOnContinueTab () {
        wait.waitUntilElementIsVisible("verifyContinueButton");
        wait.waitUntilElementIsClickable("verifyContinueButton");
        element.click("verifyContinueButton");
    }



    public void clickOnAuthLoginPin () {
        wait.waitUntilElementIsVisible("VerifyAuthLoginPin");
        wait.waitUntilElementIsClickable("VerifyAuthLoginPin");
        element.click("VerifyAuthLoginPin");
    }

    public void verifyPinRegistrationText (String enterText){
        wait.waitUntilElementIsVisible("VerifyPinRegistration");
        verify.elementTextIsEqualTo("VerifyPinRegistration",enterText);
    }


    public void verifyEnterNewPinText (String enterText){
        wait.waitUntilElementIsVisible("VerifyEnterNewPin");
        verify.elementTextIsEqualTo("VerifyEnterNewPin",enterText);
    }

    public void clickOnPinFieldBox (){
        wait.waitUntilElementIsVisible("verifyPinFieldBox");
        wait.waitUntilElementIsClickable("verifyPinFieldBox");
       element.click("verifyPinFieldBox");
    }
    public void sendPinOnPinFieldBox (String enterPin){
        wait.waitUntilElementIsVisible("verifyPinFieldBox");
        wait.waitUntilElementIsClickable("verifyPinFieldBox");
        element.enterText("verifyPinFieldBox",enterPin);
    }

    public void verifyConfirmNewPinText (String enterRePin){
        wait.waitUntilElementIsVisible("VerifyConfirmNewPin");
        verify.elementTextIsEqualTo("VerifyConfirmNewPin",enterRePin);
    }

    public void clickOnConfirmNewPinFieldBox (){
        wait.waitUntilElementIsVisible("verifyConfirmNewPinFieldBox");
        wait.waitUntilElementIsClickable("verifyConfirmNewPinFieldBox");
        element.click("verifyConfirmNewPinFieldBox");
    }
    public void sendPinOnConfirmNewPinFieldBox (String enterPin){
        wait.waitUntilElementIsVisible("verifyConfirmNewPinFieldBox");
        wait.waitUntilElementIsClickable("verifyConfirmNewPinFieldBox");
        element.enterText("verifyConfirmNewPinFieldBox",enterPin);
    }

    public void verifyThankYouMessageText (String enterMessage) {
        wait.waitUntilAllElementsAreVisible("verifyThankYouMessage");
        verify.elementTextIsEqualTo("verifyThankYouMessage",enterMessage);
    }


}

