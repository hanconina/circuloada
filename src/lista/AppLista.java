package lista;

public class AppLista {
    public static void main(String[] args) {
        Lista<String> lista = new Lista<String>();
        lista.agregar("r");
        lista.agregar("s");
        lista.agregar("d");
        lista.agregar("e");
        lista.agregar("p");
        
        lista.mostrar();
    }
    
}
