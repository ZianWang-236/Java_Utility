package Basics;

public class MethodArgsTest {
    public void func1(String s, int i){
        System.out.println("1");
    }

    public void func1(int i, String s){
        System.out.println("2");
    }

    public void func1(String ... strs){
        System.out.println("3");
    }
    public void func1(String str){
        System.out.println("4");
    }
    public void func1(int ... str){
        System.out.println("5");
    }

    public void func1(String strs, int ... str){
        System.out.println("6");
    }

    public static void main(String[] args) {
        MethodArgsTest sol = new MethodArgsTest();
        sol.func1("hello", 1);
        sol.func1(1, "hello");
        sol.func1("hi");
        sol.func1("hi", "hey");
        sol.func1(1,2,3);
        sol.func1("aa", 1,2,3);
    }
}

