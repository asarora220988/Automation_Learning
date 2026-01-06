package Demo;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestCon {
	WebDriver driver;
	
TestCon()
{
	System.out.println("Browser launching.....");
	driver = new ChromeDriver();
	driver.manage().window().maximize();

	driver.get("https://www.google.com");
}

public void closebrowser()
{
	driver.quit();
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestCon obj=new TestCon();
		obj.closebrowser();

	}

}
