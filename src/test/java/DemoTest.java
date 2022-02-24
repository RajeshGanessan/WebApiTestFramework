import com.kh.config.ConfigFactory;
import com.kh.config.FrameworkConfig;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoTest {

    public static void main(String[] args) {


        System.out.println(ConfigFactory.getConfig().browser());
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.linkedin.com");
        driver.quit();
    }
}
