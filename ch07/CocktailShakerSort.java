package ch07;

public class CocktailShakerSort {
    private CocktailShakerSort(int[] array) {
        int n = array.length;
        for (int i = 1; i < n; i++) {
            int key = array[i];
            int j = i - 1;
            while ((j > -1) && (array[j] > key)) {
                array[j + 1] = array[j];
                j--;
            }
            array[j + 1] = key;
        }
    }
    private int[] array;

    public static void main(String[] args) {
        int[] array = {82, 12, 41, 38, 19, 26, 9, 48, 20, 55, 8, 32, 3};

        //mengurutkan array menggunakan CoctailShakerSort
        System.out.println("sebelum diurutkan CocktailShakerSort = ");
        for (int j : array) {
            System.out.print(j + " ");
        }
        System.out.println();
        new CocktailShakerSort(array);
        // pilih array menggunakan merge sort
        System.out.println("setelah dipilih CocktailShakerSort = ");
        for (int j : array) {
            System.out.print(j + " ");
        }
    }
}
