package Lab;

import java.util.Arrays;

public class BubbleSort {
    int temp ;
    public void sortMethod1(int arr[]){
        for(int i=0; i<arr.length-1; i++){
            for(int j =0; j<arr.length-1; j++){
                if(arr[j] > arr[j+1]){
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }

    }
   public  void sortMethod2(int arr[]){
        boolean b;
        for(int i=0; i<arr.length-1; i++){
            for(int j =0; j<arr.length-1; j++){
                b = false;
                if(arr[j] > arr[j+1]){
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
                if(b == true){
                    break;
                }
            }
        }

    }
    public  void sortMethod3(int arr[]){
        boolean b;
        for(int i=0; i<arr.length-1; i++){
            for(int j =0; j<arr.length-1-i; j++){
                b = false;
                if(arr[j] > arr[j+1]){
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
                if(b == true){
                    break;
                }
            }
        }

    }
}
