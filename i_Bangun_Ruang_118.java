package vonny_118_fungsi_matematika_bp;
import java.util.Scanner;
public class i_Bangun_Ruang_118 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        while (true) {
            System.out.println("\n===============================");
            System.out.println("        BANGUN RUANG");
            System.out.println("===============================");
            System.out.println("1. Kubus");
            System.out.println("2. Balok");
            System.out.println("3. Limas Segitiga");
            System.out.println("4. Tabung");
            System.out.println("5. Keluar");
            System.out.print("Pilih bangun ruang (1-5): ");
            int pilihan = input.nextInt();

            if (pilihan == 5) {
                System.out.println("Terima kasih. Program selesai.");
                break;
            }

            if (pilihan == 1) {
                System.out.print("Masukkan sisi kubus: ");
                double s = input.nextDouble();
                System.out.println("Volume Kubus = " + (s*s*s));
                System.out.println("Luas Permukaan Kubus = " + (6*s*s));
            } else if (pilihan == 2) {
                System.out.print("Masukkan panjang: ");
                double p = input.nextDouble();
                System.out.print("Masukkan lebar: ");
                double l = input.nextDouble();
                System.out.print("Masukkan tinggi: ");
                double t = input.nextDouble();
                System.out.println("Volume Balok = " + (p*l*t));
                System.out.println("Luas Permukaan Balok = " + (2*(p*l + p*t + l*t)));
            } else if (pilihan == 3) {
                System.out.print("Masukkan luas alas: ");
                double la = input.nextDouble();
                System.out.print("Masukkan tinggi limas: ");
                double t = input.nextDouble();
                System.out.println("Volume Limas Segitiga = " + (1.0/3*la*t));
            } else if (pilihan == 4) {
                System.out.print("Masukkan jari-jari: ");
                double r = input.nextDouble();
                System.out.print("Masukkan tinggi: ");
                double t = input.nextDouble();
                System.out.println("Volume Tabung = " + (3.1416*r*r*t));
                System.out.println("Luas Permukaan Tabung = " + (2*3.1416*r*(r+t)));
            } else {
                System.out.println("Pilihan tidak valid!");
            }
        }

        input.close();
    }
}

