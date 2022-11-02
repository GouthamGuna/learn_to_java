package Food_Order_Project;

import java.util.List;

public interface FoodItems {

    List<String> getMenu();
    
    String selectTimingMeals(String meal);

    List<String> getBreakFastItems();

    List<String> getLunchItems();
}
