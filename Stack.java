public interface Stack<T> {
    // Agrega un elemento a la pila.
    void push(T element);

    // Elimina y devuelve el elemento en la cima de la pila.
    T pop();

    // Devuelve el elemento en la cima de la pila sin eliminarlo.
    T peekElement();

    // Devuelve true si la pila está vacía, false de lo contrario.
    boolean isEmpty();

    // Devuelve el número de elementos en la pila.
    int size();
}
