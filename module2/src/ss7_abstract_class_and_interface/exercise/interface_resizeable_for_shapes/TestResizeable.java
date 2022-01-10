package ss7_abstract_class_and_interface.exercise.interface_resizeable_for_shapes;

import java.util.Scanner;

public class TestResizeable {
    public static void main(String[] args) {
        Resizeable[] resizes = new Resizeable[3];
        resizes[0]=new Circle();
        resizes[1]=new Rectangle();
        resizes[2]=new Square();

        System.out.println("Pre-resize");
        for(Resizeable resize : resizes){
            System.out.println(resize);
        }

        System.out.println("After-resize");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter size to resize in percentage :");
        double percent=scanner.nextDouble();

        for(Resizeable resize : resizes){
            resize.resize(percent);
            System.out.println(resize);
        }




    }
}
