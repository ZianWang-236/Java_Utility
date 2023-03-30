package AbstractCalss;

import java.rmi.MarshalledObject;

public abstract class Shapes {

    protected final static int CLASSID = 999;
    private String color;
    private Double area;

    public Shapes(){}

    public Shapes(String color){
        this.color = color;
    }

    public Shapes(double area){
        this.area = area;
    }

    public Shapes(String color, double area) {
        this.color = color;
        this.area = area;
    }

    //
    public abstract double findArea();

    @Override
    public String toString() {
        return "Shapes{" +
                "color='" + color + '\'' +
                ", area=" + area +
                '}';
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }


}
