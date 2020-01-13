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
        bs.sortMethod1(arr);
        //bs.sortMethod2(arr);
        //bs.sortMethod3(arr);
       // System.out.println("Sorted array is : " + Arrays.toString(arr));
}
}
