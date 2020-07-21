import java.util.*;
public class BirthdayReminder
{
   public static void main(String[] args)
   {
      final int MAX = 10;
      final String QUIT = "ZZZ";
      String[] names = new String[MAX];
      String[] birthdates = new String[MAX];
      String entry = "";
      String msg;
      String list = "";
      int count = 0, x;
      boolean isFound = false;
      Scanner input = new Scanner(System.in);
      System.out.println("Enter a name");
      entry = input.nextLine();
      names[count] = entry;
      while(count < names.length && (!entry.equals(QUIT)) )
      {
         System.out.println("Enter birthdate with slashes between the month, day, and year");
         entry = input.nextLine();
         birthdates[count] = entry;
         ++count;
         if(count < names.length)
         {
            System.out.println("Enter a name or " + QUIT + " to quit");
            entry = input.nextLine();
            names[count] = entry;
         }
      }
      System.out.println("Count of names entered: " + count);
      for(x = 0; x < count; ++x)
         list += names[x] + "\n";
      System.out.println(list);
      System.out.println("Enter a name to search for >> ");
      entry = input.nextLine();
      while(!entry.equals(QUIT))
      {
          isFound = false;
          for(x = 0; x < count; ++x)
             if (entry.equals(names[x]))
             {
                isFound = true;

                System.out.println(names[x] + "'s birthdate is " + birthdates[x]);
             }
          if(!isFound)
            msg = "Sorry, no entry for " + entry + "\n";
          else
            msg = "";

          System.out.println(msg + "Enter a name to search for or " + QUIT + " to quit");
          entry = input.nextLine();
      }
   }
}
