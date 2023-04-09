package Basics.exceptions;

public class EcmDef {

    public static void main(String[] args) {
        try{
            int result = ecm(args);
            System.out.println("the result is: " + result);
        } catch (NumberFormatException e){
            System.out.println("data format not compatible");
        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println("input args not complete");
        } catch (ArithmeticException e){
            System.out.println("can not divided by zero");
        } catch (EcDef | EcDef2 e){
            System.out.println(e.getMessage());
        }
    }

    public static int ecm(String[] args) throws EcDef, EcDef2{
        if(args.length > 2){
            throw new EcDef2("input args too long!");
        }
        int i = Integer.parseInt(args[0]);
        int j = Integer.parseInt(args[1]);
        if(i < 0 || j < 0){
            throw new EcDef("分子或分母为负数！");
        }
        return i / j;
    }
}
