import java.util.Scanner;

public class soal3nomor1 {
    public static void main(String[] args) {
        int jmlhSiswa, nilai=0, totalNilai = 0;
        double rerata;
        Scanner s = new Scanner(System.in);
        System.out.println("Inputkan jumlah siswa: ");
        jmlhSiswa = s.nextInt();

        for (int i = 1; i <= jmlhSiswa; i++) {
            System.out.println("Inputkan nilai siswa ke-"+i+": ");
            nilai = s.nextInt();
            totalNilai += nilai;
        }
            rerata = totalNilai/jmlhSiswa;
            System.out.println("Jumlah siswa: "+jmlhSiswa);
            System.out.println("Total nilai: "+totalNilai);
            System.out.println("Rata-rata: "+rerata);
            s.close();
    }
}