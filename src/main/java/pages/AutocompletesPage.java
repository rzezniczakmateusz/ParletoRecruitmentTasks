package pages;

import base.TestBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AutocompletesPage extends TestBase {

    /*** repozytorium elementów ***/
    @FindBy(xpath = "//*[text()='Chips']/parent::div[@class='v-input__slot']")
    WebElement chipsCheckbox;

    @FindBy(xpath = "//*[text()='Deletable Chips']/parent::div[@class='v-input__slot']")
    WebElement deletableChipsCheckbox;

    @FindBy(xpath = "//*[@id='usage']//*[@class='v-input__control']//*[@class='v-select__slot']/div[@class='v-input__append-inner']")
    WebElement selecetPalau;

    @FindBy(xpath = "//*[@id='usage']//*[@class='v-input__control']//*[@class='v-select__slot']//input[@file='v-autocomplete/usage']")
    WebElement countryInput;

    @FindBy(xpath = "//*[text()='Palau']")
    WebElement countryPalau;

    @FindBy(xpath = "//*[@class='v-icon notranslate v-chip__close v-icon--link v-icon--right theme--light']")
    WebElement cancelButton;

    /*** konstruktor ***/
    public AutocompletesPage() {
        PageFactory.initElements(driver,this);
    }

    /*** metody ***/
    public void selectCheckbox(){
        chipsCheckbox.click();
        deletableChipsCheckbox.click();
    }

    public void selectCountry(){
        selecetPalau.click();
        countryInput.sendKeys("Palau");
        countryPalau.click();
    }

    public void clickCancelButton() {
        cancelButton.click();
    }

}
