import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import pages.MainPage;

import static com.codeborne.selenide.Selenide.open;
import static org.assertj.core.api.Assertions.assertThat;

public class SmokeTest {

    @Test
    @DisplayName("Check sum")
    public void testSum() {
        assertThat(5).isEqualTo(5);
    }

    @Test
    @DisplayName("Verify home page")
    public void verifyHomePage() {
        open("http://todomvc.com/examples/react/#/");
        new MainPage().addItem("Clean carpet");
        System.out.println();
    }

}
