package food_order_project;

import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class FoodItemsImpl implements  FoodItems{

    @Override
    public void getMenu() {

        List<String> getMenuList=new ArrayList<>();
        getMenuList.add("Press 1 : Breakfast");
        getMenuList.add("Press 2 : Lunch");
       // getMenuList.add("Press 3 : Dinner");
        getMenuList.add("Press 3 : Exit");
        System.out.println(" ");
        System.out.println(" ");
        getMenuList.forEach(System.out::println);
    }

    @Override
    public void getMealList(int menuNo, int userId) {

        Scanner scanner=new Scanner(System.in);

        switch (menuNo){
            case 1 -> {
                    getBreakFastItems();

                    System.out.print("Enter the Break Fast ID : ");
                    int bfId = scanner.nextInt();

                    System.out.print("Enter the Qty : ");
                    int qty = scanner.nextInt();

                    int total = addTotalAmount(setAmount(bfId), qty);

                    System.out.println("Total Amount : " + total);
                    System.out.println("----------------------------------------------");

            }
            case 2 -> {
                    getLunchItems();

                    System.out.print("Enter the Lunch ID : ");
                    int lunId = scanner.nextInt();

                    System.out.print("Enter the Qty : ");
                    int qty = scanner.nextInt();

                    int total = addTotalAmount(setAmount(lunId), qty);

                    System.out.println("Total Amount : " + total);
                    System.out.println("----------------------------------------------");
            }
            case 3 -> System.exit(0);
        }
    }

    @Override
    public void getBreakFastItems() {

        List<String> getBFItems=new ArrayList<>();
        getBFItems.add("1 : Idli Recipe   : rs : 30 ");
        getBFItems.add("2 : Masala Dosa   : rs : 30 ");
        getBFItems.add("3 : Appam Recipe  : rs : 50 ");
        getBFItems.add("4 : Pongal Recipe : rs : 50 ");
        getBFItems.add("5 : Rava Pongal   : rs : 30 ");
        getBFItems.add("6 : Medu Vada     : rs : 10 ");

        getBFItems.forEach(System.out::println);
        System.out.println(" ");
    }

    @Override
    public void getLunchItems() {

        List<String> getLunchItm=new ArrayList<>();
        getLunchItm.add("7 : Tamarind Rice       : rs : 30");
        getLunchItm.add("8 : Arachu Vitta Sambar : rs : 30");

        getLunchItm.forEach(System.out::println);
        System.out.println(" ");
    }

    @Override
    public int addTotalAmount(int price, int qty) {
        return price*qty;
    }

    @Override
    public int setAmount(int mealAmount) {

        HashMap<Integer, Integer> getAmount =new HashMap<>();
        getAmount.put(1, 30);
        getAmount.put(2, 30);
        getAmount.put(3, 50);
        getAmount.put(4, 50);
        getAmount.put(5, 30);
        getAmount.put(6, 10);
        getAmount.put(7, 30);
        getAmount.put(8, 30);

        return getAmount.getOrDefault(mealAmount,0);
    }

    @Override
    public void getHeaderWithStart() throws IOException {
        FileReader fileReader=new FileReader("cat.txt");
        int data = fileReader.read();
        while (data != -1){
            System.out.print((char) data);
            data = fileReader.read();
        }
        fileReader.close();
    }
}
