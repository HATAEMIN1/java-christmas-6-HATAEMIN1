package christmas;

import java.util.ArrayList;
import java.util.List;

public class MenuList {
    private List<Menu> menuList;

    public MenuList() {
        this.menuList = new ArrayList<>();
        initializeMenu();
    }

    private void initializeMenu() {
        menuList.add(new Menu("양송이수프","에피타이저", 6000));
        menuList.add(new Menu("타파스", "에피타이저", 5500));
        menuList.add(new Menu("시저샐러드", "에피타이저", 8000));

        menuList.add(new Menu("티본스테이크","메인", 55000));
        menuList.add(new Menu("바비큐립", "메인",54000));
        menuList.add(new Menu("해산물파스타", "메인",35000));
        menuList.add(new Menu("크리스마스파스타", "메인",25000));

        menuList.add(new Menu("초코케이크", "디저트",15000));
        menuList.add(new Menu("아이스크림", "디저트",5000));

        menuList.add(new Menu("제로콜라", "음료",3000));
        menuList.add(new Menu("레드와인", "음료",60000));
        menuList.add(new Menu("샴페인", "음료",25000));
    }
    public List<Menu> getMenuList() {
        List<Menu> initialMenuList = new ArrayList<>();
        for (int i = 0; i < 12; i++) {
            initialMenuList.add(menuList.get(i));
        }
        return initialMenuList;
    }
}
