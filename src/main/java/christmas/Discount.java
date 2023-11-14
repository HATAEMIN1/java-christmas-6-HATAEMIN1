package christmas;

import java.util.List;

public class Discount {
    public void giftEvent(int totalOrderAmount) {
        if (totalOrderAmount >= 120000) {
            System.out.println("샴페인 1개");
            System.out.println();
        }
        if (totalOrderAmount < 120000) {
            System.out.println("없음");
            System.out.println();
        }
    }

    public int benefitDetailsdday(int date, int totalOrderAmount) {
        if (totalOrderAmount >= 10000) {
            if (date >= 1 && date <= 25) {
                int startDiocunt = 1000;
                int dicountplus = 100;
                int day = date - 1;
                int totalDiscount = startDiocunt + (day * dicountplus);
                return totalDiscount;
            }
        }
        return 0;
    }

    public int benefitDetailsweekday(int date, List<String> menuList, int totalOrderAmount) {
        if (totalOrderAmount >= 10000) {
            if (date % 7 == 3 || date % 7 == 4 || date % 7 == 5 || date % 7 == 6 || date % 7 == 0) {
                MenuList totalMenuList = new MenuList();
                List<Menu> menus = totalMenuList.getMenuList();
                int dessertDiscount = 2023;
                int totalDessertDiscount = 0;

                for (int i = 0; i < menuList.size(); i += 2) {
                    String menuItem = menuList.get(i);
                    int quantity = Integer.parseInt(menuList.get(i + 1));
                    for (Menu menu : menus) {
                        if (menu.getName().equals(menuItem) && menu.getCategory().equals("디저트")) {
                            totalDessertDiscount += dessertDiscount * quantity;
                            break;
                        }
                    }
                }
                return totalDessertDiscount;
            }
        }
        return 0;
    }

    public int benefitDetailsweekend(int date, List<String> menuList,int totalOrderAmount) {
        if (totalOrderAmount>=10000){
            if (date % 7 == 1 || date % 7 == 2) {
                MenuList totalMenuList = new MenuList();
                List<Menu> menus = totalMenuList.getMenuList();
                int mainDiscount = 2023;
                int totalMainDiscount = 0;

                for (int i = 0; i < menuList.size(); i += 2) {
                    String menuItem = menuList.get(i);
                    int quantity = Integer.parseInt(menuList.get(i + 1));
                    for (Menu menu : menus) {
                        if (menu.getName().equals(menuItem) && menu.getCategory().equals("메인")) {
                            totalMainDiscount += mainDiscount * quantity;
                            break;
                        }
                    }
                }
                return totalMainDiscount;
            }
        }
        return 0;
    }

    public int benefitDetailsSpecial(int date, int totalOrderAmount) {
        if (totalOrderAmount >= 10000) {
            if (date % 7 == 3 || date == 25) {
                int specialDiocunt = 1000;
                return specialDiocunt;
            }
        }
        return 0;
    }

    public int benefitDetailsGift(int totalOrderAmount) {
        if (totalOrderAmount >= 120000) {
            return 25000;
        }
        return 0;
    }

}
