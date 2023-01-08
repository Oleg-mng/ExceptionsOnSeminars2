import java.lang.reflect.Array;

/**
 *2. Если необходимо, исправьте данный код (задание 2)
 */

public class App2 {
    public static void main(String[] args) {
        try {
            int d = 0;
            int[] intArray = {0, 2, 4, 6, 1, 9, 13, 9, 8, 7};
            double catchedRes1 = intArray[8] / d;
            System.out.println("catchedRes1 = " + catchedRes1);
        } catch (ArithmeticException e) {
            System.out.println("Catching exception: " + e);
        }

    }
}
