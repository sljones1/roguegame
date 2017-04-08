package factory;

import model.Room;
import view.RoomDescriptors;

/**
 * Factory for creating a new basic game.
 */
public class RoomFactory {
    private int roomDirections;

    public RoomFactory(int roomDirections) {
        this.roomDirections = roomDirections;
    }

    public Room createMain() {
        Room room = new Room("Welcome Adventurers, to your DOOM!! \n" + RoomDescriptors.getRandomRoom(), roomDirections);
        setNeighbors(room, new Room(RoomDescriptors.getRandomRoom(), roomDirections), 2);
        Room neighbor = new Room(RoomDescriptors.getRandomRoom(), roomDirections);
        setNeighbors(room, neighbor, 5);
        Room last = new Room("You have found the last room, it is filled with treasure", roomDirections);
        last.setWon();
        setNeighbors(neighbor, last, 4);
        return room;
    }

    private void setNeighbors(Room room, Room neighbor, int adjacentArea) {
        if (adjacentArea >= roomDirections) return;
        room.setRoom(neighbor, adjacentArea);
        neighbor.setRoom(room, roomDirections - 1 - adjacentArea);
    }
}
