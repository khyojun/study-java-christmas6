package christmas.controller;

import christmas.domain.Badge;
import christmas.domain.Benefit;
import christmas.domain.Date;
import christmas.domain.Gift;
import christmas.domain.Menus;
import christmas.exception.MenuException;
import christmas.view.InputView;
import christmas.view.OutputView;
import java.beans.beancontext.BeanContext;

public class ChristmasEventController {


    private Benefit benefit = new Benefit();
    private Badge badge = new Badge();
    private InputView inputView;
    private OutputView outputView;

    public ChristmasEventController(InputView inputView, OutputView outputView) {
        this.inputView=inputView;
        this.outputView=outputView;
    }

    public void eventStart() {
        Date date = inputDate();
        Menus menus = inputMenu();
        afterInputMenu(date);
        notifyBeforeCalculateBenefit(menus);
        giftCheck(menus);
        saleCheck(menus, date);
        outputView.saleResult(benefit);
        resultCheck(menus, benefit);
        badgeCheck(benefit);

    }

    private void resultCheck(Menus menus,Benefit benefit) {
        outputView.printTotalBenefitPrice(benefit.totalBenefitPrice());
        outputView.printAfterTotalSalePrice(
            menus.calculateBeforeSale(),benefit.getSaleStatus().totalSalePrice());
    }

    private void badgeCheck(Benefit benefit) {
        outputView.printBadge(badge.badgeFind(benefit));
    }

    private void saleCheck(Menus menus, Date date) {
        benefit.checkSaleStatus(menus, date);
    }

    private void giftCheck(Menus menus) {
        outputView.printGift(benefit.checkGift(menus));
    }

//    <증정 메뉴>
//    없음
//
//<혜택 내역>
//    없음
//
//<총혜택 금액>
//0원
//
//    <할인 후 예상 결제 금액>
//        8,500원
//
//        <12월 이벤트 배지>
//    없음

    private void afterInputMenu(Date date) {

        outputView.printAfterInputMenu(date.getDate());
    }

    private void notifyBeforeCalculateBenefit(Menus menus) {
        outputView.printBeforeClaculateBenefit(menus);
        outputView.printBeforeMoney(menus.calculateBeforeSale());
    }



    private Menus inputMenu() {
        try {
            outputView.printInputMenu();
            return new Menus(inputView.inputMenu());
        }catch (IllegalArgumentException error){
            outputView.printError(error.getMessage());
            return inputMenu();
        }
    }

    private Date inputDate() {
        try{
            outputView.printInputDate();
            return new Date(inputView.inputDate());
        }catch (IllegalArgumentException error){
            outputView.printError(error.getMessage());
            return inputDate();
        }
    }
}
