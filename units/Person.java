package units;

import java.util.ArrayList;

import Cords.Position;

public abstract class Person {
    protected String name; // имя, задаётся пользователем
    protected int age; // возраст, задаётся пользователем
    protected int health; // здоровье
    protected int power; // сила
    protected int armor; // броня
    protected int endurance; // выносливость
    protected int gold; // золото
    protected String weapon; // оружие
    protected Position position;

    // конструктор
    public Person(String name, int age, int health, int power, int armor, int endurance, int gold, String weapon, int x,
            int y) {
        this.name = name;
        this.health = health;
        this.power = power;
        this.age = age;
        this.armor = armor;
        this.endurance = endurance;
        this.weapon = weapon;
        this.gold = gold;
        this.position = new Position(x, y);
    }

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