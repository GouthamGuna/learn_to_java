package exception;

public class CustomExceptions extends Exception{

    String message;

    public CustomExceptions(String ignoredE) {
        message= String.valueOf(ignoredE);
    }

    public String toString(){
        return ("Custom Exception Occurred : "+message);
    }
}
