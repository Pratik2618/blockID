package mobile.tests.cosmospinsetuptest;

import com.onekosmos.kernel.blockid.framework.init.Base;
import com.onekosmos.kernel.blockid.performaction.autoweb.Wait;
import mobile.objectRepository.cosmospinsetup.Login1Cosmos;
import org.testng.annotations.Test;

public class Login1CosmosTest extends Base {

    Login1Cosmos login1Cosmos;
    Wait wait;

    @Test
    public void verifyPinsetUpSuccessfully (){
        login1Cosmos = new Login1Cosmos(driver);
        login1Cosmos.clickOnUserAgreementLink();
        login1Cosmos.clickOnBackButtonOf1cosmosAgreement();
        login1Cosmos.clickOnContinueTab();
        //login1Cosmos.verifyFutureLoginMethodTextAfterContinueButton("Please enable the following method for future login");
        login1Cosmos.clickOnAuthLoginPin();
        login1Cosmos.verifyPinRegistrationText("PIN Registration");
        login1Cosmos.verifyEnterNewPinText("Enter new PIN");
        login1Cosmos.clickOnPinFieldBox();
        login1Cosmos.sendPinOnPinFieldBox("00000000");
        login1Cosmos.verifyConfirmNewPinText("Confirm new PIN");
        login1Cosmos.clickOnConfirmNewPinFieldBox();
        login1Cosmos.sendPinOnConfirmNewPinFieldBox("00000000");
        login1Cosmos.verifyThankYouMessageText("Thank You!");

    }

}
