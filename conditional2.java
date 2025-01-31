import java.util.Scanner;

public class conditional2 {
    public static void main(String[] args) {

       try (Scanner in = new Scanner(System.in)) {
        System.out.println("enter first number: ");
           double a = in.nextDouble();
           System.out.println("enter second number");
           double b = in.nextDouble();
           System.out.println("Enter operator");
           char op = in.next().charAt(0);
           double num = 0;
           switch (op) {
            case '+':
            num = a + b;
            System.out.println(a + "+" + b + "=" + num );
            break;
            
            case '-':
            num = a - b;
            System.out.println(a + "-" + b + "=" + num);
            break;

            case '*':
            num = a * b;
            System.out.println(a + "*" + b + "=" + num);
            break;

            case '/':
            num = a / b;
            System.out.println(a + "/" + b + "=" + num);
            break;

            case '%':
            num = a % b;
            System.out.println(a + "%" + b + "=" + num);
            break;

            default :
            System.out.println("invalid operator");
                break;
           }
    }
    }
}       