import com.engeto.Guest;
import com.engeto.Room;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {
    private List<Booking> bookings;

    public void main() {
        this.bookings = new ArrayList<>();
    }

    public void addBooking(Booking booking) {
        bookings.add(booking);
    }

    public void printAllBookings() {
        for (Booking booking : bookings) {
            System.out.println(booking);
        }
    }

    public static void main(String[] args) {

        System.out.println("Hello and welcome!");
        System.out.println();

        Guest guest1 = new Guest("Adéla Malíková", LocalDate.of(1983, 3, 13));
        Guest guest2 = new Guest("Jana Dvořáčková", LocalDate.of(1995, 5, 5));

        List<Guest> guests = new ArrayList<>();
        guests.add(guest1);
        guests.add(guest2);

        System.out.println("Number of guests: " + guests.size());
        for (Guest guest : guests) {
            System.out.println(guest.getDescription());
        }
        System.out.println();
        Room room1 = new Room(101, 2, true, true, 1000);
        Room room2 = new Room(102, 2, true, true, 1000);
        Room room3 = new Room(103, 3, false, true, 2400);

        List<Room> rooms = new ArrayList<>();
        rooms.add(room1);
        rooms.add(room2);
        rooms.add(room3);

        System.out.println("Number of rooms: " + rooms.size());
        for (Room room : rooms) {
            System.out.println(room.getDescription());
        }
        System.out.println();
        Booking booking1 = new Booking(101, "Adéla Malíková","none", LocalDate.of(2021, 7, 19), LocalDate.of(2021, 7, 26), "recreational");
        Booking booking2 = new Booking(103, "Adéla Malíková", "Jana Dvořáčková", LocalDate.of(2021, 9, 1), LocalDate.of(2021, 9, 14), "recreational");

        List<Booking> bookings = new ArrayList<>();
        bookings.add(booking1);
        bookings.add(booking2);


        System.out.println("Bookings: " + bookings.size());
        for (Booking booking : bookings) {
            System.out.println(booking.getDescription());
        }

    }
}