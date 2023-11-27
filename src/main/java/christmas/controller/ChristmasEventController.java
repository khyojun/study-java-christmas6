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
        inputDate();





    }

    private void inputDate() {
        try{
            outputView.printInputDate();
            Date date = new Date(inputView.inputDate());
        }
    }
}
