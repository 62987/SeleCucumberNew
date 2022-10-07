package StepDefination;

import io.cucumber.java.bs.A;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class Demo extends BaseClass{


    @When("I launch chrome browser")
    public void i_launch_chrome_browser() throws InterruptedException {

        preCondition();

    }

    @Then("I login as a PM user")
    public void i_login_as_a_pm_user() throws InterruptedException {
        d.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
        d.get("http://192.168.115.84:8080/HeroPayoutUI/html/HeroFincorp/login.html");
        Thread.sleep(4500);
        d.findElement(By.xpath("//input[@id='usrname']")).sendKeys("PMTW001");
        //Thread.sleep(4000);
        d.findElement(By.xpath("//input[@id='password']")).sendKeys("093874");
        //Thread.sleep(4000);
        d.findElement(By.xpath("//button[@id='Sign_In']")).click();
        Thread.sleep(8000);
        //d.close();
    }

    @When("I go to workflow")
    public void i_go_to_workflow() throws InterruptedException {
        d.findElement(By.xpath("//p[text()='Workflow']")).click();
        Thread.sleep(5000);
    }


    @When("I go to Update file")
    public void i_go_to_update_file() throws InterruptedException {
        d.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        d.findElement(By.xpath("//a[text()='Upload File']")).click();
        Thread.sleep(5000);
    }

    @When("I select File Type")
    public void i_select_file_type() throws InterruptedException {
        Select s=new Select(d.findElement(By.xpath("//select[@id='reportType']")));
        //s = d.findElement(By.xpath("//select[@id='reportType']"));
        s.selectByVisibleText("LMS Upload");
        Thread.sleep(5000);
        //s.selectByValue("LMS Upload");
    }

    @When("I select Month")
    public void i_select_month() throws InterruptedException {
        Select s=new Select(d.findElement(By.xpath("//select[@id='monthName']")));
        s.selectByVisibleText("Jan");
        Thread.sleep(5000);
    }

    @When("I select Period")
    public void i_select_period() throws InterruptedException {
        Select s=new Select(d.findElement(By.xpath("//select[@id='exec_type']")));
        s.selectByValue("Monthly");
        Thread.sleep(5000);
    }

    @When("I select Product Name")
    public void i_select_product_name() throws InterruptedException {
        Select s=new Select(d.findElement(By.xpath("//select[@id='productName']")));
        s.selectByValue("TW");
        Thread.sleep(5000);
    }

    @When("I select Year")
    public void i_select_year() throws InterruptedException {
        Select s=new Select(d.findElement(By.xpath("//select[@id='yearVal']")));
        s.selectByVisibleText("2021");
        Thread.sleep(5000);
    }

    @When("I choose Select File")
    public void i_choose_select_file() throws InterruptedException, IOException {
       d.findElement(By.xpath("//label[@class='btn btn-info btn-block']")).click();
       Thread.sleep(8000);
       Runtime.getRuntime().exec("AutoIT/FileUpload2.exe");
       Thread.sleep(5000);
    }

    @When("I click on submit button")
    public void i_click_on_submit_button() throws InterruptedException {
        d.findElement(By.xpath("//button[contains(text(),'Submit')]")).click();
        Thread.sleep(10000);
        d.switchTo().alert().accept();
        Thread.sleep(5000);
    }

    @When("I select Reports")
    public void i_select_reports() throws InterruptedException {
        d.findElement(By.xpath("//p[text()='Reports']")).click();
        Thread.sleep(5000);
    }

    @When("I Select Batch Management")
    public void i_select_batch_management() throws InterruptedException {
        Actions a=new Actions(d);
        a.moveToElement(d.findElement((By.xpath("//a[text()='Batch Management']")))).click().build().perform();
        //d.findElement((By.xpath("//a[text()='Batch Management']"))).click();
        Thread.sleep(8000);
    }



    @When("I click on Master")
    public void i_click_on_master() throws InterruptedException {
        d.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        d.findElement(By.xpath("//p[text()='Master']")).click();
        Thread.sleep(5000);

    }

    @When("I click on Target")
    public void i_click_on_target() throws InterruptedException {
        d.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        d.findElement(By.xpath("//a[text()='Target']")).click();
        Thread.sleep(5000);
    }
    @When("I Select File Type for Target")
    public void i_select_file_type_for_target() throws InterruptedException {
        d.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        Select s=new Select(d.findElement(By.xpath("//select[@id='reportType']")));
        s.selectByVisibleText("TM-Target");
        Thread.sleep(5000);
    }

    @When("I select Role in Upload Target")
    public void i_select_role_in_upload_target() throws InterruptedException {
        d.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        Select s= new Select(d.findElement(By.xpath("//select[@id='Role']")));
        s.selectByVisibleText("TM");
        Thread.sleep(5000);
    }

    @When("I select Product Name in Upload Target")
    public void i_select_product_name_in_upload_target() throws InterruptedException {
        d.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        Select s=new Select(d.findElement(By.xpath("//select[@id='productName']")));
        s.selectByValue("TW");
        Thread.sleep(5000);
    }

    @When("I select Period in Upload Target")
    public void i_select_period_in_upload_target() throws InterruptedException {
        d.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        Select s= new Select(d.findElement(By.xpath("//select[@id='exec_type']")));
        s.selectByValue("Monthly");
        Thread.sleep(5000);
    }

    @When("I select File for Upload Target")
    public void i_select_File_for_upload_target() throws InterruptedException, IOException {
        d.findElement(By.xpath("//label[@class='btn btn-info btn-block']")).click();
        Thread.sleep(40000);
        Runtime.getRuntime().exec("AutoIT/TM_Target_Upload.exe");
        Thread.sleep(5000);
    }

    @When("I click on submit button for upload Target")
    public void i_click_on_submit_button_for_upload_target() throws InterruptedException {
        d.findElement(By.xpath("//button[@id='submitExcel']")).click();
        Thread.sleep(8000);
        d.switchTo().alert().accept();
        Thread.sleep(5000);
    }

    @When("I click on Reset in Upload Target")
    public void i_click_on_reset_in_upload_target() throws InterruptedException {
        d.findElement(By.xpath("//a[@id='cancelExcelUpload']")).click();
        Thread.sleep(5000);

    }














                        /*****************Reports*******************/
    @When("I click on Payment Management")
    public void i_click_on_payment_Management() throws InterruptedException {
        d.findElement(By.xpath("//a[text()='Payment Management']")).click();
        Thread.sleep(3000);


    }



    @Then("i as {string}")
    public void i_as(String string) {

    }










}
