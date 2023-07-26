package mobile.objectRepository.cosmosmenulists;

import com.onekosmos.kernel.blockid.performaction.autoweb.Element;
import com.onekosmos.kernel.blockid.performaction.autoweb.Verify;
import com.onekosmos.kernel.blockid.performaction.autoweb.Wait;
import org.openqa.selenium.WebDriver;

public class CosmosMyMenuLists {
    public WebDriver driver = null;
    Verify verify = null;
    Wait wait = null;
    Element element = null;

    public CosmosMyMenuLists(WebDriver driver) {
        this.driver = driver;
        verify = new Verify(driver);
        wait = new Wait(driver);
        element = new Element(driver);
    }


    public void verifyMyIdentityTextOfMenuList(String enterText) {
        wait.waitUntilElementIsVisible("verifyMyIdentityText");
        verify.elementTextIsEqualTo("verifyMyIdentityText", enterText);
    }

    public void clickOnMyIdentityTabOfMenuList(){
        wait.waitUntilElementIsVisible("verifyMyIdentityTab");
        wait.waitUntilElementIsClickable("verifyMyIdentityTab");
        element.click("verifyMyIdentityTab");
    }

    public void verifyVerifiableCredentialsText(String enterText){
        wait.waitUntilElementIsVisible("verifyVerifiableCredentialsText");
        verify.elementTextIsEqualTo("verifyVerifiableCredentialsText",enterText);
    }

    public void clickOnVerifiableCredentialsTab(){
        wait.waitUntilElementIsVisible("verifyVerifiableCredentialsTab");
        wait.waitUntilElementIsClickable("verifyVerifiableCredentialsTab");
        element.click("verifyVerifiableCredentialsTab");
    }

    public void verifyRecoveryMnemonicText (String enterText) {
        wait.waitUntilElementIsVisible("verifyRecoveryMnemonicText");
        verify.elementTextIsEqualTo("verifyRecoveryMnemonicText",enterText);
    }

    public void clickOnRecoveryMnemonicTab (){
        wait.waitUntilElementIsVisible("verifyRecoveryMnemonicTab");
        wait.waitUntilElementIsClickable("verifyRecoveryMnemonicTab");
        element.click("verifyRecoveryMnemonicTab");
    }

    public void verifyZeroTrustText (String enterText){
        wait.waitUntilElementIsVisible("verifyZeroTrustText");
        verify.elementTextIsEqualTo("verifyZeroTrustText",enterText);
    }

    public void clickOnZeroTrustTab (){
        wait.waitUntilElementIsVisible("verifyZeroTrustTab");
        wait.waitUntilElementIsClickable("verifyZeroTrustTab");
        element.click("verifyZeroTrustTab");
    }

    public void verifyAboutTextOfMenuList (String enterText) {
        wait.waitUntilElementIsVisible("verifyAboutTextOfMenuList");
        verify.elementTextIsEqualTo("verifyAboutTextOfMenuList",enterText);
    }

    public void clickOnAboutTabOfMenuList () {
        wait.waitUntilElementIsVisible("verifyAboutTabOfMenuList");
        wait.waitUntilElementIsClickable("verifyAboutTabOfMenuList");
        element.click("verifyAboutTabOfMenuList");
    }

    public void verifyEndUserLicenseAgreementText (String enterText) {
        wait.waitUntilElementIsVisible("verifyEndUserLicenseAgreement(EULA)Text");
        verify.elementTextIsEqualTo("verifyEndUserLicenseAgreement(EULA)Text",enterText);
    }

    public void clickOnEndUserLicenseAgreementTab () {
        wait.waitUntilElementIsVisible("verifyEndUserLicenseAgreement(EULA)Tab");
        wait.waitUntilElementIsClickable("verifyEndUserLicenseAgreement(EULA)Tab");
        element.click("verifyEndUserLicenseAgreement(EULA)Tab");
    }


}
