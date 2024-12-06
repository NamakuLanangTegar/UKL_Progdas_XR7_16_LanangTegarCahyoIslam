import java.util.Random;
import java.util.Scanner;

public class soal2nomor3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        boolean keepPlaying = true;

        System.out.println("Ayo main Kuis Matematika dengan Double!");
        System.out.println("Ketik 'capek' kapan aja buat akhirin kuis.");

        while (keepPlaying) {
            double num1 = random.nextInt(10) + 1;
            double num2 = random.nextInt(10) + 1;
            int operator = random.nextInt(3);

            String operatorSymbol;
            double correctAnswer;

            switch (operator) {
                case 0:
                    operatorSymbol = "*";
                    correctAnswer = num1 * num2;
                    break;
                case 1:
                    operatorSymbol = "/";
                    correctAnswer = num1 / num2;
                    break;
                case 2:
                    operatorSymbol = "%";
                    correctAnswer = num1 % num2;
                    break;
                default:
                    throw new IllegalStateException("Operator ga valid!");
            }

            System.out.printf("%.2f %s %.2f = ?%n", num1, operatorSymbol, num2);

            String userInput = scanner.nextLine();

            if (userInput.equalsIgnoreCase("capek")) {
                keepPlaying = false;
                System.out.println("Makasi udah main!");
                break;
            }

            try {
                double userAnswer = Double.parseDouble(userInput);

                if (Math.abs(userAnswer - correctAnswer) < 0.0001) {
                    System.out.println("Bener nih!");
                } else {
                    System.out.printf("Salah! Yang bener tuh %.2f.%n", correctAnswer);
                }
            } catch (NumberFormatException e) {
                System.out.println("Masukin angka yang valid ya!");
            }
        }

        scanner.close();
    }
}
