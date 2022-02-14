package furama_resort.service;

import furama_resort.util.exception.user_input_exception.UserInputException;

public interface FacilityService extends Display {
    void addVilla() throws UserInputException;
    void addHouse() throws UserInputException;
    void addRoom() throws UserInputException;
    void displayMaintenance();

}
