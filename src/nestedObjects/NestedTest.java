package nestedObjects;


public class NestedTest {
    public static void main(String[] args) {
        Student stu = new Student();
        stu.setName("zian");
        School sch = new School();
        sch.setName("concordia");
        stu.setSch(sch);
        sch.setStu(stu);
        System.out.println(stu.toString());
        System.out.println(sch.toString());
    }
}

class Student{
    String name;
    School sch;

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", sch=" + sch.getName() +
                '}';
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public School getSch() {
        return sch;
    }

    public void setSch(School sch) {
        this.sch = sch;
    }
}

class School{
    String name;
    Student stu;

    @Override
    public String toString() {
        return "School{" +
                "name='" + name + '\'' +
                ", stu=" + stu.getName() +
                '}';
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Student getStu() {
        return stu;
    }

    public void setStu(Student stu) {
        this.stu = stu;
    }
}
