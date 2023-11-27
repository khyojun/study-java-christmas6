package christmas.domain;

public class Benefit {


    private Gift gift = new Gift();
    private SaleStatus saleStatus = new SaleStatus(
        new Dday(),
        new WeekSale(),
        new SpecialDay()
    );

    private boolean empty;

    public Gift getGift() {
        return gift;
    }

    public SaleStatus getSaleStatus() {
        return saleStatus;
    }

    public boolean checkGift(Menus menus) {
        return gift.judgeGift(menus);
    }

    public void checkSaleStatus(Menus menus, Date date) {
        saleStatus.checkSale(menus, date);
    }

    public boolean isEmpty() {
        return saleStatus.getWeekSale().getPrice() == 0 && saleStatus.getDday().getPrice() == 0
            && saleStatus.getSpecialDay().getPrice() == 0 && gift.getPrice() == 0;
    }

    public int totalBenefitPrice(){
        return saleStatus.getWeekSale().getPrice() +  saleStatus.getDday().getPrice() +
            + saleStatus.getSpecialDay().getPrice() + gift.getPrice();
    }
}
