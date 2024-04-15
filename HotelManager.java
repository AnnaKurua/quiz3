package HMS;

import java.util.HashMap;
import java.util.Map;

public class HotelManager {
    private Map<String, Room> guests = new HashMap<>();

    public void checkIn(Person person, Room room) {
        guests.put(person.getId(), room);
    }

    public void checkOut(String personId) {
        guests.remove(personId);
    }

    public void displayInfo() {
        System.out.println("Hotel Guests Information:");
        for (Map.Entry<String, Room> entry : guests.entrySet()) {
            String personId = entry.getKey();
            Room room = entry.getValue();
            System.out.println("HMS.Person ID: " + personId + ", HMS.Room Number: " + room.getNumber());
        }
    }
}
