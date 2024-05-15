import com.engeto.Guest;
import com.engeto.com.engeto.Room;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello and welcome!");
        System.out.println();

        Room room1 = new Room(1, true, true, 1000);
        Room room2 = new Room(1, true, true, 1000);
        Room room3 = new Room(3, false, true, 2400);


        Guest guest1 = new Guest("Adéla Malíková", LocalDate.of(1983, 3, 13));
        Guest guest2 = new Guest("Jana Dvořáčková", LocalDate.of(1995, 5, 5));

        System.out.println();
        System.out.println(room1.getDescription());
        System.out.println(room2.getDescription());
        System.out.println(room3.getDescription());

        System.out.println();
        List<Guest> GuestList = new ArrayList<>();
        GuestList.add(guest1);
        GuestList.add(guest2);

        System.out.println("Počet hostů: "+GuestList.size());
        for (Guest guest : GuestList) {
        System.out.println(guest.getDescription());

        }
    }
}

