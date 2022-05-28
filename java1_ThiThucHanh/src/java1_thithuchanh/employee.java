/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java1_thithuchanh;

/**
 *
 * @author ADMIN
 */
public class employee {

    private String name;
    private String company;
    private double salary;

    public employee() {
    }

    public employee(String name, String company, double salary) {
        this.name = name;
        this.company = company;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

     public void display(){
        System.out.printf("%-30s %-10s %-10.2a\n", name, company, salary);
    }
     
      public void upperCaseName(){
        name = name.toUpperCase();
    }    
   
    public void loweCaseName(){
        name = name.toLowerCase();
    }
}
