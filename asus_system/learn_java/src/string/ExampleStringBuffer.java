package string;

public class ExampleStringBuffer {

    public static void main(String[] args) {

        String subjectName = "English";

        StringBuilder stringBuilder =new StringBuilder();
        stringBuilder.append("Nil" + ", ").append(subjectName);

        System.out.println("stringBuilder() : "+stringBuilder);

    }
}
