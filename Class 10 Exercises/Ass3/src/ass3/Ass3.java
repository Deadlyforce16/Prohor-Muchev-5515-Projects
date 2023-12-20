package ass3;

import java.io.*;

public class Ass3 
{
	public static void main(String[] args) 
	{
		InputStreamReader isr=new InputStreamReader(System.in);
        BufferedReader input=new BufferedReader(isr);
        String text;
        
        try
        {	
        	while(true)
        	{
        		System.out.print("Input the text. To finish inputting, input END: ");
            	text=input.readLine();
            	if(text.equals("END")||text.equals("end"))
            	{
            		System.out.println("Thank you for using the program.");
            		break;
            	}
            	else
            	{
            		int weight=0;
                	for(int i=0;i<text.length();i++)
                	{
                		 weight+=(int)text.charAt(i);
                	}
                	System.out.println(text+" has "+text.length()+" characters, and its weight is "+weight);
            	}
        	}
        }
        catch(Exception e)
        {
        	System.out.println("An exception has occurred!");
        }
	}
}
