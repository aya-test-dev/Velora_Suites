package Services;

public class SpaService implements Service {

    @Override
    public int getCost() {
        return 100;
    }

    @Override
    public String getName() {
        return "Spa Services.";
    }
}
