package nestedObjects.andong;

public class ClassB {
    String strB;
    ClassA classA;

    public ClassB() {
        strB = "This is classB";
    }

    public String getStrB() {
        return strB;
    }

    public void setStrB(String strB) {
        this.strB = strB;
    }

    public ClassA getClassA() {
        return classA;
    }

    public void setClassA(ClassA classA) {
        this.classA = classA;
    }
}
