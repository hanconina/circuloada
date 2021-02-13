package cealgoritmos.design.greedy;

public class DevolverVuelto {
    public static void voraz(int[] c, int[] s, int p){
        int i=c.length-1;
        int aux=0;
        while (i!=0 && aux<p){ // (C <> Ø) Y NO solución(S)
            int x = i; // seleccionar(x)
            i=i-1; // C:= C - {x}
            if (c[x] <= (p-aux)){ // factible(S, x)
                int n = (p-aux) / c[x]; 
                s[x] = n; // insertar(S, x)
                aux = aux + n*c[x];
            }
        }
        if (aux<p){ // NO solución(S)
            System.out.println("No hay solución");
            return;
        }
        // Mostrar S
        for (int a : s)
            System.out.print(a+"\t");        
    }
    public static void main(String[] args) {
        int[] c = {1,2,5,10,20,50,100,200};
        int[] s = new int[8];
        voraz(c,s, 439);
    }
    
}
