public class SelectionSort{

public static int[] selectionSortArray(int[] array){
        
for (int i = 0; i < array.length - 1; i++)
{
             int index = i;

   for (int j = i + 1; j < array.length; j++)

                 if (array[j] < array[index])
                     index = j;
       
             int minimumNumber = array[index]; 
             array[index] = array[i];
             array[i] = minimumNumber;

 }
         return array;
 }
      
public static void main(String a[]){
          
 int[] array = {12,24,6,56,3,9,15,41};
         
   System.out.println("Before sorting");
         
    for(int i:array){
   System.out.print(i);
   System.out.print(", ");
   }
 
   int[] resultarr = selectionSortArray(array);
         
         System.out.println("\nAfter sorting"); 

      for(int i:resultarr){

     System.out.print(i);
     System.out.print(", ");
     }
}
}
