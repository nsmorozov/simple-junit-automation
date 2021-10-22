import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import steps.CommonSteps;
import steps.GalleryPageSteps;
import steps.HomePageSteps;

import static com.codeborne.selenide.Selenide.open;
import static org.assertj.core.api.Assertions.assertThat;

public class SmokeTest {

    @Test
    @DisplayName("Check sum")
    public void testSum() {
        assertThat(5).isEqualTo(5);
    }

    @Test
    @DisplayName("Verify Search results")
    public void verifyHomePage() {
        final String keyword = "Dress";
        new CommonSteps().openHomePage();
        new HomePageSteps().search(keyword);
        new GalleryPageSteps().verifySearchResults(keyword);

    }

}
