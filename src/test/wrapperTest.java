package test;

public class wrapperTest {

    public static void main(String[] args) {
        Boolean b1 = new Boolean("TrUe");
        System.out.println(b1);

        int n1 = 10;
        String s1 = "123";
        Integer in0 = n1;
        Integer in1 = Integer.parseInt(s1);
        System.out.println(in0);
        System.out.println(in1);

        Object o1 = false ? new Integer(1) : new Double(2.0);
        System.out.println(o1);
    }
}
