package vonny_118_fungsi_matematika_bp;
import java.util.Scanner;
public class j_Trigonometri_118 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        while (true) {
            System.out.println("\n===============================");
            System.out.println("       TRIGONOMETRI DASAR");
            System.out.println("===============================");
            System.out.println("1. Sinus (sin)");
            System.out.println("2. Cosinus (cos)");
            System.out.println("3. Tangen (tan)");
            System.out.println("4. Keluar");
            System.out.print("Pilih menu (1-4): ");
            int pilihan = input.nextInt();

            if (pilihan == 4) {
                System.out.println("Terima kasih. Program selesai.");
                break;
            }

            System.out.print("Masukkan sudut dalam derajat: ");
            double derajat = input.nextDouble();

            // Konversi derajat ke radian 
            double pi = 3.141592653589793;
            double rad = derajat * pi / 180.0;

            System.out.println("\n=== CARA PENGERJAAN ===");
            System.out.println("1. Ubah derajat menjadi radian");
            System.out.println("   Rumus : radian = (derajat * " + pi + ")" + " / 180");
            System.out.println("   Perhitungan : radian = (" + derajat + " * 3.1416) / 180");
            System.out.println("   Hasil radian = " + rad);

            System.out.println("\n2. Hitung nilai trigonometri:");

            if (pilihan == 1) {
                double hasil = Math.sin(rad);
                System.out.println("   Rumus : sin(sudut) = sin(radian)");
                System.out.println("   sin(" + derajat + " derajat) = sin(" + rad + ")");
                System.out.println("   Nilai sinus = " + hasil);
            } else if (pilihan == 2) {
                double hasil = Math.cos(rad);
                System.out.println("   Rumus : cos(sudut) = cos(radian)");
                System.out.println("   cos(" + derajat + " derajat) = sin(" + rad + ")");
                System.out.println("   Nilai cosinus = " + hasil);
            } else if (pilihan == 3) {
                double hasil = Math.tan(rad);
                System.out.println("   Rumus : tan(sudut) = tan(radian)");
                System.out.println("   tan(" + derajat + " derajat) = sin(" + rad + ")");
                System.out.println("   Nilai tangen = " + hasil);
            } else {
                System.out.println("Pilihan tidak valid!");
            }
        }

        input.close();
    }
}



