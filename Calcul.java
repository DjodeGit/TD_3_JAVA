public class Calcul{
    static void inverse(int[] tab) {
        if (tab == null || tab.length <= 1) return;
        for (int i = 0; i < tab.length / 2; i++) {
            int temp = tab[i];
            tab[i] = tab[tab.length - 1 - i];
            tab[tab.length - 1 - i] = temp;
        }
    }
    public static void main(String[]args){
        int[] tab={3, 7, 8, 9, 10, 1};
        Calcul.inverse(tab);
        System.out.println(java.util.Arrays.toString(tab));
    }
}