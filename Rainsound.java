package hackearth;

import java.util.Scanner;

public class Rainsound {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter the number of case you want to run:");
        int r = sc.nextInt();

        for (int i = r; r >= 1; r--) {
            System.out.println("enter the number:");
            int n = sc.nextInt();

            System.out.println("enter the start interval and end point ");
//        for example represent[5,10] is 5 10
            int n1 = sc.nextInt();
            int n2 = sc.nextInt();
            System.out.println("enter number for doing multiply:");
            int nm = sc.nextInt();
            int multiply = n * nm;


            if (multiply < n2 && multiply > n1) {
                System.out.println(multiply);
            } else {
                System.out.println("there are sound!");
            }


        }
    }
}
