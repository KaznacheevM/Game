package units;

import java.util.ArrayList;

public abstract class Magician extends Person {
    protected static final int INITIATIVE = 1;

    protected int mana;
    protected int healVal;
    protected int healPrice;

    protected Magician(String name, int age, int health, int power, int armor, int endurance, int gold, String weapon, int mana, int healVal, int healPrice, int x, int y) {
        super(name, age, health, power, armor, endurance, gold, weapon, INITIATIVE, x, y);
        this.mana = mana;
        this.healVal = healVal;
        this.healPrice = healPrice;
    }

    // лечение персонажа
    public void heal(Person person) {
        person.health += this.healVal;
        this.mana -= this.healPrice;
    }

    // лечение себя
    public void heal() {
        super.health += this.healVal;
        this.mana -= this.healPrice;
    }

    @Override
    public void step(ArrayList<Person> enemies) {

    }
}