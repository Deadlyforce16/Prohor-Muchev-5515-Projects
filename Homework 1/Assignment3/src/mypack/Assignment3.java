package mypack;
import java.lang.String;
public class Assignment3 
{
	public static void main(String[] args) 
	{
		String str="Java Developer";
		int l=str.length();
		char firstChar=str.charAt(0), lastChar=str.charAt(l-1), middleChar=str.charAt(l/2), biggestChar;
		int sumofChar=(int)firstChar+lastChar+middleChar;
		
		if(firstChar>lastChar && firstChar>middleChar)
			biggestChar=firstChar;
		else if(lastChar>firstChar && lastChar>middleChar)
			biggestChar=lastChar;
		else
			biggestChar=middleChar;
		
		System.out.println("My string is: "+str);
		System.out.println("Its first character is "+firstChar);
		System.out.println("Its last character is "+lastChar);
		System.out.println("Its middle character is "+middleChar);
		System.out.println("The sum of these characters is "+sumofChar);
		System.out.println("The biggest character of these three is: "+biggestChar+" with code of "+(int)biggestChar);
	}
}
