//Print the largest of 3

public class F{
  public static void main(String args[]){
    int A=1,B=3,C=6;
    if ((A>=B) && (A>=C)){
       System.out.println("A  is largest");
    }

    else if(B>=C){
        System.out.println("B is larger");
    }
    
    else{
        System.out.println("C is larger");
    }

  }
}