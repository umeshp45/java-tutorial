import java.util.*;


public class calculator {
   public static void main(String args[]) {
       Scanner sc = new Scanner(System.in);
       int a = sc.nextInt();
       int b = sc.nextInt();
       int operator = sc.nextInt();


       
        
    


       switch(operator) {
           case '+' : System.out.println(a+b);
           break;
           case '-' : System.out.println(a-b);
           break;
           case '*' : System.out.println(a*b);
           break;
           case '/' : if(b == 0) {
                       System.out.println("Invalid Division");
                   } else {
                       System.out.println(a/b);
                   }
	    break;
           case 5 : if(b == 0) {
                       System.out.println("Invalid Division");
                   } else {
                       System.out.println(a%b);
                   }
	    break; 
           default : System.out.println("Invalid Operator");
       }
   }
}
