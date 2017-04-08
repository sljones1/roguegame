package view;

import java.util.function.Consumer;

/**
 * ViewModel for View to update with.
 */
public class ViewModel<T> {
    private Consumer<T> consumer;

    public ViewModel(Consumer<T> consumer) {
        this.consumer = consumer;
    }

    public void update(T value) {
        consumer.accept(value);
    }
}
