package ass1;

//Prohor Muchev 5515

import java.io.*;

public class Demo 
{
    public static void main(String[] args) 
    {
        Employee employee=new Employee();
        employee.setFirstName("Prohor");
        employee.setLastName("Muchev");
        employee.setDob("15-03-2003");
        employee.setEmployeeId(5515);
        employee.setDepartment("IT");
        employee.setSecurityClearance(5);
        
        System.out.println("First Name: "+employee.getFirstName());
        System.out.println("Last Name: "+employee.getLastName());
        System.out.println("Date of Birth: "+employee.getDob());
        System.out.println("Employee ID: "+employee.getEmployeeId());
        System.out.println("Department: "+employee.getDepartment());
        System.out.println("Security Clearance: "+employee.getSecurityClearance());
        
        System.out.println();
        
        //Serializing the object and writting it to Employees.txt
        try 
        {
            FileOutputStream fileOut=new FileOutputStream("Employees.txt");
            ObjectOutputStream objectOut=new ObjectOutputStream(fileOut);
            objectOut.writeObject(employee);
            objectOut.close();
            fileOut.close();
            System.out.println("Object serialized and written to file Employees.txt.");
        } catch(IOException e) 
        {
            e.printStackTrace();
        }
        
        //Deserializing the object from Employees.txt
        Employee deserializedEmployee=null;
        try 
        {
            FileInputStream fileIn=new FileInputStream("Employees.txt");
            ObjectInputStream objectIn=new ObjectInputStream(fileIn);
            deserializedEmployee=(Employee) objectIn.readObject();
            objectIn.close();
            fileIn.close();
            System.out.println("Object deserialized from file Employees.txt.");
        } catch (IOException | ClassNotFoundException e) 
        {
            e.printStackTrace();
        }
        
        if (deserializedEmployee!=null) 
        {
            System.out.println("\nDeserialized Object:");
            System.out.println("First Name: "+deserializedEmployee.getFirstName());
            System.out.println("Last Name: "+deserializedEmployee.getLastName());
            System.out.println("Date of Birth: "+deserializedEmployee.getDob());
            System.out.println("Employee ID: "+deserializedEmployee.getEmployeeId());
            System.out.println("Department: "+deserializedEmployee.getDepartment());
            System.out.println("Security Clearance: "+deserializedEmployee.getSecurityClearance());
        }
    }
}