package units;

import java.util.ArrayList;

public abstract class Infantries extends Person {
    protected static final int INITIATIVE = 2;

    protected Infantries(String name, int age, int health, int power, int armor, int endurance, int gold, String weapon, int x, int y) {
        super(name, age, health, power, armor, endurance, gold, weapon, INITIATIVE, x, y);
    }

    // атака
    public void attack(Person person) {
        person.health -= super.power;
    }

    @Override
    public void step(ArrayList<Person> enemies) {

    }
}