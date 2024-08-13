import java.util.Scanner;
class Primary
{
int num1;
Scanner sc=newScanner (System.in);
{
int num2;
}
class Derived extends Secondary
{
void basevalues()
{
System.out.println("\n Enter a primary base values:=");
num1=sc.nextInt();
System.out.println("\n Enter a secondary base values:=");
num2=sc.nextInt();
}
void compare()
{
if (num1==num2)
{
System.out.println("\n Both base values are same:=");
}
else
{
System.out.println("\n Both base values are different:=");
}
}
class Testmultipleinh
{
public static void main(String []args)
{
Primary d=new Primary();
        d.basevalues();
}
}



