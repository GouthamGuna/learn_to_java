package food_order_project;

import java.util.List;

public interface FoodItems {

    List<String> getMenu();

    void getMealList(int item);

    void getBreakFastItems();

    List<String> getLunchItems();

    int addTotalAmount(int price, int qty);

    int setAmount(int mealName);
}
