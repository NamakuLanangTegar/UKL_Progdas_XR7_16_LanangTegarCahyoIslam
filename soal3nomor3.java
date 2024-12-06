public class soal3nomor3 {
    public static void main(String[] args) {
        int[] array = {1, 1, 1, 1, 2, 2, 2, 2, 2, 3, 3, 3, 4};

        for (int i = 0; i < array.length; i++) {
            boolean sudahDihitung = false;
            for (int j = 0; j < i; j++) {
                if (array[i] == array[j]) {
                    sudahDihitung = true;
                }
            }

            if (sudahDihitung) continue;

            int frekuensi = 0;
            for (int j = 0; j < array.length; j++) {
                if (array[i] == array[j]) {
                    frekuensi++;
                }
            }

            System.out.println(array[i] + " muncul " + frekuensi + " kali");
        }
    }
}
