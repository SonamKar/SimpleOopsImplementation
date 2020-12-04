package EmployeeRoles;

public class JavaDeveloper extends Developer{
    //use of private access specifier -- Encapsulation
    private double Salary;
    JavaDeveloper(int employeeId,String employeeName){
        super(employeeId,employeeName);
    }
     void roleType(){
        System.out.println("Role Type: Java Developer");
    }
    void displayDetails(){
        super.displayDetails();
        roleType();
        System.out.println("Salary: Rs."+getSalary());
    }
    // Polymerphism demonstration using getSalary()
     double getSalary() {
        return Salary;
    }
    void setSalary(double salary,double incentive){
         Salary=salary+incentive;
    }
     void setSalary(double salary) {
        Salary = salary;
    }
}
