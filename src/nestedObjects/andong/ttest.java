package nestedObjects.andong;

//import com.sun.org.apache.bcel.internal.generic.INSTANCEOF;

public class ttest {
    public static void main(String[] args) {
        ClassA classA = new ClassA();
        ClassB classB = new ClassB();
        classA.setClassB(classB);
        classB.setClassA(classA);
        System.out.println(classA.getClassB().getStrB());
        System.out.println(classB.getClassA().getStrA());
    }
}
