//Print number from 1 to n

import java.util.*;
public class C{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Range :");
        int range =sc.nextInt();
        int counter=1;

        while(counter<=range){
            System.out.print(counter +" ");
            counter++;
        }

    }
}