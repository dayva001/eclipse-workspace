
public class Time implements Calculable<Time>, Comparable<Time>, Cloneable
{
	int hours, minutes, seconds;
	
	public Time()
	{
		hours = minutes = seconds = 0;
	}
	
	public Time(int hours, int minutes, int seconds)
	{
		this.hours = this.minutes = this.seconds = 0;
		if(seconds>= 60 || seconds <=-60)
		{
			this.seconds = seconds %60;
			this.minutes= seconds/60;
		}
		else
		{
			this.seconds = seconds;
		}
		if(this.seconds<0)
		{
			this.seconds+=60;
		}
		this.minutes += minutes;
		if(this.minutes>=60 || this.minutes <=-60)
		{
			this.hours += this.minutes/60;
			this.minutes = this.minutes%60;
			if(this.minutes <60)
			{
				this.minutes +=60;
			}
		}
		if(this.minutes<0)
		{
			this.minutes+=60;
		}
		this.hours += hours % 24;

	}
	
	public Time(int hours, int minutes)
	{
		this.seconds=0;
		this.minutes = minutes;
		if(this.minutes>=60 || this.minutes <=-60)
		{
			this.hours = this.minutes/60;
			this.minutes = this.minutes%60;
		}
		if(this.minutes<0)
		{
			this.minutes+=60;
		}
		this.hours += hours % 24;
	}
	
	public Time(int hours)
	{
		this.minutes = this.seconds = 0;
		this.hours = hours % 24;
	}
	
	public Time(Time o)
	{
		new Time(o.getHour(),o.getMinute(), o.getSecond());
	}
	public int getHour()
	{
		return hours;
	}
	
	public int getMinute()
	{
		return minutes;
	}
	
	public int getSecond()
	{
		return seconds;
	}
	public int getTotalSeconds()
	{
		return seconds + (minutes * 60) + (hours * 3600);
	}
	
	public int compareTo(Time o) {
		
		return getTotalSeconds()-o.getTotalSeconds();
	}

	public Time add(Time o)
	{
		return new Time(hours + o.getHour(), minutes + o.getMinute(), seconds + o.getSecond());
	}

	public Time subtract(Time o)
	{
		return new Time(hours - o.getHour(), minutes - o.getMinute(),  seconds - o.getSecond());
	}
	
	public String toString()
	{
		return String.format("%02d", hours) + ":" + String.format("%02d", minutes) + ":" + String.format("%02d", seconds);
	}
	
	public Time clone() throws CloneNotSupportedException
	{
		return (Time)super.clone();
	}
}
