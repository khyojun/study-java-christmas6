package christmas.domain;

import java.util.List;

public class SpecialDay {

    private static final List<Integer> specialDay = List.of(3,10,17,24,25,31);

    private int price;


    public SpecialDay() {
        this.price = 0;
    }

    public int getPrice() {
        return price;
    }

    public void recordSale(Date date) {
        if(specialDay.contains(date.getDate())){
            price=1000;
        }
    }
}
