package manager;

import models.User;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class UserHelper extends HelperBase{
    public UserHelper(WebDriver wd) {
        super(wd);
    }

    public void initLogin() {
        click(By.cssSelector("[href='/login']"));
    }

    public void fillInLoginForm(User user) throws InterruptedException {
        type(By.cssSelector("#user"), user.getEmail());
        click(By.cssSelector("#login"));
        Thread.sleep(2000);
        type(By.cssSelector("#password"), user.getEmail());
    }

    public void submitLogin() {
        click(By.cssSelector("#login-submit"));
    }

    public void logOut() {
        click(By.cssSelector("[data-test-id = 'header-member-menu-button']"));
        click(By.cssSelector("[data-test-id = 'header-member-menu-logout']"));
        click((By.cssSelector("[data-testid = 'logout-button']")));

    }

    public boolean isLogget() {
        return wd.findElements(By.cssSelector("[data-test-id = 'head-member-menu-button']")).size() > 0;

    }
