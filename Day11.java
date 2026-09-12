import java.util.Scanner;

public class Day11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Constanta
        final String KAMPUS = "UNSULBAR";

        System.out.println("INPUT BIODATA MAHASISWA");
        System.out.println("Kampus: " + KAMPUS + "\n");

        // Input 9 tipe data
        System.out.print("Nama Lengkap (String)   : ");
        String nama = input.nextLine();

        System.out.print("Jumlah Saudara (byte)   : ");
        byte saudara = input.nextByte();

        System.out.print("Tahun Masuk (short)     : ");
        short tahun = input.nextShort();

        System.out.print("Umur (int)              : ");
        int umur = input.nextInt();

        System.out.print("No HP (long)            : ");
        long noHp = input.nextLong();

        System.out.print("Berat Badan (float)     : ");
        float berat = input.nextFloat();

        System.out.print("Tinggi Badan (double)   : ");
        double tinggi = input.nextDouble();

        input.nextLine(); // Bersihkan buffer enter

        System.out.print("Jenis Kelamin L/P (char): ");
        char jk = input.nextLine().charAt(0);

        System.out.print("Status Aktif (boolean)  : ");
        boolean aktif = input.nextBoolean();

        // Update variabel (hitung umur tahun depan)
        int umurNanti = umur;
        umurNanti = umurNanti + 1;

        // Output Hasil
        System.out.println("\n=== HASIL BIODATA ===");
        System.out.println("Nama\t\t: " + nama);
        System.out.println("Kampus\t\t: " + KAMPUS);
        System.out.println("Tahun Masuk\t: " + tahun);
        System.out.println("JK\t\t: " + jk);
        System.out.println("Status Aktif\t: " + aktif);
        System.out.println("Jumlah Saudara\t: " + saudara);
        System.out.println("No HP\t\t: " + noHp);
        
        // Menggunakan printf untuk pecahan & variabel update
        System.out.printf("Tinggi / Berat\t: %.1f cm / %.1f kg\n", tinggi, berat);
        System.out.printf("Umur Sekarang\t: %d tahun (Tahun depan: %d tahun)\n", umur, umurNanti);

        input.close();
    }
}
