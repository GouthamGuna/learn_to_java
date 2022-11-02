package Food_Order_Project;

import java.util.Scanner;

public class MainMethod {
    public static void main(String[] args) {

        FoodItemsImpl foodList=new FoodItemsImpl();

        System.out.println(foodList.getMenu());

        System.out.print("Enter Menu name : ");
        Scanner scanner=new Scanner(System.in);
        String menuname= scanner.next();

        System.out.println(foodList.selectTimingMeals(menuname));
    }
}
