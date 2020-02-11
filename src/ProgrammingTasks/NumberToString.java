package ProgrammingTasks;

import java.util.Scanner;

/* TASK:
	На вход функции подается целое число. Функция должна вернуть соответствующую строку (см. таблицу):
	    •	При значении от 1 до 42 возвращается буква в нижнем регистре;
        •	Начиная с числа 43 должны возвращаться строки типа A, B, AR, ABT, CCDB

        1	2	…	41	42	43	44	…	68	69	70	…	94	95	96	…	…	…
        k	l	 	y	z	A	B	 	Z	AA	AB	 	AZ	BA	BB	 	AAA
 */
public class NumberToString {
    public static String getStringValue(long n) {
        String stringValue = "";

        if (n > 0 && n <= 42 ){
            long index = (42-n)%26;
            stringValue += (char)('z'-index);

            System.out.println("The matching String is - " + stringValue);
        }
        else if (n>42){
            n -= 42;
            while (n > 0) {
                n--;
                stringValue = (char)(65 + n%26) + stringValue;
                n /= 26;
            }
            System.out.println("The matching String is - " + stringValue);
        }
        else System.out.println(stringValue = "Incorrect number");

        return stringValue;
    }

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        try {
            System.out.println("Enter any positive number and we'll tell you the matching letter:");
            long num = in.nextInt();
            getStringValue(num);
        } catch (RuntimeException e) {
            System.out.println("Enter the number, not a letter !!!");
        } finally {
            in.close();
        }
    }

}
