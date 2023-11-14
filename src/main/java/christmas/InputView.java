package christmas;

import camp.nextstep.edu.missionutils.Console;

import java.util.*;

public class InputView {
    public int readDate() {
        while (true) {
            int date = 0;
            try {
                System.out.println("12월 중 식당 예상 방문 날짜는 언제인가요? (숫자만 입력해 주세요!)");
                String input = Console.readLine();
                date = Integer.parseInt(input);
                System.out.println(date);
                if (date >= 1 && date <= 31) {
                    return date;
                }
                System.out.println("[ERROR] 유효하지 않은 날짜입니다. 다시 입력해 주세요.");
            } catch (NumberFormatException e) {
                System.out.println("[ERROR] 유효하지 않은 날짜입니다. 다시 입력해 주세요.");
            }
        }
    }

    public List<String> menu() {
        while (true) {
            try {
                System.out.println("주문하실 메뉴를 메뉴와 개수를 알려 주세요. (e.g. 해산물파스타-2,레드와인-1,초코케이크-1)");
                String input = Console.readLine();
                String[] menus = input.split(",");
                MenuList initializeMenuList = new MenuList();
                List<Menu> initializeMenu = initializeMenuList.getMenuList();
                List<String> menuList = new ArrayList<>();
                boolean foundNoMenu = false;
                for (String menu : menus) {
                    String[] menuNumber = menu.split("-");
                    //메뉴 형식,갯수 예외처리
                    if (Integer.parseInt(menuNumber[1]) < 1) {
                        System.out.println("[ERROR] 유효하지 않은 주문입니다. 다시 입력해 주세요.");
                        break;
                    }
                    // 메뉴판에 있는지 확인
                    boolean menuFound = false;
                    for (Menu menuItem : initializeMenu) {
                        if (menuItem.getName().equals(menuNumber[0])) {
                            menuFound = true;
                            break;
                        }
                    }
                    if (!menuFound) {
                        System.out.println("[ERROR] 유효하지 않은 주문입니다. 다시 입력해 주세요.");
                        foundNoMenu = true;
                        break;
                    }
                    menuList.addAll(Arrays.asList(menuNumber));
                }
                if (foundNoMenu){
                    continue;
                }
                //메뉴 20개가 넘을 경우
                int sum = 0;
                for (int i = 0; i < menuList.size(); i = i + 2) {
                    int numberOfMenus = Integer.parseInt(menuList.get(i + 1));
                    sum = sum + numberOfMenus;
                }
                if (sum > 20) {
                    System.out.println("[ERROR] 유효하지 않은 주문입니다. 다시 입력해 주세요.");
                    continue;
                }
                // 중복 메뉴 확인
                boolean foundDuplicate =false;
                for (int i = 0; i < menuList.size() - 2; i = i + 2) {
                    if (menuList.get(i).equals(menuList.get(i + 2))) {
                        System.out.println("[ERROR] 유효하지 않은 주문입니다. 다시 입력해 주세요.");
                        foundDuplicate = true;
                        break;
                    }
                }
                if (foundDuplicate){
                    continue;
                }
                //음료만 시킬경우
                int count = 0;
                for (int i = 0; i < menuList.size() - 1; i = i + 2) {
                    String itemName = menuList.get(i);
                    for (Menu menuItem : initializeMenu) {
                        if (menuItem.getName().equals(itemName) && menuItem.getCategory().equals("음료")) {
                            count++;
                        }
                    }
                }
                if (menuList.size() / 2 == count) {
                    System.out.println("[ERROR] 유효하지 않은 주문입니다. 다시 입력해 주세요.");
                    continue;
                }
                return menuList;
            }
            catch (NumberFormatException e){
                System.out.println("[ERROR] 유효하지 않은 주문입니다. 다시 입력해 주세요.");
            }
        }
    }
}
