package food_order_project;

public interface FoodItems {

    void getMenu();

    void getMealList(int item);

    void getBreakFastItems();

    void getLunchItems();

    int addTotalAmount(int price, int qty);

    int setAmount(int mealName);
}
