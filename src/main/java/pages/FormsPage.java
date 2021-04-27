package pages;

import base.TestBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FormsPage extends TestBase {

    /*** repozytorium elementów ***/
    @FindBy(xpath="//*[@id='usage']//*[contains(text(),'First name')]/following-sibling::input")
    WebElement firstNameInput;

    @FindBy(xpath="//*[@id='usage']//*[contains(text(),'Last name')]/following-sibling::input")
    WebElement lastNameInput;

    @FindBy(xpath="//*[@id='usage']//*[contains(text(),'E-mail')]/following-sibling::input")
    WebElement emailInput;

    /*** konstruktor ***/
    public FormsPage() {
        PageFactory.initElements(driver,this);
    }

    /*** metody ***/
    public void setInput(WebElement inputElement, String text){
        inputElement.clear();
        inputElement.sendKeys(text);
    }

    public void fillForm(String nameStr, String lastNameStr, String emailStr) {
        setInput(firstNameInput,nameStr);
        setInput(lastNameInput,lastNameStr);
        setInput(emailInput,emailStr);
    }
}
