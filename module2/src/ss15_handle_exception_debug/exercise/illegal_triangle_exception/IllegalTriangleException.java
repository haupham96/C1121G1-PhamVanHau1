package ss15_handle_exception_debug.exercise.illegal_triangle_exception;

import java.util.Scanner;

public class IllegalTriangleException extends Exception {
    public IllegalTriangleException() {
    }

    public IllegalTriangleException(String message) {
        super(message);
    }
}
