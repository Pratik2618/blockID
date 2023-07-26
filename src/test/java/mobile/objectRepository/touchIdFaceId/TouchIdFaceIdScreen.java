package mobile.objectRepository.touchIdFaceId;

import com.onekosmos.kernel.blockid.performaction.autoweb.Element;
import com.onekosmos.kernel.blockid.performaction.autoweb.Verify;
import com.onekosmos.kernel.blockid.performaction.autoweb.Wait;
import org.openqa.selenium.WebDriver;

public class TouchIdFaceIdScreen {

        public WebDriver driver = null;
        Verify verify = null;
        Wait wait = null;
        Element element = null;

        public TouchIdFaceIdScreen(WebDriver driver) {
            this.driver = driver;
            verify = new Verify(driver);
            wait = new Wait(driver);
            element = new Element(driver);
        }


        public void verifyEnableTouchIdText(String enterText) {
            wait.waitUntilElementIsVisible("unableTouchIdText");
            verify.elementTextIsEqualTo("unableTouchIdText", enterText);
        }
        public void clickOnEnableButtonOfTouchIdFaceId(){
            wait.waitUntilElementIsVisible("enableButtonOfTouchIdFaceId");
            wait.waitUntilElementIsClickable("enableButtonOfTouchIdFaceId");
            element.click("enableButtonOfTouchIdFaceId");
        }
        public void clickOnMAyBeLaterTab () {
            wait.waitUntilElementIsVisible("mayBeLaterTab");
            wait.waitUntilElementIsClickable("mayBeLaterTab");
            element.click("mayBeLaterTab");
        }

        public void clickOnOkButtonOfSetupBiometricFutureMessage (){
            wait.waitUntilElementIsVisible("okButton");
            wait.waitUntilElementIsClickable("okButton");
            element.click("okButton");
        }

        public void clickOnImageMenu () {
            wait.waitUntilElementIsVisible("imageOfMenu");
            wait.waitUntilElementIsClickable("imageOfMenu");
            element.click("imageOfMenu");
        }

        public void verifyMenuTextAfterClickingOnImageMenu (String enterText){
            wait.waitUntilElementIsVisible("menuText");
            verify.elementTextIsEqualTo("menuText",enterText);
        }

        public void clickOnCloseTabOfMenu (){
            wait.waitUntilElementIsVisible("closeTab");
            wait.waitUntilElementIsClickable("closeTab");
            element.click("closeTab");
        }

        public void verifyYourPasscodeText (String enterText){
            wait.waitUntilElementIsVisible("yourPasscodeText");
            verify.elementTextIsEqualTo("yourPasscodeText",enterText);
        }

    }

