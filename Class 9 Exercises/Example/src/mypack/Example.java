package mypack;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Example 
{
	public static void main(String[] args) 
	{
		/*
		List<String> listOfStrings=Arrays.asList("a","b","c","d");
		List<String> collect=listOfStrings.stream().map(String::toUpperCase).collect(Collectors.toList());
		System.out.println(collect);
		*/
		
		List<Integer> numbers=Arrays.asList(2,3,4,5,2);
		
		Collection<Integer> initialListOfNumbers = numbers;
		initialListOfNumbers.stream().map(x ->  x*x).forEach(y ->  System.out.println(y));
		
	}
}
