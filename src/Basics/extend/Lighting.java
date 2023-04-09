package Basics.extend;

public interface Lighting {

    String name = "lighting connector";

    String lightingUUID = "qwerty";

    void connect();

    void charge();

    void fileTransfer(String file);

    static void staticLighting(){
        System.out.println("function: staticLighting()");
    }

}
