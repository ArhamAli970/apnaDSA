
// Given a sorted array and a value x, the ceiling of x is the smallest element in an array greater than or equal to x, and the floor is the greatest element smaller than or equal to x. Assume that the array is sorted in non-decreasing order. Write efficient functions to find the floor and ceiling of x. 
// Examples : 

// For example, let the input array be {1, 2, 8, 10, 10, 12, 19}
// For x = 0:    floor doesn't exist in array,  ceil  = 1
// For x = 1:    floor  = 1,  ceil  = 1
// For x = 5:    floor  = 2,  ceil  = 8
// For x = 20:   floor  = 19,  ceil doesn't exist in array



hint :: binary search use TC Is O(logn) 
  else brute force will give O(n)




public class prac3{ 

    public static int ceil(int arr[],int x){  
        if(x<=arr[0]){
if(x==arr[0]){return arr[0];}
if(1<arr.length){return arr[1];}

        }

        else if(x>=arr[arr.length-1]){
        if(x>arr[arr.length-1]){return -1;}
return arr[arr.length-1]; 

        }

   
   
        int st=0,end=arr.length-1;
        int mid=0;
   
        while(st<=end){ 
   mid=(st+end)/2;
            if(arr[mid]==x){return x;}
            else if(arr[mid]>x){end=mid-1;}
            else {st=mid+1;}
        }

        if(arr[mid]<x){return arr[mid+1];}
        return arr[mid];


    }

    public static void main(String[] args) {
        
     int arr[]={1,3,4,7,9,12,16,33}; 
     int x=20;

   System.out.println(ceil(arr, x));
   


    }
}
