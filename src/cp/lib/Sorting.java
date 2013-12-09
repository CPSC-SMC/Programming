//********************************************************************
//  Sorting.java       Author: Lewis/Loftus
//
//  Demonstrates the selection sort and insertion sort algorithms.
//********************************************************************
package cp.lib;

public class Sorting
{
		
   //-----------------------------------------------------------------
   //  Sorts the specified array of objects using the selection
   //  sort algorithm.
   //-----------------------------------------------------------------
   public static int selectionSort (Comparable[] list)
   {
       int iterations = 0;
      int min;
      Comparable temp;
		//counter = 0; //reset counter
		
      for (int index = 0; index < list.length-1; index++)
      {
          if (list[index] == null)
              break;
          
         min = index;
         for (int scan = index+1; scan < list.length; scan++)
         {
             if (list[scan] == null)
                 break;
	
             iterations++; // add one to counter
            if (list[scan].compareTo(list[min]) < 0)
            {
                min = scan;
            }
         }
			
         // Swap the values
         temp = list[min];
         list[min] = list[index];
         list[index] = temp;
      }
      return iterations;
   }

   public static int bubbleSort(Comparable[] list)
   {
       int iterations = 0;
       boolean sorted = false;
       
       while (!sorted)
       {
           sorted = true;
           for(int index = 0; index < list.length - 1; index++)
           {
               iterations++;
               if (list[index + 1].compareTo(list[index]) < 0)
               {
                   Comparable temp = list[index];
                   list[index] = list[index+1];
                   list[index+1] = temp;
                   sorted = false;
               }
           }
       }
       
       return iterations;
   }
   //-----------------------------------------------------------------
   //  Sorts the specified array of objects using the insertion
   //  sort algorithm.
   //-----------------------------------------------------------------
   public static int insertionSort (Comparable[] list)
   {
       int iterations = 0;
      for (int index = 1; index < list.length; index++)
      {
         Comparable key = list[index];
         int position = index;

         //  Shift larger values to the right
         while (position > 0 && key.compareTo(list[position-1]) < 0)
         {
             iterations ++;
            list[position] = list[position-1];
            position--;
         }
            
         list[position] = key;
      }
      return iterations;
   }
   
}
