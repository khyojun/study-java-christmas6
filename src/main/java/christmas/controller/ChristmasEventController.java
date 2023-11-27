package christmas.controller;

import christmas.domain.Date;
import christmas.domain.Menus;
import christmas.exception.MenuException;
import christmas.view.InputView;
import christmas.view.OutputView;

public class ChristmasEventController {

    private InputView inputView;
    private OutputView outputView;

    public ChristmasEventController(InputView inputView, OutputView outputView) {
        this.inputView=inputView;
        this.outputView=outputView;
    }

    public void eventStart() {
        Date date = inputDate();
        inputMenu();



    }

    private Menus inputMenu() {
        try {
            outputView.printInputMenu();
            return new Menus(inputView.inputMenu());
        }catch (IllegalArgumentException error){
            outputView.printError(error.getMessage());
            return inputMenu();
        }
    }

    private Date inputDate() {
        try{
            outputView.printInputDate();
            return new Date(inputView.inputDate());
        }catch (IllegalArgumentException error){
            outputView.printError(error.getMessage());
            return inputDate();
        }
    }
}
