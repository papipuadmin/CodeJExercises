package ProgrammingTasks;
import java.util.Arrays;

/* TASK:
	Переместить все дублирующиеся элементы массива в конец массива.
 */

public class MoveDuplicates {

    public static void main(String[] args) {

        String[] inputArray = {"text", "wolf", "message", "bio", "aqua", "text", "message", "wolf", "retro", "retro", "text", "message", "retro", "bio"};

        //  String[] inputArray = new String[0];
        if (inputArray == null || inputArray.length == 0) {
            System.out.println("Empty inputArray");
        }

        Arrays.sort(inputArray);

        for (int i = 0; i < inputArray.length; i++) {
            System.out.print(inputArray[i] + "  ");
        }

        int write = 0;

        for (int read = 1; read < inputArray.length; read++) {
            if (!inputArray[read].equalsIgnoreCase(inputArray[read - 1]) && !inputArray[read].equalsIgnoreCase(inputArray[write])) {
                write++;
                swap(inputArray, read, write);
            }
        }

        Arrays.sort(inputArray, write + 1, inputArray.length);

        System.out.println();
        System.out.println("*** The array after moving all duplicates to the end is: ");
        for (int i = 0; i < inputArray.length; i++) {
            System.out.print(inputArray[i] + "  ");
        }

    }

    private static void swap(String[] arr, int read, int write) {
       // System.out.println();
       // System.out.println("Swap " + read + " element with " + write);
        String tmp = arr[read];
        arr[read] = arr[write];
        arr[write] = tmp;
    }
}
