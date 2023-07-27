package mobile.tests.touchIdFaceIdTest;

import com.onekosmos.kernel.blockid.framework.init.Base;
import com.onekosmos.kernel.blockid.performaction.autoweb.Wait;
import mobile.objectRepository.appRegistration.PinRegistration;
import mobile.objectRepository.touchIdFaceId.TouchIdFaceIdScreen;
import org.testng.annotations.Test;

public class TouchIdFaceIdScreenTest extends Base {

    PinRegistration pinRegistration;
    TouchIdFaceIdScreen touchIdFaceIdScreen;
    Wait wait;

    @Test
    public void verifyMenuIconOfApp  (){

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
        touchIdFaceIdScreen.verifyYourPasscodeText("Your passcode");
        touchIdFaceIdScreen.clickOnImageMenu();
        touchIdFaceIdScreen.verifyMenuTextAfterClickingOnImageMenu("Menu");
        touchIdFaceIdScreen.clickOnCloseTabOfMenu();
        touchIdFaceIdScreen.verifyYourPasscodeText("Your passcode");

    }

}
