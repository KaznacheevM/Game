package cords;

public class Position {
    private int x;
    private int y;

    public Position(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void setPos(Position pos) {
        setX(pos.x);
        setY(pos.y);
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public double getDistance(Position target) {
        return Math.sqrt(Math.pow(target.getX() - this.x, 2) + Math.pow(target.getY() - this.y, 2));
    }

    public Position delta(Position enemyPos) {
        int dX = enemyPos.x - this.x;
        int dY = enemyPos.x - this.y;
        return new Position(dX,dY);
    }
}
