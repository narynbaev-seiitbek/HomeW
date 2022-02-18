package HW16.housing;


import HW16.interfaces.Utilities;
import HW16.interfaces.CreatePerson;
import HW16.persons.Person;

import java.util.Arrays;
import java.util.Random;

public class Apartment implements CreatePerson, Utilities {


    private String address;
    private CreatePerson[] apartment;

    public Apartment() {
    }

    public Apartment(String address, CreatePerson[] apartment) {
        this.address = address;
        this.apartment = apartment;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public CreatePerson[] getApartment() {
        return apartment;
    }

    public void setApartment(CreatePerson[] apartment) {
        this.apartment = apartment;
    }

    @Override
    public void utilities() {
        System.out.println("Utilities $500 per month");
    }

    @Override
    public Person create() {
        Random random = new Random();
        int apart = random.nextInt(apartment.length);
        return apartment[apart].create();
    }

    @Override
    public String toString() {
        System.out.println("Apartment information: ");
        utilities();
        return
                "address: " + address + '\n';
    }

}
