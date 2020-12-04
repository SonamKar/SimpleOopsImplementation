package EmployeeRoles;
//Inheritance
abstract public class Developer extends Employee{
    final String employeeGrade="C1";
    Developer(int employeeId,String employeeName){
        super(employeeId,employeeName);
    }
    //abstraction
    abstract void roleType();
    void displayDetails(){
        super.displayDetails();
        System.out.println("Employee Grade:"+employeeGrade);
    }

}
