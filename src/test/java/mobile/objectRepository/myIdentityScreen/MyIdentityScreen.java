package mobile.objectRepository.myIdentityScreen;

import com.onekosmos.kernel.blockid.performaction.autoweb.Element;
import com.onekosmos.kernel.blockid.performaction.autoweb.Verify;
import com.onekosmos.kernel.blockid.performaction.autoweb.Wait;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class MyIdentityScreen {

    public WebDriver driver = null;
    Verify verify = null;
    Wait wait = null;
    Element element = null;

    public MyIdentityScreen(WebDriver driver) {
        this.driver = driver;
        verify = new Verify(driver);
        wait = new Wait(driver);
        element = new Element(driver);
    }


    public void verifyEmailTextOfMyIdentityPage(String enterText) {
        wait.waitUntilElementIsVisible("verifyEmailTextOfMyIdentityScreen");
        verify.elementTextIsEqualTo("verifyEmailTextOfMyIdentityScreen", enterText);
    }

    public void clickOnEmailTabOfMyIdentityPage(){
        wait.waitUntilElementIsVisible("verifyEmailTabOfMyIdentityScreen");
        wait.waitUntilElementIsClickable("verifyEmailTabOfMyIdentityScreen");
        element.click("verifyEmailTabOfMyIdentityScreen");
    }

    public void verifyEmailVerificationTextAfterClickingOnEmailText (String enterText){
        wait.waitUntilElementIsVisible("verifyEmailVerificationTextAfterClickOnEmailTab");
        verify.elementTextIsEqualTo("verifyEmailVerificationTextAfterClickOnEmailTab",enterText);
    }

    public void clickOnEnterYourEmailAddressFieldBox (){
        wait.waitUntilElementIsVisible("verifyEnterYourEmailAddressFieldBox");
        wait.waitUntilElementIsClickable("verifyEnterYourEmailAddressFieldBox");
        element.click("verifyEnterYourEmailAddressFieldBox");
    }

    public void sendEmailOnEmailAddressFieldBox (String enterMailId) {
        wait.waitUntilElementIsVisible("verifyEnterYourEmailAddressFieldBox");
        element.enterText("verifyEnterYourEmailAddressFieldBox", enterMailId);
//        ((AndroidDriver) driver).pressKey(new KeyEvent(AndroidKey.NUMPAD_ENTER));

        ((AndroidDriver) driver).pressKey(new KeyEvent(AndroidKey.ENTER));
        element.click("verifyEnterYourEmailAddressFieldBox");
        ((AndroidDriver) driver).pressKey(new KeyEvent(AndroidKey.ENTER));
    }

    public void clickOnContinueButtonOfEmail(){
        wait.waitUntilElementIsVisible("verifyContinueButtonOfEmailVerification");
        wait.waitUntilElementIsClickable("verifyContinueButtonOfEmailVerification");
        element.click("verifyContinueButtonOfEmailVerification");
    }

    public void verifyCheckYourEmailTextOfMail (String enterText){
        wait.waitUntilElementIsVisible("verifyCheckYourEmailText");
        verify.elementTextIsEqualTo("verifyCheckYourEmailText",enterText);
    }

    public void verifyCheckEmailTabOfMail (String enterText){
        wait.waitUntilElementIsVisible("verifyCheckEmailTab");
        verify.elementTextIsEqualTo("verifyCheckEmailTab",enterText);
    }

    public void clickOnCheckEmailTabOfMail(){
        wait.waitUntilElementIsVisible("verifyCheckEmailTab");
        wait.waitUntilElementIsClickable("verifyCheckEmailTab");
        element.click("verifyCheckEmailTab");
    }

    public void verifyResendEmailTabOfMail(String enterText){
        wait.waitUntilElementIsVisible("verifyResendEmailTab");
        verify.elementTextIsEqualTo("verifyResendEmailTab",enterText);
    }

    public void clickOnResendEmailTabOfMail(){
        wait.waitUntilElementIsVisible("verifyResendEmailTab");
        wait.waitUntilElementIsClickable("verifyResendEmailTab");
        element.click("verifyResendEmailTab");
    }

    public void verifyInboxTextOfMailId (String enterText){
        wait.waitUntilElementIsVisible("verifyInboxTextOfMail");
        verify.elementTextIsEqualTo("verifyInboxTextOfMail",enterText);
    }

    public void verifyPhoneTabOfMyIdentityPage(String enterText){
        wait.waitUntilElementIsVisible("verifyPhoneTextOfIdentityScreen");
        verify.elementTextIsEqualTo("verifyPhoneTextOfIdentityScreen",enterText);
    }

    public void clickOnPhoneTabOfMyIdentityPage(){
        wait.waitUntilElementIsVisible("verifyPhoneTabOfMyIdentityScreen");
        wait.waitUntilElementIsClickable("verifyPhoneTabOfMyIdentityScreen");
        element.click("verifyPhoneTabOfMyIdentityScreen");
    }

    public void verifyNoSimdetectedTextAfterClickingOnPhoneTab (String enterText){
        wait.waitUntilElementIsVisible("verifyNoSimDetectedText");
        verify.elementTextIsEqualTo("verifyNoSimDetectedText", enterText);
    }

    public void verifyActiveSimRequiredText (String enterText){
        wait.waitUntilElementIsVisible("verifyActiveSimRequiredText");
        verify.elementTextIsEqualTo("verifyActiveSimRequiredText",enterText);
    }


    public void verifyLiveIdTextOfMyIdentityPage (String enterText){
        wait.waitUntilElementIsVisible("verifyLiveIdTextOfMyIdentityScreen");
        verify.elementTextIsEqualTo("verifyLiveIdTextOfMyIdentityScreen",enterText);
    }

    public void clickOnLiveIdTextOfMyIdentityPage (){
        wait.waitUntilElementIsVisible("clickOnLiveIdTab");
        wait.waitUntilElementIsClickable("clickOnLiveIdTab");
        element.click("clickOnLiveIdTab");
    }

    public void verifyNextTabOfLiveId (String enterText){
        wait.waitUntilElementIsVisible("verifyNextTabOfLiveId");
        verify.elementTextIsEqualTo("verifyNextTabOfLiveId",enterText);
    }

    public void clickOnNextTabOfLiveId (){
        wait.waitUntilElementIsVisible("verifyNextTabOfLiveId");
        wait.waitUntilElementIsClickable("verifyNextTabOfLiveId");
        element.click("verifyNextTabOfLiveId");
    }

    public void verifyCancelTabOfLiveId (String enterText){
        wait.waitUntilElementIsVisible("verifyCancelTabOfLiveId");
        verify.elementTextIsEqualTo("verifyCancelTabOfLiveId",enterText);
    }

    public void clickOnCancelTabOfLiveId (){
        wait.waitUntilElementIsVisible("verifyCancelTabOfLiveId");
        wait.waitUntilElementIsClickable("verifyCancelTabOfLiveId");
        element.click("verifyCancelTabOfLiveId");
    }

    public void verifyAdjustFaceUntilRedToGreenText (String enterText){
        wait.waitUntilElementIsVisible("verifyAdjustFaceUntilRedToGreenText");
        verify.elementTextIsEqualTo("verifyAdjustFaceUntilRedToGreenText",enterText);
    }

    public void verifyPleaseAlignFaceProperlyMessageText (String enterText) {
        wait.waitUntilElementIsVisible("verifyPleaseAlignFaceProperlyMessage");
        verify.elementTextIsEqualTo("verifyPleaseAlignFaceProperlyMessage",enterText);
    }



    public void verifyDriversLicenseTextOfMyIdentityPage (String enterText){
        wait.waitUntilElementIsVisible("verifyDriversLicenseText");
        verify.elementTextIsEqualTo("verifyDriversLicenseText",enterText);
    }

    public void clickOnDriversLicenseTabOfMyIdentityPage (){
        wait.waitUntilElementIsVisible("clickDriversLicenseTextOfMyIdentity");
        wait.waitUntilElementIsClickable("clickDriversLicenseTextOfMyIdentity");
        element.click("clickDriversLicenseTextOfMyIdentity");
    }

    public void verifyLiveIdEnrollmentMessageAfterClickOnDriversLicense (String enterText){
        wait.waitUntilElementIsVisible("verifyLiveIdEnrollmentMessageAfterClickOnDriversLicense");
        verify.elementTextIsEqualTo("verifyLiveIdEnrollmentMessageAfterClickOnDriversLicense",enterText);
    }

    public void clickOnEnrollLiveIDButtonOfLiveIdEnrollmentMessageAfterClickOnDriversLicense () {
        wait.waitUntilElementIsVisible("verifyEnrollLiveIDButtonOfLiveIdEnrollmentMessageAfterClickOnDriversLicense");
        wait.waitUntilElementIsClickable("verifyEnrollLiveIDButtonOfLiveIdEnrollmentMessageAfterClickOnDriversLicense");
        element.click("verifyEnrollLiveIDButtonOfLiveIdEnrollmentMessageAfterClickOnDriversLicense");
    }



    public void verifyPassportTextOfMyIdentityPage (String enterText){
        wait.waitUntilElementIsVisible("verifyPassportTextOfMyIdentityScreen");
        verify.elementTextIsEqualTo("verifyPassportTextOfMyIdentityScreen",enterText);
    }

    public void clickOnPassportTextOfMyIdentityPage () {
        wait.waitUntilElementIsVisible("clickOnPassportTextOfMyIdentityScreen");
        wait.waitUntilElementIsClickable("clickOnPassportTextOfMyIdentityScreen");
        element.click("clickOnPassportTextOfMyIdentityScreen");
    }



    public void verifyYourDidTextOfMyIdentityPage (String enterText) {
        element.scrollUntilElementVisible(driver, Element.Direction.UP,"verifyYourDidTextOfMyIdentityScreen");
        wait.waitUntilElementIsVisible("verifyYourDidTextOfMyIdentityScreen");
        verify.elementTextIsEqualTo("verifyYourDidTextOfMyIdentityScreen",enterText);
    }

    public void verifyIdentityValueOfYourDidOfMyIdentityPage () {

        wait.waitUntilElementIsVisible("verifyIdentityValueOfYourDidOfMyIdentityScreen");
        String identityValue = element.getElementText("verifyIdentityValueOfYourDidOfMyIdentityScreen");
        Assert.assertFalse(identityValue.isEmpty());
        System.out.println("identity value of your did : " + identityValue);
    }
}
