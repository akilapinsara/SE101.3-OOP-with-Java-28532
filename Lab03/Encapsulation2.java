
package com.mycompany.newquestion01replace;

public class Encapsulation2
{
    private String name;
    private int age;
    private float salary;
    
    public Encapsulation2(String name, int age, float salary)
    {
        this.name=name;
        this.age=age;
        this.salary=salary;
    }
    
    public void display()
    {
        System.out.println("Name: "+name);
        System.out.println("Age: "+age);
        System.out.println("Salary: "+salary);
    }
    
}
