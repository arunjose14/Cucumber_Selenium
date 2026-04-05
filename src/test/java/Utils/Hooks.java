package Utils;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.WebDriver;

public class Hooks {
    
    // Static driver so it's accessible globally
    public static WebDriver driver;

    @Before
    public void setup() {
        ChromeOptions options = new ChromeOptions();
        driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        
    }

    @After
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}
