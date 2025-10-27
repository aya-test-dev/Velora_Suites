package Rooms;

import java.util.ArrayList;
import Services.*;
public abstract class Room {

    private String roomNumber;
    private int baseRate;
    private ArrayList<Service> services = new ArrayList<>() ;

    public Room(String roomNumber, int baseRate) {
        this.roomNumber = roomNumber;
        this.baseRate = baseRate;
    }

    public String getRoomNumber() {
        return roomNumber;
    }


    public void setBaseRate(int baseRate) {
        this.baseRate = baseRate;
    }

    public ArrayList<Service> getServices() {
        return services;
    }


    public void addService(Service service){
        services.add(service);
    }


    public float getTotalCost(){
        float totalCost = 0;

        for (Service s :services){
            totalCost+= s.getCost();
        }
        totalCost+= this.baseRate;
        return totalCost;
    }

    public abstract String getDescription();


}
