import java.util.Scanner;
import java.io.File;
import java.io.PrintWriter;
import java.io.IOException;
public class type
	{
	public static void main(String[] args) throws IOException
		{
			if (args.length != 1)
		{
		System.out.println("usage: java type fileName");
		System.exit(-1);
	 }
	 File fr = new File(args[0]);
	 if (!fr.exists())
	 {
		 System.out.println("Error: file " + args[0] + " not found.\n");
		 System.exit(0);
	 }
	 Scanner infile = new Scanner(fr);
	 while (infile.hasNextLine())
	 {
		 String line = infile.nextLine();

		 System.out.println(line);
	 }
	 infile.close();
	 }
}