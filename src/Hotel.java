import java.util.HashMap;
import Rooms.*;
import Services.Service;

public class Hotel {

    HashMap<String,Room> hotel = new HashMap<>();

    public void addRoom(Room room){
        hotel.put(room.getRoomNumber(), room);
        System.out.println("The Rooms.Room with room number "+room.getRoomNumber()+" is added");
    }

    public Room getRoom(String roomNumber){
        return hotel.get(roomNumber);
    }

    public void bookRoom(String roomNumber, Service service){
        Room room = hotel.get(roomNumber);
        room.addService(service);
        System.out.println("The room is booked with "+service.getName());
    }

    public void displayBookingDetails(String roomNumber){
        System.out.println(hotel.get(roomNumber).getRoomNumber());
        System.out.println(hotel.get(roomNumber).getDescription());
        System.out.println(hotel.get(roomNumber).getTotalCost());
    }
}
