package screens.androidpageobjects;

import static org.testng.Assert.assertEquals;

import java.io.IOException;
import java.util.List;
import java.util.Properties;
import java.util.Random;
import java.util.concurrent.TimeUnit;

import io.appium.java_client.android.Activity;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.touch.TouchActions;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import org.testng.asserts.Assertion;

import base.ScreenBase;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.WaitOptions;
import net.bytebuddy.matcher.BooleanMatcher;
import utils.CommonUtils;

public class LandingPageAndroid extends ScreenBase {

    String USERNAME = "";
    String PASSWORD = "";
    String INUSERNAME ="";
    String INUPASSWORD = "";

    String Name ="";
    public LandingPageAndroid() {
        try {
            Properties properties = CommonUtils.read_properties();
            USERNAME = properties.getProperty("email");
            PASSWORD = properties.getProperty("password");
            INUSERNAME =(String) properties.get("invalidemail");
            INUPASSWORD =(String) properties.get("invalidpassword");
           // Name= (String) Properties.get("name");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    By Login_btn = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[3]/android.widget.TextView[2]");


    By Login_email = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.FrameLayout/android.widget.EditText");
    By Login_password = By.id("com.kodak.steptouch:id/fragment_login_password");
    By submit_Login_btn = By.id("com.kodak.steptouch:id/fragment_login_do_login");
    By term_condition_btn= By.id("com.kodak.steptouch:id/termsConditonButton");
    By quick_next_btn= By.id("com.kodak.steptouch:id/btn_next");
    By finish_app_tour = By.xpath("//android.widget.LinearLayout[@text='Finish App Tour']");
    By Quick_verify = By.id("com.polaroid.universalapp:id/textViewOverlayTitle");
    By finishAppTour = By.id("com.kodak.steptouch:id/textViewFinishAppTour");
    By startAppTour = By.id("com.kodak.steptouch:id/btn_next");
    
    
    
    
    By layout_btn= By.id("com.kodak.steptouch:id/viewPager");
    By multiple_Per_grant= By.id("android:id/button1");
    By while_using_app = By.id("com.android.permissioncontroller:id/permission_allow_foreground_only_button");
    By Photo_media_permission_id = By.id("com.android.permissioncontroller:id/permission_allow_foreground_only_button");
    By Photo_media_permission_class = By.className("android.widget.Button");
    By Photo_media_permission_xpath = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.Button[1]");
    By gallery_page_click = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/androidx.viewpager.widget.ViewPager/android.widget.RelativeLayout/android.widget.RelativeLayout/android.widget.LinearLayout[2]");
    
 
    		
    		
 

    By Ill_Btn = By.id("com.kodak.steptouch:id/ill_do_it_later_button");
    By sign_in_button = By.id("in.amazon.mShop.android.shopping:id/sign_in_button");
    By ap_email_login = By.xpath("//*[@resource-id='ap_email_login']");

    By ap_password = By.xpath("//*[@resource-id='ap_password']");
    By signInSubmit = By.xpath("//*[@resource-id='signInSubmit']");
    By finishAppTourBtn = By.id("com.polaroid.universalapp:id/textViewFinishAppTour");


    By EmailValidation = By.id("com.kodak.steptouch:id/textinput_error");
    By PassValidation = By.xpath("/hierarchy/android.widget.Toast");
    By ForgetPass = By.id("com.kodak.steptouch:id/fragment_login_forgot_password");
    By ForgetPassField = By.id("com.kodak.steptouch:id/activity_forgot_password_email");
    By InvalidPassfieldmessage = By.id("com.kodak.steptouch:id/textinput_error");
    By ForgetPassSend = By.id("com.kodak.steptouch:id/activity_forgot_password_send");
    By SuccessForgetpassTile = By.id("com.kodak.steptouch:id/activity_password_sent_title");
    By SuccessForgetpassText = By.id("com.kodak.steptouch:id/activity_password_sent_text");
    By continueBtn = By.xpath("//*[@resource-id='continue']");
    By Signup_login_page = By.id("com.kodak.steptouch:id/fragment_login_go_to_signup");
    By FullName = By.id("com.kodak.steptouch:id/fragment_signup_full_name");
    By DateOfBirth =By.id("com.kodak.steptouch:id/fragment_signup_birth");
    By EmailSignup = By.id("com.kodak.steptouch:id/fragment_signup_birth");
    By Password = By.id("com.kodak.steptouch:id/fragment_signup_password");
    By SignupBtn = By.id("com.kodak.steptouch:id/fragment_signup_create_account");
    By CreateAccount = By.id("com.kodak.steptouch:id/fragment_signup_title_textview");
    By Tap_on_signin_layout = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.ScrollView/android.widget.LinearLayout");
    By Gmail_first_email =By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.widget.RelativeLayout/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.FrameLayout[2]/android.widget.ScrollView/android.view.ViewGroup/android.widget.FrameLayout/android.support.v7.widget.RecyclerView/android.view.ViewGroup[1]");
    By image_count = By.xpath("//android.widget.LinearLayout[@resource-id='com.kodak.steptouch:id/relativeLayoutItem']");
    By Gmail_email_restBtn = By.xpath("//android.view.View[@content-desc=\"Reset password →\"]");
    public void tap_on_ill1() {
    		driver.findElement(Ill_Btn).click();
    		}
    public boolean VerifyTapill() {
    	return driver.findElement(Ill_Btn).isDisplayed();
    
    }
  
    public void tapSignInOnLandingPage(){

        //driver.findElement(Tap_on_signin_layout).click();
        driver.findElement(Login_btn).click();
        
    }
    public boolean VerifySignInButtonDash() {
    	 return driver.findElement(Login_btn).isDisplayed();
    	
    }
    public void tapContinueBtn() {
        driver.findElement(continueBtn).click();
    }

    //Snaptouch
    
    public void enterNumberOrEmail() {

        driver.findElement(Login_email).sendKeys(USERNAME);
    }

    public void enterPassword() {
        driver.findElement(Login_password).sendKeys(PASSWORD);
    }
    
    public void invalid_EnterNumberOrEmail() {
        driver.findElement(Login_email).sendKeys(INUSERNAME);
        
    }
    public void VerifyFieldvalidationEmail() {
    	//driver.findElement(EmailValidation).isDisplayed();
    	String EmailvalidationMessage = driver.findElement(EmailValidation).getText();
    	System.out.println("Valid message is "+ EmailvalidationMessage);
    	assertEquals(EmailvalidationMessage, "Please provide your valid email");
    }
    public void invalidEnterPassword() {
        driver.findElement(Login_password).sendKeys(INUPASSWORD);
    }
    public void VerifyFieldvalidationPass() {
    	//driver.findElement(EmailValidation).isDisplayed();
    	String PassvalidationMessage = driver.findElement(PassValidation).getText();
    	System.out.println("Valid message is "+ PassvalidationMessage);
    	assertEquals(PassvalidationMessage,"You have entered an invalid email id or password");
    }

    
    

    public void tapSignInSubmit() {
        driver.findElement(submit_Login_btn).click();
    }
	public void VerifySignInButton() {
		 String VerifyLoginBtn = driver.findElement(submit_Login_btn).getText();
	        System.out.println("Text of the sign button" + VerifyLoginBtn);
	       assertEquals(VerifyLoginBtn,"LOGIN"," Login succussfully");
		
	}
	
     
    public void VerifySign() {
   // MobileElement ele = driver.findElementById("com.polaroid.universalapp:id/termsConditonButton");
	//ac.longPress(ele).perform().release();
	//Thread.sleep(2000);
	boolean flag = driver.findElementById("com.polaroid.universalapp:id/termsConditonButton").isDisplayed();
	if(flag)
		{
			System.out.println("User signed in succussfully ");
		}else
		{
			System.out.println("Failed");
		}
    }
    public  void accpt_term() {
    	
    	driver.findElement(term_condition_btn);
    	String accpt_btn_verify = driver.findElement(term_condition_btn).getText();
    	assertEquals(accpt_btn_verify,"Agree Terms and Conditions" );
    }
    public void start_button() {
    	
    String VerifyButtonFinish = driver.findElement(finish_app_tour).getText();
    System.out.println("GET BUTTON TEXT -----" + finish_app_tour);
    assertEquals(VerifyButtonFinish, "Finish App Tour");
    driver.findElement(finish_app_tour).click();
    driver.findElement(layout_btn).click();
    	//driver.findElement(finish_app_tour).click();
    }
    public void exitapp() {
	
	   driver.closeApp();

    }
    

    public void Quicktour() {
    	
    	driver.findElement(term_condition_btn).click();
    	driver.findElement(layout_btn).click();
    	driver.findElement(quick_next_btn).click();
    	driver.findElement(quick_next_btn).click();
    	driver.findElement(quick_next_btn).click();
    	driver.findElement(quick_next_btn).click();
    	driver.findElement(quick_next_btn).click();
    	driver.findElement(quick_next_btn).click();
    	driver.findElement(quick_next_btn).click();
    	driver.findElement(quick_next_btn).click();
    	driver.findElement(quick_next_btn).click();
    	driver.findElement(quick_next_btn).click();
    	//driver.findElement(quick_next_btn).click(); 
    	//driver.findElement(layout_btn).click();
    	return;
    	
    	//assertEquals(Verify_quicktour_fc,"Switch Between\n"
    	//		+ "Camera and Gallery");
    	
       }
    
    public void  Finsis_App_tour() {
    	
    	driver.findElement(finishAppTour).click();
    }
    public void verify_Finishappbtn_text() {
    	
    	String finishBtn = driver.findElement(finishAppTour).getText();
    	assertEquals(finishBtn, "Finish App Tour");
    }
    public boolean verify_FinishBtn_isdisplay() {
    	return driver.findElement(finishAppTour).isDisplayed();
    }
	public void Start_App_tour() {
		driver.findElement(startAppTour).click();
	
	}
	 public void verify_Startappbtn_text() {
	    	
	    	String startBtn = driver.findElement(startAppTour).getText();
	    	assertEquals(startBtn, "Start");
	    }
	 public boolean verify_StartBtn_isdisplay() {
	    	return driver.findElement(startAppTour).isDisplayed();
	    }
	
	
    public void permission_Access() throws InterruptedException {
        driver.findElement(multiple_Per_grant).click();
        Thread.sleep(2000);

        if(driver.findElement(By.id("com.android.permissioncontroller:id/grant_dialog")).isDisplayed());
        {
        	 driver.findElement(Photo_media_permission_class).click();
        }
    }
    public void SignupBtnLogin(){
        driver.findElement(Signup_login_page).click();
    }
    public void VerfySignupBtnLogin(){
        String SignupbtnLogin = driver.findElement(Signup_login_page).getText();
        System.out.println("Sigup on login page : "+SignupbtnLogin);
        assertEquals(SignupbtnLogin, "Sign up");
    }
    public void gallery_Page_Tap() {
    	
      driver.findElement(gallery_page_click).click();
    	
    }
    public void forget_password(){
        driver.findElement(ForgetPass).click();
        driver.findElement(ForgetPassField).sendKeys(USERNAME);
        driver.findElement(ForgetPassSend).click();
    }


    public void verify_forgetpasswordbtn(){

        driver.findElement(ForgetPass).isDisplayed();
    }
    public void forget_password_successful(){

        String SuccessForgetPasstitle = driver.findElement(SuccessForgetpassTile).getText();
        assertEquals(SuccessForgetPasstitle, "Got It!");
        String SuccessForgetPassText = driver.findElement(SuccessForgetpassText).getText();
        assertEquals(SuccessForgetPassText,"If this email address exists, you will get an email shortly");
    }
    public void forget_passwordInvaild(){
        driver.findElement(ForgetPass).click();
        driver.findElement(ForgetPassField).sendKeys(INUSERNAME);
        driver.findElement(ForgetPassSend).click();
    }

    public void verify_Invalid_ForgetEmail(){
        String invalidPassEmail = driver.findElement(InvalidPassfieldmessage).getText();
        System.out.println("Message"+invalidPassEmail);
        assertEquals(invalidPassEmail,"Please enter a valid email");
    }

    public void SignupForm(){
        driver.findElement(FullName).sendKeys("Name");

    }

    public void switchapp(){

        String appPackage="com.google.android.gm";
        String appActivity="com.google.android.gm.ui.MailActivityGmail";
        Activity activity = new Activity(appPackage, appActivity);
        activity.setStopApp(true);
        ((AndroidDriver<AndroidElement>) driver).startActivity(activity);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(Gmail_first_email).click();
        String ResetBtnText = driver.findElement(Gmail_email_restBtn).getText();
        assertEquals(ResetBtnText,"ResetBtnText");

    }
    public void gmail_forget_verify() throws InterruptedException {


    }
    public void image(){
        List<WebElement> count_images =  driver.findElements(image_count);
        System.out.println("Image count   : "+ count_images);


    }
    public void generateRandomString() {
        Random randomGenerator = new Random();
        int randomInt = randomGenerator.nextInt(1000);
        System.out.println(randomInt);

    }




}
