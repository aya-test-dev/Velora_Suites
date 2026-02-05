package pages;

import Rooms.Room;
import Services.Service;
import Hotel;

/**
 * Page‐object wrapper for Hotel domain actions.
 */
public class HotelPage {

    private Hotel hotel = new Hotel();

    /**
     * Adds a room to the hotel.
     */
    public void addRoom(Room room) {
        hotel.addRoom(room);
    }

    /**
     * Retrieves a room by room number.
     */
    public Room getRoom(String roomNumber) {
        return hotel.getRoom(roomNumber);
    }

    /**
     * Books a room with a service.
     */
    public void bookRoom(String roomNumber, Service service) {
        hotel.bookRoom(roomNumber, service);
    }

    /**
     * Displays booking details for a given room.
     */
    public void displayBookingDetails(String roomNumber) {
        hotel.displayBookingDetails(roomNumber);
    }
}