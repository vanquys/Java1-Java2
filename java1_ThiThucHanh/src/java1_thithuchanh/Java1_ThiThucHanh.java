/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java1_thithuchanh;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class Java1_ThiThucHanh implements Serializable{

    private ArrayList<employee> mEmployee;

    public Java1_ThiThucHanh() {
        this.mEmployee = new ArrayList<>();
    }

    public void displayMenu() {
        System.out.println("");
        System.out.println("--------------------MENU---------------------");
        System.out.println("Press 1. input the employee list (least 5 employees) ");
        System.out.println("Press 2. Display employee list");
        System.out.println("Press 3. Display employee with the highest salary");
        System.out.println("Press 4. Display employee with the lowest salary");
        System.out.println("Press 5. Upper case employee name ");
        System.out.println("Press 6. lower case employee name ");
        System.out.println("Press 7. exit.");
        System.out.print("Press: ");
    }

    public void inputList() {
        Scanner sc = new Scanner(System.in);
        String name;
        String company;
        Double salary;

        while (true) {
            System.out.println("nhap thong tin sinh vien (dung nhap khi nam trong)");
            System.out.print("name: ");
            name = sc.nextLine();

            if (!name.equals("")) {
                System.out.print("company: ");
                company = sc.nextLine();

                System.out.print("salary: ");
                salary = sc.nextDouble();

                employee s = new employee(name, company, salary);
                mEmployee.add(s);
                sc.nextLine();
            } else if (mEmployee.size() >= 5) {
                break;
            } else {
                System.out.println("vui long nhap du 5 nhan vien !");
            }
        }

    }

    public void displayHeader() {
        System.out.printf("%-30s %-10s %-10s\n ", "name", "company", "salary");
    }

    public void display() {
        displayHeader();
        if (!mEmployee.isEmpty()) {
            for (employee s : mEmployee) {
                s.display();
            }
        }
    }
    
    public employee bestEmployee() {
        if (!mEmployee.isEmpty()) {
            employee bestEmployee = mEmployee.get(0);
            for (employee s : mEmployee) {
                if (s.getSalary()> bestEmployee.getSalary()) {
                    bestEmployee = s;
                }
            }
            return bestEmployee;
        } else {
            return null;
        }
    }
    
     public void displaylBest() {
        displayHeader();
        bestEmployee().display();

    }

    public employee lowestEmployee() {
        if (!mEmployee.isEmpty()) {
            employee bestEmployee = mEmployee.get(0);
            for (employee s : mEmployee) {
                if (s.getSalary()< bestEmployee.getSalary()) {
                    bestEmployee = s;
                }
            }
            return bestEmployee;
        } else {
            return null;
        }
    }
    
    public void displayLowest() {
        displayHeader();
        lowestEmployee().display();

    }
    
     public void upperCaseName() {
        mEmployee.forEach((s) -> {
            s.upperCaseName();
        });
    }

    public void LowCaseName() {
        mEmployee.forEach((s) -> {
            s.loweCaseName();
        });
    }
    public void executeFunction(int choose) {
        switch (choose) {

            case 1:
                inputList();
                break;
            case 2:
                display();
                break;
            case 3:
                displaylBest();
                break;
            case 4:
                displayLowest();
                
                break;
            case 5:
                upperCaseName();
                break;
            case 6:
                LowCaseName();
                break;
            case 7:
                System.out.println("da thoat ung dung !");
                break;

            default:
                System.out.printf("nhap sai ! vui long Nhap lai ");
        }

    }

    public void run() {
        Scanner sc = new Scanner(System.in);
        int choose = 7;
        while (true) {
            displayMenu();
            choose = sc.nextInt();
            executeFunction(choose);
            if (choose == 7) {
                break;
            }
        }
    }

    public static void main(String[] args) {
        Java1_ThiThucHanh nv = new Java1_ThiThucHanh();
        nv.run();

    }

}
