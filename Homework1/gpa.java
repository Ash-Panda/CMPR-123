import java.util.Scanner;
import java.io.File;
import java.io.PrintWriter;
import java.io.IOException;
import java.lang.String;
import java.text.DecimalFormat;


public class gpa
 {
	
	public static void main(String[] args) throws IOException
	{
		float grade = 0;
		int gpaCredit = 4;
		int gradePoint = 0;
		float gpaT = 0;
		int classCount = 0;
		String text= "";
			
	 File fr = new File(args[0]);
	 if (!fr.exists())
	 {
		 System.out.println("Error: file " + args[0] + " not found.\n");
		 System.exit(0);
	 }
	 Scanner infile = new Scanner(fr);
	 while (infile.hasNextLine())
	 {
		char letter = ' ';
		classCount = classCount + 1;
		String line = infile.nextLine();
		letter = line.charAt(line.length()-1);
		text = text + line + "\n" ;
		if (letter == 'A')
		{
			grade = (4*gpaCredit) + grade;
			gradePoint = gradePoint + gpaCredit;
		}
		else if (letter == 'B')
		{
			grade = (3*gpaCredit) + grade;
			gradePoint = gradePoint + gpaCredit;
		}
		else if (letter == 'C')
		{
			grade = (2*gpaCredit) + grade;
			gradePoint = gradePoint + gpaCredit;
		}
		else if (letter == 'D')
		{
			grade = (1*gpaCredit) + grade;
			gradePoint = gradePoint + gpaCredit;
		}
		else 
		{
			grade = (0*gpaCredit) + grade;
			gradePoint = gradePoint + gpaCredit;
		}
	 }
		gpaT = grade / gradePoint;
	
		if (!fr.exists())
		{
			System.out.println("Error: file " + args[0] + " not found.\n");
			System.exit(0);
		}
		else if (args.length > 1)
		{
			if (args[1].equals("-o"))
			{
				File fw = new File(args[2]);
				PrintWriter pw = new PrintWriter(fw);
				
				if (!fw.exists())
				{
					System.out.println("Cannot create file: " + args[2]);
					System.exit(0);
				}
				else
				{
					DecimalFormat df = new DecimalFormat("###.##");
					pw.println(text);
					pw.println("Number of courses Attempted: " + classCount + "\nGPA: "+ df.format(gpaT));
					System.out.println("Number of courses Attempted: " + classCount + "\nGPA: "+ df.format(gpaT));
					pw.close();
				}
			}
			
			else 
			{
				System.out.println("Invalid Command, available commands are: -o.");
				System.exit(0);
			}
		}
		else if (args.length == 1)
		{
			
			DecimalFormat df = new DecimalFormat("###.##"); 
			System.out.println(text + "GPA: " + df.format(gpaT));
			 
		}
		else 
		{
			System.out.println("usage: java gpa fileName (optional command -o to create file then add file name after");
		}
	 }

}