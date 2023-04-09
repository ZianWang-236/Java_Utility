package Basics.exceptions;

public class EcDef extends Exception{
    static final long serialVersionUID = -123451989753159L;

    public EcDef(){

    }

    public EcDef(String msg){
        super(msg);
    }
}

