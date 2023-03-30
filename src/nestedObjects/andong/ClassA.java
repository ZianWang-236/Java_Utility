package nestedObjects.andong;

public class ClassA {
    String strA;
    ClassB classB;

    public ClassA() {
        strA = "This is classA";
    }

    public String getStrA() {
        return strA;
    }

    public void setStrA(String strA) {
        this.strA = strA;
    }

    public ClassB getClassB() {
        return classB;
    }

    public void setClassB(ClassB classB) {
        this.classB = classB;
    }
}
