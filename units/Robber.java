package units;

// Разбойник
public class Robber extends Infantries {
    private static final int HEALTH = 100;
    private static final int POWER = 10;
    private static final int ARMOR = 20;
    private static final int ENDURANCE = 40;
    private static final int GOLD = 50;
    private static final String WEAPON = "knife";

    public Robber(String name, int age, int x, int y) {
        super(name, age, HEALTH, POWER, ARMOR, ENDURANCE, GOLD, WEAPON, x, y);
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
