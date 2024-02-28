public class DoublyLinkedNode<T> {
    private T data; // Datos almacenados en el nodo
    private DoublyLinkedNode<T> prev; // Referencia al nodo anterior
    private DoublyLinkedNode<T> next; // Referencia al nodo siguiente

    // Constructor que inicializa un nodo con datos y sin referencias
    public DoublyLinkedNode(T data) {
        this.data = data;
        this.prev = null;
        this.next = null;
    }

    // Métodos para acceder y modificar los datos
    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    // Métodos para acceder y modificar la referencia al nodo anterior
    public DoublyLinkedNode<T> getPrev() {
        return prev;
    }

    public void setPrev(DoublyLinkedNode<T> prev) {
        this.prev = prev;
    }

    // Métodos para acceder y modificar la referencia al nodo siguiente
    public DoublyLinkedNode<T> getNext() {
        return next;
    }

    public void setNext(DoublyLinkedNode<T> next) {
        this.next = next;
    }
}
