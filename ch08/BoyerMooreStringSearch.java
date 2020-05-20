package ch08;

public class BoyerMooreStringSearch {
    public static void main(String[] abc) {
        System.out.println("mencoba BMSS = ");
        test("abc","a",0);
        test("abc","b",1);
        test("abc","c",2);
        test("abc","d", -1);
        test("catdog","tdo",2);
        test("ratatat","at",1);
        test("goo"," ",0);
        test(" ","ber",-1);

    }
    public static void test(String text, String word,int exp){
        char[]textC = text.toCharArray();
        char[]wordC = word.toCharArray();
        int hasil = 0;
        if (hasil == exp)
            System.out.println("lewat");
        else {
            System.out.println("gagal");
            System.out.println("\ttext: " + text);
            System.out.println("\tword: " + word);
            System.out.println("\texp: " + exp);
        }
    }
}
