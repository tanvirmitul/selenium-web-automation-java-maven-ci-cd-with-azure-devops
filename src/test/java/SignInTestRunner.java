import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class SignInTestRunner extends BaseTest {
    SignIn signIn;

    @BeforeTest
    public void visitUrl() {
        signIn = new SignIn(driver, "testuser255@mailto.plus", "TestUser1234+");
        driver.get("https://magento.softwaretestingboard.com/");
        System.out.println(driver.getCurrentUrl());
        System.out.println(driver.getTitle());
        System.out.println(driver.getPageSource());
    }

    @Test(priority = 1)
    public void visitLogin() throws InterruptedException {
        signIn.linkSignIn.click();
        signIn.doLogin();
    }
}
