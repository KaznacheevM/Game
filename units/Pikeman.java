package units;

// Копейщик
public class Pikeman extends Person {
    public Pikeman(String name, int age) {
        super(name, age, 80, 30, 30, 50, 20, "pike");
    }

    // атака
    public void attack(Person person) {
        person.health -= super.power;
    }
}
