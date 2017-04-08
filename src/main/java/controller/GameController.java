package controller;

import factory.RoomFactory;
import model.Direction;
import model.Room;

import java.util.Optional;
import java.util.function.Consumer;

/**
 * Main Controller for the Game.
 */
public class GameController implements IController {
    private MainViewModel model;
    private Room roomMain;

    private Consumer<Room> roomMover = (room -> {
        roomMain = room;
        model.updateRoom(room.getDescription());
        if (room.isWon()) {
            model.endGame(true);
        } else {
            model.getPrompt(this::processCommand);
        }
    });

    public GameController(MainViewModel model) {
        this.model = model;
    }

    @Override
    public void processCommand(String command) {
        Commands commands;
        try {
            commands = Commands.valueOf(command.toUpperCase());
        } catch (IllegalArgumentException e) {
            model.getHelp(this::processCommand);
            return;
        }
        if (commands == Commands.END) {
            model.endGame(false);
        } else if (commands == Commands.HELP) {
            model.getHelp(this::processCommand);
        } else {
            Direction directionEnum = Direction.valueOf(commands.name());
            int direction = directionEnum.getDirection();
            Optional<Room> adjacent = roomMain.getAdjacent(direction);
            if (adjacent.isPresent()) {
                roomMover.accept(adjacent.get());
            } else {
                model.updateStatus("Whoops, can't go that direction");
                roomMover.accept(roomMain);
                model.getPrompt(this::processCommand);
            }
        }
    }

    public GameController start() {
        RoomFactory roomFactory = new RoomFactory(6);
        roomMain = roomFactory.createMain();
        model.updateRoom(roomMain.getDescription());
        return this;
    }
}
