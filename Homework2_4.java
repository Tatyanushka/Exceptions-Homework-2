import java.util.Scanner;

public class Homework2_4 {
    public class Homework24 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            try {
                System.out.println(inputString(scanner));
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    
        public static String inputString(Scanner scanner) throws Exception {
            
            System.out.print("Введите строку: ");
            String string = scanner.nextLine();
            string = string.trim();
            if (string.isEmpty()) {
                throw new Exception("Нельзя вводить пустые строки");
            }
            return string;
        }
    }

}

