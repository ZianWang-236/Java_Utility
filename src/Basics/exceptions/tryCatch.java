package Basics.exceptions;

import javax.sound.midi.Soundbank;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLOutput;
import java.util.Scanner;

public class tryCatch {
    public static void main(String[] args){
        // try...catch...
        tryCatchException();
        // throw...
        try {
            throwException2();
        } catch(IOException e){
            System.out.println("IO" + e.getMessage());
        }


    }

    private static void tryCatchException(){
        Scanner sc = new Scanner(System.in);
        System.out.println("input a int A: ");
        int a = sc.nextInt();
        System.out.println("input a int B: ");
        int b = sc.nextInt();
        try{
            double c = a / b;
            System.out.println("the answer is: "+ c);
        } catch(ArithmeticException e){
            System.out.println("cannot divide by zero");
            System.out.println(e.getMessage());
        }
    }

    private static void throwException() throws FileNotFoundException, IOException{
        File file = new File("hello.txt");
        FileInputStream fis = new FileInputStream(file);

        int data = fis.read();
        while(data != -1){
            System.out.print((char) data);
            data = fis.read();
        }

        fis.close();
    }

    private static void throwException2() throws FileNotFoundException, IOException {
        throwException();
    }
}
