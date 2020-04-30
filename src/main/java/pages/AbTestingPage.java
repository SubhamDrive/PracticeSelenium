package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AbTestingPage {
    private WebDriver driver;
    private By cont = By.id("content");

    public AbTestingPage(WebDriver driver)
    {
        this.driver = driver;
    }

    public String gettext()
    {
        return driver.findElement(cont).getText();
    }
}
