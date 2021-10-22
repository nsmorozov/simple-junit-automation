package pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.conditions.Visible;

import static com.codeborne.selenide.Selenide.$;

public class HomePage {

    private static final String SEARCH_BOX = "input#search_query_top";
    private static final String SEARCH_BUTTON = "button[name='submit_search']";

    public HomePage() {
        $(SEARCH_BOX).waitUntil(Condition.visible, Timeouts.PAGE_LOAD);
    }

    public void search(String searchPattern) {
        $(SEARCH_BOX).setValue(searchPattern);
        $(SEARCH_BUTTON).click();
    }
}
