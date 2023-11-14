package christmas;

import java.util.List;

public class EventPlanner {
    public void eventPlanner(){
        MenuList menuList = new MenuList();
        System.out.println("메뉴");
        InputView inputView = new InputView();
        int readDate = inputView.readDate();
        System.out.println(readDate);
        List<String> input =inputView.menu();
        System.out.println(input);
    }


}
