package view;

import controller.ConsoleMainViewModel;
import controller.GameController;
import controller.MainViewModel;

/**
 * Main Method, uses a Console View Model.
 */
public class App {
    public static void main(String[] args) {
        MainViewModel model = new ConsoleMainViewModel(getCommands());
        GameController controller = new GameController(model).start();
        model.getPrompt(getCommands(), controller::processCommand);
    }
    private static String getCommands() {
        return "You can go:\n" +
                "Up Down\n" +
                "Left Right\n" +
                "Forwards Backwards\n" +
                "Or End";
    }

}
