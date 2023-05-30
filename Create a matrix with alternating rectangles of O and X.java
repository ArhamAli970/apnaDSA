// Write a code which inputs two numbers m and n and creates a matrix of size m x n (m rows and n columns) in which every elements is either X or 0. The Xs and 0s must be filled alternatively, the matrix should have outermost rectangle of Xs, then a rectangle of 0s, then a rectangle of Xs, and so on.

// Examples:  

// Input: m = 3, n = 3
// Output: Following matrix 
// X X X
// X 0 X
// X X X



hint : use spiral matrix technique



public class prac3{ 
    public static void main(String[] args) {
        
        int n=4,m=6;
        char arr[][]=new char[n][m];

        int i=0,j=0,cnt=0; 
        int val=(n%2==0)?n/2:(n/2)+1;

        while(i<val){  
            char ch=(i%2==0)?'X':'O';

      for(int k=0+cnt;k<m-cnt;k++){ 

arr[i][k]=ch;
      }

      for(int k=0+cnt;k<n-cnt;k++){ 
        arr[k][j]=ch;
      }


      for(int k=0+cnt;k<m-cnt;k++){ 

        arr[n-i-1][k]=ch;
              }
     

    for(int k=0+cnt;k<n-cnt;k++){ 
                arr[k][m-j-1]=ch;
        }    





      i++;j++;cnt++;

        }




    //print output    
        for( i=0;i<n;i++){ 
            for(j=0;j<m;j++){ 
                System.out.print(arr[i][j]+" ");
            }
System.out.println();
        }



    }
}
