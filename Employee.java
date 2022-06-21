public class Employee
{
    private String firstName;
    private String lastName;
    private int employeeID;
    private String dateOfEmployement;
    private int salary;
    private String department;
    
    public Employee(String fname, String lname, int empID, String doe, int sal, String dep)
    {
            firstName = fname;
            lastName = lname;
            employeeID = empID;
            dateOfEmployement = doe;
            salary = sal;
            department = dep;
    }
    
    public String getFirstName()
    {
        return firstName;
    }
    
    public String getLastName()
    {
        return lastName;
    }
    
    public int getEmployeeID()
    {
        return employeeID;
    }
    
    public String getDateOfEmployement()
    {
        return dateOfEmployement;
    }
    
    public int getSalary()
    {
        return salary;
    }
    
    public String getDepartment()
    {
        return department;
    }
    
    void setFirstName(String fname)
    {
        firstName = fname;
    }
    
    void setLastName(String lname)
    {
        lastName = lname;
    }
    
    void setEmployeeID(int empid)
    {
        employeeID = empid;
    }
    
    void setDateofEmployement(String doe)
    {
        dateOfEmployement = doe;
    }
    
    void setSalary(int sal)
    {
        salary = sal;
    }
    
    void setDepartment(String dep)
    {
        department = dep;
    }
    
    public void showInfo()
    {
        System.out.println("\tFull Name: "+getFirstName());
        System.out.println("\tLast Name: "+getLastName());
        System.out.println("\tEmployee ID: "+getEmployeeID());
        System.out.println("\tDate of Employement: "+getDateOfEmployement());
        System.out.println("\tSalary: "+getSalary());
        System.out.println("\tDepartment: "+getDepartment());
    }
}
