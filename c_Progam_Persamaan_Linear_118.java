package vonny_118_fungsi_matematika_bp;
import java.util.Scanner;
public class c_Progam_Persamaan_Linear_118 {
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {

        while (true) {
            System.out.println("===============================");
            System.out.println("     PROGRAM PERSAMAAN LINEAR");
            System.out.println("===============================");
            System.out.println("1. SPL 2 Variabel (x, y)");
            System.out.println("2. SPL 3 Variabel (x, y, z)");
            System.out.println("3. Keluar");
            System.out.print("Pilih jenis SPL: ");
            int pilih = input.nextInt();

            if (pilih == 1) menuSPL2();
            else if (pilih == 2) menuSPL3();
            else if (pilih == 3) {
                System.out.println("Program selesai. Terima kasih!");
                break;
            } else {
                System.out.println("Pilihan tidak valid!");
            }

        }
    }

    // ================================
    //       MENU 2 VARIABEL
    // ================================
    static void menuSPL2() {
        System.out.println("\n=== PILIH METODE SPL 2 VARIABEL ===");
        System.out.println("1. Substitusi");
        System.out.println("2. Eliminasi");
        System.out.print("Pilih metode: ");
        int m = input.nextInt();

        double x1, y1, c1, x2, y2, c2;

        System.out.println("\nMasukkan koefisien persamaan:");
        System.out.println("Persamaan 1: x1*x + y1*y = c1");
        System.out.println("Persamaan 2: x2*x + y2*y = c2");

        System.out.print("x1: "); x1 = input.nextDouble();
        System.out.print("y1: "); y1 = input.nextDouble();
        System.out.print("c1: "); c1 = input.nextDouble();

        System.out.print("x2: "); x2 = input.nextDouble();
        System.out.print("y2: "); y2 = input.nextDouble();
        System.out.print("c2: "); c2 = input.nextDouble();

        // ============================
        //        SUBSTITUSI
        // ============================
        if (m == 1) {
            System.out.println("\n=== METODE SUBSTITUSI ===");

            System.out.println("\n1) Nyatakan x dari Persamaan 1:");
            System.out.println("   x = (c1 - y1*y) / x1");

            System.out.println("\n2) Substitusi x ke Persamaan 2:");
            double A = y2 + (x2 * (y1 / x1));
            double B = c2 - (x2 * (c1 / x1));

            System.out.println("   " + A + "y = " + B);

            double y = B / A;
            double x = (c1 - y1 * y) / x1;

            System.out.println("\n=== HASIL ===");
            System.out.println("x = " + x);
            System.out.println("y = " + y);
        }

        // ============================
        //         ELIMINASI
        // ============================
        else if (m == 2) {
            System.out.println("\n=== METODE ELIMINASI ===");

            System.out.println("\n1) Hilangkan variabel x:");
            double k = x1 / x2;

            double yBaru = y1 - k * y2;
            double cBaru = c1 - k * c2;

            System.out.println("   Hasil: " + yBaru + "y = " + cBaru);

            double y = cBaru / yBaru;
            double x = (c1 - y1 * y) / x1;

            System.out.println("\n=== HASIL ===");
            System.out.println("x = " + x);
            System.out.println("y = " + y);
        }

        else {
            System.out.println("Pilihan tidak valid!");
        }
    }

    // ================================
    //       MENU 3 VARIABEL
    // ================================
    static void menuSPL3() {
        System.out.println("\n=== METODE ELIMINASI SPL 3 VARIABEL ===");

        double x1, y1, z1, c1;
        double x2, y2, z2, c2;
        double x3, y3, z3, c3;

        System.out.println("\nMasukkan koefisien:");

        System.out.print("x1: "); x1 = input.nextDouble();
        System.out.print("y1: "); y1 = input.nextDouble();
        System.out.print("z1: "); z1 = input.nextDouble();
        System.out.print("c1: "); c1 = input.nextDouble();

        System.out.print("x2: "); x2 = input.nextDouble();
        System.out.print("y2: "); y2 = input.nextDouble();
        System.out.print("z2: "); z2 = input.nextDouble();
        System.out.print("c2: "); c2 = input.nextDouble();

        System.out.print("x3: "); x3 = input.nextDouble();
        System.out.print("y3: "); y3 = input.nextDouble();
        System.out.print("z3: "); z3 = input.nextDouble();
        System.out.print("c3: "); c3 = input.nextDouble();

        System.out.println("\n=== PROSES ELIMINASI ===");

        System.out.println("\n1) Hilangkan x dari P2 & P3...");
        double k21 = x2 / x1;
        double k31 = x3 / x1;

        double y2b = y2 - k21 * y1;
        double z2b = z2 - k21 * z1;
        double c2b = c2 - k21 * c1;

        double y3b = y3 - k31 * y1;
        double z3b = z3 - k31 * z1;
        double c3b = c3 - k31 * c1;

        System.out.println("   P2 baru: 0x + " + y2b + "y + " + z2b + "z = " + c2b);
        System.out.println("   P3 baru: 0x + " + y3b + "y + " + z3b + "z = " + c3b);

        System.out.println("\n2) Hilangkan y dari P3 baru...");
        double k32 = y3b / y2b;

        double z3c = z3b - k32 * z2b;
        double c3c = c3b - k32 * c2b;

        System.out.println("   P3 akhir: 0y + " + z3c + "z = " + c3c);

        double z = c3c / z3c;
        double y = (c2b - z2b * z) / y2b;
        double x = (c1 - y1 * y - z1 * z) / x1;

        System.out.println("\n=== HASIL ===");
        System.out.println("x = " + x);
        System.out.println("y = " + y);
        System.out.println("z = " + z);
    }
}
