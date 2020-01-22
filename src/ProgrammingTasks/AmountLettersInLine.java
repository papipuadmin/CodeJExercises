package ProgrammingTasks;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;


/*TASK:
    Вывести статистику по количеству встречающихся в строке букв. Выводятся только буквы, которые есть в тексте.
    Вывод в отсортированном по алфавиту виде.
*/

public class AmountLettersInLine {

    public static void main(String[] args) throws java.lang.Exception {

        Scanner scan = new Scanner(System.in);
        System.out.println("Please, enter the phrase to calculate the amount of characters in it");

        String phrase = scan.nextLine();

        countChar(phrase);

    }

    private static void countChar(String text){
        String cleanText = text.replaceAll("\\s+", "").toLowerCase();

        Map<Character,Integer> map = new HashMap<Character,Integer>();

        for(int i=0;i<cleanText.length();i++) {

            if (Character.isAlphabetic(cleanText.charAt(i)) && !Character.isDigit(cleanText.charAt(i))) {
             char ch = cleanText.charAt(i);
             int cnt = map.get(ch) != null ? map.get(ch) : 0;
             cnt++;
             map.put(ch, cnt);
            }
        }

        for(Iterator<Character> it = map.keySet().iterator(); it.hasNext(); )
        {
            Character key = it.next();
            System.out.println(key+" = "+map.get(key));
        }

    }
}
