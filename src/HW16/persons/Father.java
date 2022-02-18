package HW16.persons;

import HW16.interfaces.CreatePerson;

public class Father extends Person implements CreatePerson{



    public Father() {
        super("Father");
    }

    @Override
    public Person create() {
        return new Father();
    }
}
