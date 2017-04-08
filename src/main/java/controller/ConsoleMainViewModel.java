package controller;

import view.ViewModel;

import java.util.Scanner;
import java.util.function.Consumer;

/**
 *
 */
public class ConsoleMainViewModel extends MainViewModel {
    private final Scanner sc = new Scanner(System.in);


    public ConsoleMainViewModel(String mainCommands) {
        super(mainCommands);
        ViewModel<String> basicOut = new ViewModel<>(System.out::println);
        ViewModel<Boolean> endGame = new ViewModel<>(end -> {
            if(end) {
                System.out.println("You Won!");
                System.exit(0);
            } else {
                System.out.println("Try Again!");
                System.exit(0);
            }
        });
        setStatusViewModel(new ViewModel<>(System.out::println));
        setRoomViewModel(basicOut);
        setEndViewModel(endGame);
        setPromptViewModel(basicOut);
    }


    public void getPrompt(Consumer<String> processPrompt) {
        String command = sc.next();
        processPrompt.accept(command);
    }

    public void getPrompt(String prompt, Consumer<String> processPrompt) {
        displayPrompt(prompt);
        getPrompt(processPrompt);
    }
}
