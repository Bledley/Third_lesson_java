package my_testng.HomeWork;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;

import java.io.IOException;

public class BasePage {
    protected WebDriver driver;

    protected BasePage(WebDriver driver){
        this.driver = driver;
    }
}



