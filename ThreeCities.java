import java.util.Scanner;

public class ThreeCities {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // Prompting user to enter city names and assigning them to variables
        System.out.print("Enter the first city: ");
        String City1 = in.next();
        System.out.print("Enter the second city: ");
        String City2 = in.next();
        System.out.print("Enter the third city: ");
        String City3 = in.next();

        //Assigning a temporary variable to use in swapping
        String temp;

        //Comparing city names and swapping accordingly
        if ((City2.compareTo(City1) < 0) && (City2.compareTo(City3) < 0))
        {
            temp = City1;
            City1 = City2;
            City2 = temp;
        }
        else if ((City3.compareTo(City1) < 0) && (City3.compareTo(City2) < 0))
        {
            temp = City1;
            City1 = City3;
            City3 = temp;

        }
        if (City3.compareTo(City2) < 0)
        {
            temp = City2;
            City2 = City3;
            City3 = temp;
        }

        // Display cities in ascending order
        System.out.println("The three cities in alphabetical order are " +
                City1 + " " + City2 + " " + City3);
    }
}
