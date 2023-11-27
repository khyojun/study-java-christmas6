package christmas.domain;

public class Badge {

    public String badgeFind(Benefit benefit) {
        int totalBenefitPrice = benefit.totalBenefitPrice();
        if(totalBenefitPrice>=20000){
            return "산타";
        }
        if(totalBenefitPrice>=10000){
            return "트리";
        }
        if(totalBenefitPrice>=5000){
            return "별";
        }
        return "없음";
    }
}
