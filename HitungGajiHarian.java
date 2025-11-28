package pkg2025_bp1_c;
import java.util.Scanner;
import java.text.DecimalFormat;
public class HitungGajiHarian {
    public static void main(String[] arga){
         Scanner input = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#,###.00");
        
        // Deklarasi Variabel
        int jumlahMasuk;
        double gajiHarian, tunjanganPersen, pajakPersen, bonus, lembur;
        double gajiTotal, tunjangan, pajak, gajiBersih;
                
        // Inpu Data
        System.out.println("Progam Hitung Slip Gaji Harian");
        System.out.print("Jumlah Hari Masuk Kerja = ");
        jumlahMasuk = input.nextInt();
        
        System.out.print("Gaji Harian = ");
        gajiHarian = input.nextDouble();
        
        System.out.print("Persentase Tunjangan (%) : ");
        tunjanganPersen = input.nextDouble();
        
        System.out.print("Persentase Pajak (%) : ");
        pajakPersen = input.nextDouble();
                
        System.out.print("Bonus Tambahan (jika ada): ");
        bonus = input.nextDouble();                
                        
        System.out.print("Uang Lembur (jika ada) : ");
        lembur = input.nextDouble();                        
                                
        // Proses Perhitumgan 
        gajiTotal = jumlahMasuk * gajiHarian;
        tunjangan = gajiTotal * (tunjanganPersen / 100);
        pajak = gajiTotal * (pajakPersen / 100);
        gajiBersih = gajiTotal + tunjangan + bonus + lembur - pajak;
        
        // Output Hasil
        System.out.println("\n=====Slip Gaji Karyawan ====== ");
        System.out.println("Jumlah Hari Masuk Kerja : " + jumlahMasuk);
        System.out.println("Gaji Harian : Rp " + df.format(gajiHarian));
        System.out.println("Gaji Kotor : Rp " + df.format(gajiTotal));
        System.out.println("Tunjangan (" + tunjanganPersen + "%) : Rp " + df.format(tunjangan));
        System.out.println("Bonus : Rp " + df.format(bonus));
        System.out.println("Lembur : Rp " + df.format(lembur));
        System.out.println("Pajak (" + pajakPersen + "%) : Rp " + df.format(pajak));
        System.out.println("----------------------------------------------------------------------");
        System.out.println("Gaji Bersih : Rp " + df.format(gajiBersih));
        System.out.println("======================================================================");
        
        // tugas mingdep di presentasikan, di modif saja, 
        //1. tambahkan tunjangan (input) bertambah
        //gajiharian=input.nextInt(tunjangan);
        //2. pajak (input) berkurang
    }
    
}
