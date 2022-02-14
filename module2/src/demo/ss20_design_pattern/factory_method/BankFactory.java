package demo.ss20_design_pattern.factory_method;

public class BankFactory {
    private BankFactory(){};
    public static Bank getBank(TypeBank typBank){
       switch (typBank){
           case VIETCOMBANK:
               return new VietComBank();
           case TPBANK:
               return new TPBank();
           case SACOMBANK:
               return new SacomBank();
           default:
               throw new RuntimeException("Loại ngân hàng không tồn tại");
       }
    }
}
