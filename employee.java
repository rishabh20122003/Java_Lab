public class employee {
     String name;
    int age;
    double salary;

    public employee(String name, int age, double salary){
        this.name=name;
        this.age=age;
        this.salary=salary;
    }
    public String getName(){
        return name;
    }
    public int getAge(){
        return  age;
    }
    public double getSalary(){
        return salary;
    }
    public void setName(String name){
        this.name= name;
    }
    public void setAge(int age){
        this.salary=salary;
    }

    public  void raiseSalary(){
        this.salary *=1.10;
    }
    public static void main(String args[]){
        employee emp = new employee("RISHABH " ,20, 500000);

    System.out.println("Name : "+ emp.getName());
    System.out.println("Age : "+ emp.getAge());
    System.out.println("salary : "+ emp.getSalary());

    //raising the increment by 10
    emp.raiseSalary();

    System.out.println("Salary after raise : "+ emp.getSalary());
    
}
}
