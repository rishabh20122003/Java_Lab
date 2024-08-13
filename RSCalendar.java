import java.util.Scanner;
class RSCalendar
{
public static void main(String []args)
{
Scanner scanner=new Scanner(System.in);

System.out.print("Enter day (1-31):");
int day=scanner.nextInt();
System.out.print("Enter month (1-12):");
int month=scanner.nextInt();
System.out.print("Enter year (e.g.,2024):");
int year=scanner.nextInt();
scanner.close();


int dayOfWeek=calculteDayOfWeek(day,month,year);

String[]days={"Saturday","Sunday","Monday","Tuesday","Wednesday","Thursday","Friday"};

System.out.println("The day of the week is:"+days[dayOfWeek]);
}
public static int calculteDayOfWeek(int day,int month,int year)
{
if(month==1||month==2)
{
month+=12;
year-=1;
}
int k=year%100;
int j=year/100;

int f=day+(13*(month+1))/5+k+k/4+j/4-2*j;
int dayOfWeek=(((f%7)+7)%7);
System.out.println("The day of the week is:"+dayOfWeek);

return dayOfWeek;
}
}



