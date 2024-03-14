package units;

// Крестьянин
public class Peasant extends Person {
    private int arrowsNum;
    boolean inGame = true;

    public Peasant(String name, int age, int x, int y) {
        super(name, age, 20, 0, 0, 20, 20, "nothing", x, y);
    }

    // отдать стрелы
    public void giveArrows(int val) {
        this.arrowsNum -= val;
        if (!isInGame()) {
            inGame = false;
        }
    }

    // продать оружие
    public void sellWeapon(Person person, String weapon, int price) {
        person.weapon = weapon;
        super.gold += price;
    }

    // вспомогательный метод проверки нличия стрел
    private boolean isInGame() {
        return this.arrowsNum == 0 ? false : true;
    }
}
