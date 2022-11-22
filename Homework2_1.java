import java.util.Scanner;

public class Homework2_1 {

    public static void main(String[] args) {
        System.out.println(inputFloat());
    }

    public static float inputFloat() {
        try (Scanner in = new Scanner(System.in)) {
            System.out.print("Введите дробное число (например: 5,76): ");
            while (!in.hasNextFloat()) {
                System.out.print("Не верный ввод повторите попытку: ");
                in.next();
            }
            return in.nextFloat();
        }
    }
}