package christmas;

import java.util.List;

public class Exception {
    //메뉴 형식 예외처리
    public void  formaterror(String[] menus){
        if (menus.length !=2){
            System.out.println("[ERROR] 유효하지 않은 주문입니다. 다시 입력해 주세요.");
        }
    }
    //메뉴판에 없는 메뉴
    public void nomenu(String[] menus,MenuList nomenucheck){
        boolean menuFound = false;
        for (Menu menu : nomenucheck.getMenuList()) {
            if (menu.getName().equals(menus[0])) {
                menuFound = true;
                break;
            }
        }
        if (!menuFound) {
            System.out.println("[ERROR] 유효하지 않은 주문입니다. 다시 입력해 주세요.");
        }
    }
    //중복 메뉴
    public void duplicateMenu(String[] menus,List<String> orderList){
        String menuName = menus[0];
        if (orderList.contains(menuName)) {
            System.out.println("[ERROR] 유효하지 않은 주문입니다. 다시 입력해 주세요.");
        }

    }
    public void numberMenu(String[] menus){
        try {
            if (menus.length != 2 || Integer.parseInt(menus[1]) < 1) {
                System.out.println("[ERROR] 유효하지 않은 주문입니다. 다시 입력해 주세요.");
            }
        }catch (NumberFormatException e){
            System.out.println("[ERROR] 유효하지 않은 주문입니다. 다시 입력해 주세요.");
        }

    }

}
