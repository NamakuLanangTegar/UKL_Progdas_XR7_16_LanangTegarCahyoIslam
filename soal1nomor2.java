import java.util.Scanner;

public class soal1nomor2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Inputkan angka: ");
        int t = s.nextInt();
        if (t%2==0) {
            System.out.println(t+" adalah angka genap");
        } else {
            System.out.println(t+" adalah angka ganjil");
        }
        s.close();
    }
}