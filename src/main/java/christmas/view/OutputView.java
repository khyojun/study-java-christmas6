package christmas.view;

public class OutputView {

    private static final String NOTICE_DATE_INPUT = "안녕하세요! 우테코 식당 12월 이벤트 플래너입니다.\n"
        + "12월 중 식당 예상 방문 날짜는 언제인가요? (숫자만 입력해 주세요!)";

    private static final String NOTICE_MENU_INPUT = "주문하실 메뉴를 메뉴와 개수를 알려 주세요. "
        + "(e.g. 해산물파스타-2,레드와인-1,초코케이크-1)\n";

    private static OutputView instance = new OutputView();

    private OutputView() {
    }

    public static OutputView getInstance() {
        return instance;
    }

    public void printInputDate() {
        print(NOTICE_DATE_INPUT);
    }

    private void print(String message) {
        System.out.println(message);
    }

    public void printError(String error) {
        print(error);
    }

    public void printInputMenu() {
        print(NOTICE_MENU_INPUT);
    }
}
