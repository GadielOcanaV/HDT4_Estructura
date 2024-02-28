import java.util.EmptyStackException;
abstract class AbstractStack<T> implements Stack<T> {
    protected int size; // Tamaño de la pila

    public AbstractStack() {
        this.size = 0; // Inicializar el tamaño de la pila
    }

    @Override
    public boolean isEmpty() {
        return size == 0; // Verificar si la pila está vacía
    }

    @Override
    public int size() {
        return size; // Obtener el tamaño de la pila
    }

    // Método para lanzar una excepción si la pila está vacía
    protected void checkEmpty() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
    }
}
