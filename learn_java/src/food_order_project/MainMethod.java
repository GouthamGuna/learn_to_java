package food_order_project;

import java.util.Scanner;

public class MainMethod {
    public static void main(String[] args) {

        FoodItemsImpl foodList=new FoodItemsImpl();

        System.out.println(foodList.getMenu());

        int count=100;

        for(int i=1; count>=i; i++) {

            System.out.println("Bill Id : "+i+" ");

            System.out.print("Enter Menu name : ");
            Scanner scanner = new Scanner(System.in);
            String menuname = scanner.next();

            System.out.println(foodList.selectTimingMeals(menuname));
        }
    }
}
