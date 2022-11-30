package my_testng.HomeWork;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class DriverInit {

    /*@Parameters("browser")
    @Test
    public void parameteredTest(String browser) throws InterruptedException {
        WebDriver driver = getDriver(browser);

        String URL = "https://www.facebook.com/";
        String name = "Johny";
        String surname = "Depp";
        String pass = "Qweasd123";

        driver.get(URL);
        Thread.sleep(5000);
        HomePage homePage = new HomePage(driver);
        Thread.sleep(3000);
        homePage.openRegPageBtn.click();
        Thread.sleep(10000);

        RegPage regPage = new RegPage(driver); //lazy initalization
        regPage.firstNameFld.sendKeys(name);
        regPage.lastNameFld.sendKeys(surname);
        regPage.emailFld.sendKeys(regPage.generatedMail);
        regPage.repeatEmailFld.sendKeys(regPage.generatedMail);

        driver.quit();


    }*/

//    public WebDriver getDriver(String browser) {
//        if (browser.equalsIgnoreCase("firefox")) {
//            System.setProperty("webdriver.gecko.driver", "/Users/artem/IdeaProjects/Third_lesson_java/sources/geckodriver");
//            return new FirefoxDriver();
//        } else if (browser.equalsIgnoreCase("chrome")) {
//            System.setProperty("webdriver.chrome.driver", "/Users/artem/IdeaProjects/Third_lesson_java/sources/chromedriver");
//            return new ChromeDriver();
//        } else return null;
//    }
}
