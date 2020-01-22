package ProgrammingTasks;
import java.util.Scanner;

/* TASK:
    Проверить строку на палиндром (симметричность, т.е. читается одинаково и слева, и справа, например доход, заказ, потоп, А роза упала на лапу Азора)
    Если строка является палиндромом, то вывести левую половину палиндрома.
*/

public class Palindrome {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);//.useDelimiter("\\n");
        System.out.println("Please, enter the phrase and we'll define is it palindrome or not.");

        String phrase = scan.nextLine();
        //String phrase = scan.next();

        if (phrase.length() <= 1) System.out.println("No data to define. please re-enter the phrase!");
        else {

            if (isPalindromeReverseTheString(phrase) == true) {
                System.out.println("\"Your phrase is a palindrome\"!");
                System.out.println(findHalfPhrase(phrase));
            } else System.out.println("\"Your phrase is NOT a palindrome\"!");

            System.out.println(isPalindromeReverseTheString(phrase));
        }
    }

    private static String findHalfPhrase (String s){
        String r = "";
        for (int i = 0; i < s.length() / 2; ++i)
            r += s.charAt(i);
        return r;
    }

    private static boolean  isPalindromeReverseTheString(String text) {
        StringBuilder reverse = new StringBuilder();
        String clean = text.replaceAll("\\s+", "").toLowerCase();
        char[]plain = clean.toCharArray();
        for (int i = plain.length - 1; i >= 0; i--) {
            reverse.append(plain[i]);
        }
        return (reverse.toString()).equals(clean);
    }

}

