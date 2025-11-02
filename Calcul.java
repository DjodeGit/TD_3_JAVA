import java.util.Arrays;
public class Calcul{
    static void inverse(int[] tab) {
        if (tab == null || tab.length <= 1) return;
        for (int i = 0; i < tab.length / 2; i++) {
            int temp = tab[i];
            tab[i] = tab[tab.length - 1 - i];
            tab[tab.length - 1 - i] = temp;
        }
    }
    static void sum1(float[][] c, float[][] a, float[][] b){
        int n = a.length;
        if (a.length != b.length || c.length != n || n == 0 || a[0].length != b[0].length || a[0].length != c[0].length) return;
        for(int i=0; i<a.length;i++){
            for(int j=0;j < a[0].length;j++){
                c[i][j]=a[i][j]+b[i][j];
            }
        }
    }
    static float[][] sum2(float[][] a, float[][]b){
        if(a.length!=b.length || a.length==0 || a[0].length != b[0].length) return null;
        float [][] c=new float[a.length][a[0].length];
        sum1(c,a,b);
        return c;
    }
    /*float[][] sum3(float[][] a, float[][]b){
        float [][] c=new float[a.length][a.length];
        if(a.length!=b.length || a.length==0) return null;
        for(int i=0; i<a.length;i++){
           for(int j=0;j<b.length;j++){
               c[i][j]=a[i][j]+b[i][j];
           }
        }
        return c;
    }*/
    static void prod1(float[][] c, float[][] a, float[][] b){
        if(a.length==0 || b.length==0 || c.length==0 || a[0].length != b.length || c.length != a.length || c[0].length != b[0].length) return;
        for(int i=0;i<a.length;i++){
            for(int j=0;j < b[0].length;j++){
                c[i][j]=0;
                for(int k=0;k<a[0].length;k++){
                    c[i][j]+=a[i][k]*b[k][j];
                }
            }
        }
    }
    static float[][] prod2(float[][] a, float[][]b){
        if(a.length==0 || b.length==0 || a[0].length != b.length) return null;
        int n=a.length;
        int m=b[0].length;
        float [][]c=new float[n][m];
        prod1(c,a,b);
        return c;
    }
    public static void main(String[]args){
        float[][] c = new float[2][3]; // Pour sum
        int[] tab = {3, 7, 8, 9, 10, 1};
        float[][] tab1 = {{3.0f, 7.0f, 8.0f}, {9.0f, 10.0f, 1.0f}}; // 2x3
        float[][] tab2 = {{1.0f, 2.0f, 3.0f}, {4.0f, 5.0f, 6.0f}}; // 2x3
        float[][] tab3 = {{1.0f, 4.0f}, {2.0f, 5.0f}, {3.0f, 6.0f}}; // 3x2 pour multiplication avec tab1
        float[][] e = new float[2][2]; // Pour prod1 (2x2 résultat)
        
        Calcul.inverse(tab);
        sum1(c, tab1, tab2);
        float[][] d=Calcul.sum2(tab1,tab2);
        prod1(e, tab1, tab3);
        float[][] f=Calcul.prod2(tab1, tab3);
        
        System.out.println("Tableau D (sum2) : " + Arrays.deepToString(d));
        System.out.println(java.util.Arrays.toString(tab));
        System.out.println("Matrice C (tab1 + tab2) :");
        System.out.println(Arrays.deepToString(c));
        System.out.println("Matrice E (prod1 tab1 * tab3) :");
        System.out.println(Arrays.deepToString(e));
        System.out.println("Matrice F (prod2 tab1 * tab3) :");
        System.out.println(Arrays.deepToString(f));
    }
}