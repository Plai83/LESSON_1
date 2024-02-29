package clients;

import java.time.LocalDate;
import java.util.Date;

public class Animal {
    protected String name;
    protected float weight;
    protected LocalDate age;
    protected Owner owner;

    public Animal(String name, float weight, LocalDate age, Owner owner) {
        this.name = name;
        this.weight = weight;
        this.age = age;
        this.owner = owner;
    }

    public Animal() {
        this("Животное", 100, LocalDate.now(), new Owner());
    }

    private void sleep() {
        System.out.println(this.name  + " sleep");
    }
    private void wakeUp() {
        System.out.println(this.name  + " wakeUp");
    }

    private void wakeUp(int time) {
        System.out.println(this.name + " wakeUp in " + time);
    }

    private void eat() {
        System.out.println(this.name + " eat");
    }

    private void play() {
        System.out.println(this.name  + " play");
    }

    public void toGo() {
        System.out.println(this.name  + " leaving");
    }

    public void fly() {
        System.out.println(this.name  + " fly");
    }

    public void swim() {
        System.out.println(this.name + " floating away");
    }

    public void live() {
        wakeUp(20);
        eat();
        play();
        toGo();
        sleep();
    }

    public String getTape() {
        return getClass().getSimpleName();
    }

    public String getName() {
        return name;
    }

    public float getWeight() {
        return weight;
    }

    public LocalDate getAge() {
        return age;
    }

    public Owner getOwner() {
        return owner;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public void setOwner(Owner owner) {
        this.owner = owner;
    }

    @Override
    public String toString() {
        return String.format("name = %S, white = %s, age = %s, owner = %s", name, weight, age, owner);
    }
}
