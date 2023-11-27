package christmas.controller;

import christmas.domain.Date;
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
