package steps;

import io.cucumber.java.en.*;
import org.junit.Assert;
import pages.LaPolar;

public class LaPolarSteps {
    LaPolar LP = new LaPolar();

    @Given("^user navigates to LaPolar.cl$")
    public void navigate(){
    LP.navigateToLaPolar();
    }

    @When("^user click into login$")
    public void OpenLogin(){
    LP.clickGoToLogin();
    }

    @And("^logs in using email as “test@test.cl” and Password “test123“$")
    public void loginUserPass(){
        LP.emailInputSendKeys();
        LP.passwordInputSendKeys();
    }

    @Then("^login should be successful$")
    public void validateLogin(){
        Boolean result=true;
        LP.clickLoginButton();
        if (LP.ValidateLoggedIn() != "https://www.lapolar.cl/Cuenta/"){
            result = false;
        }
        Assert.assertFalse("Error trying logged in",result);
    }



    @Given("^user navigates to LaPolar/register page$")
    public void navigateRegister(){
        LP.navigateToRegister();
        LP.OpenRegisterForm();
    }

    @When("^Register with name “testerName“ lastname “testerLastName“ phone “53“ dni “1-3“ mail “testing@testinlapolar.cl“ gender “male“ password “test123“$")
    public void Register(){
        LP.sendRegisterName();
        LP.sendRegisterLastName();
        LP.sendRegisterPhone();
        LP.sendRegisterDni();
        LP.sendRegisterEmail();
        LP.clickMaleGender();
        LP.sendRegisterPassword();
        LP.sendRegisterConfirmPassword();

    }

    @Then("^Register send$")
    public void RegisterButton(){
        LP.clickRegisterButton();
        LP.waitingChange();

    }
    @And("^login should be Failed$")
    public void validateRegister(){
        Boolean result=true;
        System.out.println(LP.ValidateLoggedIn());
        if (LP.ValidateLoggedIn() != "https://www.lapolar.cl/Iniciar-Sesion/"){
            result = false;
        }
        System.out.println("resultado del bool " + result);
       Assert.assertEquals("Error. Login was successful","https://www.lapolar.cl/Cuenta/?registration=submitted",LP.ValidateLoggedIn());
    }
}
