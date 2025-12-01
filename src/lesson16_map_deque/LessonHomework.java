package lesson16_map_deque;

import java.util.*;

public class LessonHomework {
    public static void main(String[] args) {

        System.out.println(markduplicates(new String[]{"c", "c", "c", "c"})); // task 1

        System.out.println(firstAndLastChar(new String[]{"code","bug"}));

    }
    public static Map<String, Boolean> markduplicates(String[] strings) {
        HashMap<String, Boolean> stringBooleanHashMap = new HashMap<>();

        ArrayDeque<String> stringArrayDeque = new ArrayDeque<>(Arrays.asList(strings));

        String temp;

        while(!stringArrayDeque.isEmpty()) {
            temp = stringArrayDeque.pop();
            if(stringArrayDeque.contains(temp)) {
                while(stringArrayDeque.contains(temp)) { stringArrayDeque.remove(temp); }
                stringBooleanHashMap.put(temp, true);
                continue;
            }
            stringBooleanHashMap.put(temp,false);
        }

        return stringBooleanHashMap;
    }
    public static Map<String, String> firstAndLastChar(String[] strings) {
        HashMap<String, String> stringMap = new HashMap<>();
        for(String s : strings) {
            stringMap.put(String.valueOf(s.toCharArray()[0]), String.valueOf(s.toCharArray()[s.length()-1]));
        }
        return stringMap;
    }
}
