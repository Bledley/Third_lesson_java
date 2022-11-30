package my_testng.HomeWork;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage extends BasePage {

    public HomePage(WebDriver driver){
        super(driver);
    }

    public WebElement openRegPageBtn = driver.findElement(By.xpath("//*[@data-testid='open-registration-form-button']"));
    //public WebElement btnContinue = driver.findElement(By.xpath("//*[@data-cookiebanner='accept_button']"));
    //public WebElement btnAccept = driver.findElement(By.xpath("//*[@id='L2AGLb']"));
}
