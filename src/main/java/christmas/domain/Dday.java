package christmas.domain;

public class Dday {

    private int price;

    public Dday() {
        this.price = 0;
    }


    public int getPrice() {
        return price;
    }

    public int recordSale(Date date) {
        if(date.getDate() < 25)
            return (date.getDate() -1) * 100;
        return 0;
    }
}
