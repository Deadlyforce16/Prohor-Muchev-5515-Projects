package ass2;

import java.io.*;

public class Ass2 
{
	public static void main(String[] args) 
	{
		InputStreamReader isr=new InputStreamReader(System.in);
        BufferedReader input=new BufferedReader(isr);
        int rows=0,columns=0,sum=0,total_el=0;

        try 
        {
            System.out.print("Number of rows: ");
            rows=Integer.parseInt(input.readLine());

            System.out.print("Number of columns: ");
            columns=Integer.parseInt(input.readLine());

            int[][] arr=new int[rows][];
            for (int i=0;i<rows;i++) 
            {
                arr[i]=new int[columns];
            }

            for(int i=0;i<rows;i++) 
            {
                for(int j=0;j<columns;j++) 
                {
                    System.out.print("el. ["+i+"]["+j+"]= ");
                    arr[i][j] = Integer.parseInt(input.readLine());
                    total_el++;
                }
            }

            for(int i=0;i<rows;i++) 
            {
                for(int j=0;j<columns;j++) 
                {
                    sum+=arr[i][j];
                }
            }

            System.out.println("The sum: "+sum);
            System.out.println("The average: "+(float)sum/total_el);
        } 
        catch (Exception e) 
        {
            System.out.println("An exception has occurred!");
        }
	}
}
