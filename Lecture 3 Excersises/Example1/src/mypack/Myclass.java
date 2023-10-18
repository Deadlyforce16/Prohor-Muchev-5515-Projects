package mypack;

class myNumber
{
	private int num;
	public int num2;
	
	public myNumber()
	{
		num=0;
		num2=100;
	}
	
	public myNumber(int num, int num2)
	{
		this.num=num;
		this.num2=num2;
	}
	
	int getNum()
	{
		return num;
	}
	
	int getNum2()
	{
		return num2;
	}
	
	void setNum(int i)
	{
		num=i;
		num2=10*i;
	}
	
	void description()
	{
		System.out.println("num: "+num+", num2: "+num2);
	}
	
	float average()
	{
		return (num+num2)/2.0f;
	}
}

public class Myclass 
{
	public static void main(String[] args) 
	{
		myNumber A=new myNumber();
		System.out.println(A.getNum());
		A.setNum(10);
		System.out.println(A.getNum());
		System.out.println(A.num2);
		
		myNumber mb=new myNumber(13,10);
		mb.description();
		System.out.println("Average: "+mb.average());
	}
}
