
package com.mycompany.newquestion01;

public class NewQuestion01 
{

    public static void main(String[] args)
    {
        Encapsulation e1=new Encapsulation();
        e1.setName("Tharindi");
        e1.setAge(22);
        e1.setSalary(25000.00f);
       
        
        System.out.println("Name: "+e1.getName());
        System.out.println("Age: "+e1.getAge());
        System.out.println("Salary: "+e1.getSalary());
                
    }
}
