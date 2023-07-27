package mobile.tests.appRegistrationTest;

import com.onekosmos.kernel.blockid.framework.init.Base;
import com.onekosmos.kernel.blockid.performaction.autoweb.Wait;
import mobile.objectRepository.appRegistration.PinRegistration;
import org.testng.annotations.Test;

public class PinRegistrationTest extends Base {

    PinRegistration pinRegistration;
    Wait wait;


    @Test
    public void verifyThankYouMessageAfterSuccessfullyPinRegistration () {

        pinRegistration = new PinRegistration(driver);
        pinRegistration.clickOnUserAgreementLink();
        pinRegistration.clickOnBackButtonOf1cosmosAgreement();
        pinRegistration.clickOnContinueTab();
        pinRegistration.clickOnAuthLoginPin();
        pinRegistration.verifyPinRegistrationText("PIN Registration");
        pinRegistration.verifyEnterNewPinText("Enter new PIN");
        pinRegistration.clickOnPinFieldBox();
        pinRegistration.sendPinOnPinFieldBox("00000000");
        pinRegistration.verifyConfirmNewPinText("Confirm new PIN");
        pinRegistration.clickOnConfirmNewPinFieldBox();
        pinRegistration.sendPinOnConfirmNewPinFieldBox("00000000");
        pinRegistration.verifyThankYouMessageText("Thank You!");

    }

}
