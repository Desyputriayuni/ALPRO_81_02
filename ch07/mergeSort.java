package ch07;

public class mergeSort {
    private int[] data;

    public mergeSort(int n){
        this.data = new int[n];
    }

    public void setData(int index, int value ) {
        if (index >= 0 && index < this.data.length){
            this.data[index] = value;

        }
    }

    public void printData() {
        String out = "Data array = ";
        for (int a = 0; a < this.data.length; a++){
            out += this.data[a] + ", ";

        }
        System.out.println(out);

    }
    public void sort(){
        int i = 0;
        int j = this.data.length -1;

        mergeSort(i,j);
    }
    private void mergeSort(int start,int end){
        int n = (end - start + 1);

        if (n > 1){
            int med = (start + end) / 2;
            mergeSort(start,med);
            mergeSort(med + 1, end);

            int[] temp = new int[n];
            int x = start;
            int y = med + 1;

            for (int a = 0; a < n; a++){
                if (x <= med && y <= end){
                    if (this.data[x] < this.data[y]){
                        temp [a] = this.data[x];
                        x++;

                    }else {
                        temp[a] =this.data[y];
                        y++;
                    }
                }else if (x <= med){
                    temp[a] = this.data[x];
                    x++;

                }else {
                    temp[a] = this.data[y];
                    y++;
                }
            }
            for (int a = 0; a < n; a++){
                this.data[start + a] = temp[a];

            }
        }
    }
    private void ort(int start,int med){

    }

    public static void main(String[] args) {
        mergeSort sc =new mergeSort(13);

        sc.setData(0,82);
        sc.setData(1,12);
        sc.setData(2,41);
        sc.setData(3,38);
        sc.setData(4,19);
        sc.setData(5,26);
        sc.setData(6,9);
        sc.setData(7,48);
        sc.setData(8,20);
        sc.setData(9,55);
        sc.setData(10,8);
        sc.setData(11,32);
        sc.setData(12,3);

        sc.printData();
        sc.sort();
        sc.printData();

    }
}
