package ss11_stack_queue.exercise.count_occurences_of_word_using_map;

import java.util.Locale;
import java.util.Map;

public class TreeMap {
    public static void main(String[] args) {
        Map<String, Integer> map = new java.util.TreeMap<>();
        String string = "Hello Vietnam ABc abc Hello Hello Hello";
        String[] arr = string.split(" ");


        for(int i=0;i< arr.length;i++) {
            arr[i] = arr[i].toLowerCase(Locale.ROOT);
            if (map.containsKey(arr[i])) {
                int newValue = map.get(arr[i]) + 1;
                map.replace(arr[i], newValue);
            } else {
                map.put(arr[i], 1);
            }
        }

        System.out.println("Display Key and Value");
            for(String key: map.keySet()){
                System.out.println(key+" - "+map.get(key));
            }

    }
}
