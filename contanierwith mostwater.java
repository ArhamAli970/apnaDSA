// Given N non-negative integers a1,a2,....an where each represents a point at coordinate (i, ai). N vertical lines are drawn such that the two endpoints of line i is at (i, ai) and (i,0). Find two lines, which together with x-axis forms a container, such that it contains the most water.

// Note : In Case of single verticle line it will not be able to hold water.





class Solve{
    
    long maxArea(int arr[], int n){
        int i=0,j=n-1;
        
     
        long max=0;
        
        while(i<j){ 
         long ans=Math.min(arr[i],arr[j])*(j-i);
         if(arr[i]>=arr[j]){
             j--;
         }
         
         else{ 
             
            i++; 
         }
         
         max=Math.max(max,ans);
            
        }
        return max;
        
    }
    
}
