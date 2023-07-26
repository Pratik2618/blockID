package mobile.tests.cosmostouchIdfaceIdtest;

import com.onekosmos.kernel.blockid.framework.init.Base;
import com.onekosmos.kernel.blockid.performaction.autoweb.Wait;
import mobile.objectRepository.cosmospinsetup.Login1Cosmos;
import mobile.objectRepository.cosmostouchIdfaceId.CosmosTouchIdFaceId;
import org.testng.annotations.Test;

public class CosmosTouchIdFaceIdTest extends Base {

    Login1Cosmos login1Cosmos;
    CosmosTouchIdFaceId cosmosTouchIdFaceId;
    Wait wait;

    @Test
    public void verifyMenuIconOfCosmosApp  (){
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
//        cosmosTouchIdFaceId.verifySetupBiometricFutureMessage("You can setup biometrics at any time in the future from the main menu");
        cosmosTouchIdFaceId.clickOnOkButtonOfSetupBiometricFutureMessage();
        cosmosTouchIdFaceId.verifyYourPasscodeText("Your passcode");
        cosmosTouchIdFaceId.clickOnImageMenu();
        cosmosTouchIdFaceId.verifyMenuTextAfterClickingOnImageMenu("Menu");
        cosmosTouchIdFaceId.clickOnCloseTabOfMenu();
        cosmosTouchIdFaceId.verifyYourPasscodeText("Your passcode");

    }



}
