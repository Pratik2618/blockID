package mobile.tests.recoverymnemoniceuladetailstest;

import com.onekosmos.kernel.blockid.framework.init.Base;
import mobile.objectRepository.cosmosmenulists.CosmosMyMenuLists;
import mobile.objectRepository.cosmospinsetup.Login1Cosmos;
import mobile.objectRepository.cosmostouchIdfaceId.CosmosTouchIdFaceId;
import mobile.objectRepository.recoverymnemoniceuladetails.RecoveryMnemonicEulaDetails;
import org.testng.annotations.Test;

public class RecoveryMnemonicEulaDetailsTest extends Base {

    Login1Cosmos login1Cosmos;
    CosmosTouchIdFaceId cosmosTouchIdFaceId;
    CosmosMyMenuLists cosmosMyMenuLists;
    RecoveryMnemonicEulaDetails recoveryMnemonicEulaDetails;

    @Test
    public void verifyRecoveryMnemonicFunctionalityOfMenuList() {
        login1Cosmos = new Login1Cosmos(driver);
        login1Cosmos.clickOnContinueTab();
        login1Cosmos.clickOnAuthLoginPin();
        login1Cosmos.clickOnPinFieldBox();
        login1Cosmos.sendPinOnPinFieldBox("00000000");
        login1Cosmos.clickOnConfirmNewPinFieldBox();
        login1Cosmos.sendPinOnConfirmNewPinFieldBox("00000000");

        cosmosTouchIdFaceId = new CosmosTouchIdFaceId(driver);
        cosmosTouchIdFaceId.verifyEnableTouchIdText("Enable Touch ID / Face ID");
        cosmosTouchIdFaceId.clickOnMAyBeLaterTab();
        cosmosTouchIdFaceId.clickOnOkButtonOfSetupBiometricFutureMessage();
        cosmosTouchIdFaceId.clickOnImageMenu();

        cosmosMyMenuLists = new CosmosMyMenuLists(driver);
        cosmosMyMenuLists.verifyRecoveryMnemonicText("Recovery Mnemonic");
        cosmosMyMenuLists.clickOnRecoveryMnemonicTab();

        recoveryMnemonicEulaDetails = new RecoveryMnemonicEulaDetails(driver);
        recoveryMnemonicEulaDetails.verifyEnterYourPinTextAfterClickOnRecoveryMnemonic("Enter your PIN");
        recoveryMnemonicEulaDetails.clickOnEnterPinFieldBoxAfterClickOnRecoveryMnemonic();
        recoveryMnemonicEulaDetails.sendKeysOnEnterPinFieldBoxAfterClickOnRecoveryMnemonic("00000000");
        recoveryMnemonicEulaDetails.verifyRecoveryMnemonicTextAfterEnterThePin("Recovery Mnemonic");
        recoveryMnemonicEulaDetails.verifyNextButtonOfRecoveryMnemonic("Next");
        recoveryMnemonicEulaDetails.verifyClickOnNextButtonTwelveMnemonicPhrasesShouldOpen("These 12 words are the only way to restore your Identity in case of loss or damage to your device. Save them somewhere safe and secret.");
        recoveryMnemonicEulaDetails.verifyAndClickCopyPhrasesTabAtRecoveryMnemonicPage("Copy phrases");
       // recoveryMnemonicEulaDetails.verifyTextAfterClickOnCopyPhrase("Mnemonic phrase has been copied");
        recoveryMnemonicEulaDetails.verifyAndClickScreenshotTabAtRecoveryMnemonicPage("Screenshot");
        //recoveryMnemonicEulaDetails.verifyTextAfterClickOnScreenshotTab("Mnemonic phrase screenshot has been saved");
        recoveryMnemonicEulaDetails.clickOnOkButtonOfRecoveryMnemonicPage();

        cosmosMyMenuLists.verifyRecoveryMnemonicText("Recovery Mnemonic");

    }


    @Test
    public void verifyZeroTrustFunctionalityOfMenuList() {
        login1Cosmos = new Login1Cosmos(driver);
        login1Cosmos.clickOnContinueTab();
        login1Cosmos.clickOnAuthLoginPin();
        login1Cosmos.clickOnPinFieldBox();
        login1Cosmos.sendPinOnPinFieldBox("00000000");
        login1Cosmos.clickOnConfirmNewPinFieldBox();
        login1Cosmos.sendPinOnConfirmNewPinFieldBox("00000000");

        cosmosTouchIdFaceId = new CosmosTouchIdFaceId(driver);
        cosmosTouchIdFaceId.verifyEnableTouchIdText("Enable Touch ID / Face ID");
        cosmosTouchIdFaceId.clickOnMAyBeLaterTab();
        cosmosTouchIdFaceId.clickOnOkButtonOfSetupBiometricFutureMessage();
        cosmosTouchIdFaceId.clickOnImageMenu();

        cosmosMyMenuLists = new CosmosMyMenuLists(driver);
        cosmosMyMenuLists.verifyZeroTrustText("Zero Trust");
        cosmosMyMenuLists.clickOnZeroTrustTab();

        recoveryMnemonicEulaDetails = new RecoveryMnemonicEulaDetails(driver);
        recoveryMnemonicEulaDetails.verifyZeroTrustTextAfterClickOnZeroTrust("Zero Trust");
        recoveryMnemonicEulaDetails.verifyTouchIdFaceIdEnabledTextAfterClickOnZeroTrust("Touch ID / Face ID is enabled");
        recoveryMnemonicEulaDetails.verifyScreenLockEnabledTextAfterClickOnZeroTrust("Screen lock is enabled");
        recoveryMnemonicEulaDetails.verifyDeviceNotRootedTextAfterClickOnZeroTrust("The device is not rooted");
    }


    @Test
    public void verifyAboutFunctionalityOfMenuList () {
        login1Cosmos = new Login1Cosmos(driver);
        login1Cosmos.clickOnContinueTab();
        login1Cosmos.clickOnAuthLoginPin();
        login1Cosmos.clickOnPinFieldBox();
        login1Cosmos.sendPinOnPinFieldBox("00000000");
        login1Cosmos.clickOnConfirmNewPinFieldBox();
        login1Cosmos.sendPinOnConfirmNewPinFieldBox("00000000");

        cosmosTouchIdFaceId = new CosmosTouchIdFaceId(driver);
        cosmosTouchIdFaceId.verifyEnableTouchIdText("Enable Touch ID / Face ID");
        cosmosTouchIdFaceId.clickOnMAyBeLaterTab();
        cosmosTouchIdFaceId.clickOnOkButtonOfSetupBiometricFutureMessage();
        cosmosTouchIdFaceId.clickOnImageMenu();

        cosmosMyMenuLists = new CosmosMyMenuLists(driver);
        cosmosMyMenuLists.verifyAboutTextOfMenuList("About");
        cosmosMyMenuLists.clickOnAboutTabOfMenuList();

        recoveryMnemonicEulaDetails = new RecoveryMnemonicEulaDetails(driver);
        recoveryMnemonicEulaDetails.verifyAboutTextAfterClickOnAboutOfMenuList("About");
        recoveryMnemonicEulaDetails.verify1kosmosLogoOfAboutPage();
        recoveryMnemonicEulaDetails.verifyAppVersionInAboutPage();
        recoveryMnemonicEulaDetails.verifyAppVersionValueInAboutPage("1.9.41");
        recoveryMnemonicEulaDetails.verifyAppBuildInAboutPage();
        recoveryMnemonicEulaDetails.verifyAppBuildValueInAboutPage("64ABF85C)");
    }

     @Test
    public void verifyEndUserLicenseAgreementFunctionalityOfMenuList () {
         login1Cosmos = new Login1Cosmos(driver);
         login1Cosmos.clickOnContinueTab();
         login1Cosmos.clickOnAuthLoginPin();
         login1Cosmos.clickOnPinFieldBox();
         login1Cosmos.sendPinOnPinFieldBox("00000000");
         login1Cosmos.clickOnConfirmNewPinFieldBox();
         login1Cosmos.sendPinOnConfirmNewPinFieldBox("00000000");

         cosmosTouchIdFaceId = new CosmosTouchIdFaceId(driver);
         cosmosTouchIdFaceId.verifyEnableTouchIdText("Enable Touch ID / Face ID");
         cosmosTouchIdFaceId.clickOnMAyBeLaterTab();
         cosmosTouchIdFaceId.clickOnOkButtonOfSetupBiometricFutureMessage();
         cosmosTouchIdFaceId.clickOnImageMenu();

         cosmosMyMenuLists = new CosmosMyMenuLists(driver);
         cosmosMyMenuLists.verifyEndUserLicenseAgreementText("End User License Agreement (EULA)");
         cosmosMyMenuLists.clickOnEndUserLicenseAgreementTab();

         recoveryMnemonicEulaDetails = new RecoveryMnemonicEulaDetails(driver);
         recoveryMnemonicEulaDetails.verifyEULATextAfterClickOnEULAOfMenuList("EULA");
         recoveryMnemonicEulaDetails.verify1kosmosLogoOfEULAPage();
         recoveryMnemonicEulaDetails.verifyBackButtonOfEULAPage();
     }
}