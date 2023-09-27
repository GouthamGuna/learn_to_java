package in.gmsk.exception;

import java.sql.SQLException;

public class DataTruncationException extends SQLException {

    public DataTruncationException(String message){
        super(message);
    }

    public DataTruncationException (String message, Throwable cause){
        super(message, cause);
    }
}
