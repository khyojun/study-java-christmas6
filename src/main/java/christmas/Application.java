package christmas;

import christmas.controller.ChristmasEventController;
import christmas.view.InputView;
import christmas.view.OutputView;

public class Application {

    public static void main(String[] args) {
        // TODO: 프로그램 구현
        ChristmasEventController christmasEventController = new ChristmasEventController(
            InputView.getInstance(),
            OutputView.getInstance());
        christmasEventController.eventStart();

    }
}
