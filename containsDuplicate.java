
//Given an integer array nums, return true if any value appears at least twice in the array, and return false if every element is distinct.

import java.util.*;


public class prac3{ 
  

    public static boolean isduplicate(int arr[]){ 
        HashSet <Integer> h= new HashSet<>();

        for (int i=0;i<arr.length;i++){ 
        
            if(!h.contains(arr[i])){ 
                h.add(arr[i]);
            }
            else{ 
                return true;
            }
        
        
        }
        
        return false;
    }

public static void main(String[] args) {

 int [] arr={1,34,77,1};

System.out.println(isduplicate(arr));


}
