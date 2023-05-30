// Zigzag (or diagonal) traversal of Matrix


// Given a 2D matrix, print all elements of the given matrix in diagonal order. For example, consider the following 5 X 4 input matrix.  

// Example:

// 1     2     3     4
// 5     6     7     8
// 9    10    11    12
// 13    14    15    16
// 17    18    19    20
// Diagonal printing of the above matrix is

// 1
// 5 2
// 9 6 3
// 13 10 7 4
// 17 14 11 8
// 18 15 12
// 19 16
// 20

hint:: traverse through rows then last column. 


public class prac3{     
public static void main(String[] args) {
    
    int [][] mat = {{1,2},{4,5},{7,8},{9,0}}; 
    int n=mat.length;
    int m=mat[0].length;
    int arr[]=new int[n*m];
    int idx=0;


    for (int i=0;i<n;i++){ 
        int k=i,j=0;
        while(k>=0 && j<m){ 
            arr[idx++]=mat[k--][j++];
        }
    }


    for (int j=1;j<m;j++){ 
        int i=n-1,k=j;
        while(i>=0 && k<m){ 
            arr[idx++]=mat[i--][k++];
        }
    }


    for(int i=0;i<arr.length;i++){ 
        System.out.print(arr[i]+" ");
    }

}

}



