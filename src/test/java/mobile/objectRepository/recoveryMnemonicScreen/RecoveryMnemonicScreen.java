package mobile.objectRepository.recoveryMnemonicScreen;

import com.onekosmos.kernel.blockid.performaction.autoweb.Element;
import com.onekosmos.kernel.blockid.performaction.autoweb.Verify;
import com.onekosmos.kernel.blockid.performaction.autoweb.Wait;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class RecoveryMnemonicScreen {
    public WebDriver driver = null;
    Verify verify = null;
    Element element = null;
    Wait wait = null;

    public RecoveryMnemonicScreen(WebDriver driver) {
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
        wait.waitUntilElementIsVisible("verifyCopyPhrasesTextAtRecoveryMnemonicScreen");
        verify.elementTextIsEqualTo("verifyCopyPhrasesTextAtRecoveryMnemonicScreen",enterText);
        wait.waitUntilElementIsClickable("verifyCopyPhrasesTextAtRecoveryMnemonicScreen");
        element.click("verifyCopyPhrasesTextAtRecoveryMnemonicScreen");
    }



    public void verifyAndClickScreenshotTabAtRecoveryMnemonicPage (String enterText) {
        wait.waitUntilElementIsVisible("verifyScreenshotTextAtRecoveryMnemonicScreen");
        verify.elementTextIsEqualTo("verifyScreenshotTextAtRecoveryMnemonicScreen",enterText);
        wait.waitUntilElementIsClickable("verifyScreenshotTextAtRecoveryMnemonicScreen");
        element.click("verifyScreenshotTextAtRecoveryMnemonicScreen");
    }
    public void clickOnOkButtonOfRecoveryMnemonicPage () {
        wait.waitUntilElementIsVisible("verifyOkButtonOfRecoveryMnemonicScreen");
        wait.waitUntilElementIsClickable("verifyOkButtonOfRecoveryMnemonicScreen");
        element.click("verifyOkButtonOfRecoveryMnemonicScreen");
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
        wait.waitUntilElementIsVisible("verify1kosmosLogoOfAboutScreen");
        String logotext = element.getElementText("verify1kosmosLogoOfAboutScreen");
        System.out.println(logotext);
     }
     public void verifyAppVersionValueInAboutPage (String enterText) {
        wait.waitUntilElementIsVisible("verifyAppVersionValueInAboutScreen");
        verify.elementTextIsEqualTo("verifyAppVersionValueInAboutScreen",enterText);
     }
     public void verifyAppBuildValueInAboutPage (String enterText) {
        wait.waitUntilElementIsVisible("verifyAppBuildValueInAboutScreen");
        verify.elementTextIsEqualTo("verifyAppBuildValueInAboutScreen",enterText);
     }




     public void verifyEULATextAfterClickOnEULAOfMenuList (String enterText) {
        wait.waitUntilElementIsVisible("verifyEULATextAfterClickOnEULAOfMenuList");
        verify.elementTextIsEqualTo("verifyEULATextAfterClickOnEULAOfMenuList",enterText);
     }

     public void verify1kosmosLogoOfEULAPage () {
        wait.waitUntilElementIsVisible("verify1kosmosLogoOfEULAScreen");
        String logotext = element.getElementText("verify1kosmosLogoOfEULAScreen");
        System.out.println(logotext);
        Assert.assertTrue(true);
     }

     public void verifyBackButtonOfEULAPage () {
        wait.waitUntilElementIsVisible("verifyBackButtonOfEULAScreen");
        wait.waitUntilElementIsClickable("verifyBackButtonOfEULAScreen");
        element.click("verifyBackButtonOfEULAScreen");
     }



    }

