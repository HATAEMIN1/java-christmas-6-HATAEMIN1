package christmas;

import java.util.List;

public class EventPlanner {
    public void eventPlanner(){
        InputView inputView = new InputView();
        int readDate = inputView.readDate();
        System.out.println(readDate);
        List<String> input =inputView.menu();
        System.out.println(input);
    }


}
