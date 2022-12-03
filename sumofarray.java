package hackearth;

import java.math.BigInteger;
import java.util.Scanner;

public class sumofarray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("enter the number");
        int n=sc.nextInt();

        System.out.println("enter input:");


        BigInteger sum= BigInteger.valueOf(0);
        for (int i=0;i<n;i++){
          BigInteger input=sc.nextBigInteger();

          BigInteger input1=new BigInteger(String.valueOf(input));

          sum=sum.add(input);
        }
        System.out.println(sum);
    }
}
