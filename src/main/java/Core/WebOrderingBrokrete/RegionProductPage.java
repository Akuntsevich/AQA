package Core.WebOrderingBrokrete;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class RegionProductPage extends AbstractPage {

    @FindBy (xpath = "//*[@class=\"sc-htpNat cNCNgL\"]")
    private WebElement signInButton;

    @FindBy (xpath = "//*[@class=\"sc-fOKMvo cHwuWI\"]")
    private WebElement signUpButton;

    @FindBy (xpath = "//*[@id=\"email\"]")
    private WebElement emailField;

    @FindBy (xpath = "//*[@id=\"phone\"]")
    private WebElement phoneNumberField;

    @FindBy (xpath = "//*[@id=\"password\"]")
    private WebElement passwordField;

    @FindBy (xpath = "//*[@id=\"password_confirm\"]")
    private WebElement passwordConfirmationField;

    @FindBy (xpath = "//*[@class=\"sc-htpNat ikqDvS sc-gHboQg dxucYH\"]")
    private WebElement signUpConfirmationButton;


    public RegionProductPage(final WebDriver driver) {
       super(driver);
    }

    public void selectSignInButton(){
        signInButton.click();
    }

    public void selectSignUpButton(){
        wait.until(ExpectedConditions.visibilityOf(signUpButton));
        signUpButton.click();
    }

    public void inputEmailField(final String text){
        wait.until(ExpectedConditions.visibilityOf(emailField));
        emailField.sendKeys(text);
    }

    public void inputPhoneNumber(final String text){
        phoneNumberField.sendKeys(text);
    }

    public void setPasswordField(final String text){
        passwordField.sendKeys(text);
    }

    public void setPasswordConfirmationField(final String text){
        passwordConfirmationField.sendKeys(text);
    }

    public void setSignUpConfirmationButton(){
        signUpConfirmationButton.click();
    }


}
