import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

/**
 * Реализуйте метод, который запрашивает у пользователя ввод дробного числа (типа float),
 * и возвращает введенное значение. Ввод текста вместо числа не должно приводить к
 * падению приложения, вместо этого, необходимо повторно запросить у пользователя ввод данных.
 */

public class App1 {
    public static void main(String[] args) {
        inputFloat();
    }
    public static void inputFloat(){
        Scanner in = new Scanner(System.in);
        System.out.println("Введите дробное число типа float (например: '1,7')");
//        float k = in.nextFloat();

        float k = 0;
        try {
            k = in.nextFloat();
            System.out.println("Вам удалось ввести валидное число типа float: " + k);
        } catch (InputMismatchException e) {
            System.out.println("Введите корректное дробное число типа float");
            inputFloat();
        }

        in.close();
    }
}