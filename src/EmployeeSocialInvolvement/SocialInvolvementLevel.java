package EmployeeSocialInvolvement;

import EmployeeRoles.Employee;

public class SocialInvolvementLevel extends Employee {
    SocialInvolvementLevel(int employeeId,String employeeName){
        super(employeeId,employeeName);
    }
    public static void main(String args[]){
        SocialInvolvementLevel socialInvolvementLevel=new SocialInvolvementLevel(123,"abc");

        /*Cannot access employeeName since it's not protected & it is a different package*/

        System.out.println("Employee id:"+socialInvolvementLevel.employeeId);
        System.out.println("Company Name:"+socialInvolvementLevel.companyName);
        System.out.println("Status: Highly Active");

    }
}
