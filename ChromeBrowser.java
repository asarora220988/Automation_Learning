import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeBrowser extends Browser {

    @Override
    public void openBrowser() {
        driver = new ChromeDriver();
        driver.get("https://www.google.com");
        System.out.println("Chrome browser opened");
    }
}
