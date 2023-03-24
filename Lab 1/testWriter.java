import java.util.Scanner;
import java.io.File;
import java.io.PrintWriter;
import java.io.IOException;

public class testWriter
{
	 public static void main(String[] args) throws IOException
	 {
		 if (args.length != 1)
		 {
			 System.out.println("usage: java writeFile fileName");
			 System.exit(-1);
		 }

		 File fw = new File(args[0]);

		 PrintWriter pw = new PrintWriter(fw);

		 if (!fw.exists())
		 {
			 System.out.println("Cannot create file: " + args[0]);
			 System.exit(0);
		 }
		 
		 String name = "James Gosling";
		 
		 int age = 45;
		 
		 double income = 256000.00;
		 
		 pw.println(name);
		 
		 pw.println(age);
		 
		 pw.println(income);
		 
		 Scanner input = new Scanner(System.in);
		 
		 System.out.print("Enter name: ");
		 
		 name = input.nextLine();
		 
		 pw.println(name);
		 
		 System.out.print("Enter age: ");
		 
		 age = Integer.parseInt(input.nextLine());
		 
		 pw.println(age);
		 
		 System.out.print("Enter income: ");
		 
		 income = Double.parseDouble(input.nextLine());
		 
		 pw.println(income);

		 pw.close();
	 }
}