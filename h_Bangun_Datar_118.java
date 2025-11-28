package vonny_118_fungsi_matematika_bp;
import java.util.Scanner;
public class h_Bangun_Datar_118 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        while (true) {
            System.out.println("\n===============================");
            System.out.println("        BANGUN DATAR");
            System.out.println("===============================");
            System.out.println("1. Persegi");
            System.out.println("2. Persegi Panjang");
            System.out.println("3. Segitiga");
            System.out.println("4. Lingkaran");
            System.out.println("5. Keluar");
            System.out.print("Pilih bangun datar (1-5): ");
            int pilihan = input.nextInt();

            if (pilihan == 5) {
                System.out.println("Terima kasih. Program selesai.");
                break;
            }

            if (pilihan == 1) {
                System.out.print("Masukkan sisi persegi: ");
                double s = input.nextDouble();
                System.out.println("Luas Persegi = " + (s * s));
                System.out.println("Keliling Persegi = " + (4 * s));

            } else if (pilihan == 2) {
                System.out.print("Masukkan panjang: ");
                double p = input.nextDouble();
                System.out.print("Masukkan lebar: ");
                double l = input.nextDouble();
                System.out.println("Luas Persegi Panjang = " + (p * l));
                System.out.println("Keliling Persegi Panjang = " + (2 * (p + l)));

            } else if (pilihan == 3) {
                System.out.print("Masukkan alas: ");
                double a = input.nextDouble();
                System.out.print("Masukkan tinggi: ");
                double t = input.nextDouble();
                System.out.println("Luas Segitiga = " + (0.5 * a * t));

            } else if (pilihan == 4) {
                System.out.print("Masukkan jari-jari: ");
                double r = input.nextDouble();
                System.out.println("Luas Lingkaran = " + (3.1416 * r * r));
                System.out.println("Keliling Lingkaran = " + (2 * 3.1416 * r));

            } else {
                System.out.println("Pilihan tidak valid!");
            }
        }

        input.close();
    }
}

