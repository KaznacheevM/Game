package units;

// Арбалетчик
public class Crossbowman extends Person {
    public Crossbowman(String name, int age) {
        super(name, age, 60, 40, 20, 30, 40, "gun");
    }

    // атака
    public void attack(Person person) {
        person.health -= super.power;
    }
}
