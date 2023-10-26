//check if a number is prime or not

import java.util.*;
public class N{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter your number :");
        int n =sc.nextInt();

        if(n%2==0){
            System.out.println("Not prime");
        }else{
            System.out.println("prime");
        }
    }
}