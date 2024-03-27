package units;

// Волшебник
public class Wizard extends Magician {

    private static final int HEALTH = 80;
    private static final int POWER = 30;
    private static final int ARMOR = 5;
    private static final int ENDURANCE = 30;
    private static final int GOLD = 30;
    private static final String WEAPON = "stick";

    private static final int MANA = 10;
    private static final int HEAL_VAL = 10;
    private static final int HEAL_PRICE = 2;
    private static final int ATTACK_PRICE = 1;

    public Wizard(String name, int age, int x, int y) {
        super(name, age, HEALTH, POWER, ARMOR, ENDURANCE, GOLD, WEAPON, MANA, HEAL_VAL, HEAL_PRICE, x, y);
    }

    // атака
    public void attack(Person person) {
        person.health -= super.power;
        this.mana -= ATTACK_PRICE;
    }

    @Override
    public String getInfo() {
        return "Волшебник " + history;
    }

    @Override
    public String toString() {
        return String.format("Волшебник %s H: %d E: %d A: %d D: %d", this.name, this.health, this.endurance,
                this.armor, this.power);
    }
}
