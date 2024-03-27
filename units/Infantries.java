package units;

import cords.Position;

import java.util.ArrayList;
import java.util.Iterator;

public abstract class Infantries extends Person {
    protected static final int INITIATIVE = 2;

    protected Infantries(String name, int age, int health, int power, int armor, int endurance, int gold, String weapon, int x, int y) {
        super(name, age, health, power, armor, endurance, gold, weapon, INITIATIVE, x, y);
    }

    // атака
    protected void attack(Person person) {
        person.health -= super.power;
    }

    // имеет возможность перемещения
    protected boolean isAbleToMove(Position newPos, ArrayList<Person> friends) {
        boolean abylity = true;
        Iterator<Person> iterator = friends.iterator();

        while (abylity && iterator.hasNext()) {
            if (iterator.next().position == newPos) {
                abylity = false;
            }
        }

        return abylity;
    }


    // движение
    protected void move(Position newPos, ArrayList<Person> friends) {
        if (this.isAbleToMove(newPos, friends)) {
            this.position.setPos(newPos);
        }
    }

    @Override
    public void step(ArrayList<Person> enemies, ArrayList<Person> friends) {
        if (this.isAlive()) {
            Person enemy = this.findNearestEnemy(enemies);
            Position delta = this.position.delta(enemy.position);
            int dX = delta.getX();
            int dY = delta.getY();

            if (Math.abs(dX) <= 1 && Math.abs(dY) <= 1) {
                this.attack(enemy);
                history = "атаковал " + enemy.name + " (" + enemy.getInfo().split(" ")[0] + ")";
                return;
            }

            Position newPos;
            if (Math.abs(dX) > Math.abs(dY)) {
                newPos = new Position(this.position.getX() + Integer.signum(dX), this.position.getY());
                this.move(newPos, friends);
                history = "продвинулся";
            } else {
                newPos = new Position(this.position.getX(), this.position.getY() + Integer.signum(dY));
                this.move(newPos, friends);
                history = "продвинулся";
            }
        }
    }
}