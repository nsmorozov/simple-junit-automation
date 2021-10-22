package steps;

import pages.HomePage;

public class HomePageSteps {

    public void search(String searchPattern) {
        new HomePage().search(searchPattern);
    }
}
