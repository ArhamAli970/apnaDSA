//Given an array (or string), the task is to reverse the array/string.


import java.util.*;


public class prac3{ 
  


public static void main(String[] args) {

    int arr[]= {-12,34};

int n=arr.length;

int i=0,j=n-1;

while(i<j){ 

    int num=arr[i];
    arr[i]=arr[j];
    arr[j]=num;

    j--;
    i++;

}



for ( i=0;i<arr.length;i++){ 
    System.out.print(arr[i]+" ");
}




}



}
