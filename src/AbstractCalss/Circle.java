package AbstractCalss;

public class Circle extends Shapes {

    private int diameter;

    private static final double PI = 3.1415926;

    {
        System.out.println("before block");
        System.out.println("after block");
    }

    public Circle() {}

    public Circle(int diameter) {
        this.diameter = diameter;
    }

    public Circle(int diameter, String color){

        super(color);
        System.out.println("before construction");
        this.diameter = diameter;
        this.setArea(this.findArea());
        System.out.println("after construction");
    }

    @Override
    public String toString() {
        return "Circle{" +
                "diameter=" + diameter +
                ", color=" + this.getColor() +
                ", area=" + this.getArea() +
                '}';
    }

    public int getDiameter() {
        return diameter;
    }

    public void setDiameter(int diameter) {
        this.diameter = diameter;
    }

    @Override
    public double findArea() {
        return PI * Math.pow(this.diameter, 2) ;
    }
}
