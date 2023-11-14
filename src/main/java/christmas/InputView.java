package christmas;

import camp.nextstep.edu.missionutils.Console;

import java.util.*;

public class InputView {
    public int readDate() {
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
        return date;
    }

    public List<String> menu() {
        System.out.println("주문하실 메뉴를 메뉴와 개수를 알려 주세요. (e.g. 해산물파스타-2,레드와인-1,초코케이크-1)");
        String input = Console.readLine();
        String[] menus = input.split(",");
        List<String> menuList = new ArrayList<>();
        MenuList nomenucheck = new MenuList();
        List<String> orderedMenuNames = new ArrayList<>();
        for (String menu : menus) {
            Exception exception = new Exception();
            String[] menuNumber = menu.split("-");
            exception.formaterror(menuNumber);
            exception.numberMenu(menuNumber);
            exception.nomenu(menuNumber,nomenucheck);
            exception.duplicateMenu(menuNumber,orderedMenuNames);
            orderedMenuNames.add(menuNumber[0]);
            menuList.addAll(Arrays.asList(menuNumber));
        }
        return menuList;
    }
}
