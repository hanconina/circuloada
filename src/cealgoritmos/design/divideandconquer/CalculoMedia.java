package cealgoritmos.design.divideandconquer;


public class CalculoMedia {

    public static double mediaMet1(int[] a) {
        double suma = 0;
        int n = a.length;
        for (int i = 0; i < n; i++) {
            suma += a[i];
        }
        return suma / n;
    }

    public static double mediaMet2(int[] a) {
        int p = 0;
        int q = a.length-1;
        return mediaDV(a, p, q);
    }

    public static double mediaDV(int[] a, int p, int q) {
        if (p==q) {
            return a[p];
        } else {
            int m = (p+q)/2;
            double med1 = mediaDV(a, p, m);
            double med2 = mediaDV(a, m + 1, q);
            return (med1 + med2) / 2;
        }
    }

    public static void main(String[] args) {

        int[] a = {2, 4, 8, 1, 8, 4, 5, 6};
        
        System.out.println("Calcular la Media metodo 1: " + mediaMet1(a));
        System.out.println("Calcular la Media metodo 2: "
                + mediaMet2(a));

    }

}
