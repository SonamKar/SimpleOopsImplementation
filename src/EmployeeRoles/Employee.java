package EmployeeRoles;

public class Employee {
      protected int employeeId;
      String employeeName;
      protected static String companyName="TCS";

      public Employee(int employeeId,String employeeName){
         this.employeeId=employeeId;
         this.employeeName=employeeName;
    }

    void displayDetails(){
        System.out.println("Employee Id:"+employeeId);
        System.out.println("Employee Name:"+employeeName);
        System.out.println("Company Name:"+companyName);
    }
}
