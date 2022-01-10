package ss7_abstract_class_and_interface.practise.animal_and_interface_edible;

public class Chicken extends Animal implements IEdible {
    @Override
    public String makeSound() {
        return "Chicken : cluck cluck !";
    }

    @Override
    public String howToEat() {
        return "could be fried";
    }
}
