package JavaDaily;

import java.util.Scanner;

public class Loop1 {

    public static void Table(int x){
        for(int i=1;i<=10;i++){
            System.out.println(x*i);
        }
    }
    public static void main(String[] args) {

        /*int a=2;
        for(int i=1;i<=10;i++){
            System.out.println(a*i);
        }*/
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the table : ");
        int a=sc.nextInt();
        Table(a);

    }
}
