package Basics.Interface;

public class NintendoCord implements HDMI{

    String name = "Nintendo HDMI cord";

    @Override
    public int connect() {
        System.out.println("NintendoCord connection successful");
        return 1;
    }

    @Override
    public int transmit() {
        System.out.println("NintendoCord transmit successful");
        return 2;
    }
}
