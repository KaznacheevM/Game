package units;

// Волшебник
public class Wizard extends Person {
    private int mana;
    private int healVal;
    private int healPrice;
    private int attackPrice;

    public Wizard(String name, int age, int x, int y) {
        super(name, age, 80, 30, 5, 30, 30, "stick", x, y);
        this.mana = 10;
        this.healPrice = 2;
        this.attackPrice = 1;
    }

    // атака
    public void attack(Person person) {
        person.health -= super.power;
        this.mana -= price("attack");
    }

    // лечение персонажа
    public void heal(Person person) {
        person.health += this.healVal;
        this.mana -= price("heal");
    }

    // лечение себя
    public void heal() {
        super.health += this.healVal;
        this.mana -= price("heal");
    }

    // вспомогательный метод для определения цены в единицах маны
    private int price(String action) {
        if (action == "heal")
            return this.healPrice;
        else if (action == "attack")
            return this.attackPrice;
        return 0;
    }
}
