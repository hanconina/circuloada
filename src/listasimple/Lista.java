
package listasimple;
public class Lista <T extends Comparable>{
    // Atributo
    private Nodo cabeza;  
    // Operaciones
    public Lista(){
        this.cabeza = null;
    }
    // Verificar si la Lista esta vácia
    public boolean esVacia(){
        // return cabeza==null;
        if (cabeza==null){
            return true;
        }else{
            return false;
        }            
    }
    // Agregar un elemento a la Lista
    public void agregar(T elemento){
        // Agregar un elemento en la primera posición
        if (esVacia()){
            Nodo nuevoNodo = new Nodo(elemento,null);
            cabeza = nuevoNodo;
        }else{ // Tenemos elementos
            Nodo aux = cabeza;
            while (aux.getSgtNodo() != null){
               aux = aux.getSgtNodo();
            }
            Nodo nuevoNodo = new Nodo(elemento,null);
            aux.setSgtNodo(nuevoNodo);
        }        
    }
    public void mostrar(){
        Nodo aux = cabeza;
        while (aux!=null){
            System.out.println(aux.getDato());
            aux = aux.getSgtNodo(); // Desplace el puntero            
        }
    }
    
    public int lonitud(){
        int n = 0;
        Nodo aux = cabeza;
        while (aux!=null){
            n++;
            aux = aux.getSgtNodo(); // Desplace el puntero            
        }
        return n;
    }
    
    public T iesimo(int pos){
        return null;
    }
    
    public int ubicacion(T elemento){
        return 0;
    }
    
    public void insertar(int pos, T elemento){
        
    }
    
    public void eliminar(int pos){
        
    }
    
}
