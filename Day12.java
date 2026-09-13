import java.util.Scanner;
// Mengimpor Scanner untuk menerima input dari pengguna

public class Day12 {
    public static void main(String[] args) {

        // Membuat objek Scanner untuk membaca input dari keyboard
        Scanner input = new Scanner(System.in);

        // Menampilkan judul program
        System.out.println("=== PROGRAM BIODATA MAHASISWA ===");

        // Meminta pengguna memasukkan nama
        System.out.print("Nama Lengkap : ");
        String nama = input.nextLine();
        // String digunakan untuk menyimpan data berupa teks

        // Meminta pengguna memasukkan NIM
        System.out.print("NIM           : ");
        String nim = input.nextLine();
        // NIM disimpan sebagai String karena berupa data identitas

        // Meminta pengguna memasukkan program studi
        System.out.print("Program Studi : ");
        String prodi = input.nextLine();

        // Meminta pengguna memasukkan asal daerah
        System.out.print("Asal Daerah   : ");
        String asal = input.nextLine();

        // Meminta pengguna memasukkan hobi
        System.out.print("Hobi          : ");
        String hobi = input.nextLine();

        // Menampilkan hasil biodata yang telah dimasukkan
        System.out.println("\n=== BIODATA MAHASISWA ===");

        System.out.println("Nama          : " + nama);
        System.out.println("NIM           : " + nim);
        System.out.println("Program Studi : " + prodi);
        System.out.println("Asal Daerah   : " + asal);
        System.out.println("Hobi          : " + hobi);

        // Menutup Scanner setelah selesai digunakan
        input.close();
    }
}
