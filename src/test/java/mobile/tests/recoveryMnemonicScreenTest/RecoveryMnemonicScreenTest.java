package mobile.tests.recoveryMnemonicScreenTest;

import com.onekosmos.kernel.blockid.framework.init.Base;
import mobile.objectRepository.mainMenuScreen.MainMenuScreen;
import mobile.objectRepository.appRegistration.PinRegistration;
import mobile.objectRepository.touchIdFaceId.TouchIdFaceIdScreen;
import mobile.objectRepository.recoveryMnemonicScreen.RecoveryMnemonicScreen;
import org.testng.annotations.Test;

public class RecoveryMnemonicScreenTest extends Base {

    PinRegistration pinRegistration;
    TouchIdFaceIdScreen touchIdFaceIdScreen;
    MainMenuScreen mainMenuScreen;
    RecoveryMnemonicScreen recoveryMnemonicScreen;

    @Test
    public void verifyRecoveryMnemonicFunctionality () {
        pinRegistration = new PinRegistration(driver);
        pinRegistration.clickOnContinueTab();
        pinRegistration.clickOnAuthLoginPin();
        pinRegistration.clickOnPinFieldBox();
        pinRegistration.sendPinOnPinFieldBox("00000000");
        pinRegistration.clickOnConfirmNewPinFieldBox();
        pinRegistration.sendPinOnConfirmNewPinFieldBox("00000000");

        touchIdFaceIdScreen = new TouchIdFaceIdScreen(driver);
        touchIdFaceIdScreen.verifyEnableTouchIdText("Enable Touch ID / Face ID");
        touchIdFaceIdScreen.clickOnMAyBeLaterTab();
        touchIdFaceIdScreen.clickOnOkButtonOfSetupBiometricFutureMessage();
        touchIdFaceIdScreen.clickOnImageMenu();

        mainMenuScreen = new MainMenuScreen(driver);
        mainMenuScreen.verifyRecoveryMnemonicText("Recovery Mnemonic");
        mainMenuScreen.clickOnRecoveryMnemonicTab();

        recoveryMnemonicScreen = new RecoveryMnemonicScreen(driver);
        recoveryMnemonicScreen.verifyEnterYourPinTextAfterClickOnRecoveryMnemonic("Enter your PIN");
        recoveryMnemonicScreen.clickOnEnterPinFieldBoxAfterClickOnRecoveryMnemonic();
        recoveryMnemonicScreen.sendKeysOnEnterPinFieldBoxAfterClickOnRecoveryMnemonic("00000000");
        recoveryMnemonicScreen.verifyRecoveryMnemonicTextAfterEnterThePin("Recovery Mnemonic");
        recoveryMnemonicScreen.verifyNextButtonOfRecoveryMnemonic("Next");
        recoveryMnemonicScreen.verifyClickOnNextButtonTwelveMnemonicPhrasesShouldOpen("These 12 words are the only way to restore your Identity in case of loss or damage to your device. Save them somewhere safe and secret.");
        recoveryMnemonicScreen.verifyAndClickCopyPhrasesTabAtRecoveryMnemonicPage("Copy phrases");
        recoveryMnemonicScreen.verifyAndClickScreenshotTabAtRecoveryMnemonicPage("Screenshot");
        recoveryMnemonicScreen.clickOnOkButtonOfRecoveryMnemonicPage();

    }


    @Test
    public void verifyZeroTrustFunctionality () {
        pinRegistration = new PinRegistration(driver);
        pinRegistration.clickOnContinueTab();
        pinRegistration.clickOnAuthLoginPin();
        pinRegistration.clickOnPinFieldBox();
        pinRegistration.sendPinOnPinFieldBox("00000000");
        pinRegistration.clickOnConfirmNewPinFieldBox();
        pinRegistration.sendPinOnConfirmNewPinFieldBox("00000000");

        touchIdFaceIdScreen = new TouchIdFaceIdScreen(driver);
        touchIdFaceIdScreen.clickOnMAyBeLaterTab();
        touchIdFaceIdScreen.clickOnOkButtonOfSetupBiometricFutureMessage();
        touchIdFaceIdScreen.clickOnImageMenu();

        mainMenuScreen = new MainMenuScreen(driver);
        mainMenuScreen.verifyZeroTrustText("Zero Trust");
        mainMenuScreen.clickOnZeroTrustTab();

        recoveryMnemonicScreen = new RecoveryMnemonicScreen(driver);
        recoveryMnemonicScreen.verifyZeroTrustTextAfterClickOnZeroTrust("Zero Trust");
        recoveryMnemonicScreen.verifyTouchIdFaceIdEnabledTextAfterClickOnZeroTrust("Touch ID / Face ID is enabled");
        recoveryMnemonicScreen.verifyScreenLockEnabledTextAfterClickOnZeroTrust("Screen lock is enabled");
        recoveryMnemonicScreen.verifyDeviceNotRootedTextAfterClickOnZeroTrust("The device is not rooted");
    }


    @Test
    public void verifyAppBuildAndVersionOfAboutScreen () {

        pinRegistration = new PinRegistration(driver);
        pinRegistration.clickOnContinueTab();
        pinRegistration.clickOnAuthLoginPin();
        pinRegistration.clickOnPinFieldBox();
        pinRegistration.sendPinOnPinFieldBox("00000000");
        pinRegistration.clickOnConfirmNewPinFieldBox();
        pinRegistration.sendPinOnConfirmNewPinFieldBox("00000000");

        touchIdFaceIdScreen = new TouchIdFaceIdScreen(driver);
        touchIdFaceIdScreen.clickOnMAyBeLaterTab();
        touchIdFaceIdScreen.clickOnOkButtonOfSetupBiometricFutureMessage();
        touchIdFaceIdScreen.clickOnImageMenu();

        mainMenuScreen = new MainMenuScreen(driver);
        mainMenuScreen.verifyAboutTextOfMenuList("About");
        mainMenuScreen.clickOnAboutTabOfMenuList();

        recoveryMnemonicScreen = new RecoveryMnemonicScreen(driver);
        recoveryMnemonicScreen.verifyAboutTextAfterClickOnAboutOfMenuList("About");
        recoveryMnemonicScreen.verify1kosmosLogoOfAboutPage();
        recoveryMnemonicScreen.verifyAppVersionValueInAboutPage("1.9.41");
        recoveryMnemonicScreen.verifyAppBuildValueInAboutPage("64ABF85C)");
    }

     @Test
    public void verifyEndUserLicenseAgreementFunctionality () {

         pinRegistration = new PinRegistration(driver);
         pinRegistration.clickOnContinueTab();
         pinRegistration.clickOnAuthLoginPin();
         pinRegistration.clickOnPinFieldBox();
         pinRegistration.sendPinOnPinFieldBox("00000000");
         pinRegistration.clickOnConfirmNewPinFieldBox();
         pinRegistration.sendPinOnConfirmNewPinFieldBox("00000000");

         touchIdFaceIdScreen = new TouchIdFaceIdScreen(driver);
         touchIdFaceIdScreen.verifyEnableTouchIdText("Enable Touch ID / Face ID");
         touchIdFaceIdScreen.clickOnMAyBeLaterTab();
         touchIdFaceIdScreen.clickOnOkButtonOfSetupBiometricFutureMessage();
         touchIdFaceIdScreen.clickOnImageMenu();

         mainMenuScreen = new MainMenuScreen(driver);
         mainMenuScreen.verifyEndUserLicenseAgreementText("End User License Agreement (EULA)");
         mainMenuScreen.clickOnEndUserLicenseAgreementTab();

         recoveryMnemonicScreen = new RecoveryMnemonicScreen(driver);
         recoveryMnemonicScreen.verifyEULATextAfterClickOnEULAOfMenuList("EULA");
         recoveryMnemonicScreen.verify1kosmosLogoOfEULAPage();
         recoveryMnemonicScreen.verifyBackButtonOfEULAPage();
     }
}