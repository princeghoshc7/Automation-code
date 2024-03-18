package JavaDaily;

import java.util.Scanner;

public class Evenodd {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any Number: ");
        int num = sc.nextInt();
        if (num % 2 == 0)
            System.out.println("Given number is EVEN");
        else
            System.out.println("Given number is ODD");
    }
}
