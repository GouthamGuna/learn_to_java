package food_order_project;

import java.io.IOException;

public interface FoodItems {

    void getMenu();

    void getMealList(int item, int userId);

    void getBreakFastItems();

    void getLunchItems();

    int addTotalAmount(int price, int qty);

    int setAmount(int mealName);

    void getHeaderWithStart() throws IOException;
}
