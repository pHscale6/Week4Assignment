//Paul Hyde
// I believe I got most of the code for the individual parts right, but I don't know how to make it all come together.
// It will simply do the first method and either stop or continually repeat the first method without moving on.
import java.util.Random;
import java.util.Scanner;
public class Paul_Hyde_Week6Assignment {
	public static void main(String[] args) 
	{
		//forLoop();
	
		whileLoop();
		
		doWhileLoop();
		
	}
	private static void forLoop() 
	{
		Scanner input = new Scanner(System.in);
		System.out.println("---------------------------------------------------------------------");
		System.out.println("Part 1: for loop: Average of randomly generated integers");
		System.out.println("---------------------------------------------------------------------");
		System.out.println("Enter the bottom number of the range: ");
		int x = input.nextInt();
		System.out.println("Enter the top number of the range: ");
		int y = input.nextInt();
		System.out.println(" Enter How Many Numbers to Generate: ");
		int z = input.nextInt();	
		System.out.print("Generated Random Numbers: ");
		double sum = 0;
		for (int i=1; i<=z; i++)
		{
			Random r = new Random();
			int min = x;
		    int max = y;
		    int t;
		    t = r.nextInt((max - min) + 1) + min;
		    System.out.print(t + " ");
		    sum = sum + t;
		}
		System.out.println("\n" + "Average of generated numbers: " + sum/z);
		System.out.println("---------------------------------------------------------------------");
		input.close();
	}
	private static void whileLoop()
	{
		Scanner input = new Scanner(System.in);
		System.out.println("Part 2: while loop: Average of user-entered integers using While loop");
		System.out.println("---------------------------------------------------------------------");
		System.out.println("Enter integers to average. Enter -1 to finish.");
		int i = 1;
		double sum = 0;
		while (input.hasNextInt())
		{
			int c = input.nextInt();
			if (c != -1)
			{
			System.out.println("Entry " + i + ": " + c);
			sum = sum + c; 
			i++;
			}
			else
			{
				System.out.println("Entry " + i + ": " + c);
				System.out.println("Number of entries: " + (i-1));
				System.out.println("Average of user-entered numbers: " + sum/(i-1));
				System.out.println("---------------------------------------------------------------------");
			}
		}
		
		input.close();
	}
	private static void doWhileLoop()
	{
		Scanner user = new Scanner(System.in); 
		System.out.println("Part 3: do-while loop: Display menu until user chooses to exit");
		System.out.println("---------------------------------------------------------------------");
		int x;
		do 
		{
			System.out.println("==============================");
			System.out.println("MENU");
			System.out.println("==============================");
			System.out.println("1: Choice 1\r\n" + "2: Choice 2\r\n" + "3: Choice 3\r\n" + "4: Exit");
			System.out.println("==============================");
			System.out.print("Enter 1, 2, 3 or 4 to Exit: ");
			x = user.nextInt(); 
			if (x==1 || x==2 || x==3 || x==4)
			{
				System.out.println(x);
			}
			else
			{
			System.out.println("Error! Please enter 1, 2, 3 or 4.");
			}
		}
		while(x!= 4);
		System.out.print("Goodbye!");
		user.close();
		}
	}