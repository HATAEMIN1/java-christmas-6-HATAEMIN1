package christmas;

import java.util.List;

public class OutputView {
        public void printMenu(List<String> menuList) {
            System.out.println("<주문 메뉴>");
            for (int i = 0; i < menuList.size(); i += 2) {
                System.out.println(menuList.get(i)+" "+menuList.get(i + 1)+"개");
            }
            System.out.println();
        }
        public int totalOrderAmount(List<String> menuList){
            System.out.println("<할인 전 총주문 금액>");
            MenuList totalmenuList = new MenuList();
            List<Menu> menus = totalmenuList.getMenuList();
            int totalAmount = 0;
            for (int i = 0; i < menuList.size(); i += 2) {
                String menuItem = menuList.get(i);
                int quantity = Integer.parseInt(menuList.get(i + 1));

                for (Menu menu : menus) {
                    if (menu.getName().equals(menuItem)) {
                        totalAmount += menu.getPrice() * quantity;
                        break;
                    }
                }
            }
            System.out.println(totalAmount+"원");
            System.out.println();
            return totalAmount;
        }
        public void giftMenu(){
            System.out.println("<증정 메뉴>");
        }
        public void benefit(int benefitDetailsdday,int benefitDetailsweekday,int benefitDetailsweekend,int benefitDetailsSpecial,int benefitDetailsGift){
            System.out.println("<혜택 내역>");
            if (benefitDetailsdday>0){
                System.out.println("크리스마스 디데이 할인: -"+benefitDetailsdday+"원");
            }
            if (benefitDetailsweekday>0){
                System.out.println("평일 할인: -"+benefitDetailsweekday+"원");
            }
            if (benefitDetailsweekend>0){
                System.out.println("주말 할인: -"+benefitDetailsweekend+"원");
            }
            if (benefitDetailsSpecial==1000){
                System.out.println("특별 할인: -"+benefitDetailsSpecial+"원");
            }
            if(benefitDetailsGift==25000){
                System.out.println("증정 이벤트: -"+benefitDetailsGift+"원");
            }
            if (benefitDetailsdday==0&&benefitDetailsweekday==0&&benefitDetailsweekend==0){
                System.out.println("없음");
            }
            System.out.println();
        }
        public  void totalBenefit(int totalbenefit){
            System.out.println("<총혜택 금액>");
            System.out.println("-"+totalbenefit+"원");
            System.out.println();
        }
        public  void expectedAmount(int totalOrderAmount,int benefitDetailsdday,int benefitDetailsweekday,int benefitDetailsweekend,int benefitDetailsSpecial){
            System.out.println("<할인 후 예상 결제 금액>");
            int total = totalOrderAmount-(benefitDetailsdday+benefitDetailsweekday+benefitDetailsweekend+benefitDetailsSpecial);
            System.out.println(total+"원");
            System.out.println();
        }
        public  void badge(){
            System.out.println("<12월 이벤트 배지>");
        }


}
