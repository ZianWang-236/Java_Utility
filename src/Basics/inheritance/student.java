package Basics.inheritance;

public class student extends people{

    private String major;

    public student() {
    }

    public student(int age, String gender, String major) {
        super(age, gender);
        this.major = major;
    }
    public void printAge(){
        System.out.println(this.getAge() + "!!!");
    }
    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public static void main(String[] args) {
        student a = new student(2, "female", "sci");
        System.out.println(a.getAge());
        System.out.println(a.getGender());
        System.out.println(a.getMajor());
        a.printAge();

    }
}
