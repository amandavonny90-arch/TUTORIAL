package vonny_118_fungsi_matematika_bp;
import java.util.Scanner;
public class e_Pecahan_Desimal_Persen_118 {
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        
        while (true) {
            System.out.println("\n===============================");
            System.out.println("      PECAHAN & DESIMAL");
            System.out.println("===============================");
            System.out.println("1. Penjumlahan Pecahan");
            System.out.println("2. Pengurangan Pecahan");
            System.out.println("3. Perkalian Pecahan");
            System.out.println("4. Pembagian Pecahan");
            System.out.println("5. Konversi Desimal ke Persen");
            System.out.println("6. Konversi Persen ke Desimal");
            System.out.println("7. Keluar");
            System.out.print("Pilih operasi (1-7): ");
            int pilihan = input.nextInt();

            if (pilihan == 7) {
                System.out.println("Terima kasih. Program selesai.");
                break;
            }

            if (pilihan >= 1 && pilihan <= 4) {
                // Input pecahan
                System.out.print("Masukkan pembilang pecahan pertama: ");
                int pembilang1 = input.nextInt();
                System.out.print("Masukkan penyebut pecahan pertama: ");
                int penyebut1 = input.nextInt();
                System.out.print("Masukkan pembilang pecahan kedua: ");
                int pembilang2 = input.nextInt();
                System.out.print("Masukkan penyebut pecahan kedua: ");
                int penyebut2 = input.nextInt();

                double frac1 = (double)pembilang1 / penyebut1;
                double frac2 = (double)pembilang2 / penyebut2;
                double hasil = 0;

                if (pilihan == 1) hasil = frac1 + frac2;
                else if (pilihan == 2) hasil = frac1 - frac2;
                else if (pilihan == 3) hasil = frac1 * frac2;
                else if (pilihan == 4) {
                    if (frac2 == 0) {
                        System.out.println("Kesalahan: Pembagian dengan nol!");
                        continue;
                    }
                    hasil = frac1 / frac2;
                }

                System.out.println("Hasil: " + hasil);
            } 
            else if (pilihan == 5) {
                System.out.print("Masukkan angka desimal: ");
                double desimal = input.nextDouble();
                System.out.println(desimal + " = " + (desimal * 100) + "%");
            } 
            else if (pilihan == 6) {
                System.out.print("Masukkan persen (%): ");
                double persen = input.nextDouble();
                System.out.println(persen + "% = " + (persen / 100));
            } 
            else {
                System.out.println("Pilihan tidak valid! Silakan pilih 1-7.");
            }
        }

        input.close();
    }
}
    
