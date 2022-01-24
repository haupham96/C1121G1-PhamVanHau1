package ss19_string_regex.practice.validate_account;

public class AccountExampleTest {
    public static void main(String[] args) {
        AccountExample accountExample = new AccountExample();
        String[] validAccount = new String[] { "123abc_", "_abc123", "______", "123456","abcdefgh" };
        String[] invalidAccount = new String[] { ".@", "12345", "1234_", "abcde" };

        for(String acc:validAccount){
            boolean check = accountExample.validateAcc(acc);
            System.out.println("Account : "+acc+" is "+check);
        }
        System.out.println();
        System.out.println();
        System.out.println();
        for(String acc:invalidAccount){
            boolean check = accountExample.validateAcc(acc);
            System.out.println("Account "+acc+" is "+check);
        }
    }
}
