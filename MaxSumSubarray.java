Given an integer array nums, find the subarraywith the largest sum, and return its sum.

Mainly her we use KADANE'S Algo.


class Solution {
    public static  void main(String[] args[]) { 

int nums[]={1,34,-23,73}

        int max=Integer.MIN_VALUE;
int sum=0;
        for (int i=0;i<nums.length;i++){ 
sum+=nums[i]; 
max=Math.max(sum,max);
if(sum<0){ 
    sum=0;
}


        } 
       System.out.print(max);
        
    }
}
