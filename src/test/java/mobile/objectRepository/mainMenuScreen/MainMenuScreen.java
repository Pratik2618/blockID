package mobile.objectRepository.mainMenuScreen;

import com.onekosmos.kernel.blockid.performaction.autoweb.Element;
import com.onekosmos.kernel.blockid.performaction.autoweb.Verify;
import com.onekosmos.kernel.blockid.performaction.autoweb.Wait;
import org.openqa.selenium.WebDriver;

public class MainMenuScreen {
    public WebDriver driver = null;
    Verify verify = null;
    Wait wait = null;
    Element element = null;

    public MainMenuScreen(WebDriver driver) {
        this.driver = driver;
        verify = new Verify(driver);
        wait = new Wait(driver);
        element = new Element(driver);
    }


    public void verifyMyIdentityTextOfMenuList(String enterText) {
        wait.waitUntilElementIsVisible("myIdentityText");
        verify.elementTextIsEqualTo("myIdentityText", enterText);
    }

    public void clickOnMyIdentityTabOfMenuList(){
        wait.waitUntilElementIsVisible("myIdentityTab");
        wait.waitUntilElementIsClickable("myIdentityTab");
        element.click("myIdentityTab");
    }

    public void verifyVerifiableCredentialsText(String enterText){
        wait.waitUntilElementIsVisible("verifiableCredentialsText");
        verify.elementTextIsEqualTo("verifiableCredentialsText",enterText);
    }

    public void clickOnVerifiableCredentialsTab(){
        wait.waitUntilElementIsVisible("verifiableCredentialsTab");
        wait.waitUntilElementIsClickable("verifiableCredentialsTab");
        element.click("verifiableCredentialsTab");
    }

    public void verifyRecoveryMnemonicText (String enterText) {
        wait.waitUntilElementIsVisible("recoveryMnemonicText");
        verify.elementTextIsEqualTo("recoveryMnemonicText",enterText);
    }

    public void clickOnRecoveryMnemonicTab (){
        wait.waitUntilElementIsVisible("recoveryMnemonicTab");
        wait.waitUntilElementIsClickable("recoveryMnemonicTab");
        element.click("recoveryMnemonicTab");
    }

    public void verifyZeroTrustText (String enterText){
        wait.waitUntilElementIsVisible("zeroTrustText");
        verify.elementTextIsEqualTo("zeroTrustText",enterText);
    }

    public void clickOnZeroTrustTab (){
        wait.waitUntilElementIsVisible("zeroTrustTab");
        wait.waitUntilElementIsClickable("zeroTrustTab");
        element.click("zeroTrustTab");
    }

    public void verifyAboutTextOfMenuList (String enterText) {
        wait.waitUntilElementIsVisible("aboutTextOfMenuList");
        verify.elementTextIsEqualTo("aboutTextOfMenuList",enterText);
    }

    public void clickOnAboutTabOfMenuList () {
        wait.waitUntilElementIsVisible("aboutTabOfMenuList");
        wait.waitUntilElementIsClickable("aboutTabOfMenuList");
        element.click("aboutTabOfMenuList");
    }

    public void verifyEndUserLicenseAgreementText (String enterText) {
        wait.waitUntilElementIsVisible("endUserLicenseAgreement(EULA)Text");
        verify.elementTextIsEqualTo("endUserLicenseAgreement(EULA)Text",enterText);
    }

    public void clickOnEndUserLicenseAgreementTab () {
        wait.waitUntilElementIsVisible("endUserLicenseAgreement(EULA)Tab");
        wait.waitUntilElementIsClickable("endUserLicenseAgreement(EULA)Tab");
        element.click("endUserLicenseAgreement(EULA)Tab");
    }


}
