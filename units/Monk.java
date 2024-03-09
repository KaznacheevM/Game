package units;

// Монах
public class Monk extends Person {
    private int mana;
    private int healVal;
    private int healPrice;

    public Monk(String name, int age) {
        super(name, age, 60, 40, 20, 30, 40, "gun");
    }

    // вылечить персонажа
    public void heal(Person person) {
        person.health += this.healVal;
        this.mana -= price("heal");
    }

    // вылечить себя
    public void heal() {
        super.health += this.healVal;
        this.mana -= price("heal");
    }

    // вспомогательный метод для определения цены в единицах маны
    private int price(String action) {
        if (action == "heal")
            return healPrice;
        return 0;
    }
}
