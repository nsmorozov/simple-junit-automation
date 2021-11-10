import steps.PetStoreApiSteps;

public class PetStoreApi {

    private PetStoreApiSteps petStoreApiSteps;
    public PetStoreApiSteps petStoreSteps() {
        if (petStoreApiSteps == null) {
            petStoreApiSteps = new PetStoreApiSteps();
        }
        return petStoreApiSteps;
    }
}
