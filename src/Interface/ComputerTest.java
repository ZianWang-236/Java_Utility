package Interface;

public class ComputerTest {
    public static void main(String[] args) {
        Computer ASUS = new Computer();
        flashDrive kingston = new flashDrive();
        ASUS.transferOut(kingston);

        ssd seagate = new ssd();
        ASUS.transferOut(seagate);
    }
}
