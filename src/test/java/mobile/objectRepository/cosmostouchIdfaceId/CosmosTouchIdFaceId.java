package mobile.objectRepository.cosmostouchIdfaceId;

import com.onekosmos.kernel.blockid.performaction.autoweb.Element;
import com.onekosmos.kernel.blockid.performaction.autoweb.Verify;
import com.onekosmos.kernel.blockid.performaction.autoweb.Wait;
import org.openqa.selenium.WebDriver;

public class CosmosTouchIdFaceId {

        public WebDriver driver = null;
        Verify verify = null;
        Wait wait = null;
        Element element = null;

        public CosmosTouchIdFaceId(WebDriver driver) {
            this.driver = driver;
            verify = new Verify(driver);
            wait = new Wait(driver);
            element = new Element(driver);
        }


        public void verifyEnableTouchIdText(String enterText) {
            wait.waitUntilElementIsVisible("verifyUnableTouchIdText");
            verify.elementTextIsEqualTo("verifyUnableTouchIdText", enterText);
        }

        public void clickOnSettingsButton (){
            wait.waitUntilElementIsVisible("verifySettingsButton");
            wait.waitUntilElementIsClickable("verifySettingsButton");
            element.click("verifySettingsButton");
        }

        public void clickOnEnableButtonOfTouchIdFaceId(){
            wait.waitUntilElementIsVisible("verifyEnableButtonOfTouchIdFaceId");
            wait.waitUntilElementIsClickable("verifyEnableButtonOfTouchIdFaceId");
            element.click("verifyEnableButtonOfTouchIdFaceId");
        }
        public void clickOnMAyBeLaterTab () {
            wait.waitUntilElementIsVisible("verifyMaybelaterTab");
            wait.waitUntilElementIsClickable("verifyMaybelaterTab");
            element.click("verifyMaybelaterTab");
        }

        public void verifySetupBiometricFutureMessage (String enterText){
            wait.waitUntilElementIsVisible("verifySetupBiometricMessage");
            verify.elementTextIsEqualTo("verifySetupBiometricMessage",enterText);
        }

        public void clickOnOkButtonOfSetupBiometricFutureMessage (){
            wait.waitUntilElementIsVisible("verifyOkButton");
            wait.waitUntilElementIsClickable("verifyOkButton");
            element.click("verifyOkButton");
        }

        public void clickOnImageMenu () {
            wait.waitUntilElementIsVisible("verifyImageOfMenu");
            wait.waitUntilElementIsClickable("verifyImageOfMenu");
            element.click("verifyImageOfMenu");
        }

        public void verifyMenuTextAfterClickingOnImageMenu (String enterText){
            wait.waitUntilElementIsVisible("verifyMenuText");
            verify.elementTextIsEqualTo("verifyMenuText",enterText);
        }

        public void clickOnCloseTabOfMenu (){
            wait.waitUntilElementIsVisible("verifyCloseTab");
            wait.waitUntilElementIsClickable("verifyCloseTab");
            element.click("verifyCloseTab");
        }

        public void verifyYourPasscodeText (String enterText){
            wait.waitUntilElementIsVisible("verifyYourPasscodeText");
            verify.elementTextIsEqualTo("verifyYourPasscodeText",enterText);
        }

    }

