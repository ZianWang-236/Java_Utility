package Basics.Interface;

public class HDMITest {

    public void LegionDisplay(HDMI cord){
        int connectRes = cord.connect();
        System.out.println("Connection status: " + connectRes);
        int transmitRes = cord.transmit();
        System.out.println("Transmit status: " + transmitRes);
        cord.defun();
    }

    public static void main(String[] args) {
        NintendoCord nintendoCord = new NintendoCord();
        HDMITest hdmiTest = new HDMITest();
        hdmiTest.LegionDisplay(nintendoCord);
        System.out.println("-----------------------");
        System.out.println(nintendoCord.name);
        System.out.println(HDMI.name);
        System.out.println(HDMI.connectorType);
        System.out.println("-----------------------");
        AmazonBasicCord amazonBasicCord = new AmazonBasicCord();
        hdmiTest.LegionDisplay(amazonBasicCord);
        amazonBasicCord.connect("hello");
        System.out.println("-----------------------");
        HDMI.Util();

    }
}
