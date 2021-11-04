package steps;

import io.qameta.allure.Step;
import pages.HomePage;

public class HomePageSteps {

    @Step("I search by {searchKeyword}")
    public void search(String searchPattern) {
        new HomePage().search(searchPattern);
    }
}
