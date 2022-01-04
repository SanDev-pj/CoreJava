package EXCEPTION;

import java.util.Scanner;

public class MyNumber {
    private int firstNumber;
    private int secondNumber;
    private double result;

    public MyNumber(int firstNumber, int secondNumber) {
        this.firstNumber = firstNumber;
        this.secondNumber = secondNumber;
    }

    public void add() {
        this.result = this.firstNumber + this.secondNumber;
    }

    public void sub() {
        this.result = this.firstNumber - this.secondNumber;
    }

    public void mul() {
        this.result = this.firstNumber * this.secondNumber;
    }

    public void div() {
        try {
            this.result = this.firstNumber / this.secondNumber;
        }
        catch (ArithmeticException e){
            e.printStackTrace();
        }

    }

    public static void main(String[] args) {
        MyNumber j=new MyNumber(5,0);
        while (true) {
            System.out.println(" \t\t\t menu driven");
            System.out.println("\n 1.Addition\n2.Subtraction\n3.multiplication\n4.division\n5.Exit");
            Scanner Sc = new Scanner(System.in);
            System.out.println("Enter the option to be performed: ");
            int opt = Sc.nextInt();
            switch (opt){
                case 1:
                    j.add();
                    System.out.println(j.result);
                    break;
                case 2:
                    j.sub();
                    System.out.println(j.result);
                    break;
                case 3:
                    j.mul();
                    System.out.println(j.result);
                    break;
                case 4:
                    j.div();
                    System.out.println(j.result);
                    break;
                case 5:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid Choice.");
                    break;

            }
        }
    }
}
