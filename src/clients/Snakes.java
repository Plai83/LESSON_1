package clients;

import java.time.LocalDate;

public class Snakes extends Animal{
    public Snakes(String name, float weight, LocalDate age, Owner owner) {
        super(name, weight, age, owner);
    }

    public void fly() {
        System.out.println(this.getName() + " can not fly");
    }

    public void swim() {
        System.out.println(this.getName() + " can't swim");
    }

    public void toGo() {
        System.out.println(this.getName() + " can't walk, but can crawl");
    }
}
