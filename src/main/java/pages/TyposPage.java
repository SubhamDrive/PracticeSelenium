package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TyposPage {
    private WebDriver driver;
    private By text = By.id("content");

    public TyposPage(WebDriver driver)
    {
        this.driver= driver;
    }

    public String getText1()
    {
        return driver.findElement(text).getText();
    }

}
