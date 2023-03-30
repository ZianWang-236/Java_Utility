package Interface;

public class flashDrive implements Usb{

    final String deviceName = "flashDrive";

    public String getDeviceName() {
        return deviceName;
    }

    @Override
    public void startTrans() {
        System.out.println("start transferring data(flashDrive)");
    }

    @Override
    public void stopTrans() {
        System.out.println("transfer stopped(flashDrive)");
    }
}

