package mobile.tests.cosmosmyidentitydetailstest;

import com.onekosmos.kernel.blockid.framework.init.Base;
import mobile.objectRepository.cosmosmenulists.CosmosMyMenuLists;
import mobile.objectRepository.cosmosmyidentitydetails.CosmosMyIdentityDetails;
import mobile.objectRepository.cosmospinsetup.Login1Cosmos;
import mobile.objectRepository.cosmostouchIdfaceId.CosmosTouchIdFaceId;
import org.testng.annotations.Test;

public class CosmosMyIdentityDetailsTest extends Base {
    Login1Cosmos login1Cosmos;
    CosmosTouchIdFaceId cosmosTouchIdFaceId;

    CosmosMyMenuLists cosmosMyMenuLists;

    CosmosMyIdentityDetails cosmosMyIdentityDetails;

    @Test
    public void verifyEnrollEmailToMyIdentity() {

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
        cosmosMyMenuLists.clickOnMyIdentityTabOfMenuList();

        cosmosMyIdentityDetails = new CosmosMyIdentityDetails(driver);
        cosmosMyIdentityDetails.verifyEmailTextOfMyIdentityPage("Email");
        cosmosMyIdentityDetails.clickOnEmailTabOfMyIdentityPage();
        cosmosMyIdentityDetails.sendEmailOnEmailAddressFieldBox("atul.sharma@1kosmos.com");
        cosmosMyIdentityDetails.clickOnContinueButtonOfEmail();
        cosmosMyIdentityDetails.verifyCheckYourEmailTextOfMail("Check Your Email");
        cosmosMyIdentityDetails.verifyCheckEmailTabOfMail("Check Email");
        cosmosMyIdentityDetails.verifyResendEmailTabOfMail("Resend Email");
        cosmosMyIdentityDetails.clickOnCheckEmailTabOfMail();
        cosmosMyIdentityDetails.verifyInboxTextOfMailId("Inbox");
        cosmosMyIdentityDetails.clickOnVerificationMailOf1kosmos();
    }

    @Test
    public void verifyEnrollPhoneNumberToMyIdentity (){
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
        cosmosMyMenuLists.clickOnMyIdentityTabOfMenuList();

        cosmosMyIdentityDetails = new CosmosMyIdentityDetails(driver);
        cosmosMyIdentityDetails.verifyPhoneTabOfMyIdentityPage("Phone");
        cosmosMyIdentityDetails.clickOnPhoneTabOfMyIdentityPage();
        cosmosMyIdentityDetails.verifyNoSimdetectedTextAfterClickingOnPhoneTab("No SIM detected!");
        cosmosMyIdentityDetails.verifyActiveSimRequiredText("An active SIM is required to proceed with registration. Insert a SIM and try again.");
    }

    @Test
    public void verifyEnrollLiveIdToMyIdentity (){
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
        cosmosMyMenuLists.clickOnMyIdentityTabOfMenuList();

        cosmosMyIdentityDetails = new CosmosMyIdentityDetails(driver);
        cosmosMyIdentityDetails.verifyLiveIdTextOfMyIdentityPage("Live ID");
        cosmosMyIdentityDetails.clickOnLiveIdTextOfMyIdentityPage();
        cosmosMyIdentityDetails.verifyCancelTabOfLiveId("Cancel");
        cosmosMyIdentityDetails.clickOnCancelTabOfLiveId();
        cosmosMyIdentityDetails.clickOnLiveIdTextOfMyIdentityPage();
        cosmosMyIdentityDetails.verifyNextTabOfLiveId("Next");
        cosmosMyIdentityDetails.clickOnNextTabOfLiveId();
        cosmosMyIdentityDetails.verifyAdjustFaceUntilRedToGreenText("Adjust your face position until red box turns green.");
        cosmosMyIdentityDetails.verifyPleaseAlignFaceProperlyMessageText("Please align face properly");

    }

    @Test
    public void verifyEnrollDriversLicenseToMyIdentity () {
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
        cosmosMyMenuLists.clickOnMyIdentityTabOfMenuList();

        cosmosMyIdentityDetails = new CosmosMyIdentityDetails(driver);
        cosmosMyIdentityDetails.verifyDriversLicenseTextOfMyIdentityPage("Drivers License");
        cosmosMyIdentityDetails.clickOnDriversLicenseTabOfMyIdentityPage();
        cosmosMyIdentityDetails.verifyLiveIdEnrollmentMessageAfterClickOnDriversLicense("Live ID enrollment is mandatory to enroll driving license. Please complete Live ID enrollment first.");
        cosmosMyIdentityDetails.clickOnEnrollLiveIDButtonOfLiveIdEnrollmentMessageAfterClickOnDriversLicense();
        cosmosMyIdentityDetails.verifyCancelTabOfLiveId("Cancel");
        cosmosMyIdentityDetails.clickOnCancelTabOfLiveId();
        cosmosMyIdentityDetails.clickOnDriversLicenseTabOfMyIdentityPage();
        cosmosMyIdentityDetails.clickOnEnrollLiveIDButtonOfLiveIdEnrollmentMessageAfterClickOnDriversLicense();
        cosmosMyIdentityDetails.verifyNextTabOfLiveId("Next");
        cosmosMyIdentityDetails.clickOnNextTabOfLiveId();
        cosmosMyIdentityDetails.verifyAdjustFaceUntilRedToGreenText("Adjust your face position until red box turns green.");
        cosmosMyIdentityDetails.verifyPleaseAlignFaceProperlyMessageText("Please align face properly");

    }


    @Test
    public void verifyEnrollPassportToMyIdentityPage () {
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
        cosmosMyMenuLists.clickOnMyIdentityTabOfMenuList();

        cosmosMyIdentityDetails = new CosmosMyIdentityDetails(driver);
        cosmosMyIdentityDetails.verifyPassportTextOfMyIdentityPage("Passport");
        cosmosMyIdentityDetails.clickOnPassportTextOfMyIdentityPage();
        cosmosMyIdentityDetails.verifyLiveIdEnrollmentMessageAfterClickOnDriversLicense("Live ID enrollment is mandatory to enroll passport. Please complete Live ID enrollment first.");
        cosmosMyIdentityDetails.clickOnEnrollLiveIDButtonOfLiveIdEnrollmentMessageAfterClickOnDriversLicense();
        cosmosMyIdentityDetails.verifyCancelTabOfLiveId("Cancel");
        cosmosMyIdentityDetails.clickOnCancelTabOfLiveId();
        cosmosMyIdentityDetails.clickOnPassportTextOfMyIdentityPage();
        cosmosMyIdentityDetails.clickOnEnrollLiveIDButtonOfLiveIdEnrollmentMessageAfterClickOnDriversLicense();
        cosmosMyIdentityDetails.verifyNextTabOfLiveId("Next");
        cosmosMyIdentityDetails.clickOnNextTabOfLiveId();
        cosmosMyIdentityDetails.verifyAdjustFaceUntilRedToGreenText("Adjust your face position until red box turns green.");
        cosmosMyIdentityDetails.verifyPleaseAlignFaceProperlyMessageText("Please align face properly");

    }


    @Test
    public void verifyIdentityValueOfYourDidOfMyIdentityPage () {
        login1Cosmos = new Login1Cosmos (driver);
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
        cosmosMyMenuLists.clickOnMyIdentityTabOfMenuList();

        cosmosMyIdentityDetails = new CosmosMyIdentityDetails(driver);
        cosmosMyIdentityDetails.verifyYourDidTextOfMyIdentityPage("Your DID");
        cosmosMyIdentityDetails.verifyIdentityValueOfYourDidOfMyIdentityPage();
    }




}