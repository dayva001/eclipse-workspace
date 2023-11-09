package arraylistsEX;

public class Car implements Comparable<Car>
{

		private String make = "DMC";
		private String model = "DeLorean";
		private String lpn = "OUTATIME";
		private int year=1983;

		public Car()
		{
		}
		
		public Car(int year,String make, String model, String lpn)
		{
			this.make = make;
			this.model = model;
			this.lpn = lpn;
			if(year > 1886)
			{
				this.year = year;
			}
			else
			{
				year = 1886;
			}
		}
		
		public void setMake(String make)
		{
			this.make = make;
		}
		
		public void setModel(String model)
		{
			this.model = model;
		}
		
		public void setLicenseNum(String lpn)
		{
			this.lpn = lpn;
		}
		
		public void setYear(int year)
		{
			if(year > 1886)
			{
				this.year = year;
			}
			else
			{
				year = 1886;
			}
		}
		
		public String getMake()
		{
			return make;
		}
		
		public String getModel()
		{
			return model;
		}
		
		public String getLicenseNum()
		{
			return lpn;
		}
		
		public int getYear()
		{
			return year;
		}
		
		public int compareTo(Car other)
		{
			return this.year-other.year;
		}
		
		public String toString()
		{
			return (year + " " + make + " " + model + " (" + lpn + ")");		
		}
}
