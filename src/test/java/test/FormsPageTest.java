package test;

import base.TestBase;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.FormsPage;

public class FormsPageTest extends TestBase {
    FormsPage formsPage;

    public FormsPageTest(){
        super();
    }

    @BeforeClass
    public void setUp(){
        initialization("https://vuetifyjs.com/en/components/forms/");
        formsPage = new FormsPage();
    }

    @AfterClass
    public void close(){
        driver.quit();
    }

    @Test
    public void addPersonalDetails(){
        formsPage.fillForm("Mateusz","Rzezniczak","rzezniczakmateusz@gmail.com");
        takeScreenShot("FormPage");
    }
}
