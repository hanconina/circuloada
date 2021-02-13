package lista;

public class Lista<T> {

    // Puntero que apunta al primer elemento de la Lista
    private Nodo<T> cabeza;

    // Crear una lista vácia
    public Lista() {
        cabeza = null;
    }

    // Verificar si la lista es vácia
    public boolean esVacia() {
        return cabeza == null;
    }

    // Agragar un nuevo nodo a la lista
    public void agregar(T elemento) {
        if (esVacia()) {
            cabeza = new Nodo(elemento, null);
        } else {
            Nodo aux = cabeza;
            while (aux.getSgtNodo() != null) {
                aux = aux.getSgtNodo();                
            }
            aux.setSgtNodo(new Nodo(elemento, null));
        }
    }

    // 
    public void mostrar() {
        Nodo aux = cabeza;
        while (aux != null) {
            System.out.println(aux.getElemento());
            aux = aux.getSgtNodo();
        }
    }

}
