import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class LoginTest {
    private WebDriver driver;

    @Before
    public void initDriver(){
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
        driver = new ChromeDriver();
    }

    @Test
    public void loginTest() {
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("http://testfasttrackit.info/selenium-test/");

        WebElement accountLink = driver.findElement(By.cssSelector("#header > div > div.skip-links > div > a > span.label"));
        accountLink.click();

//        WebElement loginLink = driver.findElement(By.cssSelector("#header-account > div > ul > li.last > a"));
//        loginLink.click();
//
        driver.findElement(By.cssSelector("#header-account > div > ul > li.last > a")).click();


        driver.findElement(By.cssSelector("#email")).sendKeys("andrea@fast.org");

        driver.findElement(By.cssSelector("#pass")).sendKeys("123456");

        driver.findElement(By.cssSelector("#send2")).click();

        driver.close();
    }
    @After
    public void closeDriver(){
        driver.quit();
    }
}
