package units;

public abstract class Person {
    protected String name; // имя, задаётся пользователем
    protected int age; // возраст, задаётся пользователем
    protected int health; // здоровье
    protected int power; // сила
    protected int armor; // броня
    protected int endurance; // выносливость
    protected String weapon; // оружие
    protected int gold; // золото

    // конструктор
    public Person(String name, int age, int health, int power, int armor, int endurance, int gold, String weapon) {
        this.name = name;
        this.health = health;
        this.power = power;
        this.age = age;
        this.armor = armor;
        this.endurance = endurance;
        this.weapon = weapon;
        this.gold = gold;
    }

    // конвертация в строку
    @Override
    public String toString() {
        return name;
    }
}