package clients;

import java.time.LocalDate;

public class NoFlyBirds extends Birds{
    public NoFlyBirds(String name, float weight, LocalDate age, Owner owner) {
        super(name, weight, age, owner);
    }
    public void fly() {
        System.out.println(this.getName() + " can not fly");
    }
}
