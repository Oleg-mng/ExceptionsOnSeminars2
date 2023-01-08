import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * - Дан следующий код, исправьте его там, где требуется (задание 3)
 * - Разработайте программу, которая выбросит Exception, когда пользователь
 * вводит пустую строку. Пользователю должно показаться сообщение,
 * что пустые строки вводить нельзя.
 */

public class App3 {
    public static void main(String[] args) {
        try {
            int a = 90;
            int b = 3;
            System.out.println(a / b);
            printSum(23, 234);
            int[] abc = {1, 2};
            abc[3] = 9;
            inputNumber();


        } catch (NullPointerException e) {
            System.out.println("Указатель не может указывать на null!");
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Массив выходит за пределы своего размера!");
        } catch (Throwable e) {
            System.out.println("Что-то пошло не так...");
        }
    }

    public static void printSum(Integer a, Integer b) {
        System.out.println(a + b);
    }

    public static void inputNumber() {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите число типа Int (не строку)");
        try {
            int k = in.nextInt();
            ;
        } catch (InputMismatchException e) {
            System.out.println("пустые строки вводить нельзя");
        }
        in.close();
    }
}

