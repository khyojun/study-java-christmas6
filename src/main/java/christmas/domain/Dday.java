package christmas.domain;

public class Dday {

    public int checkSale(Date date) {
        if(date.getDate() < 25)
            return (date.getDate() -1) * 100;
        return 0;
    }
}
