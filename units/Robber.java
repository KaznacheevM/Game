package units;

// Разбойник
public class Robber extends Person {
    public Robber(String name, int age) {
        super(name, age, 100, 10, 20, 40, 50, "knife");
    }

    // атака
    public void attack(Person person) {
        person.health -= super.power;
    }

    // украсть золото
    public void stealGold(Person person, int val) {
        super.gold += val;
        person.gold -= val;
    }

    // украсть оружие
    public void stealWeapon(Person person) {
        super.weapon = person.weapon;
        person.weapon = "nothing";
    }
}
