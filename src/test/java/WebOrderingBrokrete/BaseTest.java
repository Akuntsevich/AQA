package WebOrderingBrokrete;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class BaseTest {

    private WebDriver webDriver;

    public WebDriver getWebDriver() {return webDriver;} // Инициализация драйвера, весь этот клас, им можно пользоватся в каждом тесте и он отдает свою копию в Abstract class

    @Before
    public void driverSetUp(){

        System.getProperty("webdriver.chrome.driver", "chromedriver.exe");
        webDriver = new ChromeDriver();
        webDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        webDriver.manage().window().maximize();
    }

    @After
    public void driverTearDown(){
        webDriver.close();
        webDriver.quit();
    }
}
