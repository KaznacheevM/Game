package units;

// Снайпер
public class Sniper extends Shooter {
    private static final int HEALTH = 60;
    private static final int POWER = 40;
    private static final int ARMOR = 20;
    private static final int ENDURANCE = 30;
    private static final int GOLD = 40;
    private static final String WEAPON = "bow";
    private static final int ARROWS_NUM = 10;
    private static final int DAMAGE = 2;

    public Sniper(String name, int age, int x, int y) {
        super(name, age, HEALTH, POWER, ARMOR, ENDURANCE, GOLD, WEAPON, ARROWS_NUM, DAMAGE, x, y);
    }
}
