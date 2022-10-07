package StepDefination;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class BaseClass {
    WebDriver d=null;
    public void preCondition() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","Driver/chromedriver.exe");
        System.setProperty("webdriver.chrome.slientOutput","true");
        d=new ChromeDriver();
        d.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
        d.manage().window().maximize();
        Thread.sleep(5000);
    }
    public void postCondition(){
        d.close();
    }


}
