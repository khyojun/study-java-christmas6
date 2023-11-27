package christmas.domain;

import christmas.service.DiscountPolicy;

public class SaleStatus {

    private Dday dday;

    public Dday getDday() {
        return dday;
    }

    public WeekSale getWeekSale() {
        return weekSale;
    }

    public SpecialDay getSpecialDay() {
        return specialDay;
    }

    private WeekSale weekSale;
    private SpecialDay specialDay;

    public SaleStatus(Dday dday, WeekSale weekSale, SpecialDay specialDay) {
        this.dday = dday;
        this.weekSale = weekSale;
        this.specialDay = specialDay;
    }

    public void checkSale(Menus menus, Date date) {
        if(menus.calculateBeforeSale() < 10000){
            return;
        }
        dday.recordSale(date);
        weekSale.recordSale(menus, date);
        specialDay.recordSale(date);
    }

    public int totalSalePrice() {
        return dday.getPrice() + weekSale.getPrice() + specialDay.getPrice();
    }
}
