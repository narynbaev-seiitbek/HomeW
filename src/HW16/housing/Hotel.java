package HW16.housing;

import HW16.interfaces.CreatePerson;
import HW16.interfaces.Rent;
import HW16.persons.Person;

import java.util.Arrays;
import java.util.Random;

public class Hotel implements CreatePerson, Rent {

    private String address;
    private CreatePerson[] hotel;

    public Hotel(String address, CreatePerson[] hotel) {
        this.address = address;
        this.hotel = hotel;
    }

    @Override
    public Person create() {
        Random random = new Random();
        int rent = random.nextInt(hotel.length);
        return hotel[rent].create();
    }

    @Override
    public void rent() {
        System.out.println("Rental price $450 per month");
    }

    @Override
    public String toString() {
        System.out.println("Hotel information: ");
        rent();
        return
                "Address: " + address + '\n';
    }
}
