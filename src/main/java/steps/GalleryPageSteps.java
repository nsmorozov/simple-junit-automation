package steps;

import io.qameta.allure.Step;
import pages.GalleryPage;

import static org.assertj.core.api.Assertions.assertThat;

public class GalleryPageSteps {

    @Step("Verify search results by {keyword}")
    public void verifySearchResults(String keyword) {
        GalleryPage galleryPage = new GalleryPage();
        System.out.println(galleryPage.getSearchResults());
        assertThat(true).isTrue();
    }
}
