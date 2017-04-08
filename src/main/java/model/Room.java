package model;

import java.util.Optional;

/**
 *
 */
public class Room extends GameObject {
    private Room[] adjacentList;
    private final int max;


    public Room(String description, int max) {
        super(description);
        adjacentList = new Room[max];
        this.max = max;
    }

    public void setRoom(Room adjacent, int adjacentIndex) {
        if (adjacentIndex > max - 1) return;
        adjacentList[adjacentIndex] = adjacent;
    }

    public Optional<Room> getAdjacent(int adjacentIndex) {
        if (adjacentIndex > max - 1) {
            return Optional.empty();
        } else {
            return Optional.ofNullable(adjacentList[adjacentIndex]);
        }
    }
}
