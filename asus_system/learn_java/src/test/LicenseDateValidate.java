package test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class LicenseDateValidate {

    public static void main(String[] args) throws ParseException {

        SimpleDateFormat simpleDateFormat=new SimpleDateFormat("dd-MM-yyyy");

        Date toDayDate = new Date();
        Date startDate = simpleDateFormat.parse("23-02-2022");

        Calendar calendar = Calendar.getInstance();
        calendar.setTime(startDate);
        calendar.add(Calendar.YEAR, 1);

        Date expirationDate = calendar.getTime();

        System.out.println("startDate = " + startDate);
        System.out.println("expirationDate = " + expirationDate);
        System.out.println("toDayDate = " + toDayDate);

        if(!startDate.after(toDayDate) && !expirationDate.before(toDayDate)){
            System.out.println("License Valid");
        }else{
            System.out.println("License Expired");
        }
    }
}


