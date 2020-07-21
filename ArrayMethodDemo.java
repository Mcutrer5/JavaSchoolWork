public class ArrayMethodDemo
{
   public static void main (String args[])
   {
      int[] numbers = {12, 15, 34, 67, 4, 9, 10, 7};
      int limit = 8;
      display(numbers);
      displayReverse(numbers);
      displaySum(numbers);
      displayLessThan(numbers, limit);
      displayHigherThanAverage(numbers);
   }
   public static void display(int[] numbers)
   {
      int x;
      System.out.print("\nThe numbers in the array are:");
      for(x = 0; x < numbers.length; ++x)
         System.out.print(" " + numbers[x]);
   }
   public static void displayReverse(int[] numbers)
   {
      System.out.print("\nThe numbers in reverse order are:");
      for(int i = numbers.length - 1; i >= 0; --i) {
         System.out.print(" " + numbers[i]);
      }
   }
   public static void displaySum(int[] numbers)
   {
      int total = 0;
      for(int i = 0; i < numbers.length; i++)
      {
         total += numbers[i];
      }
      System.out.println("\nThe sum of all numbers is: " + total);
   }
   public static void displayLessThan(int[] numbers, int limit)
   {
      int x;
      System.out.print("All numbers in the array that are less than: " + limit + " are: ");
      for(x = 0; x < numbers.length; ++x)
      {
         if(numbers[x] < limit)
            System.out.print(" " + numbers[x]);
      } 

   }
   public static void displayHigherThanAverage(int[] numbers)
   {
      int x, displaySum = 0;
      double avg;
      for(x = 0; x < numbers.length; ++x)
        displaySum = displaySum + numbers[x];
      avg = displaySum / 8;
      System.out.println("\nThe average of the numbers in the array is: " + avg);
      System.out.print("All numbers in the array that are greather than the average of the numbers is: ");
      for(x = 0; x < numbers.length; ++x)
      {
         if(numbers[x] > avg)
            System.out.print(" " + numbers[x]);
      }
   }
}
