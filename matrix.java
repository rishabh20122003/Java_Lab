import java.util.*;

class matrix1{

    
    int a[][] = new int[2][2];
    int b[][] = new int[2][2];
    int c[][] = new int[2][2];


    Scanner sc = new Scanner(System.in);


    void getdata()
    {
        System.out.println("Enter the element for 1st matrix");
        for(int i=0; i<2;i++)
        {
            for(int j=0;j<2;j++)
            {
                a[i][j]=sc.nextInt();
            }
            
        }

        System.out.println("Enter the element for 2nd matrix");
        for(int i=0; i<2;i++)
        {
            for(int j=0;j<2;j++)
            {
                b[i][j]=sc.nextInt();
            }
            
        }
    }

    void display()
    {
        System.out.println("1st Matrix:-");
        for(int i=0;i<2;i++)
        {
            for(int j=0;j<2;j++)
            {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("2nd Matrix:-");
        for(int i=0;i<2;i++)
        {
            for(int j=0;j<2;j++)
            {
                System.out.print(b[i][j] + " ");
            }
            System.out.println();

        }

    }

    void addition()
    {
        for(int i=0;i<2;i++)
        {
            for(int j=0;j<2;j++)
            {
                c[i][j] = a[i][j] + b[i][j]; 
            }
        }


        System.out.println("Addition Matrix:-");
        for(int i=0;i<2;i++)
        {
            for(int j=0;j<2;j++)
            {
                System.out.print(c[i][j] + " ");
            }
            System.out.println();

        }
    }

    void substraction()
    {
        for(int i=0;i<2;i++)
        {
            for(int j=0;j<2;j++)
            {
                c[i][j] = a[i][j] - b[i][j]; 
            }
        }


        System.out.println("Substraction Matrix:-");
        for(int i=0;i<2;i++)
        {
            for(int j=0;j<2;j++)
            {
                System.out.print(c[i][j] + " ");
            }
            System.out.println();

        }
    }

    void Multiplication()
    {
        for(int i=0;i<2;i++)
        {
            for(int j=0;j<2;j++)
            {
                c[i][j] = a[i][j] * b[i][j]; 
            }
        }


        System.out.println("Multiplication Matrix:-");
        for(int i=0;i<2;i++)
        {
            for(int j=0;j<2;j++)
            {
                System.out.print(c[i][j] + " ");
            }
            System.out.println();

        }
    }

    void Division()
    {
        for(int i=0;i<2;i++)
        {
            for(int j=0;j<2;j++)
            {
                c[i][j] = a[i][j] / b[i][j]; 
            }
        }


        System.out.println("Division Matrix:-");
        for(int i=0;i<2;i++)
        {
            for(int j=0;j<2;j++)
            {
                System.out.print(c[i][j] + " ");
            }
            System.out.println();

        }
    }

    
}

public class matrix {
    public static void main(String args[])
    {

        matrix1 m = new matrix1();
        m.getdata();
        m.display();
        m.addition();
        m.substraction();
        m.Multiplication();
        m.Division();
        
    }
    
}
