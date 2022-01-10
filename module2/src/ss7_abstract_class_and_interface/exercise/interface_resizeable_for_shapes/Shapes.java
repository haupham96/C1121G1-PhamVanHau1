package ss7_abstract_class_and_interface.exercise.interface_resizeable_for_shapes;

public class Shapes  {
    private String color = "green";
    private boolean filled = true;

    public Shapes() {
    }

    public Shapes(String color, boolean filled) {
        this.color = color;
        this.filled = filled;

    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return this.color;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    public boolean isFilled() {
        return this.filled;
    }

    @Override
    public String toString(){
        return " A Shape with color of "+ getColor()+"\n"
                + " And "
                + (isFilled() ? " filled " : "not filled");
    }

}