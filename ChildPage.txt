import org.openqa.selenium.By;

public class ChildPage extends BaseTest

public void logintest()
{
openBowser();
driver.get("https://example.com");

closeBrowser();

}

public static void main(String[] args)
{

ChildPage obj= new ChildPage();
obj.logintest();
}
