package ss21_design_pattern.practice.factory_method;

public class FactoryAnimal {
    public Animal getAnimal(String animal) {
        if ("canine".equals(animal)) {
            return new Dog();
        } else {
            return new Cat();
        }
    }
}
