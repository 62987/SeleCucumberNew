package StepDefination;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
//import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class Direct_Incentive extends BaseClass{
    //JavascriptExecutor js;
    PropertiesFileReader p=new PropertiesFileReader();

    @When("I launch Chrome browser for direct incentive")
    public void i_launch_chrome_browser_for_direct_incentive() throws InterruptedException {
        preCondition();
    }
    @Then("I login as PMTW user")
    public void i_login_as_pmtw_user() throws InterruptedException {
        //Json b=new Json();
        String URL=p.readPropertiesData("url");
        String Username=p.readPropertiesData("Username");
        String password=p.readPropertiesData("password");
        d.get(URL);

        d.findElement(By.xpath("//input[@id='usrname']")).sendKeys(Username);
        d.findElement(By.xpath("//input[@id='password']")).sendKeys(password);
        d.findElement(By.xpath("//button[@id='Sign_In']")).click();
        Thread.sleep(5000);
    }

    @Then("I click on workflow")
    public void i_click_on_workflow() throws InterruptedException {
        d.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        Actions a=new Actions(d);
        a.moveToElement(d.findElement(By.xpath("//p[text()='Workflow']"))).click().build().perform();
        Thread.sleep(3000);

    }

    @Then("I click on upload file")
    public void i_click_on_upload_file() throws InterruptedException {
        d.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        d.findElement(By.xpath("//a[text() ='Upload File']")).click();
        Thread.sleep(2000);

    }

    @Then("I select New Incetive File")
    public void i_select_new_incetive_file() throws InterruptedException {
        Select s=new Select(d.findElement(By.xpath("//select[@id='reportType']")));
        //s = d.findElement(By.xpath("//select[@id='reportType']"));
        s.selectByVisibleText("New Incentive");
        Thread.sleep(1000);

    }
    @Then("I select Month for new incentive")
    public void i_select_month_for_new_incentive() throws InterruptedException {
        Select s1=new Select(d.findElement(By.xpath("//select[@id='monthName']")));
        s1.selectByVisibleText("Apr");
        Thread.sleep(1000);
    }
    @Then("I select period for new incentive")
    public void i_select_period_for_new_incentive() throws InterruptedException {
        Select s2=new Select(d.findElement(By.xpath("//select[@id='exec_type']")));
        s2.selectByVisibleText("Monthly");
        Thread.sleep(1000);
    }
    @Then("I select Product Name for new incentive")
    public void i_select_product_name_for_new_incentive() throws InterruptedException {
        Select s3=new Select(d.findElement(By.xpath("//select[@id='productName']")));
        s3.selectByVisibleText("TW");
        Thread.sleep(1000);

    }
    @Then("I select Year for new incentive")
    public void i_select_year_for_new_incentive() throws InterruptedException {
        Select s4=new Select(d.findElement(By.xpath("//select[@id='yearVal']")));
        s4.selectByVisibleText("2022");
        Thread.sleep(1000);
    }

    @Then("I upload new incentive file")
    public void i_upload_new_incentive_file() throws InterruptedException, IOException {
        d.findElement(By.xpath("//label[@class='btn btn-info btn-block']")).click();
        Thread.sleep(3000);
        Runtime.getRuntime().exec("AutoIT/Direct_Incentive.exe");
        Thread.sleep(3000);
    }
    @Then("i click on submit button")
    public void i_click_on_submit_button() throws InterruptedException {
        d.findElement(By.xpath("//button[@id='submitExcel']")).click();
        Thread.sleep(5000);
        d.switchTo().alert().accept();
        Thread.sleep(8000);
    }

    @Then("i click on reports for direct incentive")
    public void i_click_on_reports_for_direct_incentive() throws InterruptedException {
        d.findElement(By.xpath("//p[text()='Reports']")).click();
        Thread.sleep(2000);
    }
    @Then("i click on batch management")
    public void i_click_on_batch_management() throws InterruptedException {
        d.findElement(By.xpath("//a[text()='Batch Management']")).click();
        Thread.sleep(3000);
    }

    @Then("i click on calculate GST button")
    public void i_click_on_calculate_gst_button() throws InterruptedException {
        d.findElement(By.xpath("(//td[@class=' downloadPDF1'])[1]")).click();
        Thread.sleep(8000);
        d.switchTo().alert().accept();
        Thread.sleep(5000);
        d.switchTo().alert().accept();


    }
    @Then("i click on view GST sheet")
    public void i_click_on_view_gst_sheet() throws InterruptedException {
        d.findElement(By.xpath("(//td[@class=' viewGSTDetails'])[1]")).click();
        Thread.sleep(4000);
    }

    @Then("i click on invoice generation button")
    public void i_click_on_invoice_generation_button() throws InterruptedException {
        d.findElement(By.xpath("(//td[@class=' generateInvoice'])[1]")).click();
        Thread.sleep(4000);
        d.switchTo().alert().accept();
    }

    @Then("i click on view invoice sheet")
    public void i_click_on_view_invoice_sheet() throws InterruptedException {
        d.findElement(By.xpath("(//td[@class=' viewInvoiceDetails'])[1]"));
        Thread.sleep(4500);

    }

    @Then("i close the chrome browser")
    public void i_close_the_chrome_browser() {
        postCondition();
    }

















}
