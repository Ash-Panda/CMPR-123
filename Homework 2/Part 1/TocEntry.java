public class TocEntry
{
	public TocEntry(String chapter, int page)
	{
		this.chapter = chapter;
		this.page = page;
	}

	public String getChapterTitle()
	{
		return chapter;
	}
	public int getPageNumber()
	{
		return page;
	}
	

private String chapter;
private int page;
} 