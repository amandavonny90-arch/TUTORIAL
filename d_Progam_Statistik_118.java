package vonny_118_fungsi_matematika_bp;
import java.util.Scanner;
public class d_Progam_Statistik_118 {
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {

        System.out.println("PROGRAM STATISTIK MANUAL");
        System.out.print("Masukkan jumlah data: ");
        int n = input.nextInt();

        int[] data = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Masukkan data ke-" + (i + 1) + ": ");
            data[i] = input.nextInt();
        }

        // -------------------------------
        // Hitung jumlah & rata-rata
        // -------------------------------
        int total = 0;
        int i = 0;
        while (i < n) {
            total += data[i];
            i++;
        }
        double mean = (double) total / n;

        // -------------------------------
        // Bubble Sort untuk Median & Modus
        // -------------------------------
        i = 0;
        while (i < n - 1) {
            int j = 0;
            while (j < n - 1 - i) {
                if (data[j] > data[j + 1]) {
                    int temp = data[j];
                    data[j] = data[j + 1];
                    data[j + 1] = temp;
                }
                j++;
            }
            i++;
        }

        // -------------------------------
        // Median
        // -------------------------------
        double median;
        if (n % 2 == 1) {
            median = data[n / 2];
        } else {
            median = (data[(n/2)-1] + data[n/2]) / 2.0;
        }

        // -------------------------------
        // Modus
        // -------------------------------
        int modus = data[0];
        int maxCount = 1;

        i = 0;
        while (i < n) {
            int count = 1;
            int j = i + 1;
            while (j < n && data[j] == data[i]) {
                count++;
                j++;
            }
            if (count > maxCount) {
                maxCount = count;
                modus = data[i];
            }
            i = j;
        }

        // -------------------------------
        // Nilai Maksimum & Minimum
        // -------------------------------
        int max = data[0];
        int min = data[0];
        i = 1;
        while (i < n) {
            if (data[i] > max) {
                max = data[i];
            }
            if (data[i] < min) {
                min = data[i];
            }
            i++;
        }

        // -------------------------------
        // Output hasil
        // -------------------------------
        System.out.println("\n=== HASIL STATISTIK ===");
        System.out.println("Data (terurut): ");
        i = 0;
        while (i < n) {
            System.out.print(data[i] + " ");
            i++;
        }
        System.out.println("\nJumlah data: " + total);
        System.out.println("Rata-rata (Mean): " + mean);
        System.out.println("Median: " + median);
        System.out.println("Modus: " + modus);
        System.out.println("Nilai maksimum: " + max);
        System.out.println("Nilai minimum: " + min);

        input.close();
    }
}
    