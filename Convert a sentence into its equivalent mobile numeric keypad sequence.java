Given a sentence in the form of a string, convert it into its equivalent mobile numeric keypad sequence. 
 






import java.util.*;



public class prac3{ 


public static void main(String[] args) {

    String arr="GEEKSFORGEEKS";
 
    String ar[]={"2","22","222","3","33","333","4","44","444","5","55","555","6","66","666","7","77","777","7777","8","88","888","9","99","999","9999"};

    StringBuilder sb= new StringBuilder();
    for(int i=0;i<arr.length();i++){ 
        sb.append(ar[arr.charAt(i)-'A']);
    }

  
    System.out.println(sb.toString());




}



}
