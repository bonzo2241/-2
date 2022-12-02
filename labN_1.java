import java.awt.*;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите дату строго в формате dd/mm/yyy: ");
        String a = scanner.nextLine();
        if(!a.matches("[0-9/]+")){
            System.out.println("Введёное значение не является датой");
         System.exit(1);
        }
         List<String> list = Arrays.asList(a.split("/"));
        int aa = Integer.parseInt(list.get(0));
        int bb = Integer.parseInt(list.get(1));
        int cc = Integer.parseInt(list.get(2));
        if (aa > 31 || bb > 12 || (cc < 1900) || (cc > 9999) || a.length() != 10 ){
            System.out.println("Введёное значение не является датой");
        }
        else
            System.out.println("Введёное значение является датой");
    }
}

