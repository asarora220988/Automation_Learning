import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class LoginTest {

    @Test
    public void verifyLogin() {

        WebDriver driver = new ChromeDriver();
        driver.get("https://example.com/login");

        // Using encapsulated page class
        LoginPage lp = new LoginPage(driver);
        lp.login("admin", "admin123");

        driver.quit();
    }
}
