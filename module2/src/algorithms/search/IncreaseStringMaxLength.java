package algorithms.search;

import java.util.ArrayList;

public class IncreaseStringMaxLength {
    public static void main(String[] args) {
        String string = "Welcome";
        // duyet mang => dat ptu vao 1 mang phu , neu ptu sau>ptu trc thi cho vao , ko thi thoi.
        ArrayList<Character> list = new ArrayList<>();
        for(int i=0;i<string.length();i++){
            ArrayList<Character> temp = new ArrayList<>();
            temp.add(string.charAt(i));
            for(int j=i+1;j<string.length();j++){
                if(string.charAt(j)>temp.get(temp.size()-1)){
                    temp.add(string.charAt(j));
                }
            }
            if(temp.size()>list.size()){
                list.clear();
                list.addAll(temp);
            }
            temp.clear();
        }
        for(Character max:list){
            System.out.print(max);
        }

    }
}
