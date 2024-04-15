package HMS;

import java.util.ArrayList;
import java.util.List;

public class PersonManager {


    public static List<Person> getPersons() {

        List<Person> result= new ArrayList<>();

        String[] lines = Persons.Persons.split("\n");

        for (String line : lines) {
            String[] fields = line.split(",");

            String firstName = fields[0].trim();
            String lastName = fields[1].trim();
            String personalNumber = fields[2].trim();

            Person p = new Person();
            p.setId(2);
            p.setName("anna");
            p.setSurname("kurua");

            result.add(p);

        }
        return result;
    }
}