class SinglyLinkedListStack<T> extends AbstractStack<T> {
    private Node<T> top; // Nodo superior de la pila

    @Override
    public void push(T element) {
        Node<T> newNode = new Node<>(element); // Crear un nuevo nodo
        newNode.next = top; // Establecer el nuevo nodo como el nuevo superior
        top = newNode; // Actualizar el nodo superior
        size++; // Incrementar el tamaño de la pila
    }

    @Override
    public T pop() {
        checkEmpty(); // Verificar si la pila está vacía
        T element = top.data; // Obtener el dato del nodo superior
        top = top.next; // Mover el puntero al siguiente nodo
        size--; // Decrementar el tamaño de la pila
        return element; // Devolver el elemento eliminado
    }

    @Override
    public T peekElement() {
        return top.data; // Obtener el dato del nodo superior
    }

    // Clase interna para representar un nodo en la lista enlazada
    private static class Node<T> {
        T data; // Dato del nodo
        Node<T> next; // Referencia al siguiente nodo

        Node(T data) {
            this.data = data;
            this.next = null;
        }
    }
}
