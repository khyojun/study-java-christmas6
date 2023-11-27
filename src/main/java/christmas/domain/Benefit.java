package christmas.domain;

public class Benefit {


    private Gift gift = new Gift();
    private SaleStatus saleStatus = new SaleStatus();


    public boolean checkGift(Menus menus) {
        return gift.judgeGift(menus);
    }

    public void checkSaleStatus(Menus menus, Date date) {
        saleStatus.checkSale(menus, date);
    }
}
