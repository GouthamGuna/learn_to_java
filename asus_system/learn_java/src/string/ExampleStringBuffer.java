package string;

public class ExampleStringBuffer {

    public static void main(String[] args) {

        String subjectName = "Hello";

        StringBuilder stringBuilder =new StringBuilder();
        stringBuilder.append("Hai" + ", ").append(subjectName);

        System.out.println("stringBuilder() : "+stringBuilder);

    }
}
