
package konversiotomatis;

public class Day18 {
    public static void main(String[] args) {

        System.out.println("KONVERSI OTOMATIS");
        System.out.println("Dari Tipe Data Kecil ke Besar");

        // 1. byte ke short
        byte nilaiByte = 25;
        short nilaiShort = nilaiByte;

        // 2. short ke int
        int nilaiInt = nilaiShort;

        // 3. int ke long
        long nilaiLong = nilaiInt;

        // 4. long ke float
        float nilaiFloat = nilaiLong;

        // 5. float ke double
        double nilaiDouble = nilaiFloat;

        // 6. char ke int
        char karakter = 'B';
        int kodeKarakter = karakter;

        // 7. boolean
        boolean status = false;

        System.out.println("Nilai byte: " + nilaiByte);
        System.out.println("Nilai short: " + nilaiShort);
        System.out.println("Nilai int: " + nilaiInt);
        System.out.println("Nilai long: " + nilaiLong);
        System.out.println("Nilai float: " + nilaiFloat);
        System.out.println("Nilai double: " + nilaiDouble);
        System.out.println("Karakter: " + karakter);
        System.out.println("Kode karakter: " + kodeKarakter);
        System.out.println("Status: " + status);
    }
}
