import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;

class Course{
    private final String name;
    private final String Category;
    private final int reviewScore;
    private final int noOfStudent;

    public Course(String name, String category, int reviewScore, int noOfStudent) {
        this.name = name;
        this.Category = category;
        this.reviewScore = reviewScore;
        this.noOfStudent = noOfStudent;
    }

    public String getCategory() {
        return Category;
    }

    public int getReviewScore() {
        return reviewScore;
    }

    public int getNoOfStudent() {
        return noOfStudent;
    }

    @Override
    public String toString() {
        return "Course{" +
                "name='" + name + '\'' +
                ", reviewScore='" + reviewScore + '\'' +
                ", noOfStudent='" + noOfStudent + '\'' +
                '}';
    }
}


public class FP03CustomClass {
    public static void main(String[] args) {

        List<Course> listOfCourses = List.of(
                new Course("Spring", "FrameWork", 98, 10000),
                new Course("Spring Boot", "FrameWork", 95, 5000),
                new Course("Full Stack", "Full Stack", 97, 60000),
                new Course("Microservice", "Microservice", 99, 80000),
                new Course("API", "Microservice", 94, 8000)
        );

        // allMatch, nonMatch, anyMatch
        Predicate<Course> coursePredicateGreaterThen90 =
                course -> course.getReviewScore() < 90;

        Predicate<Course> coursePredicateGreaterThen95 =
                course -> course.getReviewScore() > 95;

        System.out.println(
        listOfCourses.stream().allMatch(coursePredicateGreaterThen95));

        System.out.println(
                listOfCourses.stream().noneMatch(coursePredicateGreaterThen90));

        // sort the course
        Comparator<Course> comparingByNoOfStudent = Comparator.comparing(Course::getNoOfStudent);

        Comparator<Course> comparingByNoOfStudentDec = Comparator.comparingInt(Course::getNoOfStudent).reversed();

        System.out.println("comparingByNoOfStudent : " +
        listOfCourses.stream().sorted(comparingByNoOfStudent).toList());

        System.out.println("comparingByNoOfStudentDecreasing : " +
                listOfCourses.stream().sorted(comparingByNoOfStudentDec).toList());

        Comparator<Course> comparingByNoOfStudentsNoOfReview = Comparator.comparingInt(Course::getReviewScore);

        System.out.println("comparingByNoOfStudentsNoOfReview : "+
                listOfCourses.stream().sorted(comparingByNoOfStudentsNoOfReview).toList());

        //skip, limit

        System.out.println("comparingByNoOfStudentsNoOfReview using limit : "+
                listOfCourses.stream().sorted(comparingByNoOfStudentsNoOfReview).limit(3).toList());

        System.out.println("comparingByNoOfStudentsNoOfReview using skip : "+
                listOfCourses.stream().sorted(comparingByNoOfStudentsNoOfReview).skip(3).toList());

        System.out.println("filter : "+
        listOfCourses.stream()
                .filter(getMicroservice()).toList());
    }

    private static Predicate<Course> getMicroservice() {
        return course -> course.getCategory().equals("Microservice");
    }
}
