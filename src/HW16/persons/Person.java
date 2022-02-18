package HW16.persons;

import HW16.interfaces.CreatePerson;

public abstract class Person implements CreatePerson {

    private String name;


    public Person() {
    }

    public Person(String name) {
        this.name = name;

    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return
                "Members of family: " + name;
    }
}
