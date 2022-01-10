package ss7_abstract_class_and_interface.exercise.interface_resizeable_for_shapes;

public class TestResizeable {
    public static void main(String[] args) {
        IResizeable[] resizes = new IResizeable[3];
        resizes[0]=new Circle();
        resizes[1]=new Rectangle();
        resizes[2]=new Square();

        System.out.println("Pre-resize");
        for(IResizeable resize : resizes){
            System.out.println(resize);
        }

        double percent=(int)(Math.random()*100);
        System.out.println("Percentage : " + percent);

        System.out.println("After-resize");

        for(IResizeable resize : resizes){
            resize.resize(percent);
            System.out.println(resize);
        }




    }
}
