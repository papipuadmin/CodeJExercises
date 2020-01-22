package ProgrammingTasks;
import java.util.Scanner;

/* TASK:
    Есть ряд, где цифре 43 соответствует буква А, 44 - В, 45 - С и т.д. Этот ряд продолжается как в большую, так и в меньшую стороны.
    Нужно ввести любую цифру от -10^9 до + 10^9, и в ответ должна вывестись соответствующая ей буква.
*/

public class FiguresToLetters {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        try {
            System.out.println("Enter the number and we'll tell you the matching letter:");
            long num = in.nextInt();
            getLetter(num);
        } catch (RuntimeException e) {
            System.out.println("Enter the number, not a letter !!!");
        } finally {
            in.close();
        }
    }

    private static void getLetter(long num) {
        long x = (35 + num) % 26;
        long litera = x + 65;
        System.out.println("The matching letter is - " + (char) litera);
    }

}
