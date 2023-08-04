package mobile.tests.myIdentityScreenTest;

import com.onekosmos.kernel.blockid.framework.init.Base;
import mobile.objectRepository.mainMenuScreen.MainMenuScreen;
import mobile.objectRepository.myIdentityScreen.MyIdentityScreen;
import mobile.objectRepository.appRegistration.PinRegistration;
import mobile.objectRepository.touchIdFaceId.TouchIdFaceIdScreen;
import mobile.objectRepository.utils.Utils;
import mobile.tests.appRegistrationTest.PinRegistrationTest;
import org.testng.annotations.Test;

public class MyIdentityScreenTest extends Base {
    PinRegistration pinRegistration;
    TouchIdFaceIdScreen touchIdFaceIdScreen;
    MainMenuScreen mainMenuScreen;
    MyIdentityScreen myIdentityScreen;

    Utils utils ;


    @Test
    public void verifyEnrollEmailToMyIdentity() {
        utils = new Utils(driver);
        utils.setPinRegistration();

//        pinRegistration = new PinRegistration(driver);
//        pinRegistration.clickOnContinueTab();
//        pinRegistration.clickOnAuthLoginPin();
//        pinRegistration.clickOnPinFieldBox();
//        pinRegistration.sendPinOnPinFieldBox("00000000");
//        pinRegistration.clickOnConfirmNewPinFieldBox();
//        pinRegistration.sendPinOnConfirmNewPinFieldBox("00000000");

        touchIdFaceIdScreen = new TouchIdFaceIdScreen(driver);
        touchIdFaceIdScreen.clickOnMAyBeLaterTab();
        touchIdFaceIdScreen.clickOnOkButtonOfSetupBiometricFutureMessage();
        touchIdFaceIdScreen.clickOnImageMenu();

        mainMenuScreen = new MainMenuScreen(driver);
        mainMenuScreen.verifyMyIdentityTextOfMenuList("My Identity");
        mainMenuScreen.clickOnMyIdentityTabOfMenuList();

        myIdentityScreen = new MyIdentityScreen(driver);
        myIdentityScreen.verifyEmailTextOfMyIdentityPage("Email");
        myIdentityScreen.clickOnEmailTabOfMyIdentityPage();
        myIdentityScreen.sendEmailOnEmailAddressFieldBox("atul.sharma@1kosmos.com");
        myIdentityScreen.clickOnContinueButtonOfEmail();
        myIdentityScreen.verifyCheckYourEmailTextOfMail("Check Your Email");
        myIdentityScreen.verifyCheckEmailTabOfMail("Check Email");
        myIdentityScreen.verifyResendEmailTabOfMail("Resend Email");
        myIdentityScreen.clickOnCheckEmailTabOfMail();
        myIdentityScreen.verifyInboxTextOfMailId("Inbox");
    }

    @Test
    public void verifyEnrollPhoneNumberToMyIdentity (){

        utils = new Utils(driver);
        utils.setPinRegistration();

//        pinRegistration = new PinRegistration(driver);
//        pinRegistration.clickOnContinueTab();
//        pinRegistration.clickOnAuthLoginPin();
//        pinRegistration.clickOnPinFieldBox();
//        pinRegistration.sendPinOnPinFieldBox("00000000");
//        pinRegistration.clickOnConfirmNewPinFieldBox();
//        pinRegistration.sendPinOnConfirmNewPinFieldBox("00000000");

        touchIdFaceIdScreen = new TouchIdFaceIdScreen(driver);
        touchIdFaceIdScreen.clickOnMAyBeLaterTab();
        touchIdFaceIdScreen.clickOnOkButtonOfSetupBiometricFutureMessage();
        touchIdFaceIdScreen.clickOnImageMenu();

        mainMenuScreen = new MainMenuScreen(driver);
        mainMenuScreen.clickOnMyIdentityTabOfMenuList();

        myIdentityScreen = new MyIdentityScreen(driver);
        myIdentityScreen.verifyPhoneTabOfMyIdentityPage("Phone");
        myIdentityScreen.clickOnPhoneTabOfMyIdentityPage();
        myIdentityScreen.verifyNoSimdetectedTextAfterClickingOnPhoneTab("No SIM detected!");
        myIdentityScreen.verifyActiveSimRequiredText("An active SIM is required to proceed with registration. Insert a SIM and try again.");
    }

    @Test
    public void verifyEnrollLiveIdToMyIdentity (){
        utils = new Utils(driver);
        utils.setPinRegistration();

//        pinRegistration = new PinRegistration(driver);
//        pinRegistration.clickOnContinueTab();
//        pinRegistration.clickOnAuthLoginPin();
//        pinRegistration.clickOnPinFieldBox();
//        pinRegistration.sendPinOnPinFieldBox("00000000");
//        pinRegistration.clickOnConfirmNewPinFieldBox();
//        pinRegistration.sendPinOnConfirmNewPinFieldBox("00000000");

        touchIdFaceIdScreen = new TouchIdFaceIdScreen(driver);
        touchIdFaceIdScreen.clickOnMAyBeLaterTab();
        touchIdFaceIdScreen.clickOnOkButtonOfSetupBiometricFutureMessage();
        touchIdFaceIdScreen.clickOnImageMenu();

        mainMenuScreen = new MainMenuScreen(driver);
        mainMenuScreen.clickOnMyIdentityTabOfMenuList();

        myIdentityScreen = new MyIdentityScreen(driver);
        myIdentityScreen.verifyLiveIdTextOfMyIdentityPage("Live ID");
        myIdentityScreen.clickOnLiveIdTextOfMyIdentityPage();
        myIdentityScreen.verifyCancelTabOfLiveId("Cancel");
        myIdentityScreen.clickOnCancelTabOfLiveId();
        myIdentityScreen.clickOnLiveIdTextOfMyIdentityPage();
        myIdentityScreen.verifyNextTabOfLiveId("Next");
        myIdentityScreen.clickOnNextTabOfLiveId();
        myIdentityScreen.verifyAdjustFaceUntilRedToGreenText("Adjust your face position until red box turns green.");
        myIdentityScreen.verifyPleaseAlignFaceProperlyMessageText("Please align face properly");

    }

    @Test
    public void verifyEnrollDriversLicenseToMyIdentity () {
          utils = new Utils(driver);
          utils.setPinRegistration();

//        pinRegistration = new PinRegistration(driver);
//        pinRegistration.clickOnContinueTab();
//        pinRegistration.clickOnAuthLoginPin();
//        pinRegistration.clickOnPinFieldBox();
//        pinRegistration.sendPinOnPinFieldBox("00000000");
//        pinRegistration.clickOnConfirmNewPinFieldBox();
//        pinRegistration.sendPinOnConfirmNewPinFieldBox("00000000");

        touchIdFaceIdScreen = new TouchIdFaceIdScreen(driver);
        touchIdFaceIdScreen.clickOnMAyBeLaterTab();
        touchIdFaceIdScreen.clickOnOkButtonOfSetupBiometricFutureMessage();
        touchIdFaceIdScreen.clickOnImageMenu();

        mainMenuScreen = new MainMenuScreen(driver);
        mainMenuScreen.clickOnMyIdentityTabOfMenuList();

        myIdentityScreen = new MyIdentityScreen(driver);
        myIdentityScreen.verifyDriversLicenseTextOfMyIdentityPage("Drivers License");
        myIdentityScreen.clickOnDriversLicenseTabOfMyIdentityPage();
        myIdentityScreen.verifyLiveIdEnrollmentMessageAfterClickOnDriversLicense("Live ID enrollment is mandatory to enroll driving license. Please complete Live ID enrollment first.");
        myIdentityScreen.clickOnEnrollLiveIDButtonOfLiveIdEnrollmentMessageAfterClickOnDriversLicense();
        myIdentityScreen.verifyCancelTabOfLiveId("Cancel");
        myIdentityScreen.clickOnCancelTabOfLiveId();
        myIdentityScreen.clickOnDriversLicenseTabOfMyIdentityPage();
        myIdentityScreen.clickOnEnrollLiveIDButtonOfLiveIdEnrollmentMessageAfterClickOnDriversLicense();
        myIdentityScreen.verifyNextTabOfLiveId("Next");
        myIdentityScreen.clickOnNextTabOfLiveId();
        myIdentityScreen.verifyAdjustFaceUntilRedToGreenText("Adjust your face position until red box turns green.");
        myIdentityScreen.verifyPleaseAlignFaceProperlyMessageText("Please align face properly");

    }

    @Test
    public void verifyEnrollPassportToMyIdentity () {

        utils = new Utils(driver);
        utils.setPinRegistration();

//        pinRegistration = new PinRegistration(driver);
//        pinRegistration.clickOnContinueTab();
//        pinRegistration.clickOnAuthLoginPin();
//        pinRegistration.clickOnPinFieldBox();
//        pinRegistration.sendPinOnPinFieldBox("00000000");
//        pinRegistration.clickOnConfirmNewPinFieldBox();
//        pinRegistration.sendPinOnConfirmNewPinFieldBox("00000000");

        touchIdFaceIdScreen = new TouchIdFaceIdScreen(driver);
        touchIdFaceIdScreen.clickOnMAyBeLaterTab();
        touchIdFaceIdScreen.clickOnOkButtonOfSetupBiometricFutureMessage();
        touchIdFaceIdScreen.clickOnImageMenu();

        mainMenuScreen = new MainMenuScreen(driver);
        mainMenuScreen.clickOnMyIdentityTabOfMenuList();

        myIdentityScreen = new MyIdentityScreen(driver);
        myIdentityScreen.verifyPassportTextOfMyIdentityPage("Passport");
        myIdentityScreen.clickOnPassportTextOfMyIdentityPage();
        myIdentityScreen.verifyLiveIdEnrollmentMessageAfterClickOnDriversLicense("Live ID enrollment is mandatory to enroll passport. Please complete Live ID enrollment first.");
        myIdentityScreen.clickOnEnrollLiveIDButtonOfLiveIdEnrollmentMessageAfterClickOnDriversLicense();
        myIdentityScreen.verifyCancelTabOfLiveId("Cancel");
        myIdentityScreen.clickOnCancelTabOfLiveId();
        myIdentityScreen.clickOnPassportTextOfMyIdentityPage();
        myIdentityScreen.clickOnEnrollLiveIDButtonOfLiveIdEnrollmentMessageAfterClickOnDriversLicense();
        myIdentityScreen.verifyNextTabOfLiveId("Next");
        myIdentityScreen.clickOnNextTabOfLiveId();
        myIdentityScreen.verifyAdjustFaceUntilRedToGreenText("Adjust your face position until red box turns green.");
        myIdentityScreen.verifyPleaseAlignFaceProperlyMessageText("Please align face properly");

    }


    @Test
    public void verifyIdentityValueOfYourDidOfMyIdentity () {
        utils = new Utils(driver);
        utils.setPinRegistration();

//        pinRegistration = new PinRegistration(driver);
//        pinRegistration.clickOnContinueTab();
//        pinRegistration.clickOnAuthLoginPin();
//        pinRegistration.clickOnPinFieldBox();
//        pinRegistration.sendPinOnPinFieldBox("00000000");
//        pinRegistration.clickOnConfirmNewPinFieldBox();
//        pinRegistration.sendPinOnConfirmNewPinFieldBox("00000000");

        touchIdFaceIdScreen = new TouchIdFaceIdScreen(driver);
        touchIdFaceIdScreen.verifyEnableTouchIdText("Enable Touch ID / Face ID");
        touchIdFaceIdScreen.clickOnMAyBeLaterTab();
        touchIdFaceIdScreen.clickOnOkButtonOfSetupBiometricFutureMessage();
        touchIdFaceIdScreen.clickOnImageMenu();

        mainMenuScreen = new MainMenuScreen(driver);
        mainMenuScreen.clickOnMyIdentityTabOfMenuList();

        myIdentityScreen = new MyIdentityScreen(driver);
        myIdentityScreen.verifyYourDidTextOfMyIdentityPage("Your DID");
        myIdentityScreen.verifyIdentityValueOfYourDidOfMyIdentityPage();
    }

}