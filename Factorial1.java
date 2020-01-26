import java.util.Scanner;

public class Factorial1 {
    int factorial(int n){
        if ( n == 1){
            return 1;
        }
        else{
            return factorial( n- 1)* n;
        }

    }

    public static void main(String[] args) {
        Factorial1 obj = new Factorial1();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to find factorial : ");
        int  n = sc.nextInt();
        System.out.println(obj.factorial(n));
     }
}
