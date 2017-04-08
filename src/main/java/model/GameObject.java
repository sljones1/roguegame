package model;

/**
 *
 */
public class GameObject extends Describable implements IWinnable {
    private boolean isWon;

    public GameObject(String description) {
        super(description);
    }

    @Override
    public boolean isWon() {
        return isWon;
    }

    public void setWon() {
        isWon = true;
    }
}
