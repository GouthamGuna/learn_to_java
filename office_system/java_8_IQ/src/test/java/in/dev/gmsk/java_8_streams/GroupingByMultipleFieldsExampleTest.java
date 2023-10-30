package in.dev.gmsk.java_8_streams;

import in.dev.gmsk.jdbc.JDBCConnection;
import in.dev.gmsk.model.Employee;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Map;

class GroupingByMultipleFieldsExampleTest {

    private static final String url = "jdbc:mysql://localhost:3306/dev_gmsk_db";
    private static final String user = "root";
    private static final String password = "root";
    private static final JDBCConnection jdbcConnection;

    static{
        jdbcConnection = new JDBCConnection(url, user, password);
    }

    @Test
    void groupByDesignationAndGenderTest() {

        Map<String, Map<String, Long>> stringMapMap =
                GroupingByMultipleFieldsExample.groupByDesignationAndGender(jdbcConnection);

        System.out.println("stringMapMap = " + stringMapMap);
    }

    @Test
    void groupByDesignationTest() {

        Map<String, Long> stringLongMap =
                GroupingByMultipleFieldsExample.groupByDesignation(jdbcConnection);

        System.out.println("stringLongMap = " + stringLongMap);
    }

    @Test
    void groupByMultipleFieldsCollectAggregatedTest() {

        Map<String, Map<String, List<Employee>>> stringMapMap =
                GroupingByMultipleFieldsExample.groupByMultipleFieldsCollectAggregated(jdbcConnection);

        System.out.println("stringMapMap = " + stringMapMap);
    }
}