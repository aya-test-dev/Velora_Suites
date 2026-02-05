package testpages;

import pages.HotelPage;
import Rooms.StandardRoom;
import Services.DiningService;
import Rooms.Room;

/**
 * Initial tests for HotelPage functionality.
 */
public class HotelTests {

    public static void main(String[] args) {
        HotelPage hotelPage = new HotelPage();

        // Test addRoom and getRoom
        StandardRoom standardRoom = new StandardRoom("101", 100);
        hotelPage.addRoom(standardRoom);
        Room retrievedRoom = hotelPage.getRoom("101");
        if (retrievedRoom == null) {
            throw new AssertionError("getRoom returned null after addRoom");
        }
        System.out.println("addRoom/getRoom test passed");

        // Test bookRoom
        DiningService diningService = new DiningService();
        hotelPage.bookRoom("101", diningService);
        Room bookedRoom = hotelPage.getRoom("101");
        if (!bookedRoom.getServices().contains(diningService)) {
            throw new AssertionError("bookRoom did not add service to room");
        }
        System.out.println("bookRoom test passed");

        // Test getTotalCost after booking
        float expectedCost = 100 + diningService.getCost();
        float actualCost = bookedRoom.getTotalCost();
        if (actualCost != expectedCost) {
            throw new AssertionError("Expected total cost " + expectedCost + " but got " + actualCost);
        }
        System.out.println("getTotalCost test passed");

        // Test displayBookingDetails (visual check)
        System.out.println("displayBookingDetails output:");
        hotelPage.displayBookingDetails("101");

        System.out.println("All HotelPage tests passed");
    }
}
