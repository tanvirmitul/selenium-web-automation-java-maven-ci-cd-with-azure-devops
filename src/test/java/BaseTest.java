import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import java.time.Duration;

public class BaseTest {
    public WebDriver driver;

    @BeforeTest
    public void setup() {
        // Configure Chrome options
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        options.addArguments("--no-sandbox"); // Important for Linux
        options.addArguments("--disable-dev-shm-usage"); // Prevents memory issues
        options.addArguments("--headless"); // Run without GUI (useful for CI/CD pipelines)
        options.addArguments("--disable-gpu"); // Disable GPU acceleration (Linux)
        driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

    }
    @AfterTest
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}
