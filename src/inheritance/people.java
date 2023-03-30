package inheritance;

public class people {

    private int age;
    private String gender;

    public people() {
        this.age = 1;
        this.gender = "male";
    }

    public people(int age, String gender) {
        this.age = age;
        this.gender = gender;
    }

    public void printAge(){
        System.out.println(this.age);
    }
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
}
