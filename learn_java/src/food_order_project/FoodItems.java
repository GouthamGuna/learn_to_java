package food_order_project;

import java.util.List;

public interface FoodItems {

    List<String> getMenu();
    
    String selectTimingMeals(String meal);

    List<String> getBreakFastItems();

    List<String> getLunchItems();

    Integer addTotalAmount(int price, int qty);
}
