package christmas.domain;

import christmas.constant.Menu;

public class Gift {

    private static final Menu GIFT_MENU = Menu.SHAMPAIGN;

    private static final int GIFT_COUNT = 1;

    private int price;

    public Gift() {
        this.price = 0;
    }

    public int getPrice() {
        return price;
    }

    public boolean judgeGift(Menus menus) {
        if(menus.calculateBeforeSale() >=120000){
            price=GIFT_MENU.getPrice();
            return true;
        }
        return false;
    }

    public static Menu getGiftMenu() {
        return GIFT_MENU;
    }
    public static int getGiftCount(){
        return GIFT_COUNT;
    }
}
