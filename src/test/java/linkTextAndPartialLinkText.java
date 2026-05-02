import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static java.time.Duration.ofSeconds;

public class linkTextAndPartialLinkText {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://demoqa.com/links");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(ofSeconds(20));
        Thread.sleep(5000);
//        driver.findElement(By.linkText("Home")).click();
        driver.findElement(By.partialLinkText("Ho")).click();

        Thread.sleep(2000);


    }
}
