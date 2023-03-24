import java.util.ArrayList;
import java.util.Formatter;
import java.io.BufferedReader;
import java.io.InputStreamReader;


public class Toc
{
	public static final int TOCSIZE = 100;
	public static void main(String[] args)
	{
		TocEntry toc[] = new TocEntry[TOCSIZE]; 
		String chapterName = " ";
		int pageNumber;
		int index = 0;
		

		
		while (index < TOCSIZE)
		{	try
			{
				InputStreamReader rdr = new InputStreamReader(System.in);
				BufferedReader Terminal = new BufferedReader(rdr);
				
				System.out.print("Enter chapter title: ");
				chapterName = Terminal.readLine();
				if(chapterName.equals("****"))
				{
					System.out.println();
					break;
				}
				System.out.print("Enter starting page number: ");
				pageNumber = Integer.parseInt(Terminal.readLine());
				System.out.println();
				toc[index++] = new TocEntry(chapterName, pageNumber);
			}
				
			catch (Exception e)
			{
				System.out.println("Please only enter whole numbers, e.g. '16' or '46'"); 
			}
		}
		
		if (index == TOCSIZE)
		{
			System.out.println("you reached the maximum number of chapters.");
		}

		for (int i= 0; i < index; i++)
		{
			int count = 0;
			int counter = 0;
			int length = 0;
			String chptr = toc[i].getChapterTitle();
			int page = toc[i].getPageNumber();
			
			length = chptr.length();
			
			while (page != 0) 
			{
			page = page / 10;
			count ++;
			}
			
			counter = 50 - length - count;
			
			System.out.print(toc[i].getChapterTitle());
			
			for (int x = 0; x < counter; x++)
			{
				System.out.print(".");
			}
			
			System.out.print(toc[i].getPageNumber());
			System.out.println();
		}
	}
}
