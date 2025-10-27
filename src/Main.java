import Rooms.DeluxeRoom;
import Rooms.StandardRoom;
import Rooms.SuiteRoom;
import Services.DiningService;
import Services.GymService;
import Services.SpaService;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

import Rooms.*;

public class Main {
    public static void main(String[] args) {

        Hotel hotel = new Hotel();

        hotel.addRoom(new StandardRoom("101", 200));   // Create Standard Rooms.Room
        hotel.addRoom(new DeluxeRoom("102", 300));     // Create Deluxe Rooms.Room
        hotel.addRoom(new SuiteRoom("103", 500));      // Create Suite Rooms.Room

        hotel.bookRoom("101", new SpaService());       // Add Spa service to Standard Rooms.Room
        hotel.bookRoom("102", new DiningService());    // Add Dining service to Deluxe Rooms.Room
        hotel.bookRoom("103", new GymService());       // Add Gym service to Suite Rooms.Room

        hotel.displayBookingDetails("101");
        hotel.displayBookingDetails("102");
        hotel.displayBookingDetails("103");


    }
}