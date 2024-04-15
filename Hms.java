package HMS;

public class Hms {
    public static void main(String[] args) {

        HotelManager hotelManager = new HotelManager();

        Person person1 = new Person();


        Room room1 = new Room(101);


        hotelManager.checkIn(person1, room1);


        hotelManager.displayInfo();
    }
}