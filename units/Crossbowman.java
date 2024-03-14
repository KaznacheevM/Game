package units;

// Арбалетчик
public class Crossbowman extends Person {

    // private final int HEALTH = 60;
    // private final int POWER = 40;
    // private final int ARMOR = 20;
    // private final int ENDURANCE = 30;
    // private final int GOLD = 40;
    // private final String WEAPON = "gun";

    public Crossbowman(String name, int age, int x, int y) {
        super(name, age, 60, 40, 20, 30, 40, "gun", x, y);
    }

    // атака
    public void attack(Person person) {
        person.health -= super.power;
    }
}
