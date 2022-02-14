package demo.ss20_design_pattern.singleton;

public class Service {
    public static void test(){
        Singleton singleton = Singleton.getInstance();
        System.out.println(singleton);
    }
}
