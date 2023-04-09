package Basics.Interface;

public interface HDMI {

    String name = "HDMI interface can transmit video and images";

    int connectorType = 1;

    int connect();

    public abstract int transmit();

    static void Util(){
        int version = 1;
        System.out.println("version: " + version);
    }

    default void defun(){
        System.out.println("interface defun");
    }
}
