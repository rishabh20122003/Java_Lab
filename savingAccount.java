import java.io.*;
import java.util.*;

public class savingAccount {
    public double savingbalance ;
    public static double annualInterestrate;


    public savingAccount(double d)
    {
        this.savingbalance = d;

    }

    public double getbalance()
    {
        return savingbalance;
    }

    public void setbalance(double d)
    {
        this.savingbalance = d;
    }

    public double calmonthlyinterestest()
    {
        double monthlyinterest = (savingbalance * annualInterestrate/12)/100;
        savingbalance += monthlyinterest;
        return monthlyinterest;
    }

    public void print_sav()
    {
        System.out.printf("Saving Balance:- %.2f%n",savingbalance);
    }

    public static void annualInterestrate(double newRate)
    {
        annualInterestrate = newRate;
    }


    public static void main(String args[])
    {
        savingAccount.annualInterestrate(4);

        System.out.println("Enter the balance: ");

        System.out.println("Enter balance of account 1: ");
        Scanner sc = new Scanner(System.in);
        double sv1 = sc.nextDouble();
        System.out.println("Enter balance of account 2: ");
        double sv2 = sc.nextDouble();
        
        

        savingAccount s1 = new savingAccount(sv1);
        savingAccount s2 = new savingAccount(sv2);

        System.out.printf("Account 1 monthly interest: %.2f\n ", s1.calmonthlyinterestest());
        System.out.printf("Account 1 new balance: %.2f\n", s1.getbalance());

        System.out.printf("Account 2 monthly interest: %.2f\n", s2.calmonthlyinterestest());
        System.out.printf("Account 2 new balance: %.2f\n", s2.getbalance());


        savingAccount.annualInterestrate(5);

        System.out.printf("Account 1 monthly interest: %.2f\n ", s1.calmonthlyinterestest());
        System.out.printf("Account 1 new balance: %.2f\n", s1.getbalance());

        System.out.printf("Account 2 monthly interest: %.2f\n", s2.calmonthlyinterestest());
        System.out.printf("Account 2 new balance: %.2f\n", s2.getbalance());


    }


}
