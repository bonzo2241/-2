import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int k = 0;
        while (k < 1) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Введите пароль: ");
            String a = scanner.nextLine();
            if (a.length() > 7) {
                if (a.matches(".*[A-Z].*")) {
                    if (a.matches(".*_.*")) {
                        System.out.println("Пароль надёжен");
                        k = k + 1;
                    } else
                        System.out.println("Пароль ненадёжен, повторите ввод");
                } else
                    System.out.println("Пароль ненадёжен, повторите ввод");
            }
            else
                System.out.println("Пароль ненадёжен, повторите ввод");
        }
    }
}
