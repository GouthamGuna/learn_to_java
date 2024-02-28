package in.dev.gmsk.controller;

import in.dev.gmsk.service.FastExcelService;

import java.io.IOException;
import java.util.List;
import java.util.Map;

public class FastExcelHelper {

    public static void main(String[] args) throws IOException {

        FastExcelService fastexcelService = new FastExcelService();

        // Map<Integer, List<String>> integerListMap = fastexcelService.readExcel("C:\\Users\\User\\Downloads\\JUNETransportDefaulterReport(2).xlsx");

        // System.out.println("integerListMap = " + integerListMap);

        fastexcelService.writeExcel();
    }
}

