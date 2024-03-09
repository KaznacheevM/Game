package units;

// Снайпер
public class Sniper extends Person {
    private int bulletsNum;
    boolean inGame = true;

    public Sniper(String name, int age) {
        super(name, age, 60, 40, 20, 30, 40, "gun");
    }

    // атака
    public void attack(Person person) {
        person.health -= super.power;
        this.bulletsNum -= 1;
        if (!isInGame()) {
            inGame = false;
        }
    }

    // вспомогательный метод проверки нличия стрел
    private boolean isInGame() {
        return this.bulletsNum == 0 ? false : true;
    }
}
