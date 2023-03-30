package inheritanceTest;

public class student extends people{

    private String major;

    // 调用super的已有构造器
//    public student(int age, String name, String major) {
////        super(age, name);
////        this.major = major;
////    }
    // 调用空参构造器， 父类得显式定义空参构造器
    public student(int age, String name, String major){
        super();
        this.setAge(age);
        this.setName(name);
        this.major = major;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }


    @Override
    public String toString() {
        return "student{" +
                "major='" + major + '\'' +
                ", age=" + getAge() +
                ", name='" + getName() + '\'' +
                '}';
    }

    public static void main(String[] args) {
        student st = new student(24, "zian", "ece");
        System.out.println(st.toString());
    }
}
