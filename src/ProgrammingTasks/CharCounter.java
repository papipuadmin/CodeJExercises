package ProgrammingTasks;

import java.util.Scanner;

public class CharCounter {
    public static void main(String[] args) {
        // считываем консоль
        Scanner scan = new Scanner(System.in);
        // текущяя строка
        String in = null;
        // счётчик
        int counter = 0;
        // поехали считать
        while ((in = scan.nextLine()) != null) {
            if (in.equals(""))
                break;
            char[] tmp = in.toCharArray();
            for (int i = 0; i < tmp.length; i++) {
                if (Character.isAlphabetic(tmp[i]) && !Character.isDigit(tmp[i])) {
                    counter++;
                }
            }
        }
        System.out.println("всего букв - " + counter);
        scan.close();
    }
}
