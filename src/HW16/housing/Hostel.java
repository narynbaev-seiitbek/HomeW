package HW16.housing;

import HW16.interfaces.CreatePerson;
import HW16.interfaces.Rent;
import HW16.persons.Person;

import java.util.Arrays;
import java.util.Random;

public class Hostel implements CreatePerson, Rent {

    private String address;
    private CreatePerson[] hostel;

    public Hostel() {
    }

    public Hostel(String address, CreatePerson[] hostel) {
        this.address = address;
        this.hostel = hostel;
    }

    @Override
    public Person create() {
        Random random = new Random();
        int rent = random.nextInt(hostel.length);
        return hostel[rent].create();
    }

    @Override
    public void rent() {
        System.out.println("Rental price $350 per month");

    }

    @Override
    public String toString() {
        System.out.println("Hostel information: ");
        rent();
        return
                "Address: " + address + '\n';
    }
}
