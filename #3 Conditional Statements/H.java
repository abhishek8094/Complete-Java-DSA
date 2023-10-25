//check if a student will pass or fail

// import java.util.*;
// public class H{
//     public static void main(String args[]){
//         Scanner sc=new Scanner(System.in);
//         int marks=sc.nextInt();

//         if (marks>=33){
//             System.out.println("PASS");
//         }
//         else {
//              System.out.println("fail");
//         }
//     }
// }


//from Ternory operator

public class H{
    public static void main(String args[]){
        int marks=5;

        String reportCard=(marks>=33) ? "Pass":"Fail";
        System.out.println(reportCard);
    }
}