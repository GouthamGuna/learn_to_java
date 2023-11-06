package in.dev.gmsk.java_8_streams;

import in.dev.gmsk.jdbc.JDBCConnection;
import in.dev.gmsk.model.Employee;
import in.dev.gmsk.model.EmployeeGroupByModel;
import in.dev.gmsk.model.GroupByModel;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

class GroupingByMultipleFieldsExample {

    private static List<Employee> fetchEmployeeDetails(Connection connection) {

        PreparedStatement stmt = null;
        ResultSet rs = null;
        List<Employee> addAllEmployee = new ArrayList<>();
        Employee employeeObject;

        try {

            stmt = connection.prepareStatement("SELECT * FROM `employee`");
            rs = stmt.executeQuery();

            while (rs.next()) {

                employeeObject = new Employee();
                employeeObject.setId(rs.getInt("id"));
                employeeObject.setName(rs.getString("name"));
                employeeObject.setDesignation(rs.getString("designation"));
                employeeObject.setGender(rs.getString("gender"));
                employeeObject.setSalary(rs.getDouble("salary"));
                addAllEmployee.add(employeeObject);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (null != rs && !rs.isClosed()) {
                    rs.close();
                }
                if (null != stmt && !stmt.isClosed()) {
                    stmt.close();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        return addAllEmployee;
    }

    static Map<String, Map<String, Long>> groupByDesignationAndGender
            (JDBCConnection jdbcConnection) {

        Connection connection = null;
        Map<String, Map<String, Long>> multipleFieldsMap = null;

        try {

            connection = JDBCConnection.getDataBaseConnection(jdbcConnection);

            List<Employee> employees = fetchEmployeeDetails(connection);

            // group by - multiple fields
            // Grouping by designation and Gender two properties and need to get the count.

            multipleFieldsMap = employees.stream()
                    .collect(
                            Collectors.groupingBy(Employee::getDesignation,
                                    Collectors.groupingBy(Employee::getGender,
                                            Collectors.counting()))
                    );

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (null != connection && !connection.isClosed()) {
                    connection.close();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        return multipleFieldsMap;
    }

    static Map<String, Long> groupByDesignation(JDBCConnection jdbcConnection) {

        Connection connection = null;
        Map<String, Long> multipleFieldsMap = null;

        try {

            connection = JDBCConnection.getDataBaseConnection(jdbcConnection);

            List<Employee> employees = fetchEmployeeDetails(connection);


            // group by - multiple fields
            // Grouping by designation properties and need to get the count.

            multipleFieldsMap = employees.stream()
                    .collect(
                            Collectors.groupingBy(Employee::getDesignation,
                                    Collectors.counting())
                    );

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (null != connection && !connection.isClosed()) {
                    connection.close();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        return multipleFieldsMap;
    }

    static Map<String, Map<String, List<Employee>>> groupByMultipleFieldsCollectAggregated
            (JDBCConnection jdbcConnection) {

        Connection connection = null;
        Map<String, Map<String, List<Employee>>> stringMapMap = null;

        try {

            connection = JDBCConnection.getDataBaseConnection(jdbcConnection);

            List<Employee> employees = fetchEmployeeDetails(connection);

            stringMapMap = employees.stream().collect(
                    Collectors.groupingBy(
                            Employee::getDesignation,
                            Collectors.groupingBy(Employee::getGender)
                    )
            );

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (null != connection && !connection.isClosed()) {
                    connection.close();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        return stringMapMap;
    }

    static Map<GroupByModel, Long> avoidCollectorsChaining(JDBCConnection jdbcConnection){

        Connection connection = null;
        Map<GroupByModel, Long> returnValue;

        try{
            connection = JDBCConnection.getDataBaseConnection(jdbcConnection);

            List<Employee> employees = fetchEmployeeDetails(connection);

           /* Map<GroupByModel, Long> multipleFieldsMap = employees.stream()
                    .collect(Collectors.groupingBy(EmployeeGroupByModel::getGroupBy,
                            Collectors.counting()));*/

        }catch (Exception e){
            e.printStackTrace();
        }

        return null;
    }
}
