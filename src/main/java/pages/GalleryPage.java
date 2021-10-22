package pages;

import com.codeborne.selenide.Condition;

import static com.codeborne.selenide.Selenide.$;

public class GalleryPage {

    public GalleryPage() {
        $(SEARCH_RESULTS).waitUntil(Condition.visible, Timeouts.PAGE_LOAD);
    }

    private static final String SEARCH_RESULTS = "h1[class='page-heading  product-listing']";

    public String getSearchResults() {
        return $(SEARCH_RESULTS).getText();
    }

}
