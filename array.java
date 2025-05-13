/*
//largest&sclargest
import java.util.Scanner;
public class array {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int[] arr={12,34,65,2,87};
        int largest=0;
        int sclargest=-1;
        for(int i=0;i<arr.length;i++){
          if(arr[i]>largest) {
              largest = arr[i];
          }
        }
        for(int i=0;i<arr.length;i++){
            if(arr[i]>sclargest&&arr[i]!=largest){
                sclargest=arr[i];
            }
        }

        System.out.println(largest);
        System.out.println(sclargest);
    }
}

import java.util.Arrays;
/*

//reverse a array
public class array {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        int start=0;
        int temp=0;
        int end=arr.length-1;
        while(start<end){
            temp=arr[start];
           arr[start]=arr[end];
           arr[end]=temp;
           start++;
           end--;
        }
        System.out.println(Arrays.toString(arr));
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);}
    }
}
*/

// move zeros to end
/*
public class array {
    public static void main(String[] args) {
        int[] nums={0,1,0,3,12};
        int j=0;
        for(int i=0;i< nums.length;i++){
            if(nums[i]!=0){
                int temp=nums[i];
                nums[i]=nums[j];
                nums[j]=temp;
                j++;
            }
        }
        for(int i=0;i< nums.length;i++){
            System.out.print(nums[i]+" ");
        }
    }
}*/

public class array {
    public static void main(String[] args) {
        int[] arr={1,1,2};
        int ans= sum(arr);
        System.out.println(ans);
    }
    static int sum(int[] arr) {
        int i = 0;
        for (int j = 1; j < arr.length; i++) {
            if (arr[i] != arr[j]) {
                arr[i+1] = arr[j];
                i++;
                return i+1;

            }
        }
   return 0;
    }
}
























