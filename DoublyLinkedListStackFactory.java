import java.util.EmptyStackException;

public class DoublyLinkedListStackFactory<T> implements StackFactory<T>{
    @Override
    public Stack<T> createStack() {
        return new DoublyLinkedListStack<>();
    }
}