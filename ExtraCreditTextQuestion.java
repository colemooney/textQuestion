import java.util.Scanner;
public class ExtraCreditTextQuestion
{
   public static void main(String[] arg)
   {
        //CONSTANTS
        final String STATE = "California";
        
        //VARIABLES
        String city;
        String location;
        int locationSize;
        
        //ARRAYS
        
        //OBJECTS
        Scanner keyboardInput = new Scanner(System.in);
        //SOLUTION
        CS170.information("Cole Mooney", "Extra Credit", "Numerical Question");
        
        //VARIABLE ASSIGNMENT
       
        
        //KEYBOARD INPUT
        System.out.print("Enter your city: ");
        city = keyboardInput.nextLine();
        
        //Concatenation
        location = city + ", " + STATE;
        
        //Text Size
        locationSize = location.length();
        
        //SCREEN OUTPUT
        System.out.println("Location: " + location);
        System.out.println("Location Size: " + locationSize);
        
        
        keyboardInput.close();
        
       
    }
}
