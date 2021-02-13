package cealgoritmos.design.programdinamic;

public class DevolverVuelto {

    private double[][] d;
    private int[] n;
    private int p;
    
    /*

    public DevolverVuelto(int[] n, int p) {
        this.n = n;
        this.p = p;
        this.d = new double[n.length][p + 1];
        for (int i = 0; i < n.length; i++) {
            d[i][0] = 0;
        }
        int k=1;
        int q=1;
        for (int i = 1; i <= n.length; i++) {
            for (int j = 1; j <= p; j++) {
                // D[i-1,j]
                k=u-1;
                q=v;
                if (q==0){
                    d[u][v]=0;
                }else{
                    if (k<=0 && q<0){
                        d[u][v]=Double.MAX_VALUE;
                    }else{
                        
                    }
                }
                k++;
                q++;
                
                    

                double a = 0;
                if (i - 1 < 0) {
                    a = d[i - 1][j];
                } else {
                    a = d[i - 1][j];
                }

                int r = j - n[i - 1];
                double b = 0;
                if (r < 0) {
                    b = Double.MAX_VALUE;
                } else {
                    b = 1 + d[i][r];
                }
                d[i][j] = Math.min(a, b);
            }
        }

    }

    public double cambio(int k, int q) {

//                int[] x = new int[n.length];
//                int u=n.length;
//                int v=p;
//                while(u!=0 && v!=0){
//                    if (d[u][v]==d[u-1][v]){
//                        u=u-1;
//                    }else{
//                        x[u-1]=x[u-1]+1;
//                        v=v-n[u-1];
//                    }
//                }
        for (int i = 0; i <= n.length; i++) {
            for (int j = 0; j <= p; j++) {
                System.out.print(d[i][j] + "\t");
            }
            System.out.println();
        }
        return d[n.length][p];
    }
    public static void main(String[] args) {
        int[] n = {1, 4, 6};
        int p = 8;
        DevolverVuelto dv = new DevolverVuelto(n, p);
        System.out.println("Monedas: " + dv.cambio(p, p));
    }
*/

}
