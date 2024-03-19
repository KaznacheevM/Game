package units;

import java.util.ArrayList;

import cords.Position;

public abstract class Person implements GameInterface {
    protected String name; // имя, задаётся рандомно
    protected int age; // возраст, задаётся рандомно
    protected int health; // здоровье
    protected int power; // сила
    protected int armor; // броня
    protected int endurance; // выносливость
    protected int gold; // золото
    protected String weapon; // оружие
    protected int initiative; // инициатива
    protected Position position; // позиция

    // конструктор
    protected Person(String name, int age, int health, int power, int armor, int endurance, int gold, String weapon, int initiative, int x, int y) {
        this.name = name;
        this.health = health;
        this.power = power;
        this.age = age;
        this.armor = armor;
        this.endurance = endurance;
        this.weapon = weapon;
        this.gold = gold;
        this.position = new Position(x, y);
        this.initiative = initiative;
    }

    // поиск ближайшего противника
    public Person findNearestEnemy(ArrayList<Person> enemies) {
        double minDistance = Double.MAX_VALUE;
        Person nearestEnemy = null;
        for (Person enemy : enemies) {
            double distance = this.position.getDistance(enemy.position);
            if (distance < minDistance) {
                minDistance = distance;
                nearestEnemy = enemy;
            }
        }
        return nearestEnemy;
    }

    // конвертация в строку
    @Override
    public String toString() {
        return String.format("%s >>> %s (%d): (%d, %d)", this.getClass().getSimpleName(), this.name, this.age,
                this.position.getX(), this.position.getY());
    }

}