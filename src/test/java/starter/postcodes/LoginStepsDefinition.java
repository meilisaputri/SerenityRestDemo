package starter.postcodes;

import io.cucumber.java.en.And;
import io.cucumber.java.en.When;

public class LoginStepsDefinition {
    @And("user input username data")
    public void userInputUsernameData() {
        System.out.println("input username");
    }

    @And("user input valid password data")
    public void userInputValidPasswordData() {
        System.out.println("input valid password");
    }

    @When("user click login button")
    public void userClickLoginButton() {
        System.out.println("click login");
    }

    @And("user input invalid password data")
    public void userInputInvalidPasswordData() {
        System.out.println("input invalid password");
    }

    @And("user input invalid username data")
    public void userInputInvalidEmailData() {
        System.out.println("input invalid username");
    }

    @When("user click login with google")
    public void userClickLoginWithGoogle() {
        System.out.println("click login with google");
    }
}
