
import steps.CommonSteps;
import steps.GalleryPageSteps;
import steps.HomePageSteps;

public class WebApplication {

    private CommonSteps commonSteps;
    private HomePageSteps homePageSteps;
    private GalleryPageSteps galleryPageSteps;

    public HomePageSteps onHomePage() {
        if (homePageSteps == null) {
            homePageSteps = new HomePageSteps();
        }
        return homePageSteps;
    }

    public GalleryPageSteps onGalleryPage() {
        if (galleryPageSteps == null) {
            galleryPageSteps = new GalleryPageSteps();
        }
        return galleryPageSteps;
    }

    public CommonSteps commonSteps() {
        if (commonSteps == null) {
            commonSteps = new CommonSteps();
        }
        return commonSteps;
    }
}
