package vonny_118_fungsi_matematika_bp;
import java.util.Scanner;
public class b_Barisan_Deret_118 {
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        
      while (true) {
            System.out.println("\n===============================");
            System.out.println("        BARISAN & DERET");
            System.out.println("===============================");
            System.out.println("1. Deret Aritmatika");
            System.out.println("2. Deret Geometri");
            System.out.println("3. Keluar");
            System.out.print("Pilih menu (1-3): ");
            int pilihan = input.nextInt();

            // -------------------------------
            // Deret Aritmatika
            // -------------------------------
            if (pilihan == 1) {
                System.out.println("\n--- DERET ARITMATIKA ---");
                System.out.print("Suku pertama (a1): ");
                double a1 = input.nextDouble();
                System.out.print("Jumlah suku (n): ");
                int n = input.nextInt();
                System.out.print("Beda antar suku (b): ");
                double beda = input.nextDouble();

                System.out.println("\nSuku-suku deret aritmatika:");
                double total = 0;
                int i = 0;
                while (i < n) {
                    double suku = a1 + i * beda;
                    System.out.println("Suku ke-" + (i+1) + " : " + suku);
                    total += suku;
                    i++;
                }
                System.out.println("Jumlah n suku pertama: " + total);
            }

            // -------------------------------
            // Deret Geometri
            // -------------------------------
            else if (pilihan == 2) {
                System.out.println("\n--- DERET GEOMETRI ---");
                System.out.print("Suku pertama (a1): ");
                double a1 = input.nextDouble();
                System.out.print("Jumlah suku (n): ");
                int n = input.nextInt();
                System.out.print("Rasio antar suku (r): ");
                double r = input.nextDouble();

                System.out.println("\nSuku-suku deret geometri:");
                double total = 0;
                int i = 0;
                while (i < n) {
                    double suku = a1;
                    int j = 0;
                    while (j < i) {
                        suku *= r;
                        j++;
                    }
                    System.out.println("Suku ke-" + (i+1) + " : " + suku);
                    total += suku;
                    i++;
                }
                System.out.println("Jumlah n suku pertama: " + total);
            }

            // -------------------------------
            // Keluar
            // -------------------------------
            else if (pilihan == 3) {
                System.out.println("Terima kasih. Program selesai.");
                break;
            }

            // -------------------------------
            // Input Tidak Valid
            // -------------------------------
            else {
                System.out.println("Pilihan tidak valid. Silakan pilih 1, 2, atau 3.");
            }
        }

        input.close(); // 
    }
}

