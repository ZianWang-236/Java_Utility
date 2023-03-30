package test;

public class finaTest {
    public static void main(String[] args) {
//        Test test = new Test();
//        System.out.println(test.b);
        System.out.println(Test.b);
    }
}

class Test{
//    {
//        b = 2;
//    }
    final static int a = 1;
    static int b= 9;

    {
        b = 2;
    }
}
