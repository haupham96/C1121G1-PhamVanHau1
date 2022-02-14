package demo.ss20_design_pattern.factory_method;

public class Client {
    public static void main(String[] args) {
        Bank bank = BankFactory.getBank(TypeBank.VIETCOMBANK);
        Bank bank1 = BankFactory.getBank(TypeBank.TPBANK);
        Bank bank3 = BankFactory.getBank(TypeBank.SACOMBANK);
        System.out.println(bank.getNameBank());
        System.out.println(bank1.getNameBank());
        System.out.println(bank3.getNameBank());
    }
}
