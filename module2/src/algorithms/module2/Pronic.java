package algorithms.module2;

public class Pronic {
   static boolean solution(int num) {

        for(int i=0;i<num;i++){
            if(i*(i+1)==num){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        boolean check = solution(0);
        System.out.println(check);
    }
}
