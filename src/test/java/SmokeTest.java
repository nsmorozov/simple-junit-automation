import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class SmokeTest {

    WebApplication w = new WebApplication();
    PetStoreApi api = new PetStoreApi();

    @Test
    @DisplayName("Check sum")
    public void testSum() {
        assertThat(5).isEqualTo(5);
    }

    @Test
    @DisplayName("Verify Search results")
    public void verifyHomePage() {
        final String keyword = "Dress";
        w.commonSteps().openHomePage();
        w.onHomePage().search(keyword);
        w.onGalleryPage().verifySearchResults(keyword);
    }

    @Test
    @DisplayName("Get pet by id using API")
    public void getPetbyId() {
        api.petStoreSteps().getPetById(1);
    }

}
