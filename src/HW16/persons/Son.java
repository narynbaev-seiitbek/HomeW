package HW16.persons;

import HW16.interfaces.CreatePerson;

public class Son extends Person implements CreatePerson{

    public Son() {
        super("Son");
    }

    @Override
    public Person create() {
        return new Son();
    }
}
