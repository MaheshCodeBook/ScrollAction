import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;
import java.util.List;

public class ScrollAction3 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "PATH_TO_CHROMEDRIVER");

        WebDriver driver = new ChromeDriver();

        driver.get("https://qanewsfeed.ccbp.tech/");

        JavascriptExecutor js = (JavascriptExecutor) driver;

        js.executeScript("window.scrollTo(0, document.body.scrollHeight)");

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h2[text() = 'Music Festival Announced']")));

        List<WebElement> articleElements = driver.findElements(By.className("news-article"));

        if(articleElements.size() == 10) {
            System.out.println("All 10 articles displayed");
        } else {
            System.out.println("Few articles are missing...");
        }

        driver.quit();
    }
}