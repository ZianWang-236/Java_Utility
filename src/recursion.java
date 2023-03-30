public class recursion {
    public static void main(String[] args) {
        recursion sol = new recursion();
        System.out.println("add: " + sol.recursionadd(100));
        System.out.println("mul: " +sol.recursionmul( 3));
        System.out.println("func1: " +sol.func( 3));
        System.out.println("fibo: " +sol.fibo( 8));
    }

    public int recursionadd(int i){
        if(i == 1){
            return 1;
        }else{
            return i + recursionadd(i - 1);
        }
    }

    public int recursionmul(int i){
        if(i == 1){
            return 1;
        }else{
            return i * recursionadd(i - 1);
        }
    }

    public int func(int i){
        if(i == 0){
            return 1;
        }else if(i == 1){
            return 4;
        }else{
            return 2*func(i - 1) + func(i - 2);
        }
    }

    public int fibo(int i){
        if(i == 0){
            return 0;
        }else if(i == 1){
            return 1;
        }else{
            return fibo(i - 1) + fibo(i - 2);
        }
    }
}
