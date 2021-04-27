package test;

import base.TestBase;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.AutocompletesPage;


public class AutocompletesPageTest extends TestBase {
    AutocompletesPage autocompletesPage;

    public AutocompletesPageTest(){
        super();
    }

    @BeforeClass
    public void setUp(){
        initialization("https://vuetifyjs.com/en/components/autocompletes/");
        autocompletesPage = new AutocompletesPage();
    }

    @AfterClass
    public void close(){
        driver.quit();
    }

    @Test(priority = 1)
    public void selectingCheckbox(){
        autocompletesPage.selectCheckbox();
    }

    @Test(priority = 2)
    public void selectingPalau(){
        autocompletesPage.selectCountry();
        takeScreenShot("Autocomplete");
    }

    @Test(priority = 3)
    public void deleteCountry(){
        autocompletesPage.clickCancelButton();
    }
}
