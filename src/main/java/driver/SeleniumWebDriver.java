package driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SeleniumWebDriver {
    public static WebDriver driver;

    public static SeleniumWebDriver firefoxDriver(){
        driver = new FirefoxDriver();
        return new SeleniumWebDriver();
    }
    public static WebDriver on(String url){
        driver.get(url);
        return driver;
    }
}
