package christmas.domain;

import christmas.constant.Menu;

public class Gift {

    private static final Menu GIFT_MENU = Menu.SHAMPAIGN;

    private static final int GIFT_COUNT = 1;

    public boolean judgeGift(Menus menus) {
        return menus.calculateBeforeSale() >= 120000;
    }

    public static Menu getGiftMenu() {
        return GIFT_MENU;
    }
    public static int getGiftCount(){
        return GIFT_COUNT;
    }
}
