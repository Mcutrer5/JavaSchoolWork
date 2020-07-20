import java.util.*;
public class ValidatePassword
{
  public static void main(String[] args)
  {
     String charIn;
     int stringLen;
     final int NUM = 1;
     int upperCount = 0, lowerCount = 0, count = 0, letterCount = 0;
     boolean isValid = false;
     Scanner in = new Scanner(System.in);
     int numSpaces = 0;
     System.out.println("Password Validation: ");
     System.out.println("Password must have at least: ");
     System.out.println("        2 uppercase characters");
     System.out.println("        3 lowercase characters");
     System.out.println("        1 digit");

     do {
     System.out.print("Enter a password >> ");
     charIn = in.nextLine();
     stringLen = charIn.length();

     for(int i = 0; i < stringLen; i++)
     {
        char ch = charIn.charAt(i);
        if(Character.isUpperCase(ch))
           upperCount++;
        else {
           if(Character.isLowerCase(ch))
             lowerCount++;
           else
              if(Character.isDigit(ch))
                 count++;
        }
     }
     if(upperCount >= NUM && lowerCount >= NUM && count >= NUM) {
        System.out.println("Valid password");
        isValid = true;
     }
     else
     {
        System.out.println("The password did not have enough of the following:");
        if(upperCount < NUM)
           System.out.println("uppercase letters");
        if(lowerCount < NUM)
           System.out.println("lowercase letters");
        if(count < NUM)
          System.out.println("digits");
     }
  } while (!isValid);
  } 
}
