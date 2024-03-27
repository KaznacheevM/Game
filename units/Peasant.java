package units;

// Крестьянин
public class Peasant extends Civilians {
    private static final int HEALTH = 20;
    private static final int POWER = 0;
    private static final int ARMOR = 0;
    private static final int ENDURANCE = 20;
    private static final int GOLD = 20;
    private static final String WEAPON = "nothing";

    private int arrowsNum;

    public Peasant(String name, int age, int x, int y) {
        super(name, age, HEALTH, POWER, ARMOR, ENDURANCE, GOLD, WEAPON, x, y);
        this.arrowsNum = 10;
    }

    // отдать стрелы
    public void giveArrows(int val) {
        this.arrowsNum -= val;
    }

    // продать оружие
    public void sellWeapon(Person person, String weapon, int price) {
        person.weapon = weapon;
        super.gold += price;
    }

    @Override
    public String getInfo() {
        return "Крестьянин " + history;
    }

    @Override
    public String toString() {
        return String.format("Крестьянин %s H: %d E: %d A: %d D: %d", this.name, this.health, this.endurance,
                this.armor, 0);
    }
}
