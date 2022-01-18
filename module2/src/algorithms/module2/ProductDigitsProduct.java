package algorithms.module2;

public class ProductDigitsProduct {
    public static void main(String[] args) {
        System.out.println(digitsProduct(19));
    }
    public static int digitsProduct(int num) {
        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= 9; j++) {
                if (i * j == num) {
                    return i * 10 + j;
                }
            }
        }
        return -1;
    }
}
