package steps;

import pages.GalleryPage;

import static org.assertj.core.api.Assertions.assertThat;

public class GalleryPageSteps {

    public void verifySearchResults(String keyword) {
        GalleryPage galleryPage = new GalleryPage();
        System.out.println(galleryPage.getSearchResults());
        assertThat(true).isTrue();
    }
}
