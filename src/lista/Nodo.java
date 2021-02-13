package lista;

public class Nodo <T> {
    // Dato que se almacena en el nodo
    private T elemento;
    // Puntero al nodo siguiente
    private Nodo sgtNodo;
    
    public Nodo(T elemento, Nodo sgtNodo){
        this.elemento = elemento;
        this.sgtNodo = sgtNodo;
    }

    public Nodo getSgtNodo() {
        return sgtNodo;
    }

    public T getElemento() {
        return elemento;
    }

    public void setSgtNodo(Nodo sgtNodo) {
        this.sgtNodo = sgtNodo;
    }
    
    
}
