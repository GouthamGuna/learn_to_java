package update_test;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

// Arrays.asList(2015,2016,2017,2018,2019,2020,2021,2022,2023,2024,2025,2026,2027,2028,2029,2030)

public class YearList {
    public static void main(String[] args) {

        List<Integer> years = new ArrayList<>();
        int endYear = Calendar.getInstance().get(Calendar.YEAR);

        for(int year = 2020; year <= endYear; year++){
            System.out.println("year : "+year);
            years.add(year);
        }

    }
}
