package ProgrammingTasks;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class smth {

    public static void main(String[] args) {
        counter();
     /*   String txt = "hello";
        HashMap<Character, Integer> map = new HashMap<Character, Integer>(40);
        for (int i = 0; i < txt.length(); ++i) {
            char c = txt.charAt(i);
            // если надо, то проверяем является ли символ буквой
            if (Character.isLetter(c)) {
                if (map.containsKey(c)) {
                    map.put(c, map.get(c) + 1);
                } else {
                    map.put(c, 1);
                }
            }
        }

        System.out.println(map.get('l'));*/
    }


    public static void counter()

    {
        String text = "kjns dkjsn fkjns fk";
        Map<Character,Integer> map = new HashMap<Character,Integer>();
        for(int i=0;i<text.length();i++)
        {
            char ch = text.charAt(i);
            int cnt = map.get(ch)!=null?map.get(ch):0;
            cnt++;
            map.put(ch, cnt);
        }

        for(Iterator<Character> it = map.keySet().iterator(); it.hasNext(); )
        {
            Character key = it.next();
            System.out.println(key+" = "+map.get(key));
        }
    }
}
