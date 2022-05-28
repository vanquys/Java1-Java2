
import java.util.ArrayList;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author ADMIN
 */
public class java1_StudentManager {

    private ArrayList<Student> mStudentList;

    public java1_StudentManager() {
        this.mStudentList = new ArrayList<>();
    }

    public void displayMenu() {
        System.out.println("");
        System.out.println("--------------------MeNU---------------------");
        System.out.println("An 1. Nhap moi danh sach sinh vien");
        System.out.println("An 2. Nhap tiep danh sach sinh vien");
        System.out.println("An 3. in danh sach sinh vien ");
        System.out.println("An 4. Sinh vien co diem cao nhat");
        System.out.println("An 5. Sinh vien co diem Thap nhat");
        System.out.println("An 6. doi ten sinh vien thanh chu hoa");
        System.out.println("An 7. doi ten sinh vien thanh chu thuong");
        System.out.println("An 8. Hien thi danh sach sinh vien giam dan");
        System.out.println("An 0. Thoat");
        System.out.print("chon: ");
    }

    public void inputList() {
        Scanner sc = new Scanner(System.in);
        String name;
        String className;
        float mark;

        while (true) {
            System.out.println("nhap thong tin sinh vien (dung nhap khi nam trong)");
            System.out.print("Ten: ");
            name = sc.nextLine();

            if (!name.equals("")) {
                System.out.print("Lop: ");
                className = sc.nextLine();

                System.out.print("diem: ");
                mark = sc.nextFloat();

                Student s = new Student(name, className, mark);
                mStudentList.add(s);
                sc.nextLine();
            } else {
                break;
            }
        }

    }

    public void inputNewList() {
        mStudentList.clear();
        inputList();
    }

    public void displayHeader() {
        System.out.printf("%-30s %-10s %-10s\n ", "ho va ten", "lop", "diem");
    }

    public void display() {
        displayHeader();
        if (!mStudentList.isEmpty()) {
            for (Student s : mStudentList) {
                s.display();
            }
        }
    }

    /**
     * hoc sinh cao diem nhat
     *
     * @return
     */
    public Student bestStudent() {
        if (!mStudentList.isEmpty()) {
            Student bestStudent = mStudentList.get(0);
            for (Student s : mStudentList) {
                if (s.getmMark() > bestStudent.getmMark()) {
                    bestStudent = s;
                }
            }
            return bestStudent;
        } else {
            return null;
        }
    }

//    public Student bestStudent() {
//        float max = 0;
//        Student result = new Student();
//        for (Student s : mStudentList) {
//             if(max < s.getmMark()){
//                 max = s.getmMark();
//                 result = s;
//             } 
//        }
//        
//        return result;
//    }
    public void displaylBest() {
        displayHeader();
        bestStudent().display();

    }

    /**
     * hoc sinh thap diem nhat
     *
     * @return
     */
    public Student lowestStudent() {
        if (!mStudentList.isEmpty()) {
            Student lowestStudent = mStudentList.get(0);
            for (Student s : mStudentList) {
                if (s.getmMark() < lowestStudent.getmMark()) {
                    lowestStudent = s;
                }
            }
            return lowestStudent;
        } else {
            return null;
        }
    }

    public void displayLowest() {
        displayHeader();
        lowestStudent().display();

    }

    public void upperCaseName() {
        mStudentList.forEach((s) -> {
            s.upperCaseName();
        });
    }

    public void LowCaseName() {
        mStudentList.forEach((s) -> {
            s.loweCaseName();
        });
    }

  
    public void ascending() {
        ArrayList<Student> result = new ArrayList<>();
        ArrayList<Student> dupStdList = new ArrayList<>();
        
        
        Student std;
        
        Student stdJ = null;
        
        int size = mStudentList.size();
        for (int i = 0; i < size; i++) {
            std = mStudentList.get(0);
            for (int j = 0; j < size; j++) {
                if (std.compareTo(mStudentList.get(j)) > 0) {
                    stdJ = mStudentList.get(j);                
                }
            }
            result.add(stdJ);
            System.out.println(result.size());
            mStudentList.remove(stdJ);
        }
        mStudentList.clear();
        
        mStudentList = result;
        if (!result.isEmpty()) {
            for (Student s : result) {
                s.display();
            }
        }
    }

    public void executeFunction(int choose) {
        switch (choose) {
            case 0:
                System.out.println("da thoat ung dung !");
                break;
            case 1:
                inputNewList();
                break;
            case 2:
                inputList();
                break;
            case 3:
                display();
                break;
            case 4:
                displaylBest();
                ;
                break;
            case 5:
                displayLowest();
                break;
            case 6:
                upperCaseName();
                break;
            case 7:
                LowCaseName();
                break;
            case 8:
                ascending();
                break;

            default:
                System.out.printf("nhap sai ! vui long Nhap lai ");
        }

    }

    public void run() {
        Scanner sc = new Scanner(System.in);
        int choose = 0;
        while (true) {
            displayMenu();
            choose = sc.nextInt();
            executeFunction(choose);
            if (choose == 0) {
                break;
            }
        }
    }

    public static void main(String[] args) {
        java1_StudentManager stm = new java1_StudentManager();
        stm.run();

    }
}
