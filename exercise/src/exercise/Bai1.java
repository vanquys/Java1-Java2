package exercise;

import java.util.Scanner;

public class Bai1 {
    /**
     * Nhập n
     * n là số phần tử nên n phải > 0
     * return: tra ve so vua nhap
     */
    public static int inputNumber(){
        try (Scanner scanner = new Scanner(System.in)) {
			int n ;
			System.out.print("nhap vao n : ");
			n = scanner.nextInt();
			while(n <= 0) {	
				System.out.printf("nhap sai !%nnhap lai n : ");
			    n = scanner.nextInt();
			}
			return n;
		}
   
         
    }
   
    /**F
     * Nhập mảng n phần tử
     * @param array là mảng cân nhập vào
     */
    public static void inputArray(int [] array){
        try (Scanner scanner = new Scanner(System.in)) {
			System.out.println("Nhap cac phan tu cua mang:");
			for(int i = 0; i < array.length; i++){
			    System.out.print("Phan tu " + i + " = ");
			    array[i] = scanner.nextInt();
			}
		}
    }
   
    /**
     * In mang
     * @param array la mang can in
     */
    public static void displayArray(int[] array){
        for(int i = 0; i < array.length; i++){
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
   
    /**
     * In mang dao nguoc
     * @param array la mang can in
     */
    public static void displayReverseArray(int[] array){
        for(int i = array.length - 1; i  >= 0; i--){
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
   
    /**
     * Tim so lon nhat cua mang
     * @param array la mang can tim so lon nhat
     * return: tra ve so lon nhat cua mang
     */
    public static int maxOfArray(int[] array){
        int max = array[0];
        for(int i = 1; i < array.length; i++){
            if(max < array[i]){
                max = array[i];
            }
        }
        return max;
    }
   
    /**
     * Tim so be nhat cua mang
     * @param array la mang can tim so nho nhat
     * return: tra ve so be nhat cua mang
     */
    public static int minOfArray(int[] array){
        int min = array[0];
        for(int i = 1; i < array.length; i++){
            if(min > array[i]){
                min = array[i];
            }
        }
        return min;
    }
   
    /**
     * Tính tổng các phần tử của mảng
     * @param array la mang can tinh tong cac phan tu
     * return: tra ve tong cac phan tu cua mang
     */
    public static int sumOfElements(int[] array){
        int sum = 0;
        for(int i = 0; i < array.length; i++){
            sum += array[i];
        }
        return sum;
    }
   
    /**
     * Liệt kê các phần thử chẵn của mảng
     * @param array la mang can liet ke
     */
    public static void evensOfArray(int[] array){
        int count = 0;
        System.out.print("Cac so chan cua mang: ");
        for(int i = 0; i < array.length; i++){
            if(array[i] % 2 == 0){
                count++;
                System.out.print(array[i] + " ");
            }
        }  
        if(count == 0){
            System.out.print("khong co so nao");
        }
        System.out.println();
    }
   
    /**
     * Kiem tra so nguyen to
     * @param n la so can kiem tra
     * @return true hoac false
     */
    public static boolean isPrime(int n){
        if(n < 2){
            return false;
        }
       
        for(int i = 2; i <= Math.sqrt(n); i++){
            if(n % i == 0){
                return false;
            }
        }
        return true;
    }
   
    /**
     * Liệt kê các phần tử là số nguyên tố của mảng
     * @param args
     */
    public static void primesOfArray(int[] array){
        int count = 0;
        System.out.print("Cac so nguyên tố: ");
        for(int i = 0; i < array.length; i++){
            if(isPrime(array[i])){
                count++;
                System.out.print(array[i] + " ");
            }
        }  
        if(count == 0){
            System.out.print("khong co so nao");
        }
        System.out.println();
    }
   
    /**
     * Kiem tra so hoan hao
     * @param n la so can kiem tra
     */
    public static boolean isPerfectNumber(int n){
        int sum = 0;
        for(int i = 1; i <= n/2; i++){
            if(n % i == 0){
                sum += i;
            }
        }
       
        if(sum == n){
            return true;
        }
        return false;
    }
   
    /**
     * Liệt kê các phần tử là số hoàn hảo
     * @param args
     * @return true hoac false
     */
    public static void perfectNumberOfArray(int[] array){
        System.out.print("Cac so hoan hao: ");
        int count = 0;
        for(int i = 0; i < array.length; i++){
            if(isPerfectNumber(array[i])){
                count++;
                System.out.print(array[i] + " ");
            }
        }  
        if(count == 0){
            System.out.print("khong co so nao");
        }
        System.out.println();
    }
   
    /**
     * Sắp xếp mảng tăng dần
     * @param array la mang can sap xep
     */
    public static void increaseSort(int[] array){
        System.out.println("Sap xep mang tang dan: ");
       
        for(int i = 0; i < array.length - 1; i++){
            for(int j = i; j < array.length; j++){
                if(array[i] > array[j]){
                    int tmp = array[i];
                    array[i] = array[j];
                    array[j] = tmp;
                }
            }
        }
       
        //in mang sau khi sap xep
        for(int i = 0; i < array.length; i++){
            System.out.print(array[i] + " ");
        }        
        System.out.println();
    }
   
    /**
     * Sắp xếp mảng giảm dần
     * @param array la mang can sap xep
     */
    public static void decreaseSort(int[] array){
        System.out.println("Sap xep mang giam dan: ");
       
        for(int i = 0; i < array.length - 1; i++){
            for(int j = i; j < array.length; j++){
                if(array[i] < array[j]){
                    int tmp = array[i];
                    array[i] = array[j];
                    array[j] = tmp;
                }
            }
        }
       
        //in mang sau khi sap xep
        for(int i = 0; i < array.length; i++){
            System.out.print(array[i] + " ");
        }        
        System.out.println();
    }
   
    /**
     * Nhập một số và tìm trong mảng. nếu có thì in ra tat ca vị trí
     * @param array la mang can tim
     * @param k la so can tim trong mang
     */
    public static void search(int[] array, int k){
        System.out.print("Vi tri cua " + k + " trong mang la: ");
        int count = 0;
        for(int i = 0; i < array.length; i++){
            if(array[i] == k){
                System.out.print(i + " ");
                count++;
            }
        }
       
        //ko tim thay
        if(count == 0){
            System.out.print("khong tim thay");
        }
        System.out.println();
    }
   
    public static void main(String[] args) {
        //nhap n
        int n = inputNumber();  
        int[] array = new int[n];
       
        //nhap mang
        inputArray(array);
       
        //in mang
        System.out.print("Mang vua nhap: ");
        displayArray(array);
       
        //mang dao nguoc
        System.out.print("Mang dao nguoc: ");
        displayReverseArray(array);
       
        //max
        System.out.println("So lon nhat cua mang: " + maxOfArray(array));
       
        //min
        System.out.println("So nho nhat cua mang: " + minOfArray(array));
       
        //sum
        System.out.println("Tong cac phan tu: " + sumOfElements(array));
       
        //trung binh
        System.out.println("Trung binh cua mang: " + 1.0f*sumOfElements(array)/array.length);
       
        //so chan cua mang
        evensOfArray(array);
       
        //So nguyen to cua mang
        primesOfArray(array);
       
        //so hoan hao
        perfectNumberOfArray(array);
       
        //sap xep tang
        increaseSort(array);
       
        //sap xep giam
        decreaseSort(array);
       
        //tim kiem
        System.out.println("Tim kiem");
        int k = inputNumber();
        search(array, k);
       
    }
}


