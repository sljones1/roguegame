package controller;

import view.ViewModel;

import java.util.function.Consumer;

/**
 *
 */
public abstract class MainViewModel {
    private ViewModel<String> roomViewModel;
    private ViewModel<String> statusViewModel;
    private ViewModel<String> promptViewModel;
    private ViewModel<Boolean> endViewModel;
    private String mainCommands;

    public MainViewModel(String mainCommands) {
        this.mainCommands = mainCommands;
    }

    public abstract void getPrompt(Consumer<String> processPrompt);

    public abstract void getPrompt(String prompt, Consumer<String> processPrompt);

    public void updateRoom(String room) {
        update(roomViewModel, room);
    }

    public void endGame(boolean endGame) {
        update(endViewModel, endGame);
    }

    public void updateStatus(String status) {
        update(statusViewModel, status);
    }

    public void getHelp(Consumer<String> processPrompt) {
        getPrompt(mainCommands, processPrompt);
    }

    protected void displayPrompt(String prompt) {
        update(promptViewModel, prompt);
    }

    private <T> void update(ViewModel<T> model, T updated) {
        if (model != null) {
            model.update(updated);
        }
    }

    public void setRoomViewModel(ViewModel<String> roomViewModel) {
        this.roomViewModel = roomViewModel;
    }

    public void setEndViewModel(ViewModel<Boolean> endViewModel) {
        this.endViewModel = endViewModel;
    }

    public void setStatusViewModel(ViewModel<String> statusViewModel) {
        this.statusViewModel = statusViewModel;
    }

    public void setPromptViewModel(ViewModel<String> promptViewModel) {
        this.promptViewModel = promptViewModel;
    }
}
