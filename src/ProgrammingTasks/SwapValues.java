package ProgrammingTasks;
import java.util.Scanner;

/* TASK:
    Поменять местами значения двух целочисленных переменных без использования третьей переменной
 */

public class SwapValues {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        try {
            System.out.println("Enter the numerical parameter A =");
            int a = in.nextInt();
            System.out.println("Enter the numerical parameter B =");
            int b = in.nextInt();

            int result[] = swapWithoutTempVar(a,b);

            System.out.println("Wow! Your results were swapped without using the third parameter!");
            System.out.println("now A = "+result[0] +", B = "+ result[1]);

        } catch (RuntimeException e) {
            System.out.println("Enter the number, not a letter !!!");
        } finally {
            in.close();
        }

    }

    private static int[] swapWithoutTempVar (int a, int b){
        a=a+b-(b=a);
        return new int[] {a, b};
    }
}
