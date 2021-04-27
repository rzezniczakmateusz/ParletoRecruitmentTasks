package base;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.io.IOException;

public class TestBase {
    public static WebDriver driver;
    public static WebDriverWait wait;

    public static void initialization(String www){
        System.setProperty("webdriver.chrome.driver","src/main/resources/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(www);
    }

    public void takeScreenShot(String NazwaTestu) {
        File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        try {
            FileUtils.copyFile(src, new File("src/main/resources/" + NazwaTestu+ "_screenshot.png"));
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

}
