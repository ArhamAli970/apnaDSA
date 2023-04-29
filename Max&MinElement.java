//Given an array of size N. The task is to find the maximum and the minimum element of the array using the minimum number of comparisons.



import java.util.*;


public class prac3{ 
  

 

public static void main(String[] args) {

    int arr[]= {-12,343,34,75,383,99};

    int n=arr.length;
    int max=Integer.MIN_VALUE;
    int min=Integer.MAX_VALUE;
    
    for(int i=0;i<n;i++){ 
    
        max=Math.max(max,arr[i]);
        min=Math.min(min,arr[i]);
    
    
    }
    
    System.out.println(max+" "+min);


}



}
