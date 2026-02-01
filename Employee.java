public class Employee{
    private String name;
    private int age;
    private String ssn;
    private double salary;
    private boolean employed;

    public Employee(String n, int a, String ssn, double s, boolean e){
        name = n;
        age = a;
        this.ssn = ssn;
        salary = s;
        employed  = e;
    }

    public String toString(){
        return ("Name: " + name + "\nAGE: " + age + "\nSSN:" + ssn + 
        "\nSALARY: $" + salary + "\nEMPLOYED: " + employed + "\n\n");
    }


}