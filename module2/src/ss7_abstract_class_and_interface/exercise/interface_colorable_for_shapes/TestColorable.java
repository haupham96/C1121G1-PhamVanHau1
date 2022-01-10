package ss7_abstract_class_and_interface.exercise.interface_colorable_for_shapes;

public class TestColorable {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[3];
        shapes[0] = new Circle();
        shapes[1] = new Rectangle();
        shapes[2] = new Square();

        for(Shape shape:shapes){
            if(shape instanceof Colorable){
                System.out.println(((Colorable) shape).howToColor());
            }
        }
    }
}
