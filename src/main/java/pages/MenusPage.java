package pages;

import base.TestBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class MenusPage extends TestBase {

    /*** repozytorium elementów ***/
    @FindBy(xpath = "//*[@id='usage']//button[@class='v-btn v-btn--is-elevated v-btn--has-bg theme--dark v-size--default primary']")
    WebElement button;

    @FindBys({
            @FindBy(xpath="//div[@class='v-list v-sheet theme--light']"),
            @FindBy(xpath = "//div[contains(text(),'Click')]")
    })
    List<WebElement> optionsList;

    /*** konstruktor ***/
    public MenusPage() {
        PageFactory.initElements(driver,this);
    }

    /*** metody ***/
    public void clickButton(){
        button.click();
    }

    public void getOpiontsListText(){
        for (WebElement webElement : optionsList) {
            String name = webElement.getText();
            System.out.println(name);
        }
    }
}
