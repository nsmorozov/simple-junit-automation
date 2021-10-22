package steps;

import static com.codeborne.selenide.Selenide.open;

public class CommonSteps {

    public void openHomePage() {
        open("http://automationpractice.com");
    }
}
