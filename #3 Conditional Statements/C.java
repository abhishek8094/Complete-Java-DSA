//Print if a number is Odd or Even
import java.util.*;
public class C {
    public static void main(String args[]){
        Scanner sc =new Scanner (System.in);
        int number =sc.nextInt();

        if( number%2 ==0){
            System.out.println("EVEN");
        }
        else{
            System.out.println("ODD");
        }
        
    }
}