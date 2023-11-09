import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

final class CustomString
{
	//variables
	private char[] stringContent;
	
	
	//constructors
	public CustomString(char[] data)
	{
		stringContent = Arrays.copyOf(data, data.length);
	}
	//functions
	public CustomString changeCase()
	{
		char tempHolder[]=Arrays.copyOf(stringContent, stringContent.length);
		for (int i = 0; i < tempHolder.length; i++)
		{
			   // title case converted to lower case
			   if (Character.isTitleCase(tempHolder[i])) {
				   tempHolder[i] = Character.toLowerCase(tempHolder[i]);
			   }
			   // upper case converted to lower case
			   if (Character.isUpperCase(tempHolder[i])) {
				   tempHolder[i] = Character.toLowerCase(tempHolder[i]);
			   }
			   // lower case converted to upper case
			   if (Character.isLowerCase(tempHolder[i])) {
				   tempHolder[i] = Character.toUpperCase(tempHolder[i]);
			   }
			}
		return new CustomString(tempHolder);
	}
	
	public char charAt(int index)
	{
			return stringContent[index];
	
	}
	
	public int compareTo(CustomString rhs)
	{
		int myString=0;
		int compareString =0;
		for(int i=0;i<stringContent.length;i++)
		{
			myString+=(int)stringContent[i];
		}
		for(int i=0;i<rhs.length();i++)
		{
			compareString+=(int)rhs.charAt(i);
		}
		return myString-compareString;
	}
	
	public String toString()
	{
		return new String(stringContent);
	}
	
	public CustomString concat(CustomString rhs)
	{
		int size = stringContent.length + rhs.length();
		char[] cat = Arrays.copyOf(stringContent,size);
		int j=0;
		for(int i = stringContent.length;i<size;i++)	
		{
			cat[i] = rhs.charAt(j);
			j++;
		}
		return new CustomString(cat);
	}
	
	public boolean equals(CustomString rhs)
	{
		return(compareTo(rhs)==0);
	}
	
	public int length()
	{
		return stringContent.length;
	}
	public CustomString[] split(char delimiter)
	{
		List<CustomString> splitString = new ArrayList<CustomString>();
		List<Character> subString = new ArrayList<Character>();
		for(int i=0;i<stringContent.length;i++)
		{
			if(stringContent[i]!=delimiter)
			{
				subString.add(stringContent[i]);
			}
			if(stringContent[i]==delimiter && subString.size()>0)
			{
				char[]temp = new char[subString.size()];
				for(int j=0;j<subString.size();j++)
				{
					temp[j]=subString.get(j);
				}
				splitString.add(new CustomString(temp));
				subString.clear();
			}
		}
		if(subString.size() >0)
		{
			char[]temp = new char[subString.size()];
			for(int j=0;j<subString.size();j++)
			{
				temp[j]=subString.get(j);
			}
			splitString.add(new CustomString(temp));;
		}
		CustomString[] returnArray = new CustomString[splitString.size()];
		returnArray = splitString.toArray(returnArray);
		return returnArray;
	}
	
	public CustomString substring(int srcBegin)
	{
		char[] subString = new char[stringContent.length-srcBegin];
		int j=0;
		for(int i=srcBegin;i<stringContent.length;i++)
		{
			subString[j]=stringContent[i];
			j++;
		}
		return new CustomString(subString);
	}
	public CustomString substring(int srcBegin, int srcEnd)
	{
		char[] subString = new char[srcEnd-srcBegin];
		int j=0;
		for(int i=srcBegin;i<srcEnd;i++)
		{
			subString[j]=stringContent[i];
			j++;
		}
		return new CustomString(subString);
	}
	public CustomString titleize()
	{
		if(stringContent.length==0)
		{
			return new CustomString(stringContent);
		}
		char[] tempHolder = Arrays.copyOf(stringContent, stringContent.length);
		
		if (Character.isLowerCase(tempHolder[0])) {
			   tempHolder[0] = Character.toUpperCase(tempHolder[0]);
		   }
		for(int i=1;i<tempHolder.length;i++)
		{
			if (tempHolder[i]==' ' && i <tempHolder.length-1)
			{
				tempHolder[i+1] = Character.toUpperCase(tempHolder[i+1]);
				i++;
			}
		}
		return new CustomString(tempHolder);
	}
	
	public CustomString toLowerCase()
	{
		char[] tempHolder = Arrays.copyOf(stringContent, stringContent.length);
		for(int i = 0; i < tempHolder.length; i++)
		{
			tempHolder[i] = Character.toLowerCase(tempHolder[i]);
		}
		return new CustomString(tempHolder);
	}
	
	public CustomString toUpperCase()
	{
		char[] tempHolder = Arrays.copyOf(stringContent, stringContent.length);
		for(int i = 0; i < tempHolder.length; i++)
		{
			tempHolder[i] = Character.toUpperCase(tempHolder[i]);
		}
		return new CustomString(tempHolder);
	}
}
