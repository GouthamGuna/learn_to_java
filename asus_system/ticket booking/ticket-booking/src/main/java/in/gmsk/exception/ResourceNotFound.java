package in.gmsk.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value= HttpStatus.NOT_FOUND)
public class ResourceNotFound extends RuntimeException{

    private final String resourcename;
    private final String fieldname;
    private final Object fieldvalue;

    public ResourceNotFound(String resourcename, String fieldname, Object fieldvalue) {
        super(String.format("%s not found with %s : '%s'",resourcename, fieldname, fieldvalue));
        this.resourcename = resourcename;
        this.fieldname = fieldname;
        this.fieldvalue = fieldvalue;
    }

    public String getResourcename() {
        return resourcename;
    }

    public String getFieldname() {
        return fieldname;
    }

    public Object getFieldvalue() {
        return fieldvalue;
    }
}
