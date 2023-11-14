package christmas;

import java.util.List;

public class EventPlanner {
    public void eventPlanner(){
        MenuList menuList = new MenuList();
        System.out.println("안녕하세요! 우테코 식당 12월 이벤트 플래너입니다.");
        InputView inputView = new InputView();
        int readDate = inputView.readDate();
        List<String> input =inputView.menu();
        System.out.println("12월"+ readDate+"일에 우테코 식당에서 받을 이벤트 혜택 미리 보기!");
        System.out.println();
        OutputView outputView = new OutputView();
        outputView.printMenu(input);
        int totalOrderAmount= outputView.totalOrderAmount(input);
        outputView.giftMenu();
        Discount discount = new Discount();
        discount.giftEvent(totalOrderAmount);
        int benefitDetailsdday = discount.benefitDetailsdday(readDate,totalOrderAmount);
        int benefitDetailsweekday = discount.benefitDetailsweekday(readDate,input,totalOrderAmount);
        int benefitDetailsweekend = discount.benefitDetailsweekend(readDate,input,totalOrderAmount);
        int benefitDetailsSpecial= discount.benefitDetailsSpecial(readDate,totalOrderAmount);
        int benefitDetailsGift = discount.benefitDetailsGift(totalOrderAmount);
        outputView.benefit(totalOrderAmount,benefitDetailsdday,benefitDetailsweekday,benefitDetailsweekend,benefitDetailsSpecial,benefitDetailsGift);
        int totalbenefit = benefitDetailsdday+benefitDetailsweekday+benefitDetailsweekend+benefitDetailsSpecial+benefitDetailsGift;
        outputView.totalBenefit(totalbenefit);
        outputView.expectedAmount(totalOrderAmount,benefitDetailsdday,benefitDetailsweekday,benefitDetailsweekend,benefitDetailsSpecial);
        Badge badge = new Badge();
        String bagecategory = badge.badgeEvent(totalbenefit);
        outputView.badge(bagecategory);
    }


}
