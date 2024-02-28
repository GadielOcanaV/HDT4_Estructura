public class SinglyLinkedListStackFactory<T> implements StackFactory<T> {
    @Override
    public Stack<T> createStack() {
        return new SinglyLinkedListStack<>();
    }
}
