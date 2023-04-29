
// Given an array of N integers where each value represents the number of chocolates in a packet. Each packet can have a variable number of chocolates. There are m students, the task is to distribute chocolate packets such that: 

// Each student gets one packet.
// The difference between the number of chocolates in the packet with maximum chocolates and the packet with minimum chocolates given to the students is minimum.



// Input : arr[] = {7, 3, 2, 4, 9, 12, 56} , m = 3 
// Output: Minimum Difference is 2 
// Explanation:
// We have seven packets of chocolates and we need to pick three packets for 3 students 
// If we pick 2, 3 and 4, we get the minimum difference between maximum and minimum packet sizes.






import java.util.*;


public class prac3{ 
  
public static int ChocolateDistribution(int arr[],int m){ 

    if(m>=arr.length){ 
        return 0;
    }

    Arrays.sort(arr);
    int min=Integer.MAX_VALUE;

    for(int i=0,j=m+i-1;j<arr.length;j++,i++){ 

        int minChocoDiff=arr[j]-arr[i];
        min=Math.min(min, minChocoDiff);

    }

    return min;


}
 

public static void main(String[] args) {

  int  arr[] = {7, 3, 2, 4, 9, 12, 56} , m = 3;
  
 System.out.println(ChocolateDistribution(arr,m));



}



}
