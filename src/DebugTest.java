public class DebugTest {
    public static void main(String[] args) {

        hansiSingt("1000 Fehler");
        int x = 5;
        System.out.println(x + " Punkte");
        hansiSingt("Ich mach noch irgendwas");
        hansiSingt("Ich möchte es nur zeigen");
        hansiSingt("es geht nur bis 5 aus");
        hansiSingt("ich wills nur interessanter machen");
        hansiSingt2(" true love", 5);
    }

    public static void hansiSingt(String titel) {
        System.out.println("Hansi singt" + titel);
    }
    public static void hansiSingt2(String titels, int wieOft) {
        for (int i = 0; i < wieOft; i++) {

            System.out.println("Hansi singt" + titels);
        }
    }


}

