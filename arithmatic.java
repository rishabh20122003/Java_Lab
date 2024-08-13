import java.util.*;
import java.io.*;

class arithmatic {
    public static void main(String args[]) {

        int num1, num2, ch;

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number Num1");
        num1 = sc.nextInt();

        System.out.println("Enter number 2");
        num2 = sc.nextInt();

        do{

            System.out.println("Enter Your Choice: ");
            System.out.println("Addition:- 1 ");
            System.out.println("Substraction:- 2 ");
            System.out.println("Multiplication:- 3 ");
            System.out.println("Division:- 4 ");
            System.out.println("Modulos:- 5 ");
            System.out.println("Exit:- 6 ");
            System.out.println();


            ch = sc.nextInt();

            switch (ch) {

                case 1:
                    System.out.println("Result:- " + (num1 + num2));
                    System.out.println();
                    break;

                case 2:
                    System.out.println("Result:-" + (num1 - num2));
                    System.out.println();
                    break;

                case 3:
                    System.out.println("Result:- " + (num1 * num2));
                    System.out.println();

                    break;

                case 4:
                    System.out.println("Result:-" + (num1 / num2));
                    System.out.println();

                    break;

                case 5:
                    System.out.println("Result:-" + (num1 % num2));
                    System.out.println();

                    break;

                default:
                    System.out.println("Invalid input");
                    System.out.println();

                    break;

            }

        }
        while(ch<5);

    }
}