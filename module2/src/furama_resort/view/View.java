package furama_resort.view;

import furama_resort.controller.FuramaController;
import furama_resort.util.exception.controller_exception.ControllerException;
import furama_resort.util.exception.user_input_exception.UserInputException;

public class View {
    public static void main(String[] args) throws ControllerException, UserInputException {

            FuramaController furamaController = new FuramaController();
            furamaController.displayMainMenu();

    }

}
