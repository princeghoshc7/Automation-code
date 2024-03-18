package JavaDaily;

import java.util.Scanner;

public class Addwithoutplus {

    public static void AddNum(int a,int b){

        while(b!=0){
            int carry = a & b;
            a=a^b;
            b=carry << 1 ;
        }
        System.out.println("Sum of two number : " + a);
    }
    public static void main(String[] args) {
//        int a=30;
//        int b=40;
//
//        while(b!=0){
//
//            int carry=a & b;
//            a=a^b;
//            b=carry<<1;
//        }
//        System.out.println("sum of a and b : " + a);

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter first number : ");
        int num1=sc.nextInt();
        System.out.println(" Enter second number : ");
        int num2=sc.nextInt();

        AddNum(num1,num2); // method calling


    }
}
