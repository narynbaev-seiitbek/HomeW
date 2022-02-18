package HW16.persons;

import HW16.interfaces.CreatePerson;

public class Mother extends Person implements CreatePerson{


    public Mother() {
        super("Mother");
    }

    @Override
    public Person create() {
        return new Mother();
    }
}
