import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignIn {
    private String email;
    private String password;
    private WebDriver driver;
    @FindBy(xpath = "//a[contains(text(),'Sign In')]")
    public WebElement linkSignIn;
    @FindBy(id = "email")
    public WebElement txtEmail;
    @FindBy(id = "pass")
    public WebElement txtPassword;
    @FindBy(id = "send2")
    public WebElement btnSignIn;
    @FindBy(xpath = "//span[normalize-space()='Customer Login']")
    public WebElement titleCustomerLogin;

    public SignIn(WebDriver driver, String email, String password){
        this.driver= driver;
        this.email= email;
        this.password= password;
        PageFactory.initElements(driver,this);
    }
    public void doLogin() throws InterruptedException {
        txtEmail.sendKeys(email);
        txtPassword.sendKeys(password);
        Thread.sleep(1000);
        btnSignIn.click();
    }
}
