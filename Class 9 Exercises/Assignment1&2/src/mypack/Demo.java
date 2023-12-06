package mypack;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

class Student 
{
    String name;
    int indexNo;
    int age;

    public Student(String name, int indexNo, int age) 
    {
        this.name=name;
        this.indexNo=indexNo;
        this.age=age;
    }

    public static Student createStudent(String name, int indexNo, int age) 
    {
        return new Student(name,indexNo,age);
    }

    public static void printValues(Student student) 
    {
        System.out.println("Name: "+student.name);
        System.out.println("Index No: "+student.indexNo);
        System.out.println("Age: "+student.age);
    }

    public static int getRandomIndexNo() 
    {
        Random random=new Random();
        return random.nextInt(10000)+1;
    }

    public static int getRandomAge() 
    {
        Random random=new Random();
        return random.nextInt(13)+18;
    }
}

public class Demo 
{
    public static void main(String[] args) 
    {
        List<String> names=List.of("Prohor","Tristan","Jovan","Matej","Imar");

        List<Student> students=names.stream().map(name -> Student.createStudent(name, Student.getRandomIndexNo(), Student.getRandomAge())).toList();

        System.out.println("All students:");
        for(Student student:students) 
        {
            Student.printValues(student);
            System.out.println();
        }

        List<Student> startsWithP=students.stream().filter(student -> student.name.startsWith("P")).toList();

        System.out.println("Students whose name starts with P:");
        for(Student student:startsWithP) 
        {
            Student.printValues(student);
            System.out.println();
        }

        boolean allYoungerThan25=students.stream().allMatch(student -> student.age < 25);
        System.out.println("Are all students younger than 25? "+allYoungerThan25);

        boolean allOlderThan25=students.stream().allMatch(student -> student.age > 25);
        System.out.println("Are all students older than 25? "+allOlderThan25);

        boolean atLeastOneYoungerThan25=students.stream().anyMatch(student -> student.age < 25);
        System.out.println("Is there at least one student younger than 25? "+atLeastOneYoungerThan25);
    }
}