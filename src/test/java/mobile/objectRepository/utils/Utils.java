package mobile.objectRepository.utils;


import mobile.objectRepository.appRegistration.PinRegistration;
import org.openqa.selenium.WebDriver;

public class Utils {
    public PinRegistration pinRegistration;

    public Utils(WebDriver driver) {
        pinRegistration = new PinRegistration(driver);
    }
    public void setPinRegistration() {
        pinRegistration.clickOnContinueTab();
        pinRegistration.clickOnAuthLoginPin();
        pinRegistration.clickOnPinFieldBox();
        pinRegistration.sendPinOnPinFieldBox("00000000");
        pinRegistration.clickOnConfirmNewPinFieldBox();
        pinRegistration.sendPinOnConfirmNewPinFieldBox("00000000");
    }
}
