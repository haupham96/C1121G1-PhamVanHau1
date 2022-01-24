package ss19_string_regex.practice.validate_email;

public class EmailExampleTest {
    private static EmailExample emailExample;
    public static final String[] validEmail = new String[]{"a@gmail.com","ab@yahoo.com","abc@hotmail.com"};
    public static final String[] invalidEmail = new String[]{"@gmail.com","ab@yahoo.","@#abc@hotmail.com"};
    public static void main(String[] args) {
        emailExample = new EmailExample();
        for(String email:validEmail){
            boolean checkEmail = emailExample.validate(email);
            System.out.println("Email : "+email+" is "+checkEmail);
        }
        System.out.println("");
        System.out.println("");
        System.out.println("");

        for(String email:invalidEmail){
            boolean checkEmail = emailExample.validate(email);
            System.out.println("Email : "+email+" is "+checkEmail);
        }
    }
}
