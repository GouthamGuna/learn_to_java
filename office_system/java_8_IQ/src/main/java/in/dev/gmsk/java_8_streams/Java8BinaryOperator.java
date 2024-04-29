package in.dev.gmsk.java_8_streams;

import in.dev.gmsk.model.Staff;

import java.math.BigDecimal;
import java.util.*;
import java.util.function.BinaryOperator;

class Java8BinaryOperator {

    /**
     * Arrays.stream(nums).mapToInt(i -> i).sum();
     * <p/>
     * Note : that the mapToInt() method returns an IntStream,
     * which is a specialized stream for working with primitive int values.
     * This can be more efficient than using the stream() method and then converting the result to an int value.
     */

    static int sumOfArraysNumbers(int[] nums) {

        if (nums.length <= 0) return 0;

        return Arrays.stream(nums).reduce(0, Integer::sum);
    }

    static <T> T sumArrayOfValues(List<T> list, T init, BinaryOperator<T> accumulator) {
        T result = init;

        for (T t : list) {
            result = accumulator.apply(result, t);
        }

        return result;
    }

    private static List<Staff> getStaffList() {
        return Arrays.asList(
                new Staff("Saran", BigDecimal.valueOf(25000)),
                new Staff("Karan", BigDecimal.valueOf(25000)),
                new Staff("Navin", BigDecimal.valueOf(30000)),
                new Staff("Gowtham", BigDecimal.valueOf(20000)),
                new Staff("Sreeja", BigDecimal.valueOf(25000)),
                new Staff("Sathaya", BigDecimal.valueOf(25000)),
                new Staff("Saranaya", BigDecimal.valueOf(25000))
        );
    }

    static Staff getHighestPayStaffUsingComparator() {

        // 1. Create a Comparator
        Comparator<Staff> comparator = Comparator.comparing(Staff::getSalary);

        // 2. BinaryOperator with a custom Comparator
        BinaryOperator<Staff> binaryOperator = BinaryOperator.maxBy(comparator);

        return doFind(getStaffList(), binaryOperator);
    }

    static Staff getLowestPayStaffList() {
        return doFind(getStaffList(), BinaryOperator.minBy(Comparator.comparing(Staff::getSalary)));
    }

    private static Staff doFind(List<Staff> list, BinaryOperator<Staff> accumulator) {
        Staff result = null;

        for (Staff s : list) {
            if (result == null) {
                result = s;
            } else {
                result = accumulator.apply(result, s);
            }
        }

        return result;
    }

    static void printAvarageSalary(List<Staff> list){
        list.forEach(s -> System.out.print("Average Salary : "+findAverage(s.getSalary())));
    }

    private static BigDecimal findAverage(BigDecimal... args) {
        BigDecimal sum = BigDecimal.ZERO;

        for (BigDecimal i : args) {
            sum = sum.add(i);
        }

        return sum.divide(BigDecimal.valueOf(args.length), 2, BigDecimal.ROUND_HALF_UP);
    }
}