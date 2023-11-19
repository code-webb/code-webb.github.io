
import java.util.Arrays;

class TestArrayValues 
{
   public static void main(String args[])
   {
      System.out.println(" ");
      System.out.println("PROGRAM TO TEST IF AN ARRAY CONTAINS A SPECIFIC VALUE");
      int[] arr = {55, 45, 69, 44, 12, 67, 34, 23, 78, 90};
      int num = 67;

      for(int i = 0; i<arr.length; i++)
      {
         if(num == arr[i])
         {  
            System.out.println("Array : " +Arrays.toString(arr));
            System.out.println(num+ " Array contains the given element");
         }
      }
   }
}