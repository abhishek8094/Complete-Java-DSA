//print hello world to 10 time by for loop

import java.util.*;
public class E{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter n :");
        int n=sc.nextInt();
        for (int i=0; i<n; i++){
            System.out.println("Hello world!");
        }
    }
}