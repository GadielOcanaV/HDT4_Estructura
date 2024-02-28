public class VectorStackFactory<T> implements StackFactory<T> {
    @Override
    public Stack<T> createStack() {
        return new VectorStack<>();
    }
}
