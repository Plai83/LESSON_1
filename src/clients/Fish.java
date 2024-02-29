package clients;

import java.time.LocalDate;

public class Fish extends Animal{
    public Fish(String name, float weight, LocalDate age, Owner owner) {
        super(name, weight, age, owner);
    }

    public void fly() {
        System.out.println(this.getName() + " can not fly");
    }

    public void toGo() {
        System.out.println(this.getName() + " can't walk");
    }
}
