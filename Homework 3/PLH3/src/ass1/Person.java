package ass1;

//Prohor Muchev 5515

import java.io.Serializable;

public class Person implements Serializable 
{
    String firstName;
    String lastName;
    String dob;
    
    public Person() {}
    
    public void setFirstName(String firstName) 
    {
        this.firstName=firstName;
    }
    
    public String getFirstName() 
    {
        return firstName;
    }
    
    public void setLastName(String lastName) 
    {
        this.lastName=lastName;
    }
    
    public String getLastName() 
    {
        return lastName;
    }
    
    public void setDob(String dob) 
    {
        this.dob=dob;
    }
    
    public String getDob() 
    {
        return dob;
    }
}
