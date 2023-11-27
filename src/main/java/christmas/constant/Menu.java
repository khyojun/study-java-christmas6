package christmas.constant;

import static christmas.constant.Category.APPETIZER;
import static christmas.constant.Category.*;
import static christmas.constant.Category.MAIN;

import java.util.Arrays;

public enum Menu {

    MUSHROOM_SOUP("양송이수프",6_000, APPETIZER),
    TAPAS("타파스", 5_500, APPETIZER),
    CAESER_SALAD("시저샐러드", 8_000, APPETIZER),

    T_BONE_STEAK("티본스테이크",55_000, MAIN),

    BBQ_LIP("바비큐립",54_000, MAIN),
    SEAFOOD_PASTA("해산물파스타", 35_000, MAIN),

    CHRISTMAS_PASTA("크리스마스파스타",25_000,MAIN),

    CHOCO_CAKE("초코케이크", 15_000, DESSERT),

    ICECREAM("아이스크림", 5_000, DESSERT),

    ZERO_COKE("제로콜라", 3_000, BEVERAGE),

    RED_WINE("레드와인", 60_000, BEVERAGE),

    SHAMPAIGN("샴페인", 25_000, BEVERAGE);


    private String name;
    private int price;
    private Category category;


    Menu(String name, int price, Category category) {
        this.name = name;
        this.price = price;
        this.category = category;
    }


    public static void validateName(String name){
        if(Arrays.stream(Menu.values()).noneMatch(m -> m.getName().equals(name)))
            throw new IllegalArgumentException();
    }

    public static void validateCount(String count) {
        try{
            int convertCount = Integer.parseInt(count);
            if(convertCount<1 || convertCount >20)
                throw new IllegalArgumentException();
        }catch (IllegalArgumentException error){
            throw new IllegalArgumentException();
        }
    }


    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public Category getCategory() {
        return category;
    }
}
