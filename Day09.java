public class ConstantaGame {
    public static void main(String[] args) {
        // Deklarasi konstanta (Final Variable)
        final String GAME_NAME = "Mobile Legends";
        final int MAX_HERO_LEVEL = 15;
        final int BASE_TURRET_HP = 5000;
        final double RETRIBUTION_COOLDOWN = 35.0;

        // Menampilkan nilai konstanta
        System.out.println("Nama Game      : " + GAME_NAME);
        System.out.println("Max Level Hero : " + MAX_HERO_LEVEL);
        System.out.println("HP Turret Utama: " + BASE_TURRET_HP);
        System.out.println("CD Retribution : " + RETRIBUTION_COOLDOWN + " detik");
    }
}
