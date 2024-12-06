import java.util.Scanner;

public class soal2nomor2 {
    public static double hitungVolumeTabung(double jariJari, double tinggi) {
        return Math.PI * (jariJari*jariJari) * tinggi;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan jari-jari tabung (r): ");
        double jariJari = input.nextDouble();

        System.out.print("Masukkan tinggi tabung (t): ");
        double tinggi = input.nextDouble();

        double volume = hitungVolumeTabung(jariJari, tinggi);

        System.out.println("Volume tabung adalah: " + volume);

        input.close();
    }
}