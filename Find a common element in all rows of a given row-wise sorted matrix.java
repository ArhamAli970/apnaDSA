    

//Given a matrix where every row is sorted in increasing order. Write a function that finds and returns a common element in all rows. If there is no common element, then





        int mat[][] = { {1, 2, 3, 4, 5},
                    {2, 3, 5, 8, 10},
                    {3, 5, 7, 9, 11},
                    {1, 3, 5, 7, 9},
                  };  
                  int n=mat.length;
                  int m=mat[0].length;

                  HashMap<Integer,Integer> mp= new HashMap<>(); 
                  ArrayList<Integer> arr= new ArrayList<>();
    for (int i=0;i<n;i++){ 
        HashSet<Integer> h=new HashSet<>();
        for(int j=0;j<m;j++){ 
h.add(mat[i][j]); 
        } 

        for(int data:h){ 
    mp.put(data, mp.getOrDefault(data, 0)+1);
        }

    }


for(Map.Entry<Integer,Integer> e: mp.entrySet()){ 
    if(e.getValue()==n){ 
        arr.add(e.getKey());
    }
}

System.out.println(arr);




    }
}
