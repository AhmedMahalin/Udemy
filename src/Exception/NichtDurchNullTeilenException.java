package Exception;

public class NichtDurchNullTeilenException extends Exception{

    public NichtDurchNullTeilenException(String message){
        super(message); //super ruft die superklasse von Exception auf

    }
}
