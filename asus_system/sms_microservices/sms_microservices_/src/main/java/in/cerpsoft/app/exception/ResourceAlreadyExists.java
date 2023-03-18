package in.cerpsoft.app.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.BAD_REQUEST)
public class ResourceAlreadyExists extends RuntimeException{

    private String resourceName;
    private String fileName;
    private Object fileValue;

    public ResourceAlreadyExists(String resourceName, String fileName, Object fileValue){
        super(String.format("%s record already exists %s : %s",resourceName, fileName, fileValue));

        this.resourceName = resourceName;
        this.fileName = fileName;
        this.fileValue = fileValue;
    }

    public String getResourceName() {
        return resourceName;
    }

    public String getFileName() {
        return fileName;
    }

    public Object getFileValue() {
        return fileValue;
    }
}
