
package listasimple;

public class AppLista {
    public static void main(String[] args) {
        Lista<Integer> lista = new Lista();
        lista.agregar(20);
        lista.agregar(23);
        lista.agregar(2);
        lista.agregar(23);
        lista.agregar(4);
        
        lista.mostrar();
    }
    
}
