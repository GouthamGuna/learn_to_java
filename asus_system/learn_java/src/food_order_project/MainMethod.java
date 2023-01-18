package food_order_project;

import java.io.IOException;
import java.util.Scanner;

public class MainMethod {
    public static void main(String[] args) throws IOException {

        FoodItemsImpl foodList=new FoodItemsImpl();

        int count=100;
        foodList.getHeaderWithStart();
        for(int i=1; count>=i; i++) {
            foodList.getMenu();
            System.out.println("----------------------------------------------");

            System.out.println("Bill No : "+i+" ");

            System.out.print("Enter Food Menu Id : ");
            Scanner scanner = new Scanner(System.in);
            int menuName = scanner.nextInt();

            foodList.getMealList(menuName, i);
        }
    }
}
