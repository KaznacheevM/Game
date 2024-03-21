package units;

import java.util.ArrayList;

public abstract class Shooter extends Person {
    protected static final int INITIATIVE = 3;

    protected int arrowsNum;
    protected int damage;

    protected Shooter(String name, int age, int health, int power, int armor, int endurance, int gold, String weapon, int arrowsNum, int damage, int x, int y) {
        super(name, age, health, power, armor, endurance, gold, weapon, INITIATIVE, x, y);
        this.arrowsNum = arrowsNum;
        this.damage = damage;
    }

    // атака
    protected void attack(Person person) {
        person.health -= this.damage;
        this.arrowsNum--;
    }

    // проверка стрел
    protected boolean hasArrows() {
        return this.arrowsNum > 0;
    }

    @Override
    public void step(ArrayList<Person> enemies, ArrayList<Person> friends) {
        if (this.isAlive() && this.hasArrows()) {
            Person enemy = this.findNearestEnemy(enemies);
            this.attack(enemy);
        }
    }
}