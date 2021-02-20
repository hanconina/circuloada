package listasimple;

public class Lista<T> {

    // Atributo
    private Nodo<T> cabeza;

    // Operaciones
    public Lista() {
        this.cabeza = null;
    }

    // Verificar si la Lista esta vácia
    public boolean esVacia() {
        // return cabeza==null;
        if (cabeza == null) {
            return true;
        } else {
            return false;
        }
    }

    // Agregar un elemento a la Lista
    public void agregar(T elemento) {
        // Agregar un elemento en la primera posición
        if (esVacia()) {
            Nodo nuevoNodo = new Nodo(elemento, null);
            cabeza = nuevoNodo;
        } else { // Tenemos elementos
            Nodo aux = cabeza;
            while (aux.getSgtNodo() != null) {
                aux = aux.getSgtNodo();
            }
            Nodo nuevoNodo = new Nodo(elemento, null);
            aux.setSgtNodo(nuevoNodo);
        }
    }

    public void mostrar() {
        Nodo aux = cabeza;
        while (aux != null) {
            System.out.println(aux.getDato());
            aux = aux.getSgtNodo(); // Desplace el puntero            
        }
    }

    public int longitud() {
        int n = 0;
        Nodo aux = cabeza;
        while (aux != null) {
            n++;
            aux = aux.getSgtNodo(); // Desplace el puntero            
        }
        return n;
    }

    public Nodo iesimo(int pos) {
        if (pos >= 1 && pos <= longitud()) {
            int i = 1;
            Nodo aux = cabeza;
            while (aux != null) {
                if (i == pos) {
                    return aux;
                }
                i++;
                aux = aux.getSgtNodo(); // Desplace el puntero            
            }
        }
        return null;
    }

    public int ubicacion(T elemento) {
        int i = 1;
        Nodo aux = cabeza;
        while (aux != null) {
            if (aux.getDato().equals(elemento)) {
                return i;
            }
            aux = aux.getSgtNodo(); // Desplace el puntero
            i++;
        }
        return -1;
    }

    public void insertar(int pos, T elemento) {
        int n = longitud();
        if (pos >= 1 && pos <= n) {
            if (pos == 1) {
                Nodo aux = cabeza;
                cabeza = new Nodo(elemento, aux);
            } else {
                int i = 1;
                Nodo aux = cabeza;
                Nodo nodoAnterior = cabeza;
                while (i < pos) {
                    nodoAnterior = aux;
                    aux = aux.getSgtNodo();
                    i++;
                }
                Nodo nuevoNodo = new Nodo(elemento, aux);
                nodoAnterior.setSgtNodo(nuevoNodo);                
            }
        }
    }

    public void eliminar(int pos) {

    }

}
