package ass1;

//Prohor Muchev 5515

import java.io.Serializable;

public class Employee extends Person implements Serializable 
{
    int employeeId;
    String department;
    int securityClearance;
    
    public Employee() {}
    
    public int getEmployeeId() 
    {
        return employeeId;
    }
    
    public void setEmployeeId(int employeeId) 
    {
        this.employeeId=employeeId;
    }
    
    public String getDepartment() 
    {
        return department;
    }
    
    public void setDepartment(String department) 
    {
        this.department=department;
    }
    
    public int getSecurityClearance() 
    {
        return securityClearance;
    }
    
    public void setSecurityClearance(int securityClearance) 
    {
        this.securityClearance=securityClearance;
    }
}