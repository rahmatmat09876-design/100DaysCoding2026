
public class Day20 {
    public static void main(String[] args) {

        byte b = 25;
        short s = 250;
        int i = 2500;
        long l = 25000L;
        float f = 15.5f;
        double d = 45.75;
        char c = 'R';
        boolean bo = false;

        String sb = String.valueOf(b);
        String ss = String.valueOf(s);
        String si = String.valueOf(i);
        String sl = String.valueOf(l);
        String sf = String.valueOf(f);
        String sd = String.valueOf(d);
        String sc = String.valueOf(c);
        String sbo = String.valueOf(bo);

        System.out.println("Byte\t:" + sb);
        System.out.println("Short\t:" + ss);
        System.out.println("Integer\t:" + si);
        System.out.println("Long\t:" + sl);
        System.out.println("Float\t:" + sf);
        System.out.println("Double\t:" + sd);
        System.out.println("Char\t:" + sc);
        System.out.println("Boolean:" + sbo);
    }
}
