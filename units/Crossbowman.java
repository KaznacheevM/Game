package units;

// Арбалетчик
public class Crossbowman extends Shooter {
    private static final int HEALTH = 60;
    private static final int POWER = 40;
    private static final int ARMOR = 20;
    private static final int ENDURANCE = 30;
    private static final int GOLD = 40;
    private static final String WEAPON = "crossbow";
    private static final int ARROWS_NUM = 1000;
    private static final int DAMAGE = 10;

    public Crossbowman(String name, int age, int x, int y) {
        super(name, age, HEALTH, POWER, ARMOR, ENDURANCE, GOLD, WEAPON, ARROWS_NUM, DAMAGE, x, y);
    }

    @Override
    public String getInfo() {
        return "Арбалетчик " + history;
    }

    @Override
    public String toString() {
        return String.format("Арбалетчик %s H: %d E: %d A: %d D: %d", this.name, this.health, this.endurance,
                this.armor, this.damage);
    }
}
