import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.util.Iterator;

public class XLSXMain {

    /*
     *   XLSX Classes
     *
     *  XSSFWorkbook: It is a class representing the XLSX file.
     *  XSSFSheet: It is a class representing the sheet in an XLSX file.
     *  XSSFRow: It is a class representing a row in the sheet of XLSX file.
     *  XSSFCell: It is a class representing a cell in a row of XLSX file.
     */
    public static void main(String[] args) {

        try{
            File file=new File("C:\\Users\\User\\Documents\\test.xlsx");

            FileInputStream fis=new FileInputStream(file);

            XSSFWorkbook xssfWorkbook=new XSSFWorkbook(fis);
            XSSFSheet xssfSheet=xssfWorkbook.getSheetAt(0);  //creating a Sheet object to retrieve object

            for (Row row : xssfSheet) {

                Iterator<Cell> cellIterator = row.cellIterator();  //iterating over each column

                while (cellIterator.hasNext()) {

                    Cell cell = cellIterator.next();

                    switch (cell.getCellType()) {

                        case Cell.CELL_TYPE_STRING -> System.out.print(cell.getStringCellValue() + "\t\t\t");

                        case Cell.CELL_TYPE_NUMERIC -> System.out.print(cell.getNumericCellValue() + "\t\t\t");
                    }
                }
                System.out.println(" ");
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}