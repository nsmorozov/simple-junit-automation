package steps;

import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.when;
import static java.lang.String.format;

public class PetStoreApiSteps {

    private static final String PET_STORE_URI = "https://petstore.swagger.io";
    private static final String GET_PET = "/pet/%s";

    public void getPetById(int id) {
        given().
                baseUri(PET_STORE_URI).
                basePath(format(GET_PET, id)).
                when().
                get().
                then().log();
    }
}
