package listasimple;

public class Nodo<T> {
    // Atributos
    private T dato;
    private Nodo sgtNodo;   
    // Operacines
    public Nodo(T dato, Nodo sgtNodo){
        this.dato = dato;
        this.sgtNodo = sgtNodo;
    }

    public T getDato() {
        return dato;
    }

    public void setDato(T dato) {
        this.dato = dato;
    }

    public Nodo getSgtNodo() {
        return sgtNodo;
    }

    public void setSgtNodo(Nodo sgtNodo) {
        this.sgtNodo = sgtNodo;
    }
    
    
}
