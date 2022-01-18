package algorithms.search;

import java.util.ArrayList;

public class ContinousString {
    public static void main(String[] args) {
        String string = "abcabacabcdeabcdefgabcdefgh";
        ArrayList<Character> temp = new ArrayList<>();
        ArrayList<Character> max = new ArrayList<>();
        for (int i = 0; i < string.length(); i++) {

            if (temp.size() > 1 && string.charAt(i) <= temp.get(temp.size() - 1)) {
                temp.clear();
            }
            temp.add(string.charAt(i));
            if (temp.size() > max.size()) {
                max.clear();
                max.addAll(temp);
            }
        }

        for(Character list:max){
            System.out.print(list);
        }
    }
}
