public class RekursionCountDownÜbung {
    public static void main(String[] args) {
        rekursionCountDown(12, 5);


    }

    public static void rekursionCountDown(int value, int stop) {
        System.out.println(value);
        if (value > 0 && value > stop) {
            rekursionCountDown(value-1, stop);
        }
        if (value == stop) {
            System.out.println("einmalige ende");
        }
        System.out.println("rekursive ende");

    }
    public static void rekursionCountDown (int number) {
        rekursionCountDown(99, 0);
    }
}



