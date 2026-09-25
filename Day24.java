import java.util.Scanner;

public class LuasTaman {
    public static void main(String[] args) {
        Scanner data = new Scanner(System.in);

        System.out.println("=== HITUNG LUAS TAMAN ===");

        System.out.print("Panjang taman (m) : ");
        double panjang = data.nextDouble();

        System.out.print("Lebar taman (m)   : ");
        double lebar = data.nextDouble();

        double luas = panjang * lebar;

        System.out.println("\n--- HASIL ---");
        System.out.println("Panjang : " + panjang + " m");
        System.out.println("Lebar   : " + lebar + " m");
        System.out.println("Luas    : " + luas + " m2");

        data.close();
    }
}
