package ss15_handle_exception_debug.exercise.illegal_triangle_exception;

public class TestTriangle {
    public static void main(String[] args)  {
        try{
            Triangle triangle = new Triangle(1,1,5);
            triangle.setSideA(-1);
            System.out.println(triangle.toString());
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
