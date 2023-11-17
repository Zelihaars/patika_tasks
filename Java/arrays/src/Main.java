import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        int[] liste = {3, 5, 79, 12, 25, -3, 66, 82, -49, 152};
        int[] liste2 = {15, 1, 99, 7, 7, -22, 11, 2, -49, 52};

        Arrays.fill(liste, 2);
        Arrays.sort(liste2);
        System.out.println(Arrays.toString(liste2));

    }
}
