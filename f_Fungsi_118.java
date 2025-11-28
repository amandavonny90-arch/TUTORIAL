package vonny_118_fungsi_matematika_bp;
import java.util.Scanner;
public class f_Fungsi_118 {
    static Scanner input = new Scanner(System.in);  
    public static void main(String[] args) {

        while (true) {
            System.out.println("========================================");
            System.out.println("      PERHITUNGAN FUNGSI MATEMATIKA");
            System.out.println("=====================================");
            System.out.println("1. Fungsi Kuadrat (f(x) = a*x^2 + b*x + c)");
            System.out.println("2. Fungsi Polinomial Kubik (f(x) = a*x^3 + b*x^2 + c*x + d)");
            System.out.println("3. Keluar");
            System.out.print("Pilih jenis fungsi (1 / 2 / 3): ");
            int pilihan = input.nextInt();

            if (pilihan == 3) {
                System.out.println("Program selesai.");
                break;
            }

            //===========================
            //    PANGGIL METODE
            //===========================

            if (pilihan == 1) {
                hitungKuadrat();  // metode kuadrat
            }
            else if (pilihan == 2) {
                hitungPolinomial(); // metode polinomial kubik
            }
            else {
                System.out.println("Pilihan tidak valid.");
            }
        }

        input.close();
    }

    //====================================
    //   METODE MENGHITUNG FUNGSI KUADRAT
    //====================================
    public static void hitungKuadrat() {
        System.out.print("Masukkan nilai a: ");
        double a = input.nextDouble();
        System.out.print("Masukkan nilai b: ");
        double b = input.nextDouble();
        System.out.print("Masukkan nilai c: ");
        double c = input.nextDouble();

        System.out.println("\nMenghitung f(x) = " + a + "x^2 + " + b + "x + " + c);
        System.out.println("X\tf(X)");

        for (int x = -5; x <= 5; x++) {
            double y = a * x * x + b * x + c;
            System.out.println(x + "\t" + y);
        }
    }

    //============================================
    //   METODE MENGHITUNG FUNGSI POLINOMIAL KUBIK
    //============================================
    public static void hitungPolinomial() {
        System.out.print("Masukkan nilai a: ");
        double a = input.nextDouble();
        System.out.print("Masukkan nilai b: ");
        double b = input.nextDouble();
        System.out.print("Masukkan nilai c: ");
        double c = input.nextDouble();
        System.out.print("Masukkan nilai d: ");
        double d = input.nextDouble();

        System.out.println("\nMenghitung f(x) = " + a + "x^3 + " + b + "x^2 + " + c + "x + " + d);
        System.out.println("X\tf(X)");

        for (int x = -5; x <= 5; x++) {
            double y = a * x * x * x + b * x * x + c * x + d;
            System.out.println(x + "\t" + y);
        }
    }
}
