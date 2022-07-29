
package testcases.android;
import okhttp3.internal.Util;
import org.testng.Assert;
import org.testng.annotations.Test;
import base.TestBase;
import io.qameta.allure.Description;
import screens.androidpageobjects.GalleryPageAndroid;
import screens.androidpageobjects.LandingPageAndroid;


public class LandingPageTest extends TestBase {
	
	public LandingPageAndroid LandingPage = new LandingPageAndroid();
    public GalleryPageAndroid galleryPage = new GalleryPageAndroid();
    

    @Description("Verifying the Landing Page ")
    @Test(priority = 1,enabled = true )
    public void verifyILL() {
    	System.out.println("Verify the functionality of the ill do it later");
    	Assert.assertTrue(LandingPage.VerifyTapill());
    	LandingPage.tap_on_ill1();
        LandingPage.exitapp();
        
    }
    @Test(priority = 2, enabled = true)
    public void verify_Login_Btn() throws Exception {
    	
        System.out.println("Verify the Sign in present button");
        Assert.assertTrue(LandingPage.VerifySignInButtonDash());
        LandingPage.tapSignInOnLandingPage(); 
        Thread.sleep(500);
        LandingPage.exitapp();
    }
    
    @Test(priority = 3, enabled = true)
    public void verify_Login_User_Inapp(){
    	
        System.out.println("Verify the Signin Button");
        LandingPage.tapSignInOnLandingPage();    
        LandingPage.enterNumberOrEmail();
        LandingPage.enterPassword();
        LandingPage.VerifySignInButton();
        LandingPage.tapSignInSubmit();
        LandingPage.exitapp();
       
    }
    
    @Test(priority = 4, enabled = true)
    public void verifyInvalidEmail(){
    	
        System.out.println("Verify the Invaild Email");
        LandingPage.tapSignInOnLandingPage();    
        LandingPage.invalid_EnterNumberOrEmail();
        LandingPage.enterPassword();
        LandingPage.tapSignInSubmit();
        LandingPage.VerifyFieldvalidationEmail();
        LandingPage.exitapp();
       
    }
    @Test(priority = 5, enabled = true)
    public void verifyInvalidPassword(){
    	
        System.out.println("Verify the Invaild Email");
        LandingPage.tapSignInOnLandingPage();    
        LandingPage.enterNumberOrEmail();
        LandingPage.invalidEnterPassword();
        LandingPage.tapSignInSubmit();
        LandingPage.VerifyFieldvalidationPass();
        LandingPage.exitapp();
       
    }
    
    @Test(priority = 6, enabled = true )
    public void verifyQuicktour_StartBTn(){
        
    	LandingPage.tap_on_ill1();
       	//LandingPage.accpt_term();
       	LandingPage.Quicktour();
        LandingPage.verify_StartBtn_isdisplay();
     	LandingPage.verify_Startappbtn_text();
        LandingPage.Start_App_tour();
        LandingPage.exitapp();
    }
    @Test(priority = 7, enabled = true )
    public void verifySignupBt_Login(){

        System.out.println("Verify the Signup button on login page");
        LandingPage.tapSignInOnLandingPage();
        LandingPage.VerfySignupBtnLogin();
        LandingPage.SignupBtnLogin();

    }
    @Test(priority = 8, enabled = true )
    public void VerifyForgetPassword(){
        LandingPage.tapSignInOnLandingPage();
        LandingPage.verify_forgetpasswordbtn();
        LandingPage.forget_password();
        LandingPage.forget_password_successful();
    }
    @Test(priority = 9, enabled = true )
    public void VerifyForgetPassword_invalidEmail(){
        LandingPage.tapSignInOnLandingPage();
        LandingPage.forget_passwordInvaild();
        LandingPage.verify_Invalid_ForgetEmail();
    }


}
