package units;

// Монах
public class Monk extends Magician {
    private static final int HEALTH = 60;
    private static final int POWER = 0;
    private static final int ARMOR = 0;
    private static final int ENDURANCE = 30;
    private static final int GOLD = 40;
    private static final String WEAPON = "bible";
    private static final int MANA = 8;

    private static final int HEAL_VAL = 10;
    private static final int HEAL_PRICE = 2;

    public Monk(String name, int age, int x, int y) {
        super(name, age, HEALTH, POWER, ARMOR, ENDURANCE, GOLD, WEAPON, MANA, HEAL_VAL, HEAL_PRICE, x, y);
    }

    @Override
    public String getInfo() {
        return "Монах " + history;
    }

    @Override
    public String toString() {
        return String.format("Монах %s H: %d E: %d A: %d D: %d", this.name, this.health, this.endurance,
                this.armor, 0);
    }
}
