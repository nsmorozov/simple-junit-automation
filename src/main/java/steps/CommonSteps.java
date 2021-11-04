package steps;

import io.qameta.allure.Step;

import static com.codeborne.selenide.Selenide.open;

public class CommonSteps {

    @Step("Open home page")
    public void openHomePage() {
        open("http://automationpractice.com");
    }
}
