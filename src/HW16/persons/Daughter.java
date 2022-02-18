package HW16.persons;

import HW16.interfaces.CreatePerson;

public class Daughter extends Person implements CreatePerson{


    public Daughter() {
        super("Daughter");
    }

    @Override
    public Person create() {
        return new Daughter();
    }
}
