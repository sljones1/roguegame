package model;

/**
 * Direction Enum.
 * Used for getting adjacent rooms.
 */
public enum Direction {
    UP(0),
    BACKWARDS(1),
    LEFT(2),
    RIGHT(3),
    FORWARDS(4),
    DOWN(5);

    private int direction;

    Direction(int direction) {

        this.direction = direction;
    }

    public int getDirection() {
        return direction;
    }
}
