package Services;

public class GymService implements Service {

    @Override
    public int getCost() {
        return 30;
    }

    @Override
    public String getName() {
        return "Gym Services.";
    }
}
