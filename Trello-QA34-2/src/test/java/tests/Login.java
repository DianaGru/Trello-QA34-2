package tests;

import models.User;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Login extends TestBase {

    @BeforeMethod

    public void preCondition() {
        if (app.getUser().isLogget()) {
            app.getUser().logOut();
        }
    }

    @Test
    public void loginPositive() throws InterruptedException {
        User user = new User().setEmail("dianchik2004@gmail.com").setPassword("Celev1981");
        app.getUser().initLogin();
        app.getUser().fillInLoginForm(user);
        app.getUser().submitLogin();

        Assert.assertTrue(app.getUser().isLogget());
    }




}