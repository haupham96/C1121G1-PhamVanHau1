package furama_resort.view;

import furama_resort.controller.FuramaController;
import furama_resort.util.exception.controller_exception.ControllerException;

public class View {
    public static void main(String[] args) throws ControllerException {
        FuramaController furamaController = new FuramaController();
        furamaController.displayMainMenu();
    }

}
