package mypack;

public class Assignment2 
{
	public static void main(String[] args) 
	{
		int gross_salary=20000;
		double state_taxes=(double)(gross_salary*(28.4/100.0)), personal_tax, net_salary;
		double pt=gross_salary-state_taxes-7000;
		if(pt>0)
			personal_tax=(double)(pt*(10.0/100.0));
		else
			personal_tax=0;
		net_salary=gross_salary-state_taxes-personal_tax;
		
		System.out.println("The employee: Prohor Muchev with a Gross salary of: "+gross_salary+" MKD. Will get NET salary: "+Math.round(net_salary)+" MKD.");
		System.out.println("State taxes are: "+Math.round(state_taxes)+" MKD.");
		System.out.println("Personal tax is: "+Math.round(personal_tax)+" MKD.");
	}
}
