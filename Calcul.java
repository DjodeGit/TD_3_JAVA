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
        if (a.length != b.length || c.length != n || n == 0) return;
        for(int i=0; i<a.length;i++){
            for(int j=0;j<b.length;j++){
                c[i][j]=a[i][j]+b[i][j];
            }
        }
    }
    public static void main(String[]args){
        float[][] c = new float[2][3];  // Matrice résultat, initialisée à 0
        int[] tab = {3, 7, 8, 9, 10, 1};  // OK pour inverse (1D int[])
        float[][] tab1 = {{3.0f, 7.0f, 8.0f}, {9.0f, 10.0f, 1.0f}};  // 2D float, 2 lignes x 3 colonnes
        float[][] tab2 = {{1.0f, 2.0f, 3.0f}, {4.0f, 5.0f, 6.0f}};  // Même taille
        Calcul.inverse(tab);
        sum1(c, tab1, tab2);
        System.out.println(java.util.Arrays.toString(tab));
        System.out.println("Matrice C (tab1 + tab2) :");
        System.out.println(Arrays.deepToString(c));
    }
}