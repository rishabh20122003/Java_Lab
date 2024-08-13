import java.io.*;
import java.util.*;

class Mobile
{
    String brand;
    int price;
    static String name;
    Scanner sc = new Scanner(System.in);

    public void getData(){
        System.out.println("Enter the brand name");
        brand = sc.next();
        System.out.println("Enter Price: ");
        price = sc.nextInt();
        System.out.println("Enter Name of Mobile");
        name = sc.next();
        }


    public void show()
    {
        System.out.println("Enter the brand "+ brand);
        System.out.println("Enter the price "+price);
        System.out.println("Enter the name "+name);

    }
}

class static_variable{
    

    public static void main(String args[])
    {

        Mobile mb = new Mobile();
        Mobile mb2 = new Mobile();

        mb2.getData();

        mb.brand = "MI";
        mb.price = 10000;
        mb.name = "note 3" ;


       
        mb2.show();
    }

}