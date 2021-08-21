package pages;

public class LaPolar extends BaseClass{
    private String loginInput ="//input[@id='login-form-email']";
    private String urlLaPolar="https://www.lapolar.cl";
    private String urlRegister="https://www.lapolar.cl/Iniciar-Sesion/";
    private String goToLogin = "//span[contains(text(),'Iniciar Sesión / registrarse')]";
    private String passwordInput = "//input[@id='login-form-password']";
    private String buttonLogin = "//button[contains(text(),'Ingresar')]";
    private String email = "test@tesst.cl";
    private String password = "test123";
    private String inputName = "//input[@id='registration-form-fname']";
    private String inputLastName = "//input[@id='registration-form-lname']";
    private String inputPhone = "//input[@id='phone']";
    private String inputDni = "//input[@id='rut']";
    private String inputEmail = "//input[@id='registration-form-email']";
    private String maleGender = "//body/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/form[1]/div[7]/div[1]/div[1]/label[1]";
    private String inputRegisterPassword = "//input[@id='registration-form-password']";
    private String inputConfirmPassword = "//input[@id='registration-form-password-confirm']";
    private String confirmButton = "//button[contains(text(),'Registrar')]";
    private String confirmForm = "//a[contains(text(),'Registrarse')]";



    public LaPolar(){
        super(BaseClass.driver);
    }

    //login

    public void emailInputSendKeys(){
        this.sendKeys(loginInput,email);
    }

    public void passwordInputSendKeys(){
        this.sendKeys(passwordInput,password);
    }

    public void navigateToLaPolar(){
        this.navigateTo(urlLaPolar);
    }

    public void clickGoToLogin(){
        this.clickElement(goToLogin);
    }

    public void clickLoginButton(){
        this.clickElement(buttonLogin);
    }

    public String ValidateLoggedIn(){
       return this.validateUrl();
    }

    //register

    public void navigateToRegister(){
        this.navigateTo(urlRegister);
    }

    public void OpenRegisterForm(){
        this.clickElement(confirmForm);
    }

    public void sendRegisterName(){
        this.sendKeys(inputName, "testerName");
    }

    public void sendRegisterLastName(){
        this.sendKeys(inputLastName, "testerLastName");
    }

    public void sendRegisterPhone(){
        this.sendKeys(inputPhone, "53");
    }

    public void sendRegisterDni(){
        this.sendKeys(inputDni, "1-9");
    }

    public void sendRegisterEmail(){
        this.sendKeys(inputEmail, "testing@testingmean.cl");
    }

    public void clickMaleGender(){
        this.clickElement(maleGender);
    }

    public void sendRegisterPassword(){
        this.sendKeys(inputRegisterPassword, "test123");
    }

    public void sendRegisterConfirmPassword(){
        this.sendKeys(inputConfirmPassword, "test123");
    }

    public void clickRegisterButton(){
        this.clickElement(confirmButton);
    }

    public String validateRegis(){
        return this.validateUrl();
    }

    public void waitingChange(){
        this.waitForPage();
    }

}
