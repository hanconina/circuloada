
package listasimple;

public class AppLista {
    public static void main(String[] args) {
        Lista<String> lista = new Lista();
        lista.agregar("20.4");
        lista.agregar("23.5");
        lista.agregar("2.5");
        lista.agregar("23.7");
        lista.agregar("4.7");
        
        lista.mostrar();
    }
    
}
