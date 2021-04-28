package test;

import base.TestBase;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.MenusPage;

public class MenusPageTest extends TestBase {
    MenusPage menusPage;

    public MenusPageTest(){
        super();
    }

    @BeforeClass
    public void setUp(){
        initialization("https://vuetifyjs.com/en/components/menus/");
        menusPage = new MenusPage();
    }

    @AfterClass
    public void close(){
        driver.quit();
    }

    @Test
    public void getOptionsLogs() throws InterruptedException{
        menusPage.clickButton();
        Thread.sleep(3000);
        menusPage.getOpiontsListText();
        takeScreenShot("MenusPage");
    }
}
