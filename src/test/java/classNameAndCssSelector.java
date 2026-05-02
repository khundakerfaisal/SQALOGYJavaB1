import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class classNameAndCssSelector {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        driver.get("https://demoqa.com/webtables");
        driver.manage().window().maximize();
//        driver.findElement(By.className("btn-primary")).click();
        driver.findElements(By.cssSelector(".btn-primary")).get(0).click();
        Thread.sleep(3000);
        driver.quit();
    }
}
