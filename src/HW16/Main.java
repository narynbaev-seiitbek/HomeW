package HW16;

import HW16.housing.Apartment;
import HW16.housing.Hostel;
import HW16.housing.Hotel;
import HW16.interfaces.CreatePerson;
import HW16.persons.Daughter;
import HW16.persons.Father;
import HW16.persons.Mother;
import HW16.persons.Son;

public class Main {

    public static void main(String[] args) {

        Apartment apartment = new Apartment("Bishkek",new CreatePerson[]
                {new Mother(), new Father(), new Son(), new Daughter()});
        System.out.println(apartment);
        int counter=0;
        for (int i = 0; i <= 4; i++) {
            counter++;
            CreatePerson person = apartment.create();
            System.out.println(person);
        }
        System.out.println("Number of persons:"+counter);

        System.out.println("----------------------------------");

        Hostel hostel = new Hostel("Karakol",new CreatePerson[]
                {new Mother(), new Father(), new Son(), new Daughter()});
        System.out.println(hostel);
        int counter2=0;
        for (int i = 0; i < 3; i++) {
            counter2++;
           CreatePerson person = hostel.create();
            System.out.println(person);
        }
        System.out.println("Number of persons:"+counter2);

        System.out.println("--------------------------------");

        Hotel hotel = new Hotel("Karakol",new CreatePerson[]
                {new Mother(), new Father(), new Son(), new Daughter()});

        System.out.println(hotel);
        int counter3=0;
        for (int i = 0; i <= 2; i++) {
            counter3++;
            CreatePerson person = hotel.create();
            System.out.println(person);
        }
        System.out.println("Number of persons:"+counter3);

    }

}
