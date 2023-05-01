// Given an array arr[] of distinct elements size N that is sorted and then around an unknown point, the task is to check if the array has a pair with a given sum X.

// Examples : 

// Input: arr[] = {11, 15, 6, 8, 9, 10}, X = 16
// Output: true
// Explanation: There is a pair (6, 10) with sum 16



///////////////////////////////////////////CODE//////////////////////////////////

import java.util.*;



public class prac3{ 

  public static boolean haspair(int arr[],int x){ 

    int st=0,n=arr.length;

    for(int i=1;i<n-1;i++){ 
      if(arr[i]<arr[i-1]){ 
        st=i;
        break;
      }
    }

    int end=(st-1+n)%n;

    while(st!=end){ 
      if(arr[st]+arr[end]>x){ 
        end=(end-1+n)%n;
      }
      else if(arr[st]+arr[end]==x){  
        return true;
      }
      else{ 
        st=(st+1)%n;
      }
    }
return false;



  }

 
    public static void main(String[] args) {


    int   arr[] = {11, 15, 6, 8, 9, 10 };
    int  X = 16;

   System.out.println(haspair(arr, X));


    }
    



}
