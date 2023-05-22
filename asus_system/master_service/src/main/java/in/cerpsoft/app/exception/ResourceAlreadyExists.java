package in.cerpsoft.app.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.BAD_REQUEST)
public class ResourceAlreadyExists extends RuntimeException{

    public ResourceAlreadyExists(String resourceName, String fileName, Object fileValue){
        super(String.format("%s record already exists %s : %s",resourceName, fileName, fileValue));

    }
}
