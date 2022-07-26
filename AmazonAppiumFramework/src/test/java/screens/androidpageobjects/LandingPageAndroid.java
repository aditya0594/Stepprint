package screens.androidpageobjects;

import static org.testng.Assert.assertEquals;

import java.io.IOException;
import java.util.Properties;

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

    public LandingPageAndroid() {
        try {
            Properties properties = CommonUtils.read_properties();
            USERNAME = properties.getProperty("email");
            PASSWORD = properties.getProperty("password");
            INUSERNAME =(String) properties.get("invalidemail");
            INUPASSWORD =(String) properties.get("invalidpassword");
            
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    By Login_btn = By.id("com.kodak.steptouch:id/fragment_signup_go_to_login");
    By Login_email = By.id("com.kodak.steptouch:id/fragment_login_email");
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
    By gallery_page_click = By.xpath("com.polaroid.universalapp:id/recyclerViewMainGalley");
    
 
    		
    		
 

    By Ill_Btn = By.id("com.kodak.steptouch:id/ill_do_it_later_button");
    By sign_in_button = By.id("in.amazon.mShop.android.shopping:id/sign_in_button");
    By ap_email_login = By.xpath("//*[@resource-id='ap_email_login']");
    By continueBtn = By.xpath("//*[@resource-id='continue']");
    By ap_password = By.xpath("//*[@resource-id='ap_password']");
    By signInSubmit = By.xpath("//*[@resource-id='signInSubmit']");
    By finishAppTourBtn = By.id("com.polaroid.universalapp:id/textViewFinishAppTour");
    By EmailValidation = By.id("com.kodak.steptouch:id/textinput_error");
    By PassValidation = By.xpath("/hierarchy/android.widget.Toast");
    public void tap_on_ill1() {
    		driver.findElement(Ill_Btn).click();
    		}
    public boolean VerifyTapill() {
    	return driver.findElement(Ill_Btn).isDisplayed();
    
    }
  
    public void tapSignInOnLandingPage() {
        driver.findElement(Login_btn).click();
        
    }
    public boolean VerifySignInButtonDash() {
    	 return driver.findElement(Login_btn).isDisplayed();
    	
    }
    public void VerifyLoginBtn() {
    	
    	
		
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
    public void gallery_Page() {
    	
      driver.findElement(gallery_page_click).click();
    	
    }
	

}
