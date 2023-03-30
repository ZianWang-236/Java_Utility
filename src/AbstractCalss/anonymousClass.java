package AbstractCalss;

public class anonymousClass {
    public static void main(String[] args) {
        // 匿名子类的有名对象square
        Shapes square = new Shapes() {

            public int sideLength = 5;

            @Override
            public double findArea() {
                return sideLength * sideLength;
            }
        };

        System.out.println(square.findArea());
    }
}
