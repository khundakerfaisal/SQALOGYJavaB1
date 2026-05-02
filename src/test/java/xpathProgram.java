import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpathProgram {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        driver.get("https://demoqa.com/links");
        driver.manage().window().maximize();
//        driver.findElement(By.className("btn-primary")).click();
        driver.findElement(By.xpath("//a[text()='Home']")).click();
        Thread.sleep(4000);
//        driver.quit();
    }

}

