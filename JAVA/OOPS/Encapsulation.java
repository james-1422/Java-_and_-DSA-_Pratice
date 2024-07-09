package JAVA.OOPS;
class Employee{
    private String empID;
    private String name;
    private double salary;

    public Employee(String empID,String name,double salary){
        this.empID=empID;
        this.name=name;
        this.salary=salary;
    }

    public String getName(){
        return name;
    }

    public String getEmpID() {
        return empID;
    }

    public double getSalary() {
        return salary;
    }
    public String toString(){
        return empID +"\n"+ name +"\n"+ salary+"\n";
    }

    public void setEmpID(String empID) {
        this.empID = empID;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void setName(String name) {
        this.name = name;
    }
}
public class Encapsulation {
    public static void main(String[] args) {
        Employee epl = new Employee("101JS","Jones",100000);
        System.out.println(epl.toString());
        epl.setName("SAM");
        epl.setEmpID("102SA");
        epl.setSalary(5000000);
        System.out.println(epl.toString());


    }

}
