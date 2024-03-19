package cords;

public class Position {
    private int x;
    private int y;

    public Position(int x, int y) {
        this.x = x;
        this.y = y;
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
}
