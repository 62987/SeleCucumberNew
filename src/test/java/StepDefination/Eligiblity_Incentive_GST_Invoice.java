package StepDefination;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.devtools.v85.debugger.Debugger;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.w3c.dom.ls.LSOutput;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class Eligiblity_Incentive_GST_Invoice extends BaseClass {
    JavascriptExecutor js;
    PropertiesFileReader p=new PropertiesFileReader();

    @When("I launch Chrome browser")
    public void i_launch_Chrome_browser() throws InterruptedException {
        preCondition();
    }
    @Then("I login as a Pm user")
    public void i_login_as_a_Pm_user() throws InterruptedException {
        //d.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
        Json a=new Json();
        String URL=p.readPropertiesData("url");
        String Username=p.readPropertiesData("Username");
        String password=p.readPropertiesData("password");
        d.get(URL);

        d.findElement(By.xpath("//input[@id='usrname']")).sendKeys(Username);
        d.findElement(By.xpath("//input[@id='password']")).sendKeys(password);
        d.findElement(By.xpath("//button[@id='Sign_In']")).click();
        Thread.sleep(5000);


    }
    @When("I go to Workflow")
    public void i_go_to_Workflow() throws InterruptedException {
        d.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        Actions a=new Actions(d);
        a.moveToElement(d.findElement(By.xpath("//p[text()='Workflow']"))).click().build().perform();

        d.findElement(By.xpath("//p[text()='Workflow']")).click();
        Thread.sleep(2000);

    }

    @When("I go to Update File")
    public void i_go_to_update_File() throws InterruptedException {
        d.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        d.findElement(By.xpath("//a[text()='Upload File']")).click();
        Thread.sleep(2000);
    }
    @When("I Verify Workflow Upload Excel")
    public void i_verify_workflow_upload_excel() throws InterruptedException {
        d.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        String a=d.findElement(By.xpath("//h3[text()='Upload Excel']")).getText();
        Assert.assertEquals("Upload Excel",a);
        System.out.println("*********************Compare Sucessfully*******************************");
        Thread.sleep(1000);
    }

    @When("I Select File Type")
    public void i_Select_file_type() throws InterruptedException {
        Select s=new Select(d.findElement(By.xpath("//select[@id='reportType']")));
        //s = d.findElement(By.xpath("//select[@id='reportType']"));
        s.selectByVisibleText("LMS Upload");
        Thread.sleep(1000);
        //s.selectByValue("LMS Upload");
    }

    @When("I Select Month")
    public void i_Select_month() throws InterruptedException {
        Select s=new Select(d.findElement(By.xpath("//select[@id='monthName']")));
        s.selectByVisibleText("Jul");
        Thread.sleep(1000);
    }

    @When("I Select Period")
    public void i_Select_period() throws InterruptedException {
        Select s=new Select(d.findElement(By.xpath("//select[@id='exec_type']")));
        s.selectByValue("Monthly");
        Thread.sleep(1000);
    }

    @When("I Select Product Name")
    public void i_Select_product_name() throws InterruptedException {
        Select s=new Select(d.findElement(By.xpath("//select[@id='productName']")));
        s.selectByValue("TW");
        Thread.sleep(1000);
    }

    @When("I Select Year")
    public void i_Select_year() throws InterruptedException {
        Select s=new Select(d.findElement(By.xpath("//select[@id='yearVal']")));
        s.selectByVisibleText("2020");
        Thread.sleep(1000);
    }

    @When("I choose select File")
    public void i_choose_select_file() throws InterruptedException, IOException {
        d.findElement(By.xpath("//label[@class='btn btn-info btn-block']")).click();
        Thread.sleep(6000);
        Runtime.getRuntime().exec("AutoIT/FileUpload2.exe");
        Thread.sleep(3000);
    }
    @When("I click on Submit button")
    public void i_click_on_Submit_button() throws InterruptedException {
        d.findElement(By.xpath("//button[contains(text(),'Submit')]")).click();
        Thread.sleep(7000);
        d.switchTo().alert().accept();
        Thread.sleep(4000);
    }
            //With Dynamic Path for Report//
    @When("i click on \"([^\"]*)\"$")
    public void i_click_on(String string) {
        //d.findElement(By.xpath("//p[text()= '"+string+"']")).click();
        d.findElement(By.xpath("//p[text()='"+string+"']")).click();
    }
            // With Relative Path//
    @When("I Select Reports")
    public void i_Select_reports() throws InterruptedException {
        //d.findElement(By.xpath("//p[text()='Reports']")).click();
        Actions a=new Actions(d);
        a.moveToElement(d.findElement(By.xpath("//p[text()='Reports']"))).click().build().perform();
        Thread.sleep(2000);
    }


    @When("I select Batch Management")
    public void i_select_batch_management() throws InterruptedException {
        d.manage().timeouts().implicitlyWait(50,TimeUnit.SECONDS);
        //Actions a=new Actions(d);
        //a.moveToElement(d.findElement((By.xpath("//a[text()='Batch Management']")))).click().build().perform();
        d.findElement((By.xpath("//a[text()='Batch Management']"))).click();
        Thread.sleep(2000);
    }

    @Then("I click on Eligiblity")
    public void i_click_on_eligiblity() throws InterruptedException {
        d.manage().timeouts().implicitlyWait(50,TimeUnit.SECONDS);
        try {
            d.findElement(By.xpath("(//div[text()='Check Eligibility'])[1]"));
            d.findElement(By.xpath("//td[@class=' checkEligibility']")).click();
            Thread.sleep(25000);
            d.switchTo().alert().accept();
            Thread.sleep(5000);
        }
        catch (Exception e)
        {
            System.out.println(e);
        }
    }
            //With Dynamic path//
    @Then("I clicked on \"([^\"]*)\"$")
    public void i_clicked_on(String string) throws InterruptedException {
        Actions a=new Actions(d);
        a.moveToElement(d.findElement(By.xpath("(//td[@class=' "+string+"'])[1]"))).click().build().perform();
        d.findElement(By.xpath("( //td[@class=' "+string+"'])[1]")).click();
        Thread.sleep(5000);
        d.switchTo().alert().accept();
    }

    @When("I Verify Master Error Record")
    public void i_verify_master_error_record() throws InterruptedException {
        //String mastererrorrecord = "mastererrorrecord";
        WebElement pp=d.findElement(By.xpath("//a[@class='viewMasterDetailsTD']"));
        int count=Integer.parseInt(pp.getText());
        try {
            if (count == 0)
            {
                this.i_click_on_view_eligiblity_sheet();
                this.i_select_eligiblity_type_in_batch_management();
                this.i_click_on_eligiblity_submit_button();
                this.i_click_on_reports();
                this.i_click_on_batch_management();
                this.i_click_on_incentive();
                Thread.sleep(20000);
                this.i_click_on_incentive_sheet_for_view();
                this.i_click_on_incentive_select_role();
                this.i_click_on_submit();

                this.i_select_reports_for_gst();
                this.i_click_on_batch_management_for_gst();
                this.i_calculate_gst();
                this.i_click_on_view_gst_sheet();

                this.i_select_reports_for_invoice_generation();
                this.i_select_batch_management_for_invoice_generation();
                this.i_click_on_generate_invoice();
                this.i_calculate_gst();
                this.i_click_on_view_invoice();
                Thread.sleep(5000);
                System.out.println("..........................Submit the incentive....................");
                System.out.println("****************Master Errror Records Mismatch*******************");
                Thread.sleep(6000);
                this.i_close_the_Chrome_browser();
            }
            else if(count!=0)
            {
                System.out.println("................................Verify sucessfully.........................................................");
                System.out.println("................................Processed the process......................................................");
            }
        }
            catch (Exception e)
            {
                System.out.println(e);
            }


        /*String msg=d.findElement(By.xpath("//td[text()='Nothing found - sorry']")).getText();
        if(msg.equals("Nothing found - sorry"))
        {
            System.out.println("Master Errror Records Mismatch");
            this.i_click_on_reports();
            this.i_click_on_batch_management();
            this.i_verify_master_error_record();
            Thread.sleep(6000);

        }*/

    }
    @When("I Verify Master Error Record as {int}")
    public void i_verify_master_error_record_as(Integer int1) {
        try{
        WebElement h=d.findElement(By.xpath("//a[@class='viewMasterDetailsTD']"));
        int count=Integer.parseInt(h.getText());
        int cc=1;
            if (count==cc) {

                System.out.println("*****************************Verification Sccessfully***********************************");
            } else {
                System.out.println("*********************************Master Error Record is not match with 1**************************************");
            }
        }
        catch (Exception e)
        {
            System.out.println(e);
        }

    }

    @When("I Verify Master Error Record as zero")
    public void i_verify_master_error_record_as_zero() {
        try {
            WebElement j = d.findElement(By.xpath("//a[@class='viewMasterDetailsTD']"));
            int x = Integer.parseInt(j.getText());
            int y=0;
            if (x == y) {
                System.out.println("*********************************Master Error Record count is match*********************************");
            } else {
                System.out.println("*********************************Verification done *********************************");
            }
    }
        catch (Exception e)
        {
            System.out.println(e);
         }
    }


    @When("I click on Master Error Record")
        public void i_click_on_master_error_record() throws InterruptedException {
        Actions act=new Actions(d);
        act.moveToElement(d.findElement((By.xpath("(//a[@class='viewMasterDetailsTD'])[1]")))).click().build().perform();
        Thread.sleep(2000);
        }

    @When("I go on workflow")
    public void i_go_on_workflow() throws InterruptedException {
        d.manage().timeouts().implicitlyWait(50,TimeUnit.SECONDS);
        d.findElement(By.xpath("//p[text()='Workflow']")).click();
        Thread.sleep(2000);
    }

    @When("I go on upload file")
    public void i_go_on_upload_file() throws InterruptedException {
        d.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        d.findElement(By.xpath("//a[text()='Upload File']")).click();
        Thread.sleep(4000);
    }

    @When("I choose file type")
    public void i_choose_file_type() throws InterruptedException {
        Select s=new Select(d.findElement(By.xpath("//select[@id='reportType']")));
        s.selectByVisibleText("Cancellation Upload");
        Thread.sleep(2000);
    }

    @When("I Choose Month")
    public void i_choose_month() throws InterruptedException {
        Select s=new Select(d.findElement(By.xpath("//select[@id='monthName']")));
        s.selectByVisibleText("Jul");
        Thread.sleep(2000);
    }

    @When("I Choose Period")
    public void i_choose_period() throws InterruptedException {
        Select s=new Select(d.findElement(By.xpath("//select[@id='exec_type']")));
        s.selectByValue("Monthly");
        Thread.sleep(2000);

    }

    @When("I choose Product Name")
    public void i_choose_product_name() throws InterruptedException {
        Select s=new Select(d.findElement(By.xpath("//select[@id='productName']")));
        s.selectByValue("TW");
        Thread.sleep(2000);
    }

    @When("I choose Year")
    public void i_choose_year() throws InterruptedException {
        Select s=new Select(d.findElement(By.xpath("//select[@id='yearVal']")));
        s.selectByValue("2020");
        Thread.sleep(2000);
    }

    @When("I choose Cancel File")
    public void i_choose_cancel_file() throws InterruptedException, IOException {
        d.findElement(By.xpath("//label[@class='btn btn-info btn-block']")).click();
        Thread.sleep(6000);
        Runtime.getRuntime().exec("AutoIT/FileUploadDSA.exe");
        Thread.sleep(4000);
    }

    @Then("I clicked on select file for cancellation file \"([^\"]*)\"$")
    public void i_clicked_on_select_file_for_cancellation_file(String string) throws InterruptedException, IOException {
        Actions act=new Actions(d);
        act.moveToElement(d.findElement(By.xpath("//label[@class='"+string+"']"))).click().build().perform();
        Thread.sleep(6000);
        Runtime.getRuntime().exec("AutoIT/FileUploadDSA.exe");
        Thread.sleep(3000);
    }

    @When("I choose Submit")
    public void i_choose_submit() throws InterruptedException {
        d.findElement(By.xpath("//button[@id='submitExcel']")).click();
        Thread.sleep(6000);
        d.switchTo().alert().accept();
        Thread.sleep(3000);

    }
    ///********************Scheme File upload*************************///
    @Then("I click on master \"([^\"]*)\"$")
    public void i_click_on_master(String string) throws InterruptedException {
        d.findElement(By.xpath("//p[normalize-space()='"+string+"']")).click();
        Thread.sleep(5000);
    }


    @Then("i select \"([^\"]*)\"$")
    public void i_select(String string) throws InterruptedException {
        d.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        d.findElement(By.xpath("//a[text()='"+string+"']")).click();
        Thread.sleep(5000);
    }

    /* when Select tag then use this type of dynamic xpath
    @Then("i select \"([^\"]*)\" as \"([^\"]*)\"$")
    public void i_select_as(String string, String string2) {
        d.findElement(By.xpath("//a[text()='"+string+"']")).click();
    }*/

    @Then("I select \"([^\"]*)\" as \"([^\"]*)\"$")
    public void i_select_as(String string, String string2) throws InterruptedException, IOException {
        Select s=new Select(d.findElement(By.xpath("//select[@id='"+string+"']")));
        s.selectByVisibleText(string2);
        Thread.sleep(3000);

    }


    @Then("i verify DSA scheme {string}")
    public void i_verify_dsa_scheme(String string) throws InterruptedException, IOException {
                  }

    @Then("i verify Dsa scheme")
    public void i_verify_dsa_scheme() throws InterruptedException, IOException {
        String s =d.findElement(By.xpath("viewMasterDetailsTD")).getText();
        int x = Integer.parseInt(s);
        System.out.println("Get value is "+ x );
        if(x<=10)
        {
            this.i_click_on_master("Master");
            this.i_select("Schema Master");
            this.i_select_as("reportType","DSA-Scheme");
            this.i_select_as("monthName","Apr");
            this.i_select_as("Role","DSA");
            this.i_select_as("productName","TW");
            this.i_select_as("yearVal","2019");
            this.i_select_as("exec_type","Monthly");
            this.i_click_on_select_file("btn btn-info btn-block");
            this.i_click_on_submit("submitExcel");
            this.i_verify_dsa_scheme();
        }
        else{
            System.out.println();
        }
    }

    @Then("i upload DSA scheme {string}")
    public void i_upload_dsa_scheme(String string) throws InterruptedException, IOException {
        this.i_click_on_master("Master");
        this.i_select("Schema Master");
        this.i_select_as("reportType","DSA-Scheme");
        this.i_select_as("monthName","Apr");
        this.i_select_as("Role","DSA");
        this.i_select_as("productName","TW");
        this.i_select_as("yearVal","2019");
        this.i_select_as("exec_type","Monthly");
        this.i_click_on_select_file("btn btn-info btn-block");
        this.i_click_on_submit("submitExcel");
    }



    @Then("I clicked on select file for LMS upload \"([^\"]*)\"$")
    public void i_clicked_on_select_file_for_lms_upload(String string) throws InterruptedException, IOException {
        d.findElement(By.xpath("//label[@class='"+string+"']")).click();
        Thread.sleep(5000);
        Runtime.getRuntime().exec("AutoIT/FileUpload2.exe");
        Thread.sleep(4000);
    }
    @Then("i click on select file \"([^\"]*)\"$")
    public void i_click_on_select_file(String string) throws IOException, InterruptedException {
        d.findElement(By.xpath("//label[@class='"+string+"']")).click();
        Thread.sleep(4000);
        Runtime.getRuntime().exec("AutoIT/DSA_Scheme_File.exe");
        Thread.sleep(4000);

    }

    @Then("I click on submit \"([^\"]*)\"$")
    public void i_click_on_submit(String string) throws InterruptedException {
        d.findElement(By.xpath("//button[@id='"+string+"']")).click();
        Thread.sleep(5000);
        //d.switchTo().alert().accept();
    }






































    @When("I go to report again")
    public void i_go_to_report_again() throws InterruptedException {
        Actions a=new Actions(d);
        a.moveToElement(d.findElement(By.xpath("//p[text()='Reports']"))).click().build().perform();
        //d.findElement(By.xpath("//p[text()='Reports']")).click();
        Thread.sleep(6000);
    }

    @When("I go to Batch management")
    public void i_go_to_batch_management() throws InterruptedException {
        //Actions a=new Actions(d);
        //a.moveToElement(d.findElement(By.xpath("//a[text()='Batch Management']"))).click().build().perform();
        d.findElement(By.xpath("(//a[@class='ng-binding'])[15]")).click();
        Thread.sleep(6000);
    }

    @When("I choose eligiblity")
    public void i_choose_eligiblity() throws InterruptedException {
        d.findElement(By.xpath("(//td[@class=' checkEligibility'])[1]")).click();
        Thread.sleep(9000);
        d.switchTo().alert().accept();
        Thread.sleep(2500);
    }

    @When("i click on view Eligiblity Sheet")
    public void i_click_on_view_eligiblity_sheet() throws InterruptedException {
        d.findElement(By.xpath("(//td[@class=' holdJob'])[1]")).click();
        Thread.sleep(9000);
    }

    @Then("I click on Eligibility Sheet \"([^\"]*)\"$")
    public void i_click_on_eligibility_sheet(String string) throws InterruptedException {
        d.findElement(By.xpath("(//td[@class='"+string+"'])[1]")).click();
        Thread.sleep(4000);
    }

    @Then("I select eligibility role \"([^\"]*)\" as \"([^\"]*)\"$")
    public void i_select_eligibility_role_as(String string, String string2) {
        Select s=new Select(d.findElement(By.xpath("//select[@id='"+string+"']")));
        s.selectByVisibleText(string2);
    }

    @When("I select Eligiblity Type in Batch Management")
    public void i_select_eligiblity_type_in_batch_management() throws InterruptedException {
        Select s= new Select(d.findElement(By.xpath("/html/body/div[3]/div/div/div[2]/select")));
        s.selectByValue("SE Eligibility");
        Thread.sleep(2000);
    }

    @Then("I click on submit button \"([^\"]*)\"$")
    public void i_click_on_submit_button(String string) throws InterruptedException {
        d.findElement(By.xpath("(//button[@class='"+string+"'])[2]")).click();
        Thread.sleep(4000);
    }

    @When("I click on Eligiblity Submit Button")
    public void i_click_on_eligiblity_submit_button() throws InterruptedException {
        d.findElement(By.xpath("(//button[contains(text(),'Submit')])[1]")).click();
        Thread.sleep(2000);
    }

    @When("I click on Eligiblity Close Button")
    public void i_click_on_eligiblity_close_button() throws InterruptedException {
        d.manage().timeouts().implicitlyWait(50,TimeUnit.SECONDS);
        //Actions a=new Actions(d);
        //a.moveToElement(d.findElement(By.xpath("(//button[contains(text(),'Close')])[2]"))).click().build().perform();
        d.findElement(By.xpath("(//button[contains(text(),'Close')])[2]")).click();
        Thread.sleep(3000);
    }

    @When("i click on Reports")
    public void i_click_on_reports() throws InterruptedException {
        d.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        Actions a=new Actions(d);
        a.moveToElement(d.findElement(By.xpath("//p[text()='Reports']"))).click().build().perform();
        //d.findElement(By.xpath("//p[text()='Reports']")).click();
        Thread.sleep(2000);
    }

    @When("I click on Batch Management")
    public void i_click_on_batch_management() throws InterruptedException {
        d.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        d.findElement(By.xpath("//a[text()='Batch Management']")).click();
        Thread.sleep(2000);
    }

    @When("i click on incentive")
    public void i_click_on_incentive() throws InterruptedException {
        d.findElement(By.xpath("(//td[@class=' calculateIncentive'])[1]")).click();
        Thread.sleep(250000);
        d.switchTo().alert().accept();
        Thread.sleep(5000);
    }

    @When("I click on Incentive sheet for view")
    public void i_click_on_incentive_sheet_for_view() throws InterruptedException {
        d.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        Actions a=new Actions(d);
        a.moveToElement(d.findElement(By.xpath("(//td[@class=' IncentiveModel'])[1]"))).click().build().perform();
        Thread.sleep(4000);
    }

    @When("I click on Incentive Select Role")
    public void i_click_on_incentive_select_role() throws InterruptedException {
            Thread.sleep(5000);
            d.findElement(By.xpath("(//h4[text()='Select Role'])[2]"));
            Actions act = new Actions(d);
            act.moveToElement(d.findElement(By.xpath("/html/body/div[5]/div/div/div[2]/select"))).click().build().perform();
            Select ss = new Select(d.findElement(By.xpath("/html/body/div[5]/div/div/div[2]/select")));
            ss.selectByVisibleText("TM Incentive");
            Thread.sleep(4000);


        /*d.findElement(By.xpath("(//h4[text()='Select Role'])[2]"));
        d.findElement(By.xpath("/html/body/div[5]/div/div/div[2]/select")).click();
        //Select s1=new Select(d.findElement(By.xpath("//select[@class='form-control ng-pristine ng-valid ng-empty ng-touched']")));
        Select s1=new Select(d.findElement(By.xpath("/html/body/div[5]/div/div/div[2]/select")));
        s1.selectByVisibleText("TM Incentive");
        Thread.sleep(3000);*/
    }

    @When("I click on SUBMIT")
    public void i_click_on_submit() throws InterruptedException {
        Actions a= new Actions(d);
        a.moveToElement(d.findElement(By.xpath("(//button[contains(text(),'Submit')])[3]"))).click().build().perform();
        Thread.sleep(6000);
    }

    @When("I select CLOSE")
    public void i_select_close() throws InterruptedException {
        d.findElement(By.xpath("(//button[text()='Close'])[3]")).click();
        Thread.sleep(3000);
    }

    @When("I Select Reports  for GST")
    public void i_select_reports_for_gst() throws InterruptedException {
        d.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        Actions a=new Actions(d);
        a.moveToElement(d.findElement(By.xpath("//p[text()='Reports']"))).click().build().perform();
        //d.findElement(By.xpath("//p[text()='Reports']")).click();
        Thread.sleep(2000);
    }

    @When("I click on Batch Management for GST")
    public void i_click_on_batch_management_for_gst() throws InterruptedException {
        d.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        d.findElement(By.xpath("//a[text()='Batch Management']")).click();
        Thread.sleep(2000);
    }
    @When("I calculate GST")
    public void i_calculate_gst() throws InterruptedException {
        d.findElement(By.xpath("(//td[@class=' downloadPDF1'])[1]")).click();
        Thread.sleep(8000);
        d.switchTo().alert().accept();
        Thread.sleep(5000);
        d.switchTo().alert().accept();
    }

    @Then("I click on View GST sheet \"([^\"]*)\"$")
    public void i_click_on_view_gst_sheet(String string) {
        d.findElement(By.xpath("(//td[@class='"+string+"'])[1]")).click();
    }

    @When("I click on View GST Sheet")
    public void i_click_on_view_gst_sheet() throws InterruptedException {
        Actions a=new Actions(d);
        a.moveToElement(d.findElement(By.xpath("( //td[@class=' viewGSTDetails'])[1]"))).click().build().perform();
        //d.findElement(By.xpath("//td[@class=' viewGSTDetails']")).click();
        Thread.sleep(2000);
    }

    @When("I select Reports for Invoice Generation")
    public void i_select_reports_for_invoice_generation() throws InterruptedException {
        //d.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        Actions a=new Actions(d);
        a.moveToElement(d.findElement(By.xpath("//p[text()='Reports']"))).click().build().perform();
        //d.findElement(By.xpath("//p[text()='Reports']")).click();
        Thread.sleep(2000);
    }

    @When("I select Batch Management for Invoice Generation")
    public void i_select_batch_management_for_invoice_generation() throws InterruptedException {
        d.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        d.findElement(By.xpath("//a[text()='Batch Management']")).click();
        Thread.sleep(2000);
    }

    @When("I click on Generate Invoice")
    public void i_click_on_generate_invoice() throws InterruptedException {
        d.findElement(By.xpath("(//td[@class=' generateInvoice'])[1]")).click();
        Thread.sleep(4500);
        d.switchTo().alert().accept();

    }

    @When("I click on view invoice")
    public void i_click_on_view_invoice() throws InterruptedException {
        Actions a=new Actions(d);
        a.moveToElement(d.findElement(By.xpath("(//td[@class=' viewInvoiceDetails'])[1]"))).click().build().perform();
        //d.findElement(By.xpath("(//td[@class=' viewInvoiceDetails'])[1]")).click();
        Thread.sleep(4500);
    }
    @When("I close the Chrome browser")
    public void i_close_the_Chrome_browser() throws InterruptedException {
        postCondition();
    }






}
