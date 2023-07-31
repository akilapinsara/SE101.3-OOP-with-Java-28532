
package com.mycompany.pq2;

public class pq2 
{

    public static void main(String[] args) 
    {
        Q02 e1=new Q02(10000.00f);
        e1.setEmpName("Bogdan");
        System.out.println("Employee Name: "+e1.getEmpName());
        e1.setBasicSalary(50000.00f);
        System.out.println("Basic Salary: "+e1.getBasicSalary());
        e1.display();
        e1.calBonusAmount();
        
    }
}
