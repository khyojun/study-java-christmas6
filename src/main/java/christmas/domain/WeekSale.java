package christmas.domain;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.List;

public class WeekSale {

    private static final int nowYear=2023;

    private static final int nowMonth=12;

    private static final String weekendMenu = "MAIN";


    private static final String weekMenu = "DESSERT";

    private static final List<Integer> weekendList = List.of(5,6);

    private int price;

    private String week;

    public WeekSale() {
        this.price = 0;
    }

    public int getPrice() {
        return price;
    }

    public String getWeek() {
        return week;
    }

    public int recordSale(Menus menus, Date date) {
        LocalDate localDate = LocalDate.of(nowYear, nowMonth, date.getDate());
        DayOfWeek dayOfWeek = localDate.getDayOfWeek();
        int value = dayOfWeek.getValue();
        if(weekendList.contains(value)){
            week="주말";
            return (int) (menus.countSameMenu(weekendMenu) * 2023);
        }
        week="평일";
        return (int) (menus.countSameMenu(weekMenu) * 2023);
    }
}
