package model.person;

import java.util.UUID;

public class Person {

    private UUID id;
    private String name;
    private Address address;

    public Person(String name, Address address) {
        this.name = name;
        this.address = address;
        this.id = UUID.randomUUID();
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", address=" + address +
                '}';
    }

    public UUID getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Address getAddress() {
        return address;
    }
}
