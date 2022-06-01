package problem5;



public class Split { 
    public static void main(String args[]) 
    { 
        String str = "23 + 45 ( 343 / 12 ) "; 
        String[] arrOfStr = str.split(" "); 
         System.out.println("Number of substrings: "+arrOfStr.length);
         
         for(int i=0; i< arrOfStr.length; i++)
         {
             System.out.println("str["+i+"] : "+arrOfStr[i]);
         }
 
    } 
}