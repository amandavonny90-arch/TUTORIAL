package vonny_118_fungsi_matematika_bp;
import java.util.Scanner;
public class g_Fungsi_Faktorial_118 {
    static Scanner input = new Scanner(System.in);

    // ===== Fungsi Faktorial Manual =====
    public static int faktorial(int n) {
        int hasil = 1;
        for (int i = 1; i <= n; i++) {
            hasil *= i;
        }
        return hasil;
    }

    // ===== Fungsi Permutasi =====
    public static int permutasi(int n, int r) {
        return faktorial(n) / faktorial(n - r);
    }

    // ===== Fungsi Kombinasi =====
    public static int kombinasi(int n, int r) {
        return faktorial(n) / (faktorial(r) * faktorial(n - r));
    }

    // ===== Peluang =====
    public static double peluang(int kejadian, int semesta) {
        return (double) kejadian / semesta;
    }

    // ===== Fungsi Pangkat =====
    public static double pangkat(double a, int b) {
        double hasil = 1;
        for (int i = 0; i < b; i++) {
            hasil *= a;
        }
        return hasil;
    }

    // ===== Distribusi Binomial =====
    public static double binomial(int n, int k, double p) {
        return kombinasi(n, k) * pangkat(p, k) * pangkat(1 - p, n - k);
    }


    // ===== MAIN PROGRAM =====
    public static void main(String[] args) {

        while (true) {
            System.out.println("\n========================================");
            System.out.println("     MENU PELUANG & STATISTIK LANJUTAN ");
            System.out.println("========================================");
            System.out.println("1. Hitung Permutasi (nPr)");
            System.out.println("2. Hitung Kombinasi (nCr)");
            System.out.println("3. Hitung Peluang Sederhana");
            System.out.println("4. Distribusi Binomial");
            System.out.println("5. Keluar");
            System.out.print("Pilih menu: ");
            int pilih = input.nextInt();

            if (pilih == 5) {
                System.out.println("Program selesai. Terima kasih!");
                break;
            }

            // ===== PERMUTASI =====
            if (pilih == 1) {
                System.out.print("Masukkan n: ");
                int n = input.nextInt();
                System.out.print("Masukkan r: ");
                int r = input.nextInt();

                int hasil = permutasi(n, r);

                // Tampilkan CARA PENGERJAAN
                System.out.println("\n=== CARA PENGERJAAN PERMUTASI (nPr) ===");
                System.out.println("nPr = n! / (n - r)!");
                System.out.println(n + "P" + r + " = " + n + "! / " + (n - r) + "!");
                System.out.println("      = " + faktorial(n) + " / " + faktorial(n - r));
                System.out.println("      = " + hasil);

            }

            // ===== KOMBINASI =====
            else if (pilih == 2) {
                System.out.print("Masukkan n: ");
                int n = input.nextInt();
                System.out.print("Masukkan r: ");
                int r = input.nextInt();

                int hasil = kombinasi(n, r);

                // Tampilkan CARA PENGERJAAN
                System.out.println("\n=== CARA PENGERJAAN KOMBINASI (nCr) ===");
                System.out.println("nCr = n! / (r! (n - r)!)");
                System.out.println(n + "C" + r + " = " + n + "! / (" + r + "! * " + (n - r) + "!)");
                System.out.println("       = " + faktorial(n) + " / (" + faktorial(r) + " * " + faktorial(n - r) + ")");
                System.out.println("       = " + hasil);
            }

            // ===== PELUANG =====
            else if (pilih == 3) {
                System.out.print("Masukkan jumlah kejadian: ");
                int k = input.nextInt();
                System.out.print("Masukkan jumlah semesta: ");
                int s = input.nextInt();

                double hasil = peluang(k, s);

                // Tampilkan CARA PENGERJAAN
                System.out.println("\n=== CARA PENGERJAAN PELUANG ===");
                System.out.println("P = kejadian / semesta");
                System.out.println("P = " + k + " / " + s);
                System.out.println("P = " + hasil);
            }

            // ===== BINOMIAL =====
            else if (pilih == 4) {
                System.out.print("Masukkan jumlah percobaan (n): ");
                int n = input.nextInt();
                System.out.print("Masukkan jumlah sukses (k): ");
                int k = input.nextInt();
                System.out.print("Masukkan peluang sukses (p, contoh 0,5/0,...): ");
                double p = input.nextDouble();

                double hasil = binomial(n, k, p);

                // Tampilkan CARA PENGERJAAN
                System.out.println("\n=== CARA PENGERJAAN DISTRIBUSI BINOMIAL ===");
                System.out.println("P(X = k) = nCk * p^k * (1-p)^(n-k)");
                System.out.println("nCk = " + kombinasi(n, k));
                System.out.println("p^k = " + p + "^" + k + " = " + pangkat(p, k));
                System.out.println("(1 - p)^(n - k) = " + (1 - p) + "^" + (n - k) + " = " + pangkat(1 - p, n - k));
                System.out.println("Hasil = " + hasil);
            }

            else {
                System.out.println("Menu tidak valid!");
            }
        }

        input.close();
    }
}
