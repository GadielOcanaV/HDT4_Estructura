import java.util.ArrayList;

class ArrayListStack<T> extends AbstractStack<T> {
    private final ArrayList<T> stack; // ArrayList para almacenar los elementos de la pila

    public ArrayListStack() {
        stack = new ArrayList<>(); // Inicializar el ArrayList
    }

    @Override
    public void push(T element) {
        stack.add(element); // Agregar un elemento al final del ArrayList
        size++; // Incrementar el tamaño de la pila
    }

    @Override
    public T pop() {
        checkEmpty(); // Verificar si la pila está vacía
        T element = stack.remove(size - 1); // Eliminar el último elemento del ArrayList
        size--; // Decrementar el tamaño de la pila
        return element; // Devolver el elemento eliminado
    }

    @Override
    public T peekElement() {
        return stack.get(size - 1); // Obtener el último elemento del ArrayList
    }
}

