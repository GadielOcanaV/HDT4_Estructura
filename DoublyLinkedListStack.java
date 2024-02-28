import java.util.EmptyStackException;

public class DoublyLinkedListStack<T> extends AbstractStack<T> {
    private DoublyLinkedNode<T> top; // Nodo superior de la pila

    // Constructor que inicializa la pila con el nodo superior como nulo
    public DoublyLinkedListStack() {
        top = null;
    }

    @Override
    public void push(T element) {
        DoublyLinkedNode<T> newNode = new DoublyLinkedNode<>(element); // Crear un nuevo nodo
        if (isEmpty()) {
            top = newNode; // Si la pila está vacía, el nuevo nodo se convierte en el nodo superior
        } else {
            newNode.setNext(top); // Establecer el siguiente del nuevo nodo al nodo superior actual
            top.setPrev(newNode); // Establecer el anterior del nodo superior actual al nuevo nodo
            top = newNode; // El nuevo nodo se convierte en el nodo superior
        }
        size++; // Incrementar el tamaño de la pila
    }

    @Override
    public T pop() {
        checkEmpty(); // Verificar si la pila está vacía
        T removedElement = top.getData(); // Obtener el elemento superior
        top = top.getNext(); // Mover el nodo superior al siguiente nodo
        if (top != null) {
            top.setPrev(null); // Establecer el anterior del nuevo nodo superior como nulo
        }
        size--; // Decrementar el tamaño de la pila
        return removedElement;
    }

    @Override
    public T peekElement() {
        return top.getData(); // Obtener el elemento superior sin eliminarlo
    }
}

