package units;

import java.util.ArrayList;
import java.util.Objects;

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

    protected String history;

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

    // проверка жизней
    public boolean isAlive() {
        return this.health > 0;
    }

    // поиск ближайшего противника
    public Person findNearestEnemy(ArrayList<Person> enemies) {
        double minDistance = Double.MAX_VALUE;
        Person nearestEnemy = null;
        for (Person enemy : enemies) {
            if (enemy.isAlive()) {
                double distance = this.position.getDistance(enemy.position);
                if (distance < minDistance) {
                    minDistance = distance;
                    nearestEnemy = enemy;
                }
            }
        }

        if (!Objects.isNull(nearestEnemy)) {
            return nearestEnemy;
        } else {
            return enemies.getFirst();
        }
    }

    public Position getPosition() {
        return this.position;
    }

    public int[] getCords() {
        return new int[] {position.getY() + 1, position.getX() + 1};
    }

    public int getHealth() {
        return this.health;
    }
}