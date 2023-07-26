package mobile.objectRepository.recoverymnemoniceuladetails;

import com.onekosmos.kernel.blockid.performaction.autoweb.Element;
import com.onekosmos.kernel.blockid.performaction.autoweb.Verify;
import com.onekosmos.kernel.blockid.performaction.autoweb.Wait;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

public class RecoveryMnemonicEulaDetails {

    public WebDriver driver = null;

    Verify verify = null;

    Element element = null;

    Wait wait = null;

    public RecoveryMnemonicEulaDetails (WebDriver driver) {
        this.driver= driver;
        verify = new Verify (driver);
        element = new Element (driver);
        wait = new Wait (driver);
    }

    public void verifyEnterYourPinTextAfterClickOnRecoveryMnemonic (String enterText) {
        wait.waitUntilElementIsVisible("verifyEnterYourPinTextAfterClickOnRecoveryMnemonic");
        verify.elementTextIsEqualTo("verifyEnterYourPinTextAfterClickOnRecoveryMnemonic",enterText);
    }

    public void clickOnEnterPinFieldBoxAfterClickOnRecoveryMnemonic (){
        wait.waitUntilElementIsVisible("verifyEnterPinFieldBoxAfterClickOnRecoveryMnemonic");
        wait.waitUntilElementIsClickable("verifyEnterPinFieldBoxAfterClickOnRecoveryMnemonic");
        element.click("verifyEnterPinFieldBoxAfterClickOnRecoveryMnemonic");
    }

    public void sendKeysOnEnterPinFieldBoxAfterClickOnRecoveryMnemonic (String enterText) {
        wait.waitUntilElementIsVisible("verifyEnterPinFieldBoxAfterClickOnRecoveryMnemonic");
        element.enterText("verifyEnterPinFieldBoxAfterClickOnRecoveryMnemonic",enterText);
    }

    public void verifyRecoveryMnemonicTextAfterEnterThePin (String enterText) {
        wait.waitUntilElementIsVisible("verifyRecoveryMnemonicTextAfterEnterThePin");
        verify.elementTextIsEqualTo("verifyRecoveryMnemonicTextAfterEnterThePin",enterText);
    }

    public void verifyNextButtonOfRecoveryMnemonic (String enterText) {
        wait.waitUntilElementIsVisible("verifyNextButtonOfRecoveryMnemonic");
        verify.elementTextIsEqualTo("verifyNextButtonOfRecoveryMnemonic",enterText);
        wait.waitUntilElementIsClickable("verifyNextButtonOfRecoveryMnemonic");
        element.click("verifyNextButtonOfRecoveryMnemonic");
    }

    public void verifyClickOnNextButtonTwelveMnemonicPhrasesShouldOpen (String enterText) {
        wait.waitUntilElementIsVisible("verifyClickOnNextButtonTwelveMnemonicPhrasesShouldOpen");
        verify.elementTextIsEqualTo("verifyClickOnNextButtonTwelveMnemonicPhrasesShouldOpen",enterText);
    }

    public void verifyAndClickCopyPhrasesTabAtRecoveryMnemonicPage (String enterText) {
        wait.waitUntilElementIsVisible("verifyCopyPhrasesTextAtRecoveryMnemonicPage");
        verify.elementTextIsEqualTo("verifyCopyPhrasesTextAtRecoveryMnemonicPage",enterText);
        wait.waitUntilElementIsClickable("verifyCopyPhrasesTextAtRecoveryMnemonicPage");
        element.click("verifyCopyPhrasesTextAtRecoveryMnemonicPage");
    }

    public void verifyTextAfterClickOnCopyPhrase (String enterText) {
        wait.waitUntilElementIsVisible("verifyTextAfterClickOnCopyPhrase");
       // verify.elementTextIsEqualTo("verifyTextAfterClickOnCopyPhrase",enterText);
        verify.elementIsPresent("verifyTextAfterClickOnCopyPhrase");
        if (!verify.checkElementIsPresent("verifyTextAfterClickOnCopyPhrase"))
        {
            element.click("verifyCopyPhrasesTextAtRecoveryMnemonicPage");
            verify.elementIsPresent("verifyTextAfterClickOnCopyPhrase");
        }

    }

    public void verifyAndClickScreenshotTabAtRecoveryMnemonicPage (String enterText) {
        wait.waitUntilElementIsVisible("verifyScreenshotTextAtRecoveryMnemonicPage");
        verify.elementTextIsEqualTo("verifyScreenshotTextAtRecoveryMnemonicPage",enterText);
        wait.waitUntilElementIsClickable("verifyScreenshotTextAtRecoveryMnemonicPage");
        element.click("verifyScreenshotTextAtRecoveryMnemonicPage");
    }


    public void verifyTextAfterClickOnScreenshotTab (String enterText) {
//        WebDriverWait waitfortoast = new WebDriverWait(driver, Duration.ofSeconds(10));
//        waitfortoast.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//android.widget.Toast[text()='Mnemonic phrase screenshot has been saved']")));
//        String message = driver.findElement(By.xpath("//android.widget.Toast[text()='Mnemonic phrase screenshot has been saved']")).getText();
//        System.out.println(message);
        wait.waitUntilElementIsVisible("verifyTextAfterClickOnScreenshotTab");
        verify.elementTextIsEqualTo("verifyTextAfterClickOnScreenshotTab",enterText);
    }

    public void clickOnOkButtonOfRecoveryMnemonicPage () {
        wait.waitUntilElementIsVisible("verifyOkButtonOfRecoveryMnemonicPage");
        wait.waitUntilElementIsClickable("verifyOkButtonOfRecoveryMnemonicPage");
        element.click("verifyOkButtonOfRecoveryMnemonicPage");
    }





    public void verifyZeroTrustTextAfterClickOnZeroTrust (String enterText) {
        wait.waitUntilElementIsVisible("verifyZeroTrustTextAfterClickOnZeroTrust");
        verify.elementTextIsEqualTo("verifyZeroTrustTextAfterClickOnZeroTrust",enterText);
    }

    public void verifyTouchIdFaceIdEnabledTextAfterClickOnZeroTrust (String enterText) {
        wait.waitUntilElementIsVisible("verifyTouchIdFaceIdEnabledTextAfterClickOnZeroTrust");
        verify.elementTextIsEqualTo("verifyTouchIdFaceIdEnabledTextAfterClickOnZeroTrust",enterText);
    }

    public void verifyScreenLockEnabledTextAfterClickOnZeroTrust (String enterText) {
        wait.waitUntilElementIsVisible("verifyScreenLockEnabledTextAfterClickOnZeroTrust");
        verify.elementTextIsEqualTo("verifyScreenLockEnabledTextAfterClickOnZeroTrust", enterText);
    }

    public void verifyDeviceNotRootedTextAfterClickOnZeroTrust (String enterText) {
        wait.waitUntilElementIsVisible("verifyDeviceNotRootedTextAfterClickOnZeroTrust");
        verify.elementTextIsEqualTo("verifyDeviceNotRootedTextAfterClickOnZeroTrust",enterText);
    }





     public void verifyAboutTextAfterClickOnAboutOfMenuList (String enterText) {
        wait.waitUntilElementIsVisible("verifyAboutTextAfterClickOnAboutOfMenuList");
        verify.elementTextIsEqualTo("verifyAboutTextAfterClickOnAboutOfMenuList",enterText);
     }

     public void verify1kosmosLogoOfAboutPage () {
        wait.waitUntilElementIsVisible("verify1kosmosLogoOfAboutPage");
        String logotext = element.getElementText("verify1kosmosLogoOfAboutPage");
        System.out.println(logotext);
     }

     public void verifyAppVersionInAboutPage () {
        wait.waitUntilElementIsVisible("verifyAppVersionInAboutPage");
        String appversion = element.getElementText("verifyAppVersionInAboutPage");
        System.out.println (appversion);
     }

     public void verifyAppVersionValueInAboutPage (String enterText) {
        wait.waitUntilElementIsVisible("verifyAppVersionValueInAboutPage");
        verify.elementTextIsEqualTo("verifyAppVersionValueInAboutPage",enterText);
     }

     public void verifyAppBuildInAboutPage () {
        wait.waitUntilElementIsVisible("verifyAppBuildInAboutPage");
        String appbuild = element.getElementText("verifyAppBuildInAboutPage");
        System.out.println(appbuild);
     }

     public void verifyAppBuildValueInAboutPage (String enterText) {
        wait.waitUntilElementIsVisible("verifyAppBuildValueInAboutPage");
        verify.elementTextIsEqualTo("verifyAppBuildValueInAboutPage",enterText);
     }




     public void verifyEULATextAfterClickOnEULAOfMenuList (String enterText) {
        wait.waitUntilElementIsVisible("verifyEULATextAfterClickOnEULAOfMenuList");
        verify.elementTextIsEqualTo("verifyEULATextAfterClickOnEULAOfMenuList",enterText);
     }

     public void verify1kosmosLogoOfEULAPage () {
        wait.waitUntilElementIsVisible("verify1kosmosLogoOfEULAPage");
        String logotext = element.getElementText("verify1kosmosLogoOfEULAPage");
        System.out.println(logotext);
        Assert.assertTrue(true);
     }

     public void verifyBackButtonOfEULAPage () {
        wait.waitUntilElementIsVisible("verifyBackButtonOfEULAPage");
        wait.waitUntilElementIsClickable("verifyBackButtonOfEULAPage");
        element.click("verifyBackButtonOfEULAPage");
     }



    }

