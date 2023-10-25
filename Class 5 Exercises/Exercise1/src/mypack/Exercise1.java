package mypack;

public class Exercise1 
{
	public static void main(String[] args) 
	{
		String str="Computer";
		int l=str.length();
		
		System.out.println("Original: "+str);
		System.out.println("In small letters: "+str.toLowerCase());
		System.out.println("In capital letters: "+str.toUpperCase());
		System.out.println("Length: "+l);
		System.out.println("First letter: "+str.charAt(0));
		System.out.println("Last Letter: "+str.charAt(l-1));
		System.out.println("Middle letter: "+str.charAt(l/2));
		
		if(str.startsWith("Com"))
			System.out.println("The string starts with Com");
		else
			System.out.println("The string does not start with Com");
		
		if(str.endsWith("ion"))
			System.out.println("The string ends with ion");
		else
			System.out.println("The string does not end with ion");
		
		System.out.println("Replaced the letter e with o: "+str.replace("e", "o"));
		System.out.println("Replaced the part Compu with Calcula: "+str.replace("Compu", "Calcula"));
	}
}
