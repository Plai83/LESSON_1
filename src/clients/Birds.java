package clients;

import org.w3c.dom.ls.LSOutput;

import java.time.LocalDate;

public class Birds extends Animal{
    public Birds(String name, float weight, LocalDate age, Owner owner) {
        super(name, weight, age, owner);
    }

}
