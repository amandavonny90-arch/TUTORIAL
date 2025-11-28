package vonny_118_fungsi_matematika_bp;
import java.util.Scanner;
public class a_Aritmatika_Dasar_118 {
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        
       while (true) {
            System.out.println("\n===============================");
            System.out.println("       ARITMATIKA DASAR");
            System.out.println("===============================");
            System.out.println("1. Penjumlahan");
            System.out.println("2. Pengurangan");
            System.out.println("3. Perkalian");
            System.out.println("4. Pembagian");
            System.out.println("5. Keluar");
            System.out.print("Pilih operasi (1-5): ");
            int pilihan = input.nextInt();

            if (pilihan == 5) {
                System.out.println("Terima kasih. Program selesai.");
                break;
            }

            System.out.print("Berapa banyak angka yang ingin dimasukkan? ");
            int jumlah = input.nextInt();

            // Array untuk menampung angka
            double[] angka = new double[jumlah];

            // Input data
            for (int i = 0; i < jumlah; i++) {
                System.out.print("Masukkan angka ke-" + (i + 1) + ": ");
                angka[i] = input.nextDouble();
            }

            double hasil = angka[0]; // mulai dari angka pertama

            // Proses perhitungan
            if (pilihan == 1) {  
                // Penjumlahan
                hasil = 0;
                for (double nilai : angka) {
                    hasil += nilai;
                }
                System.out.println("Hasil penjumlahan = " + hasil);

            } else if (pilihan == 2) { 
                // Pengurangan 
                for (int i = 1; i < jumlah; i++) {
                    hasil -= angka[i];
                }
                System.out.println("Hasil pengurangan = " + hasil);

            } else if (pilihan == 3) { 
                // Perkalian
                hasil = 1;
                for (double nilai : angka) {
                    hasil *= nilai;
                }
                System.out.println("Hasil perkalian = " + hasil);

            } else if (pilihan == 4) { 
                // Pembagian 
                boolean valid = true;
                for (int i = 1; i < jumlah; i++) {
                    if (angka[i] == 0) {
                        System.out.println("Kesalahan: Tidak bisa membagi dengan nol!");
                        valid = false;
                        break;
                    }
                    hasil /= angka[i];
                }
                if (valid) {
                    System.out.println("Hasil pembagian = " + hasil);
                }

            } else {
                System.out.println("Pilihan tidak valid.");
            }
        }

        input.close();
    }
}
        
   