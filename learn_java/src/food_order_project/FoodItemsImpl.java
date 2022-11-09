package food_order_project;

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
        getBFItems.add(" Idli Recipe   : rs : 30 ");
        getBFItems.add(" Masala Dosa   : rs : 30 ");
        getBFItems.add(" Appam Recipe  : rs : 50 ");
        getBFItems.add(" Pongal Recipe : rs : 50 ");
        getBFItems.add(" Rava Pongal   : rs : 30 ");
        getBFItems.add(" Medu Vada     : rs : 10 ");
        return getBFItems;
    }

    @Override
    public List<String> getLunchItems() {

        List<String> getLunchItm=new ArrayList<>();
        getLunchItm.add("Tamarind Rice       : rs : 30");
        getLunchItm.add("Arachu Vitta Sambar : rs : 30");
        return getLunchItm;
    }

    @Override
    public Integer addTotalAmount(int price, int qty) {
        return price*qty;
    }
}
