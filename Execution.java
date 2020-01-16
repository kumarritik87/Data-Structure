package Lab;

import java.util.Arrays;
import java.util.Scanner;

public class Execution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BubbleSort bs = new BubbleSort();
        int arr[] = new int[5];
        for(int i = 0; i<arr.length; i++){
            System.out.println("enter the "+i+" value of array : ");
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter 1 to sort from method 1 \n     2  for method 2\n     3 for method 3");
        int a = sc.nextInt();
        if (a == 1){
            bs.sortMethod1(arr);
        }
        else if (a == 2) {
            bs.sortMethod2(arr);
        }
        else if(a == 3) {
            bs.sortMethod3(arr);
        }
        else    {
            System.out.println("ENter valid number ");
        }
       System.out.println("Sorted array is : " + Arrays.toString(arr));
}
}
