package Basics.Interface;

public class AmazonBasicCord implements HDMI{

    @Override
    public int connect() {
        System.out.println("AmazonBasicCord connection successful");
        return 3;
    }

    public int connect(String msg){
        System.out.println("AmazonBasicCord connection successful(overloading) with message: " + msg);
        return 99;
    }

    @Override
    public int transmit() {
        System.out.println("AmazonBasicCord transmit successful");
        return 4;
    }

    @Override
    public void defun() {
        HDMI.super.defun();
        System.out.println("AmazonBasicCord defun");
    }
}
