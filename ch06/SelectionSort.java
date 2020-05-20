package ch06;

public class SelectionSort {
    public static void main(String[] args) {
        int[] data = {82, 12, 41, 38, 19, 26, 9, 48, 20, 55, 8, 32, 3};
        for (int i = 1; i < data.length-1; i++) {
            int max = i;
            for (int j = i; j < data.length; j++) {
                if (data[j] < data[max]) {
                    max = j;
                }
            }
            int temp = data[i];
            data[i] = data[max];
            data[max] = temp;
        }
        cetak(data);
    }
    public static void cetak(int data[]) {
        for (int i = 0; i < data.length; i++) {
            System.out.print(data[i] + "  ");
        }
    }
}
