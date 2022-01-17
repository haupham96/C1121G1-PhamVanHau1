package ss13_searching_algorithms.exercise.find_increasing_string_with_max_length;

import java.util.ArrayList;

public class IncreasingStringLength {
    public static void main(String[] args) {
        String str = "Welcome";
        ArrayList<Character> max = new ArrayList<>();

       for(int i=0;i<str.length();i++){
           ArrayList<Character> temp = new ArrayList<>();
           temp.add(str.charAt(i));
           for(int j=i+1 ; j<str.length();j++){
               if(str.charAt(j)>temp.get(temp.size()-1)){
                   temp.add(str.charAt(j));
               }
           }
           if(temp.size()> max.size()){
               max.clear();
               max.addAll(temp);
           }
           temp.clear();
       }

        for (char list : max) {
            System.out.print(list);
        }

    }
}
