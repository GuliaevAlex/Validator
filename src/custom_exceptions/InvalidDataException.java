package custom_exceptions;

public class InvalidDataException extends Exception{
    public InvalidDataException(){

    }

    public InvalidDataException(String massage){
        super (massage);
    }

    public InvalidDataException(Throwable cause){
        super (cause);
    }

    public InvalidDataException(String massage, Throwable cause){
        super (massage, cause);
    }

}
