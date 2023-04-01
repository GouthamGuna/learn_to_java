package vending_machine;

public class ExceptionHandler extends RuntimeException{

    private String resourceName;

    private String fileName;

    private Object fileValue;

    public ExceptionHandler(String resourceName, String fileName, Object fileValue){
        super(String.format("%s not found with %s : %s ", resourceName, fileName, fileValue));
        this.resourceName = resourceName;
        this.fileName = fileName;
        this.fileValue = fileValue;
    }
}
