package ProgrammingTasks;

/* TASK:
	Переместить все дублирующиеся элементы массива в конец массива.
 */

public class MoveDuplicatesWithoutSorting {

    public static void main(String[] args) {

        String[] inputArray = {"text", "wolf", "message", "bio",  "text", "aqua","message", "wolf", "retro", "retro", "text", "message", "retro", "bio"};

        //  String[] inputArray = new String[0];
        if (inputArray == null || inputArray.length == 0) {
            System.out.println("Empty inputArray");
        }

        for (int i = 0; i < inputArray.length; i++) {
            System.out.print(inputArray[i] + "  ");
        }
        System.out.println();

        for (int i = 0; i < inputArray.length - 2; i++) {
            for (int j = i + 1; j < inputArray.length; j++) {
                //current and next are same, move elements up
                //and place the next number at the end.
                if (inputArray[i].equalsIgnoreCase(inputArray[j])) {
                    String temp = inputArray[j];
                    for (int k = j; k < inputArray.length - 1; k++) {
                        inputArray[k] = inputArray[k + 1];
                    }
                    inputArray[inputArray.length - 1] = temp;
                    break;
                }
            }
        }

        System.out.println();
        System.out.println("*** The array after moving all duplicates to the end is: ");
        for (int i = 0; i < inputArray.length; i++) {
            System.out.print(inputArray[i] + "  ");
        }
    }
}
