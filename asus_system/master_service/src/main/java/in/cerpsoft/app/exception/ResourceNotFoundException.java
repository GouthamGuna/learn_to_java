package in.cerpsoft.app.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class ResourceNotFoundException extends RuntimeException{

    public ResourceNotFoundException(String resourceName, String fileName, Object fileValue){
        super(String.format("%s not found with %s : %s",resourceName, fileName, fileValue));

    }
}
