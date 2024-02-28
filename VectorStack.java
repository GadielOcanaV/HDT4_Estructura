import java.util.Vector;

class VectorStack<T> extends AbstractStack<T> {
    private final Vector<T> stack; // Vector para almacenar los elementos de la pila

    public VectorStack() {
        stack = new Vector<>(); // Inicializar el Vector
    }

    @Override
    public void push(T element) {
        stack.add(element); // Agregar un elemento al final del Vector
        size++; // Incrementar el tamaño de la pila
    }

    @Override
    public T pop() {
        checkEmpty(); // Verificar si la pila está vacía
        T element = stack.remove(size - 1); // Eliminar el último elemento del Vector
        size--; // Decrementar el tamaño de la pila
        return element; // Devolver el elemento eliminado
    }

    @Override
    public T peekElement() {
        return stack.get(size - 1); // Obtener el último elemento del Vector
    }
}
