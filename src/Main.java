import clients.*;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Lion leva = new Lion("Лева", 200, LocalDate.now(), new Owner());
        Lion puzo = new Lion("Кот", 450, LocalDate.now(), new Owner());
        Dog pes = new Dog("Дружок", 30, LocalDate.now(), new Owner());
        Birds duck = new Birds("Дональд", 3, LocalDate.now(), new Owner());
        Birds penguin = new NoFlyBirds("Серый", 6, LocalDate.now(), new Owner());
        Snakes kaa = new Snakes("Каа", 11, LocalDate.now(), new Owner());
        Fish goopy = new Fish("Гупи", 0.01f, LocalDate.now(), new Owner());
        kaa.toGo();

    }
}
