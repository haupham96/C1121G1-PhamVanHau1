package furama_resort.service;

import furama_resort.util.exception.user_input_exception.UserInputException;

public interface ContractService {
    void createContract() throws UserInputException;
    void displayContract();
    void editContract() throws UserInputException;

}
