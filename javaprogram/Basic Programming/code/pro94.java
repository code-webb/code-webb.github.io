
import java.util.Arrays;

class SeconelowestNumber 
{
   public static void main(String args[])
   {
      System.out.println("\n Program to find second lowest number from the array");
      int temp, size;
      int array[] = {10, 20, 25, 63, 96, 57};
      size = array.length;

      for(int i = 0; i<size; i++ )
      {
         for(int j = i+1; j<size; j++)
         {
            if(array[i]>array[j]){
               temp = array[i];
               array[i] = array[j];
               array[j] = temp;
            }
         }
      }
      System.out.println("\n Arrays : "+Arrays.toString(array));
      System.out.println(" Second Smallest element of the array is:: "+array[0]);
   }
}