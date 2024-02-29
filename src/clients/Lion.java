package clients;

import java.time.LocalDate;

public class Lion extends Animal{
    public Lion(String name, float weight, LocalDate age, Owner owner) {
        super(name, weight, age, owner);
    }

    public void fly() {
        System.out.println(this.getName() + " can not fly");
    }

    public void swim() {
        System.out.println(this.getName() + " can't swim");
    }

}
