// program to find factorial of 5 using recursion;
public class Factorial {
    int m5(){
        return 5 * m4();

    }
    int m4(){
        return 4 * m3();
    }
    int m3(){
        return 3 * m2();
    }
    int m2(){
        return 2 * m1();
    }
    int m1(){
        return 1;
    }

    public static void main(String[] args) {
        Factorial f = new Factorial();
        System.out.println(f.m5());
  }
}
