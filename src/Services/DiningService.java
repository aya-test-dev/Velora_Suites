package Services;

public class DiningService implements Service {

    @Override
    public int getCost() {
        return 50;
    }

    @Override
    public String getName() {
        return "Dining Services.";
    }
}
