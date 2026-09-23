
public class Day22 {
    public static void main(String[] args) {

        int a = 10;
        int b = 20;
        int sementara;

        sementara = a;
        a = b;
        b = sementara;

        System.out.println("Nilai a: " + a);
        System.out.println("Nilai b: " + b);
    }
}
