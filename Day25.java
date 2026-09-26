import java.util.Scanner;

public class Day25 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("=== PROGRAM MENGHITUNG LUAS KOLAM ===");
        System.out.println();

        System.out.print("Masukkan diameter kolam (meter) : ");
        double diameter = input.nextDouble();

        double jariJari = diameter / 2;
        double phi = 3.14;
        double luas = phi * jariJari * jariJari;

        System.out.println();
        System.out.println("----------------------------------");
        System.out.println();
        System.out.println("+++ Hasil Perhitungan +++");
        System.out.println();

        System.out.printf("Diameter     : %.1f m%n", diameter);
        System.out.printf("Jari-jari    : %.1f m%n", jariJari);
        System.out.printf("Luas         : %.2f m2%n", luas);

        System.out.println();
        System.out.println("============================");

        input.close();
    }
}
