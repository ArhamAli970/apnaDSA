
// Given an array containing N integers and a positive integer K, find the length of the longest sub array with sum of the elements divisible by the given value K.
// Input:
// A[] = {2, 7, 6, 1, 4, 5}
// K = 3
// Output: 4
// Explanation:The subarray is {7, 6, 1, 4}
// with sum 18, which is divisible by 3.


////////////////////////////////////////////////////////////////////////////////////////////CODE/////////////////////////////////////


class Solution{
    int longSubarrWthSumDivByK(int a[], int n, int k)
    {
       
       
       

for(int i=1;i<n;i++){ 
a[i]=a[i-1]+a[i];
}

// System.out.println(arr[n-1]);

int max=0,sum=0;
HashMap<Integer,Integer> mp= new HashMap<>();
     for(int i=0;i<n;i++){ 
         sum+=a[i];
int mod=((a[i] % k) + k)%k ;  // for negative number in mind
      if(mod==0){ 
        max=i+1;
      }

// int mod=a[i]%k; 

     else if(!mp.containsKey(mod)){ 
      mp.put(mod, i);
     }

     else{ 
      max=Math.max(max,i-mp.get(mod));
     }

     }
   
return max;
       
    }
 
}
