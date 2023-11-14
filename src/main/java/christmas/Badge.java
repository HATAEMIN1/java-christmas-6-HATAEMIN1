package christmas;

public class Badge {
    public String badgeEvent(int totalbenefit){
        if (totalbenefit>=5000&&totalbenefit<10000){
            String badge = "별";
            return badge;
        }
        if (totalbenefit>=10000&&totalbenefit<20000){
            String badge = "트리";
            return badge;
        }
        if (totalbenefit>=20000){
            String badge = "산타";
            return badge;
        }
        return "없음";
    }
}
