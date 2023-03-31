package test;

public class Singleton {
    public static void main(String[] args) {
        for(int i = 0; i < args.length; i++){
            System.out.println(args[i]);
        }

        Bank bank = Bank.getBank();
        bank.setName("RBC");
        bank.setBranchNum(1001);
        System.out.println("first" + bank.toString());
        System.out.println(bank.hashCode());

        Bank bank2 = Bank.getBank();
        System.out.println("second" + bank2.toString());
        System.out.println(bank2.hashCode());

        String s1 = "1001";
        double i1 = Double.parseDouble(s1);
        System.out.println(i1);

        Integer vof = Integer.valueOf("159");
        System.out.println(vof);
    }
}

class Bank{
    private String name;
    private int branchNum;

    @Override
    public String toString() {
        return "Bank{" +
                "name='" + name + '\'' +
                ", branchNum=" + branchNum +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBranchNum() {
        return branchNum;
    }

    public void setBranchNum(int branchNum) {
        this.branchNum = branchNum;
    }

    // private Basics.constructor, only access within class
    private Bank(){}

    // private object, used only once
    private static Bank instance = new Bank();

    // public get function
    public static Bank getBank(){
        return instance;
    }

}