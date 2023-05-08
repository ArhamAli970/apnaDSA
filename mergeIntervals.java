// Given an array of intervals where intervals[i] = [starti, endi], merge all overlapping intervals, and return an array of the non-overlapping intervals 
//that cover all the intervals in the input.

 

// Example 1:

// Input: intervals = [[1,3],[2,6],[8,10],[15,18]]
// Output: [[1,6],[8,10],[15,18]]
// Explanation: Since intervals [1,3] and [2,6] overlap, merge them into [1,6].





class Solution {
    public int[][] merge(int[][] intervals) {

      ArrayList<ArrayList<Integer>> arr= new ArrayList<>(); 


 int idx=0;
 Arrays.sort(intervals,Comparator.comparingDouble(o->o[0])); 
int st=intervals[0][0];
int max=intervals[0][1];

 for(int i=1;i<intervals.length;i++){ 
    if(intervals[i][0]<=max){ 
        max=Math.max(max, intervals[i][1]);
    }
    else{ 
arr.add(new ArrayList<>());
arr.get(idx).add(st);
arr.get(idx++).add(max);
st=intervals[i][0];
max=intervals[i][1];
    }
 }
 
 arr.add(new ArrayList<>());
 arr.get(idx).add(st);
 arr.get(idx).add(max);

 int newarr[][]=new int[arr.size()][2];

for(int i=0;i<arr.size();i++){ 
    newarr[i][0]=arr.get(i).get(0);
    newarr[i][1]=arr.get(i).get(1);
}

 return newarr;

    }
}
