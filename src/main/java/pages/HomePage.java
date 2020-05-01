package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
    private WebDriver driver;

    public HomePage(WebDriver driver)
    {
        this.driver = driver;
    }

    public LoginPage clickFormAuthentication(){
        clickLink("Form Authentication");
        return new LoginPage(driver);
    }
    public AbTestingPage clickAb(){
        clickLink("A/B Testing");
        return new AbTestingPage(driver);
    }

    public TyposPage clickTypos()
    {
        clickLink("Typos");
        return new TyposPage(driver);
    }

    private void clickLink(String LinkText)
    {
        driver.findElement(By.linkText(LinkText)).click();
    }
}
