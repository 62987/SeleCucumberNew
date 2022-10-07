package StepDefination;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.json.simple.parser.ParseException;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class Setting_Option extends BaseClass{
    JavascriptExecutor js;
    PropertiesFileReader p=new PropertiesFileReader();

    @When("I launch chrome browsers")
    public void i_launch_chrome_browsers() throws InterruptedException {
        preCondition();
    }
    @Then("I login as a PM users")
    public void i_login_as_a_pm_users() throws InterruptedException {
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



        //d.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
        //d.get("http://192.168.115.84:8080/HeroPayoutUI/html/HeroFincorp/login.html");
        //Thread.sleep(6000);
        //d.findElement(By.xpath("//input[@id='usrname']")).sendKeys("PMTW001");
        //Thread.sleep(4000);
        //d.findElement(By.xpath("//input[@id='password']")).sendKeys("059832");
        //Thread.sleep(4000);
        //d.findElement(By.xpath("//button[@id='Sign_In']")).click();
        //Thread.sleep(8000);
        //d.close();
    }

    @When("I click on setting")
    public void i_click_on_setting() throws InterruptedException {
        d.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        d.findElement(By.xpath("//p[text()='Settings']")).click();
        Thread.sleep(5000);
    }
    @When("I click on Manage User inside Setting")
    public void i_click_on_manage_user_inside_setting() throws InterruptedException {
        d.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        d.findElement(By.xpath("//a[contains(text(),'Manage User')]")).click();
        Thread.sleep(5000);
    }
    // To Open SE User List
    @When("I click on SE User List Inside the Manage User")
    public void i_click_on_se_user_list_inside_the_manage_user() throws InterruptedException {
        d.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        d.findElement(By.xpath("(//a[@class='ng-binding'])[18]")).click();
        Thread.sleep(5000);
    }
    // Click On Add Button
    @When("I click on Add User for create a new SE User")
    public void i_click_on_add_user_for_create_a_new_se_user() throws InterruptedException {
        d.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        d.findElement(By.xpath("//button[@id='createUser']")).click();
        Thread.sleep(2000);
    }

    @Then("I select Type of User for SE")
    public void i_select_type_of_user_for_se() throws InterruptedException {
        d.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        Select s=new Select(d.findElement(By.xpath("//select[@id='userRole']")));
        s.selectByValue("SE");
        Thread.sleep(2000);

    }

    @Then("I select Product for SE")
    public void i_select_product_for_se() throws InterruptedException {
        d.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
        Select s1=new Select(d.findElement(By.xpath("//select[@id='Product']")));
        s1.selectByVisibleText("TW");
        //Thread.sleep(5000);

    }

    @Then("I Select Employee Or DSA Code for SE")
    public void i_select_employee_or_dsa_code_for_se() throws InterruptedException {
        d.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
        d.findElement(By.xpath("//input[@id='username']")).sendKeys("SETW0003");
        //Thread.sleep(5000);

    }
    @Then("I select First Name Or DSA Name for SE")
    public void i_select_first_name_or_dsa_name_for_se() throws InterruptedException, IOException, ParseException {
        d.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
        ReadJson rj=new ReadJson();
        String Fname=rj.readJsonData("firstname");
        d.findElement(By.xpath("//input[@id='firstname']")).sendKeys(Fname);
    }
    @Then("I select Middle Name for SE")
    public void i_select_middle_name_for_se() throws InterruptedException {
        d.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
        d.findElement(By.xpath("//input[@id='middlename']")).sendKeys("Pankaj");
        //Thread.sleep(5000);
    }
    @Then("I select Last Name for SE")
    public void i_select_last_name_for_se() throws InterruptedException {
        d.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
        d.findElement(By.xpath("//input[@id='lastname']")).sendKeys("Singh");
        //Thread.sleep(5000);
    }
    @Then("I select Manager Role for SE")
    public void i_select_manager_role_for_se() throws InterruptedException {
        d.manage().timeouts().implicitlyWait(50,TimeUnit.SECONDS);
        Select s2=new Select(d.findElement(By.xpath("//select[@id='parentGroupName']")));
        s2.selectByVisibleText("DSA");
        //Thread.sleep(1000);

    }
    @Then("I select Manager Code for SE")
    public void i_select_manager_code_for_se() throws InterruptedException {
        d.manage().timeouts().implicitlyWait(90,TimeUnit.SECONDS);
        Select s=new Select(d.findElement(By.xpath("//select[@placeholder='Manager Code']")));
        s.selectByVisibleText("10003");
        //Thread.sleep(2000);
    }
    @Then("I enter Email for SE")
    public void i_enter_email_for_se() throws InterruptedException {
        d.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        d.findElement(By.id("email")).sendKeys("surabhi.ahirrao@sumasoft.com");
        //Thread.sleep(5000);
    }
    @Then("I enter Mobile number for SE")
    public void i_enter_mobile_number_for_se() throws InterruptedException {
        d.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
        d.findElement(By.xpath("//input[@id='mobile']")).sendKeys("7030578766");
        //Thread.sleep(5000);
    }
    @Then("I select State for SE")
    public void i_select_state_for_se() throws InterruptedException {
        d.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        Select s4=new Select(d.findElement(By.xpath("//select[@id='State_Name']")));
        s4.selectByValue("Maharashtra");
        Thread.sleep(1000);
    }
    @Then("I select City for SE")
    public void i_select_city_for_se() throws InterruptedException {
        d.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        Select s5=new Select(d.findElement(By.xpath("//select[@id='city_Name']")));
        s5.selectByVisibleText("Nashik");
        Thread.sleep(1000);
    }
    @Then("I select Zone Name for SE")
    public void i_select_zone_name_for_se() throws InterruptedException {
        d.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        Select s6=new Select(d.findElement(By.xpath("//select[@id='zone_Name']")));
        s6.selectByVisibleText("North 1");
        Thread.sleep(1000);
    }
    @Then("I select Date of Joining for SE")
    public void i_select_date_of_joining_for_se() throws InterruptedException {
        d.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        d.findElement(By.xpath("//input[@id='date_of_joining']")).sendKeys("03/02/2022");
        Thread.sleep(1000);
    }
    @Then("I Select Employee Type for SE")
    public void i_select_employee_type_for_se() throws InterruptedException {
        d.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        Select s7=new Select(d.findElement(By.xpath("//select[@id='counter_type']")));
        s7.selectByVisibleText("Main");
        Thread.sleep(1000);
    }
    @Then("I click on Add Button for SE")
    public void i_click_on_add_button_for_se() throws InterruptedException {
        d.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        d.findElement(By.xpath("//button[contains(text(),'Add')]")).click();
        Thread.sleep(5000);
    }
    @When("I click on checkbox of Production and Reporting Manager Mapping")
    public void i_click_on_checkbox_of_production_and_reporting_manager_mapping() throws InterruptedException {
        d.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        WebElement check=d.findElement(By.xpath("//input[@id='0']"));
        check.click();
        Thread.sleep(1000);
    }
    @Then("Click on Delete button to delete that user")
    public void click_on_delete_button_to_delete_that_user() throws InterruptedException {
        d.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        d.findElement(By.xpath("//button[contains(text(),'Delete')]")).click();
        Thread.sleep(5000);
    }
    //Submit Button
    @When("I click on Submit button to create SE User")
    public void i_click_on_submit_button_to_create_se_user() throws InterruptedException {
        d.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        js=(JavascriptExecutor)d;
        js.executeScript("window.scrollBy(0,1000)");
        d.findElement(By.xpath("//button[contains(text(),'Submit')]")).click();
        Thread.sleep(9000);
        d.switchTo().alert().accept();
        Thread.sleep(8000);
    }
    //Reset Button
    @When("I click on Reset button to create SE User")
    public void i_click_on_reset_button_to_create_se_user() throws InterruptedException {
        d.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        js=(JavascriptExecutor)d;
        js.executeScript("window.scrollBy(0,1000)");
        d.findElement(By.xpath("//a[text()='Reset']")).click();
        Thread.sleep(5000);

    }
    @When("I click on DSA User List Inside the Manage User")
    public void i_click_on_dsa_user_list_inside_the_manage_user() throws InterruptedException {
        d.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        d.findElement(By.xpath("//a[text()='DSA User List']")).click();
        Thread.sleep(5000);
    }

    @When("I click on Add User for create a new DSA User")
    public void i_click_on_add_user_for_create_a_new_dsa_user() throws InterruptedException {
        d.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        d.findElement(By.xpath("//button[@id='createUser']")).click();
        Thread.sleep(5000);
    }
    @Then("I select Type of User for DSA")
    public void i_select_type_of_user_for_dsa() throws InterruptedException {
        d.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        Select s8=new Select(d.findElement(By.xpath("//select[@id='userRole']")));
        s8.selectByValue("DSA");
        Thread.sleep(5000);
    }
    @Then("I select Product for DSA")
    public void i_select_product_for_dsa() throws InterruptedException {
        d.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        Select s9=new Select(d.findElement(By.xpath("//select[@id='Product']")));
        s9.selectByVisibleText("TW");
        Thread.sleep(5000);
    }
    @Then("I enter Employee Or DSA Code for DSA")
    public void i_enter_employee_or_dsa_code_for_dsa() throws InterruptedException {
        d.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
        d.findElement(By.xpath("//input[@id='username']")).sendKeys("DSATW011");
        Thread.sleep(1000);

    }
    @Then("I enter First Name Or DSA Name for DSA")
    public void i_enter_first_name_or_dsa_name_for_dsa() throws InterruptedException {
        d.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
        d.findElement(By.xpath("//input[@id='firstname']")).sendKeys("Sanjeev");
        Thread.sleep(1000);
    }
    @Then("I select Manager Role for DSA")
    public void i_select_manager_role_for_dsa() throws InterruptedException {
        d.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
        Select s10=new Select(d.findElement(By.xpath("//select[@id='parentGroupName']")));
        s10.selectByVisibleText("TM");
        Thread.sleep(3000);
    }
    @Then("I select Manager Code for DSA")
    public void i_select_manager_code_for_dsa() throws InterruptedException {
        d.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
        Select s11=new Select(d.findElement(By.xpath("//select[@id='parentID']")));
        s11.selectByValue("TMTW02");
        Thread.sleep(3000);
    }
    @Then("I enter Email for DSA")
    public void i_enter_email_for_dsa() throws InterruptedException {
        d.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
        d.findElement(By.xpath("//input[@id='email']")).sendKeys("surabhi.ahirrao@sumasoft.com");
        Thread.sleep(2000);

    }
    @Then("I enter Mobile number for DSA")
    public void i_enter_mobile_number_for_dsa() throws InterruptedException {
        d.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
        d.findElement(By.xpath("//input[@id='mobile']")).sendKeys("7030578766");
        Thread.sleep(2000);

    }
    @Then("I select State for DSA")
    public void i_select_state_for_dsa() throws InterruptedException {
        d.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
        Select s12=new Select(d.findElement(By.xpath("//select[@id='State_Name']")));
        s12.selectByValue("Punjab");
        Thread.sleep(3000);
    }
    @Then("I select City for DSA")
    public void i_select_city_for_dsa() throws InterruptedException {
        d.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
        Select s13=new Select(d.findElement(By.xpath("//select[@id='city_Name']")));
        s13.selectByVisibleText("Chandigarh");
        Thread.sleep(3000);
    }
    @Then("I select Zone Name for DSA")
    public void i_select_zone_name_for_dsa() throws InterruptedException {
        d.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
        Select s14=new Select(d.findElement(By.xpath("//select[@id='zone_Name']")));
        s14.selectByVisibleText("South 1");
        Thread.sleep(3000);
    }
    @Then("I click on Add Button for DSA")
    public void i_click_on_add_button_for_dsa() throws InterruptedException {
        d.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
        d.findElement(By.xpath("//button[contains(text(),'Add')]")).click();
        Thread.sleep(5000);
    }
    @When("I click on checkbox of Production and Reporting Manager Mapping for DSA")
    public void i_click_on_checkbox_of_production_and_reporting_manager_mapping_for_dsa() throws InterruptedException {
        d.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
        WebElement check= d.findElement(By.xpath("//input[@id='0']"));
        check.click();
        Thread.sleep(1000);
    }
    @Then("Click on Delete button to delete that DSA user")
    public void click_on_delete_button_to_delete_that_dsa_user() throws InterruptedException {
        d.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
        d.findElement(By.xpath("//button[contains(text(),'Delete')]")).click();
        Thread.sleep(5000);
    }
    @Then("I enter PAN number for DSA")
    public void i_enter_pan_number_for_dsa() throws InterruptedException {
        d.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
        d.findElement(By.xpath("//input[@id='PAN_No']")).sendKeys("ABCTY1234D");
        Thread.sleep(5000);
    }
    @Then("I select Dealer Type for DSA")
    public void i_select_dealer_type_for_dsa() throws InterruptedException {
        d.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
        Select s15=new Select(d.findElement(By.xpath("//select[@id='dealer_type']")));
        s15.selectByVisibleText("Main Dealer");
        Thread.sleep(5000);

    }
    @Then("I select Dealer Entity for DSA")
    public void i_select_dealer_entity_for_dsa() throws InterruptedException {
        d.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
        Select s151=new Select(d.findElement(By.xpath("//select[@id='dsaType']")));
        s151.selectByVisibleText("Company");
        Thread.sleep(3000);
    }
    @Then("I select Date of Code Creation for DSA")
    public void i_select_date_of_code_creation_for_dsa() throws InterruptedException {
        d.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
        d.findElement(By.xpath("//input[@id='date_of_code_creation']")).sendKeys("02/02/2022");
        Thread.sleep(5000);
    }
    @Then("I select Registration status for DSA")
    public void i_select_registration_status_for_dsa() throws InterruptedException {
        d.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
        Select s16=new Select(d.findElement(By.xpath("//select[@id='registration_status']")));
        s16.selectByVisibleText("Registered");
        Thread.sleep(5000);
    }
    @Then("I enter GST Number of DSA user")
    public void i_enter_gst_number_of_dsa_user() throws InterruptedException {
        d.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
        d.findElement(By.xpath("//input[@id='GST_NO']")).sendKeys("03AADCB2230M1Z3");
        Thread.sleep(5000);
    }
    @Then("I enter Pincode for DSA")
    public void i_enter_pincode_for_dsa() throws InterruptedException {
        d.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
        d.findElement(By.xpath("//input[@id='pincode']")).sendKeys("147203");
        Thread.sleep(5000);
    }
    @Then("I enter address for DSA")
    public void i_enter_address_for_dsa() throws InterruptedException {
        d.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
        d.findElement(By.xpath("//textarea[@id='address']")).sendKeys("Chandigarh, Punjab");
        Thread.sleep(5000);

    }
    @Then("I select MSME Registration Status for DSA")
    public void i_select_msme_registration_status_for_dsa() throws InterruptedException {
        d.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
        Select s17=new Select(d.findElement(By.xpath("//select[@id='MSMED_status']")));
        s17.selectByVisibleText("Yes");
        Thread.sleep(5000);

    }
    @Then("I select MSME Registration Number for DSA")
    public void i_select_msme_registration_number_for_dsa() throws InterruptedException {
        d.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
        d.findElement(By.xpath("//input[@id='MSME_number']")).sendKeys("AB12C3456789");
        Thread.sleep(5000);

    }
    @Then("I select MSME Date if issue Number for DSA")
    public void i_select_msme_date_if_issue_number_for_dsa() throws InterruptedException {
        d.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
        d.findElement(By.xpath("//input[@id='MSME_date_issue']")).sendKeys("02/04/2021");
        Thread.sleep(5000);
    }
    @Then("I enter Beneficiary Name for DSA")
    public void i_enter_beneficiary_name_for_dsa() throws InterruptedException {
        d.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
        d.findElement(By.xpath("//input[@id='Disb_Beneficiary_Name']")).sendKeys("Sanjeev");
        Thread.sleep(5000);
    }
    @Then("I enter Bank Name for DSA")
    public void i_enter_bank_name_for_dsa() throws InterruptedException {
        d.findElement(By.xpath("//input[@id='Disb_Bank_Name']")).sendKeys("ICICI Bank");
        Thread.sleep(5000);
    }
    @Then("I enter Account Number for DSA")
    public void i_enter_account_number_for_dsa() throws InterruptedException {
        d.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
        d.findElement(By.xpath("//input[@id='Disb_Account_No']")).sendKeys("8765439882345");
        Thread.sleep(5000);

    }
    @Then("I enter IFSC Code for DSA")
    public void i_enter_ifsc_code_for_dsa() throws InterruptedException {
        d.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
        d.findElement(By.xpath("//input[@id='Disb_IFSC_Code']")).sendKeys("ICIC0000005");
        Thread.sleep(5000);

    }
    @Then("I enter Beneficiary Code for DSA")
    public void i_enter_beneficiary_code_for_dsa() throws InterruptedException {
        d.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
        d.findElement(By.xpath("//input[@id='Disb_Beneficiary_Code']")).sendKeys("DSATW011");
        Thread.sleep(5000);

    }
    @Then("I enter Payout payment to disburs acc for DSA")
    public void i_enter_payout_payment_to_disburs_acc_for_dsa() throws InterruptedException {
        d.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
        Select s18=new Select(d.findElement(By.xpath("//select[@id='payout_payment_to_disburs_acc']")));
        s18.selectByVisibleText("Yes");
        Thread.sleep(5000);

    }

    //Submit Button
    @When("I click on Submit button to create DSA User")
    public void i_click_on_submit_button_to_create_dsa_user() throws InterruptedException {
        d.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        js=(JavascriptExecutor)d;
        js.executeScript("window.scrollBy(0,1000)");
        d.findElement(By.xpath("//button[contains(text(),'Submit')]")).click();
        Thread.sleep(10000);
        d.switchTo().alert().accept();
        Thread.sleep(8000);
    }

    //Reset Button
    @When("I click on Reset button to create DSA User")
    public void i_click_on_reset_button_to_create_dsa_user() throws InterruptedException {
        d.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        js=(JavascriptExecutor)d;
        js.executeScript("window.scrollBy(0,1000)");
        d.findElement(By.xpath("//a[text()='Reset']")).click();
        Thread.sleep(5000);

    }


    @When("I click on TM User List Inside the Manage User")
    public void i_click_on_tm_user_list_inside_the_manage_user() throws InterruptedException {
        d.findElement(By.xpath("//a[text()='TM User List']")).click();
        Thread.sleep(5000);
    }

    @When("I click on Add User for create a new TM User")
    public void i_click_on_add_user_for_create_a_new_tm_user() throws InterruptedException {
        d.findElement(By.xpath("//button[@id='createUser']")).click();
        Thread.sleep(5000);
    }
    @Then("I select Type of User for TM")
    public void i_select_type_of_user_for_tm() throws InterruptedException {
        d.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
        Select s19=new Select(d.findElement(By.xpath("//select[@id='userRole']")));
        s19.selectByValue("TM");
        Thread.sleep(5000);

    }
    @Then("I select Product for TM")
    public void i_select_product_for_tm() throws InterruptedException {
        d.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
        Select s20=new Select(d.findElement(By.xpath("//select[@id='Product']")));
        s20.selectByVisibleText("TW");
        Thread.sleep(5000);
    }
    @Then("I Select Employee Or DSA Code for TM")
    public void i_select_employee_or_dsa_code_for_tm() throws InterruptedException {
        d.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
        d.findElement(By.xpath("//input[@id='username']")).sendKeys("TMTW112");
        Thread.sleep(5000);
    }
    @Then("I select First Name Or DSA Name for TM")
    public void i_select_first_name_or_dsa_name_for_tm() throws InterruptedException {
        d.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
        d.findElement(By.xpath("//input[@id='firstname']")).sendKeys("Yash");
        Thread.sleep(5000);
    }
    @Then("I select Middle Name for TM")
    public void i_select_middle_name_for_tm() throws InterruptedException {
        d.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
        d.findElement(By.xpath("//input[@id='middlename']")).sendKeys("Rajesh");
        Thread.sleep(5000);
    }
    @Then("I select Last Name for TM")
    public void i_select_last_name_for_tm() throws InterruptedException {
        d.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
        d.findElement(By.xpath("//input[@id='lastname']")).sendKeys("Singh");
        Thread.sleep(5000);
    }
    @Then("I select Manager Role for TM")
    public void i_select_manager_role_for_tm() throws InterruptedException {
        d.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
        Select s21=new Select(d.findElement(By.xpath("//select[@id='parentGroupName']")));
        s21.selectByVisibleText("CM");
        Thread.sleep(5000);

    }
    @Then("I select Manager Code for TM")
    public void i_select_manager_code_for_tm() throws InterruptedException {
        d.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
        Select s22=new Select(d.findElement(By.xpath("//select[@id='parentID']")));
        s22.selectByVisibleText("CM001");
        Thread.sleep(5000);
    }
    @Then("I enter Email for TM")
    public void i_enter_email_for_tm() throws InterruptedException {
        d.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
        d.findElement(By.id("email")).sendKeys("surabhi.ahirrao@sumasoft.com");
        Thread.sleep(5000);
    }
    @Then("I enter Mobile number for TM")
    public void i_enter_mobile_number_for_tm() throws InterruptedException {
        d.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
        d.findElement(By.xpath("//input[@id='mobile']")).sendKeys("7030578766");
        Thread.sleep(5000);
    }
    @Then("I select State for TM")
    public void i_select_state_for_tm() throws InterruptedException {
        d.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
        Select s23=new Select(d.findElement(By.xpath("//select[@id='State_Name']")));
        s23.selectByValue("Karnataka");
        Thread.sleep(5000);
    }
    @Then("I select City for TM")
    public void i_select_city_for_tm() throws InterruptedException {
        d.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
        Select s24=new Select(d.findElement(By.xpath("//select[@id='city_Name']")));
        s24.selectByVisibleText("Bagalkot");
        Thread.sleep(5000);
    }
    @Then("I select Zone Name for TM")
    public void i_select_zone_name_for_tm() throws InterruptedException {
        d.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
        Select s25=new Select(d.findElement(By.xpath("//select[@id='zone_Name']")));
        s25.selectByVisibleText("North 1");
        Thread.sleep(5000);
    }
    @Then("I select Date of Joining for TM")
    public void i_select_date_of_joining_for_tm() throws InterruptedException {
        d.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
        d.findElement(By.xpath("//input[@id='date_of_joining']")).sendKeys("02/02/2022");
        Thread.sleep(5000);
    }
    @Then("I click on Add Button for TM")
    public void i_click_on_add_button_for_tm() throws InterruptedException {
        d.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
        d.findElement(By.xpath("//button[contains(text(),'Add')]")).click();
        Thread.sleep(5000);
    }
    @When("I click on checkbox of Production and Reporting Manager Mapping after create TM user")
    public void i_click_on_checkbox_of_production_and_reporting_manager_mapping_after_create_tm_user() throws InterruptedException {
        d.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
        WebElement check=d.findElement(By.xpath("//input[@id='0']"));
        check.click();
        Thread.sleep(1000);
    }
    @Then("Click on Delete button to delete TM user")
    public void click_on_delete_button_to_delete_tm_user() throws InterruptedException {
        d.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
        d.findElement(By.xpath("//button[contains(text(),'Delete')]")).click();
        Thread.sleep(5000);
    }
    //Submit Button for TM
    @When("I click on Submit button to create TM User")
    public void i_click_on_submit_button_to_create_tm_user() throws InterruptedException {
        d.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        js=(JavascriptExecutor)d;
        js.executeScript("window.scrollBy(0,1000)");
        d.findElement(By.xpath("//button[contains(text(),'Submit')]")).click();
        Thread.sleep(10000);
        d.switchTo().alert().accept();
        Thread.sleep(8000);

    }
    //Reset Button for TM
    @When("I click on Reset button to create TM User")
    public void i_click_on_reset_button_to_create_tm_user() throws InterruptedException {
        d.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        js=(JavascriptExecutor)d;
        js.executeScript("window.scrollBy(0,1000)");
        d.findElement(By.xpath("//a[text()='Reset']")).click();
        Thread.sleep(5000);

    }

    @When("I click on CM User List Inside the Manage User")
    public void i_click_on_cm_user_list_inside_the_manage_user() throws InterruptedException {
        d.findElement(By.xpath("//a[text()='CM User List']")).click();
        Thread.sleep(5000);

    }

    @When("I click on Add User for create a new CM User")
    public void i_click_on_add_user_for_create_a_new_cm_user() throws InterruptedException {
        d.findElement(By.xpath("//button[@id='createUser']")).click();
        Thread.sleep(5000);
    }
    @Then("I select Type of User for CM")
    public void i_select_type_of_user_for_cm() throws InterruptedException {
        d.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        Select s26=new Select(d.findElement(By.xpath("//select[@id='userRole']")));
        s26.selectByValue("CM");
        Thread.sleep(5000);
    }
    @Then("I select Product for CM")
    public void i_select_product_for_cm() throws InterruptedException {
        d.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        Select s27=new Select(d.findElement(By.xpath("//select[@id='Product']")));
        s27.selectByVisibleText("TW");
        Thread.sleep(5000);
    }
    @Then("I Select Employee Or DSA Code for CM")
    public void i_select_employee_or_dsa_code_for_cm() throws InterruptedException {
        d.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        d.findElement(By.xpath("//input[@id='username']")).sendKeys("CMTW112");
        Thread.sleep(5000);
    }
    @Then("I select First Name Or DSA Name for CM")
    public void i_select_first_name_or_dsa_name_for_cm() throws InterruptedException {
        d.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        d.findElement(By.xpath("//input[@id='firstname']")).sendKeys("Yatin");
        Thread.sleep(5000);
    }
    @Then("I select Middle Name for CM")
    public void i_select_middle_name_for_cm() throws InterruptedException {
        d.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        d.findElement(By.xpath("//input[@id='middlename']")).sendKeys("Pratik");
        Thread.sleep(5000);
    }
    @Then("I select Last Name for CM")
    public void i_select_last_name_for_cm() throws InterruptedException {
        d.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        d.findElement(By.xpath("//input[@id='lastname']")).sendKeys("Singh");
        Thread.sleep(5000);
    }
    @Then("I select Manager Role for CM")
    public void i_select_manager_role_for_cm() throws InterruptedException {
        d.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        Select s28=new Select(d.findElement(By.xpath("//select[@id='parentGroupName']")));
        s28.selectByVisibleText("ZM");
        Thread.sleep(5000);
    }
    @Then("I select Manager Code for CM")
    public void i_select_manager_code_for_cm() throws InterruptedException {
        d.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        Select s29=new Select(d.findElement(By.xpath("//select[@id='parentID']")));
        s29.selectByVisibleText("ZM001");
        Thread.sleep(5000);
    }
    @Then("I enter Email for CM")
    public void i_enter_email_for_cm() throws InterruptedException {
        d.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        d.findElement(By.id("email")).sendKeys("surabhi.ahirrao@sumasoft.com");
        Thread.sleep(5000);
    }
    @Then("I enter Mobile number for CM")
    public void i_enter_mobile_number_for_cm() throws InterruptedException {
        d.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        d.findElement(By.xpath("//input[@id='mobile']")).sendKeys("7030578766");
        Thread.sleep(5000);
    }
    @Then("I select State for CM")
    public void i_select_state_for_cm() throws InterruptedException {
        d.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        Select s30=new Select(d.findElement(By.xpath("//select[@id='State_Name']")));
        s30.selectByValue("Delhi");
        Thread.sleep(5000);
    }
    @Then("I select City for CM")
    public void i_select_city_for_cm() throws InterruptedException {
        d.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        Select s31=new Select(d.findElement(By.xpath("//select[@id='city_Name']")));
        s31.selectByVisibleText("Delhi");
        Thread.sleep(5000);
    }
    @Then("I select Zone Name for CM")
    public void i_select_zone_name_for_cm() throws InterruptedException {
        d.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        Select s32=new Select(d.findElement(By.xpath("//select[@id='zone_Name']")));
        s32.selectByVisibleText("South 1");
        Thread.sleep(5000);

    }
    @Then("I select Date of Joining for CM")
    public void i_select_date_of_joining_for_cm() throws InterruptedException {
        d.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        d.findElement(By.xpath("//input[@id='date_of_joining']")).sendKeys("02/02/2022");
        Thread.sleep(5000);
    }
    @Then("I click on Add Button for CM")
    public void i_click_on_add_button_for_cm() throws InterruptedException {
        d.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        d.findElement(By.xpath("//button[contains(text(),'Add')]")).click();
        Thread.sleep(5000);
    }
    @When("I click on checkbox of Production and Reporting Manager Mapping after create CM user")
    public void i_click_on_checkbox_of_production_and_reporting_manager_mapping_after_create_cm_user() throws InterruptedException {
        d.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        WebElement check=d.findElement(By.xpath("//input[@id='0']"));
        check.click();
        Thread.sleep(1000);
    }
    @Then("Click on Delete button to delete CM user")
    public void click_on_delete_button_to_delete_cm_user() throws InterruptedException {
        d.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        d.findElement(By.xpath("//button[contains(text(),'Delete')]")).click();
        Thread.sleep(5000);
    }
    //Submit Button
    @When("I click on Submit button to create CM User")
    public void i_click_on_submit_button_to_create_cm_user() throws InterruptedException {
        d.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        js=(JavascriptExecutor)d;
        js.executeScript("window.scrollBy(0,1000)");
        d.findElement(By.xpath("//button[contains(text(),'Submit')]")).click();
        Thread.sleep(10000);
        d.switchTo().alert().accept();
        Thread.sleep(8000);
    }

    //Reset Button
    @When("I click on Reset button to create CM User")
    public void i_click_on_reset_button_to_create_cm_user() throws InterruptedException {
        d.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        js=(JavascriptExecutor)d;
        js.executeScript("window.scrollBy(0,1000)");
        d.findElement(By.xpath("//a[text()='Reset']")).click();
        Thread.sleep(5000);

    }


    @When("I click on PM User List Inside the Manage User")
    public void i_click_on_pm_user_list_inside_the_manage_user() throws InterruptedException {
        d.findElement(By.xpath("//a[text()='PM User List']")).click();
        Thread.sleep(5000);
    }

    @When("I click on Add User for create a new PM User")
    public void i_click_on_add_user_for_create_a_new_pm_user() throws InterruptedException {
        d.findElement(By.xpath("//button[@id='createUser']")).click();
        Thread.sleep(5000);
    }
    @Then("I select Type of User for PM")
    public void i_select_type_of_user_for_pm() throws InterruptedException {
        d.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        Select s26=new Select(d.findElement(By.xpath("//select[@id='userRole']")));
        s26.selectByValue("PM");
        Thread.sleep(5000);

    }
    @Then("I select Product for PM")
    public void i_select_product_for_pm() throws InterruptedException {
        d.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        Select s27=new Select(d.findElement(By.xpath("//select[@id='Product']")));
        s27.selectByVisibleText("TW");
        Thread.sleep(5000);

    }
    @Then("I Select Employee Or DSA Code for PM")
    public void i_select_employee_or_dsa_code_for_pm() throws InterruptedException {
        d.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        d.findElement(By.xpath("//input[@id='username']")).sendKeys("PMTW112");
        Thread.sleep(5000);

    }
    @Then("I select First Name Or DSA Name for PM")
    public void i_select_first_name_or_dsa_name_for_pm() throws InterruptedException {
        d.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        d.findElement(By.xpath("//input[@id='firstname']")).sendKeys("Priyank");
        Thread.sleep(5000);
    }
    @Then("I select Middle Name for PM")
    public void i_select_middle_name_for_pm() throws InterruptedException {
        d.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        d.findElement(By.xpath("//input[@id='middlename']")).sendKeys("Dhiraj");
        Thread.sleep(5000);

    }
    @Then("I select Last Name for PM")
    public void i_select_last_name_for_pm() throws InterruptedException {
        d.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        d.findElement(By.xpath("//input[@id='lastname']")).sendKeys("Singh");
        Thread.sleep(5000);

    }
    @Then("I select Manager Role for PM")
    public void i_select_manager_role_for_pm() throws InterruptedException {
        Select s32=new Select(d.findElement(By.xpath("//select[@id='parentGroupName']")));
        s32.selectByVisibleText("PM");
        Thread.sleep(5000);

    }
    @Then("I select Manager Code for PM")
    public void i_select_manager_code_for_pm() throws InterruptedException {
        Select s33=new Select(d.findElement(By.xpath("//select[@id='parentID']")));
        s33.selectByVisibleText("PM001");
        Thread.sleep(5000);

    }
    @Then("I enter Email for PM")
    public void i_enter_email_for_pm() throws InterruptedException {
        d.findElement(By.id("email")).sendKeys("surabhi.ahirrao@sumasoft.com");
        Thread.sleep(5000);
    }
    @Then("I enter Mobile number for PM")
    public void i_enter_mobile_number_for_pm() throws InterruptedException {
        d.findElement(By.xpath("//input[@id='mobile']")).sendKeys("7030578766");
        Thread.sleep(5000);
    }
    @Then("I select State for PM")
    public void i_select_state_for_pm() throws InterruptedException {
        Select s30=new Select(d.findElement(By.xpath("//select[@id='State_Name']")));
        s30.selectByValue("Punjab");
        Thread.sleep(5000);
    }
    @Then("I select City for PM")
    public void i_select_city_for_pm() throws InterruptedException {
        Select s31=new Select(d.findElement(By.xpath("//select[@id='city_Name']")));
        s31.selectByVisibleText("Batala");
        Thread.sleep(5000);
    }

    @Then("I select Date of Joining for PM")
    public void i_select_date_of_joining_for_pm() throws InterruptedException {
        d.findElement(By.xpath("//input[@id='date_of_joining']")).sendKeys("02/02/2022");
        Thread.sleep(5000);
    }
    @Then("I click on Add Button for PM")
    public void i_click_on_add_button_for_pm() throws InterruptedException {
        d.findElement(By.xpath("//button[contains(text(),'Add')]")).click();
        Thread.sleep(5000);
    }
    @When("I click on checkbox of Production and Reporting Manager Mapping after create PM user")
    public void i_click_on_checkbox_of_production_and_reporting_manager_mapping_after_create_pm_user() throws InterruptedException {
        d.findElement(By.xpath("//input[@id='0']")).click();
        Thread.sleep(5000);
    }
    @Then("Click on Delete button to delete PM user")
    public void click_on_delete_button_to_delete_pm_user() throws InterruptedException {
        d.findElement(By.xpath("//button[contains(text(),'Delete')]")).click();
        Thread.sleep(5000);
    }
    //Submit Button
    @When("I click on Submit button to create PM User")
    public void i_click_on_submit_button_to_create_pm_user() throws InterruptedException {
        d.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        js=(JavascriptExecutor)d;
        js.executeScript("window.scrollBy(0,1000)");
        d.findElement(By.xpath("//button[contains(text(),'Submit')]")).click();
        Thread.sleep(10000);
        d.switchTo().alert().accept();
        Thread.sleep(8000);

    }

    //Reset Button
    @When("I click on Reset button to create PM User")
    public void i_click_on_reset_button_to_create_pm_user() throws InterruptedException {
        d.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        js=(JavascriptExecutor)d;
        js.executeScript("window.scrollBy(0,1000)");
        d.findElement(By.xpath("//a[text()='Reset']")).click();
        Thread.sleep(5000);

    }


    @When("I click on BH User List Inside the Manage User")
    public void i_click_on_bh_user_list_inside_the_manage_user() throws InterruptedException {
        d.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        d.findElement(By.xpath("//a[text()='BH User List']")).click();
        Thread.sleep(5000);

    }
    @When("I click on Add User for create a new BH User")
    public void i_click_on_add_user_for_create_a_new_bh_user() throws InterruptedException {
        d.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        d.findElement(By.xpath("//button[@id='createUser']")).click();
        Thread.sleep(5000);
    }
    @Then("I select Type of User for BH")
    public void i_select_type_of_user_for_bh() throws InterruptedException {
        d.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        Select s32=new Select(d.findElement(By.xpath("//select[@id='userRole']")));
        s32.selectByValue("BH");
        Thread.sleep(5000);
    }

    @Then("I select Product for BH")
    public void i_select_product_for_bh() throws InterruptedException {
        d.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        Select s33=new Select(d.findElement(By.xpath("//select[@id='Product']")));
        s33.selectByVisibleText("TW");
        Thread.sleep(5000);
    }
    @Then("I Select Employee Or DSA Code for BH")
    public void i_select_employee_or_dsa_code_for_bh() throws InterruptedException {
        d.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        d.findElement(By.xpath("//input[@id='username']")).sendKeys("BHTW112");
        Thread.sleep(5000);
    }
    @Then("I select First Name Or DSA Name for BH")
    public void i_select_first_name_or_dsa_name_for_bh() throws InterruptedException {
        d.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        d.findElement(By.xpath("//input[@id='firstname']")).sendKeys("Sanjeev");
        Thread.sleep(5000);
    }
    @Then("I select Middle Name for BH")
    public void i_select_middle_name_for_bh() throws InterruptedException {
        d.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        d.findElement(By.xpath("//input[@id='middlename']")).sendKeys("Santosh");
        Thread.sleep(5000);
    }
    @Then("I select Last Name for BH")
    public void i_select_last_name_for_bh() throws InterruptedException {
        d.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        d.findElement(By.xpath("//input[@id='lastname']")).sendKeys("Singh");
        Thread.sleep(5000);
    }
    @Then("I select Manager Role for BH")
    public void i_select_manager_role_for_bh() throws InterruptedException {
        Select s34=new Select(d.findElement(By.xpath("//select[@id='parentGroupName']")));
        s34.selectByVisibleText("BH");
        Thread.sleep(5000);
    }
    @Then("I select Manager Code for BH")
    public void i_select_manager_code_for_bh() throws InterruptedException {
        Select s35=new Select(d.findElement(By.xpath("//select[@id='parentID']")));
        s35.selectByVisibleText("BHTW01");
        Thread.sleep(5000);
    }
    @Then("I enter Email for BH")
    public void i_enter_email_for_bh() throws InterruptedException {
        d.findElement(By.id("email")).sendKeys("surabhi.ahirrao@sumasoft.com");
        Thread.sleep(5000);
    }
    @Then("I enter Mobile number for BH")
    public void i_enter_mobile_number_for_bh() throws InterruptedException {
        d.findElement(By.xpath("//input[@id='mobile']")).sendKeys("7030578766");
        Thread.sleep(5000);
    }
    @Then("I select State for BH")
    public void i_select_state_for_bh() throws InterruptedException {
        Select s36=new Select(d.findElement(By.xpath("//select[@id='State_Name']")));
        s36.selectByValue("MadhyaPradesh");
        Thread.sleep(5000);
    }
    @Then("I select City for BH")
    public void i_select_city_for_bh() throws InterruptedException {
        Select s37=new Select(d.findElement(By.xpath("//select[@id='city_Name']")));
        s37.selectByVisibleText("Amarpatan");
        Thread.sleep(5000);
    }
    @Then("I select Date of Joining for BH")
    public void i_select_date_of_joining_for_bh() throws InterruptedException {
        d.findElement(By.xpath("//input[@id='date_of_joining']")).sendKeys("02/02/2022");
        Thread.sleep(5000);
    }
    @Then("I click on Add Button for BH")
    public void i_click_on_add_button_for_bh() throws InterruptedException {
        d.findElement(By.xpath("//button[contains(text(),'Add')]")).click();
        Thread.sleep(5000);
    }
    @When("I click on checkbox of Production and Reporting Manager Mapping after create BH user")
    public void i_click_on_checkbox_of_production_and_reporting_manager_mapping_after_create_bh_user() throws InterruptedException {
        d.findElement(By.xpath("//input[@id='0']")).click();
        Thread.sleep(5000);
    }
    @Then("Click on Delete button to delete BH user")
    public void click_on_delete_button_to_delete_bh_user() throws InterruptedException {
        d.findElement(By.xpath("//button[contains(text(),'Delete')]")).click();
        Thread.sleep(5000);
    }
    @When("I click on Submit button to create BH User")
    public void i_click_on_submit_button_to_create_bh_user() throws InterruptedException {
        d.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        js=(JavascriptExecutor)d;
        js.executeScript("window.scrollBy(0,1000)");
        d.findElement(By.xpath("//button[contains(text(),'Submit')]")).click();
        Thread.sleep(10000);
        d.switchTo().alert().accept();
        Thread.sleep(8000);
    }
    @When("I click on Reset button to create BH User")
    public void i_click_on_reset_button_to_create_bh_user() throws InterruptedException {
        d.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        js=(JavascriptExecutor)d;
        js.executeScript("window.scrollBy(0,1000)");
        d.findElement(By.xpath("//a[text()='Reset']")).click();
        Thread.sleep(5000);
    }


    @When("I click on FM User List Inside the Manage User")
    public void i_click_on_fm_user_list_inside_the_manage_user() throws InterruptedException {
        d.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        d.findElement(By.xpath("//a[text()='FM User List']")).click();
        Thread.sleep(5000);
    }
    @When("I click on Add User for create a new FM User")
    public void i_click_on_add_user_for_create_a_new_fm_user() throws InterruptedException {
        d.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        d.findElement(By.xpath("//button[@id='createUser']")).click();
        Thread.sleep(5000);
    }
    @Then("I select Type of User for FM")
    public void i_select_type_of_user_for_fm() throws InterruptedException {
        d.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        Select s37=new Select(d.findElement(By.xpath("//select[@id='userRole']")));
        s37.selectByValue("FM");
        Thread.sleep(5000);
    }
    @Then("I select Product for FM")
    public void i_select_product_for_fm() throws InterruptedException {
        d.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        Select s38=new Select(d.findElement(By.xpath("//select[@id='Product']")));
        s38.selectByVisibleText("TW");
        Thread.sleep(5000);
    }
    @Then("I Select Employee Or DSA Code for FM")
    public void i_select_employee_or_dsa_code_for_fm() throws InterruptedException {
        d.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        d.findElement(By.xpath("//input[@id='username']")).sendKeys("FMTW111");
        Thread.sleep(5000);
    }
    @Then("I select First Name Or DSA Name for FM")
    public void i_select_first_name_or_dsa_name_for_fm() throws InterruptedException {
        d.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        d.findElement(By.xpath("//input[@id='firstname']")).sendKeys("Ketan");
        Thread.sleep(5000);
    }
    @Then("I select Middle Name for FM")
    public void i_select_middle_name_for_fm() throws InterruptedException {
        d.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        d.findElement(By.xpath("//input[@id='middlename']")).sendKeys("Sanket");
        Thread.sleep(5000);
    }
    @Then("I select Last Name for FM")
    public void i_select_last_name_for_fm() throws InterruptedException {
        d.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        d.findElement(By.xpath("//input[@id='lastname']")).sendKeys("Singh");
        Thread.sleep(5000);
    }
    @Then("I select Manager Role for FM")
    public void i_select_manager_role_for_fm() throws InterruptedException {
        Select s39=new Select(d.findElement(By.xpath("//select[@id='parentGroupName']")));
        s39.selectByVisibleText("FM");
        Thread.sleep(5000);
    }
    @Then("I select Manager Code for FM")
    public void i_select_manager_code_for_fm() throws InterruptedException {
        Select s40=new Select(d.findElement(By.xpath("//select[@id='parentID']")));
        s40.selectByVisibleText("FMTW01");
        Thread.sleep(5000);
    }

    @Then("I enter Email for FM")
    public void i_enter_email_for_fm() throws InterruptedException {
        d.findElement(By.id("email")).sendKeys("surabhi.ahirrao@sumasoft.com");
        Thread.sleep(5000);
    }
    @Then("I enter Mobile number for FM")
    public void i_enter_mobile_number_for_fm() throws InterruptedException {
        d.findElement(By.xpath("//input[@id='mobile']")).sendKeys("7030578766");
        Thread.sleep(5000);
    }
    @Then("I select State for FM")
    public void i_select_state_for_fm() throws InterruptedException {
        Select s41=new Select(d.findElement(By.xpath("//select[@id='State_Name']")));
        s41.selectByValue("UttarPradesh");
        Thread.sleep(5000);
    }
    @Then("I select City for FM")
    public void i_select_city_for_fm() throws InterruptedException {
        Select s42=new Select(d.findElement(By.xpath("//select[@id='city_Name']")));
        s42.selectByValue("Aligarh");
        Thread.sleep(5000);

    }
    @Then("I select Date of Joining for FM")
    public void i_select_date_of_joining_for_fm() throws InterruptedException {
        d.findElement(By.xpath("//input[@id='date_of_joining']")).sendKeys("02/02/2022");
        Thread.sleep(5000);
    }
    @Then("I click on Add Button for FM")
    public void i_click_on_add_button_for_fm() throws InterruptedException {
        d.findElement(By.xpath("//button[contains(text(),'Add')]")).click();
        Thread.sleep(5000);
    }
    @When("I click on checkbox of Production and Reporting Manager Mapping after create FM user")
    public void i_click_on_checkbox_of_production_and_reporting_manager_mapping_after_create_fm_user() throws InterruptedException {
        d.findElement(By.xpath("//input[@id='0']")).click();
        Thread.sleep(5000);
    }
    @Then("Click on Delete button to delete FM user")
    public void click_on_delete_button_to_delete_fm_user() throws InterruptedException {
        d.findElement(By.xpath("//button[contains(text(),'Delete')]")).click();
        Thread.sleep(5000);
    }
    @When("I click on Submit button to create FM User")
    public void i_click_on_submit_button_to_create_fm_user() throws InterruptedException {
        d.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        js=(JavascriptExecutor)d;
        js.executeScript("window.scrollBy(0,1000)");
        d.findElement(By.xpath("//button[contains(text(),'Submit')]")).click();
        Thread.sleep(10000);
        d.switchTo().alert().accept();
        Thread.sleep(8000);
    }
    @When("I click on Reset button to create FM User")
    public void i_click_on_reset_button_to_create_fm_user() throws InterruptedException {
        d.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        js=(JavascriptExecutor)d;
        js.executeScript("window.scrollBy(0,1000)");
        d.findElement(By.xpath("//a[text()='Reset']")).click();
        Thread.sleep(5000);
    }


    @When("I click on ZM User List Inside the Manage User")
    public void i_click_on_zm_user_list_inside_the_manage_user() throws InterruptedException {
        d.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        d.findElement(By.xpath("//a[text()='ZM User List']")).click();
        Thread.sleep(5000);
    }
    @When("I click on Add User for create a new ZM User")
    public void i_click_on_add_user_for_create_a_new_zm_user() throws InterruptedException {
        d.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        d.findElement(By.xpath("//button[@id='createUser']")).click();
        Thread.sleep(5000);
    }
    @Then("I select Type of User for ZM")
    public void i_select_type_of_user_for_zm() throws InterruptedException {
        d.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        Select s43=new Select(d.findElement(By.xpath("//select[@id='userRole']")));
        s43.selectByValue("ZM");
        Thread.sleep(5000);
    }
    @Then("I select Product for ZM")
    public void i_select_product_for_zm() throws InterruptedException {
        d.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        Select s44=new Select(d.findElement(By.xpath("//select[@id='Product']")));
        s44.selectByVisibleText("TW");
        Thread.sleep(5000);
    }
    @Then("I Select Employee Or DSA Code for ZM")
    public void i_select_employee_or_dsa_code_for_zm() throws InterruptedException {
        d.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        d.findElement(By.xpath("//input[@id='username']")).sendKeys("ZMTW112");
        Thread.sleep(5000);
    }
    @Then("I select First Name Or DSA Name for ZM")
    public void i_select_first_name_or_dsa_name_for_zm() throws InterruptedException {
        d.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        d.findElement(By.xpath("//input[@id='firstname']")).sendKeys("Vinod");
        Thread.sleep(5000);
    }
    @Then("I select Middle Name for ZM")
    public void i_select_middle_name_for_zm() throws InterruptedException {
        d.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        d.findElement(By.xpath("//input[@id='middlename']")).sendKeys("Yash");
        Thread.sleep(5000);
    }
    @Then("I select Last Name for ZM")
    public void i_select_last_name_for_zm() throws InterruptedException {
        d.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        d.findElement(By.xpath("//input[@id='lastname']")).sendKeys("Singh");
        Thread.sleep(5000);
    }
    @Then("I select Manager Role for ZM")
    public void i_select_manager_role_for_zm() throws InterruptedException {
        Select s45=new Select(d.findElement(By.xpath("//select[@id='parentGroupName']")));
        s45.selectByVisibleText("BH");
        Thread.sleep(5000);
    }
    @Then("I select Manager Code for ZM")
    public void i_select_manager_code_for_zm() throws InterruptedException {
        Select s46=new Select(d.findElement(By.xpath("//select[@id='parentID']")));
        s46.selectByVisibleText("BHTW01");
        Thread.sleep(5000);
    }

    @Then("I enter Email for ZM")
    public void i_enter_email_for_zm() throws InterruptedException {
        d.findElement(By.id("email")).sendKeys("surabhi.ahirrao@sumasoft.com");
        Thread.sleep(5000);
    }
    @Then("I enter Mobile number for ZM")
    public void i_enter_mobile_number_for_zm() throws InterruptedException {
        d.findElement(By.xpath("//input[@id='mobile']")).sendKeys("7030578766");
        Thread.sleep(5000);
    }
    @Then("I select State for ZM")
    public void i_select_state_for_zm() throws InterruptedException {
        Select s47=new Select(d.findElement(By.xpath("//select[@id='State_Name']")));
        s47.selectByValue("Rajasthan");
        Thread.sleep(5000);
    }
    @Then("I select City for ZM")
    public void i_select_city_for_zm() throws InterruptedException {
        Select s48=new Select(d.findElement(By.xpath("//select[@id='city_Name']")));
        s48.selectByValue("Balotra");
        Thread.sleep(5000);
    }
    @Then("I select Zone Name for ZM")
    public void i_select_zone_name_for_zm() throws InterruptedException {
        d.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        Select s49=new Select(d.findElement(By.xpath("//select[@id='zone_Name']")));
        s49.selectByVisibleText("South 1");
        Thread.sleep(5000);
    }

    @Then("I select Date of Joining for ZM")
    public void i_select_date_of_joining_for_zm() throws InterruptedException {
        d.findElement(By.xpath("//input[@id='date_of_joining']")).sendKeys("02/02/2022");
        Thread.sleep(5000);
    }
    @Then("I click on Add Button for ZM")
    public void i_click_on_add_button_for_zm() throws InterruptedException {
        d.findElement(By.xpath("//button[contains(text(),'Add')]")).click();
        Thread.sleep(5000);
    }
    @When("I click on checkbox of Production and Reporting Manager Mapping after create ZM user")
    public void i_click_on_checkbox_of_production_and_reporting_manager_mapping_after_create_zm_user() throws InterruptedException {
        d.findElement(By.xpath("//input[@id='0']")).click();
        Thread.sleep(5000);
    }
    @Then("Click on Delete button to delete ZM user")
    public void click_on_delete_button_to_delete_zm_user() throws InterruptedException {
        d.findElement(By.xpath("//button[contains(text(),'Delete')]")).click();
        Thread.sleep(5000);
    }
    @When("I click on Submit button to create ZM User")
    public void i_click_on_submit_button_to_create_zm_user() throws InterruptedException {
        d.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        js=(JavascriptExecutor)d;
        js.executeScript("window.scrollBy(0,1000)");
        d.findElement(By.xpath("//button[contains(text(),'Submit')]")).click();
        Thread.sleep(10000);
        d.switchTo().alert().accept();
        Thread.sleep(8000);
    }
    @When("I click on Reset button to create ZM User")
    public void i_click_on_reset_button_to_create_zm_user() throws InterruptedException {
        d.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        js=(JavascriptExecutor)d;
        js.executeScript("window.scrollBy(0,1000)");
        d.findElement(By.xpath("//a[text()='Reset']")).click();
        Thread.sleep(5000);
    }


    @When("I click on Add New Policy inside Setting")
    public void i_click_on_add_new_policy_inside_setting() throws InterruptedException {
        d.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        d.findElement(By.xpath("//a[text()='Add New Policy']")).click();
        Thread.sleep(5000);
    }
    @Then("I select Product inside Add New Policy")
    public void i_select_product_inside_add_new_policy() throws InterruptedException {
        d.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        Select s50=new Select(d.findElement(By.xpath("//select[@class='form-control ng-pristine ng-untouched ng-valid ng-empty']")));
        s50.selectByVisibleText("TW");
        Thread.sleep(5000);
    }

    @When("I click on Logout as PM")
    public void i_click_on_logout_as_pm() throws InterruptedException {
        d.findElement(By.xpath("//a[text()='Logout']")).click();
        Thread.sleep(8000);
    }

    @When("I close the chrome browser")
    public void i_close_the_chrome_browser() throws InterruptedException {
        postCondition();
    }




}
