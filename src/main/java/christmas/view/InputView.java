package christmas.view;


import camp.nextstep.edu.missionutils.Console;

public class InputView {

    private static InputView instance = new InputView();
    private InputView(){

    }

    public static InputView getInstance() {
        return instance;
    }

    public String inputDate() {
        return Console.readLine();
    }

    public String inputMenu() {
        return Console.readLine();
    }
}
