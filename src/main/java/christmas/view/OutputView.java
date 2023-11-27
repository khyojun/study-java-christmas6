package christmas.view;

import christmas.domain.Menus;
import java.text.DecimalFormat;
import java.util.Map.Entry;

public class OutputView {

    private static final String NOTICE_DATE_INPUT = "안녕하세요! 우테코 식당 12월 이벤트 플래너입니다.\n"
        + "12월 중 식당 예상 방문 날짜는 언제인가요? (숫자만 입력해 주세요!)";

    private static final int NOW_MONTH=12;
    private static final String NOTICE_MENU_INPUT = "주문하실 메뉴를 메뉴와 개수를 알려 주세요. "
        + "(e.g. 해산물파스타-2,레드와인-1,초코케이크-1)";
    private static final String ORDER_MENU = "<주문 메뉴>";
    private static final String BEFORE_SALE_PRICE = "<할인 전 총주문 금액>";

    private static final String ORDER_FORMAT = "%s %d개";
    private static final String MONEY_FORMAT = "%s원";

    private static final String AFTER_INPUT_MENU= "%d월 %d일에 우테코 식당에서 받을 이벤트 혜택 미리 보기!";

    private static final DecimalFormat currencyForm = new DecimalFormat("###,###,###");

    private static final OutputView instance = new OutputView();

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

    public void printBeforeClaculateBenefit(Menus menus) {
        print(ORDER_MENU);
        for (Entry<String, Integer> nowMenu : menus.getMenuInfo().entrySet()) {
            print(String.format(ORDER_FORMAT, nowMenu.getKey(), nowMenu.getValue()));
        }
        printEnter();
    }


    public void printBeforeMoney(int beforeSalePrice) {
        print(BEFORE_SALE_PRICE);
        print(String.format(MONEY_FORMAT, currencyForm.format(beforeSalePrice)));
        printEnter();
    }


    public void printAfterInputMenu(int date) {
        print(String.format(AFTER_INPUT_MENU,NOW_MONTH,date));
        printEnter();
    }

    private void printEnter() {
        print("");
    }
}
