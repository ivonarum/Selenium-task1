import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.List;
import org.junit.Test;
import org.junit.After;
import org.junit.Before;

public class Test1 {
    WebDriver driver;

    @Before 
    //OTWIERANIE PRZEGLADARKI I CHROME DRIVER
    public void driverSetup(){
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
        driver = new ChromeDriver();
    }

    @After
    public void driverClose(){
        driver.quit();
    } 

    @Test
    public void firstTest(){
        driver.get("https://skleptest.pl/");
    }
}
