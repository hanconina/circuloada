
package listasimple;

public class AppLista {
    public static void main(String[] args) {
        Lista<String> lista = new Lista<String>();
        lista.agregar("20.4");
        lista.agregar("23.5");
        lista.agregar("2.5");
        lista.agregar("23.7");
        lista.agregar("4.7");
        lista.mostrar();
        System.out.println("Longirud: "+lista.longitud());
        if (lista.iesimo(5)!=null){
            System.out.println("Iesimo: "+lista.iesimo(5).getDato());
        }
        System.out.println("Ubicación: "+lista.ubicacion("20."));
        System.out.println("Insertar");
        lista.insertar(6, "a");
        lista.mostrar();
    }
    
}
