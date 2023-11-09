
public class VideoGame 
{
	//variables
	private String name = "";
	private String platform = "";
	private int pubYear = 0;
	private String genre = "";
	private String publisher = "";
	private double sales_NA, sales_JP, sales_EU, sales_other;
	//functions
	//------------------------------------------------------------------------------
	//constructors
	public VideoGame()
	{
	}

	public VideoGame(String n, String p, int py, String g, String pu, double sNA, double sJP, double sEU, double sO)
	{
		name=n;
		platform=p;
		pubYear=py;
		genre=g;
		publisher=p;
		sales_NA=sNA;
		sales_JP=sJP;
		sales_EU=sEU;
		sales_other=sO;
	}
	//getters
	public String name()
	{
		return name;
	}
	
	public String platform()
	{
		return platform;
	}
	
	public int yearPublished()
	{
		return pubYear;
	}
	
	public String genre()
	{
		return genre;
	}
	
	public String publisher()
	{
		return publisher;
	}

	public double salesNA()
	{
		return sales_NA;
	}
	
	public double salesJP()
	{
		return sales_JP;
	}
	
	public double salesEU()
	{
		return sales_EU;
	}
	
	public double salesOther()
	{
		return sales_other;
	}
	
	public double salesTotal()
	{
		return sales_other + sales_EU + sales_JP + sales_NA;
	}
	
	//setters
	public void setName(String n)
	{
		name=n;
	}
	
	public void setPlatform(String p)
	{
		platform=p;
	}
	
	public void setYearPublished(int yP)
	{
		pubYear=yP;
	}
	
	public void setGenre(String g)
	{
		genre=g;
	}
	
	public void setPublisher(String p)
	{
		publisher=p;
	}

	public void setSalesNA(double sNA)
	{
		sales_NA=sNA;
	}
	
	public void setSalesJP(double sJP)
	{
		sales_JP=sJP;
	}
	
	public void setSalesEU(double sEU)
	{
		sales_EU=sEU;
	}
	
	public void setSalesOther(double sO)
	{
		sales_other=sO;
	}
}