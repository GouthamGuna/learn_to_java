package Food_Order_Project;

import java.util.ArrayList;
import java.util.List;

public class FoodItemsImpl implements  FoodItems{

    @Override
    public List<String> getMenu() {

        List<String> getMenuList=new ArrayList<>();
        getMenuList.add("breakfast");
        getMenuList.add("lunch");
        getMenuList.add("dinner");
        return getMenuList;
    }

    @Override
    public String selectTimingMeals(String meal) {

        if ("breakfast".equals(meal)) {
            return getBreakFastItems().toString();
        } else if ("lunch".equals(meal)) {
            return getLunchItems().toString();
        }
        return meal;
    }
    @Override
    public List<String> getBreakFastItems() {

        List<String> getBFItems=new ArrayList<>();
        getBFItems.add(" Idli Recipe ");
        getBFItems.add(" Masala Dosa ");
        getBFItems.add(" Appam Recipe ");
        getBFItems.add(" Pongal Recipe ");
        getBFItems.add(" Rava Pongal ");
        getBFItems.add(" Medu Vada ");
        return getBFItems;
    }

    @Override
    public List<String> getLunchItems() {

        List<String> getLunchItm=new ArrayList<>();
        getLunchItm.add("Tamarind Rice");
        getLunchItm.add("Arachu Vitta Sambar");
        return getLunchItm;
    }
}
