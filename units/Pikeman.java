package units;

// Копейщик
public class Pikeman extends Infantries {
    private static final int HEALTH = 80;
    private static final int POWER = 30;
    private static final int ARMOR = 30;
    private static final int ENDURANCE = 50;
    private static final int GOLD = 20;
    private static final String WEAPON = "pike";

    public Pikeman(String name, int age, int x, int y) {
        super(name, age, HEALTH, POWER, ARMOR, ENDURANCE, GOLD, WEAPON, x, y);
    }

    @Override
    public String getInfo() {
        return "Копейщик " + history;
    }

    @Override
    public String toString() {
        return String.format("Копейщик %s H: %d E: %d A: %d D: %d", this.name, this.health, this.endurance,
                this.armor, this.power);
    }
}
