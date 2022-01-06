package ss5_access_modifier_static_method_static_property.practice.static_property;

public class TestStaticProperty {
    public static void main(String[] args) {
        Car car1 = new Car("Lazada","Sky3");
        System.out.println(Car.numberOfCars);
        Car car2 = new Car("Shopee","SkyHigh");
        System.out.println(Car.numberOfCars);
    }
}
