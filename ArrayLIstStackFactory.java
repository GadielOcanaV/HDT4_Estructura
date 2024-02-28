public class ArrayLIstStackFactory<T> implements StackFactory<T> {

    @Override
    public Stack<T> createStack() {
        return new ArrayListStack<>();
    }
}
