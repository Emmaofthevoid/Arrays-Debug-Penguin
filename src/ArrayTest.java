import java.util.Arrays;

public class ArrayTest {
    public static void main(String[] args) {
        String [] quartale =  {"frühling","sommer","herbst", "winter"};
        String q1 = quartale[0];
        System.out.println(Arrays.toString(quartale));
        System.out.println(q1);
        quartale[0] = "fruehling";
        System.out.println(Arrays.toString(quartale));
        System.out.println(q1);
    }
}
