// Paul Hyde
package week4assignment;
import java.util.Scanner;
public class week4assingment {
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("This program will accept a length, width and height of a box, "
			+  "\n" + "and then it will report the surface area and volume of it.");
	System.out.println("Enter the box length:");
	float x = sc.nextFloat();
	System.out.println("Enter the box width:");
	float y = sc.nextFloat();
	System.out.println("Enter the box height:");
	float z = sc.nextFloat();
	
	System.out.printf("The surface area of your rectangle is: %,.2f%n" , surfaceArea(x,y,z));
	
	
	System.out.printf("The volume of your rectangle is: %,.2f%n" , volume(x,y,z));
	
	
	sc.close();
	}
	private static float surfaceArea(float x, float y, float z)
    {
      float ans = (2*x*y + 2*y*z + 2*x*z);
      return ans;
    }
	private static float volume(float x, float y, float z)
    {
      float ans = (x*y*z);
      return ans;
    }
}