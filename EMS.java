import java.util.*;

public class EMS
{
    private ArrayList<Employee> employees;
    public EMS()
    {
        employees = new ArrayList<Employee>();
    }
    
    public void addEmployee()
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("\tEnter employee first name: ");
        String fName = sc.nextLine();
        System.out.println("\tEnter employee last name: ");
        String lName = sc.nextLine();
        System.out.println("\tEnter employee date of Employement: ");
        String doe = sc.nextLine();
        System.out.println("\tEnter employee department: ");
        String dep = sc.nextLine();
        System.out.println("\tEnter employee salary: ");
        int sal = sc.nextInt();
        System.out.println("\tEnter employee ID: ");
        int empID = sc.nextInt();
        for (int i = 0; i < employees.size(); i++) 
        {
          if(empID == employees.get(i).getEmployeeID())
          {
              System.out.println("Employee with given ID already exists....");
              return;
          }
        }
        Employee emp = new Employee(fName, lName, empID, doe, sal, dep);
        employees.add(emp);
    }
    
    public void updateEmployee()
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("\tEnter employee ID (to update information): ");
        int empID = sc.nextInt();
        int index=-1;
        for (int i = 0; i < employees.size(); i++) 
        {
          if(empID == employees.get(i).getEmployeeID())
          {
              System.out.println("\tEmployee information is as follows....");
              employees.get(i).showInfo();
              index = i;
              break;
          }
        }
        if(index != -1)
        {
            System.out.println("\tYou can now update employee information...");
            System.out.println("\tChoose what you want to update: ");
            System.out.println("\t1.Employee first name\n\t2.Employee last name\n\t3.Employee ID\n\t4.Date of Employement\n\t5.Salary\n\t6.Department\n\n\tYour Choice: ");
            int choice = sc.nextInt();
            if(choice==1)
            {
                System.out.println("\tEnter employee first name: ");
                String fName = sc.nextLine();
                employees.get(index).setFirstName(fName);
            }
            else if(choice==2)
            {
                System.out.println("\tEnter employee last name: ");
                String lName = sc.nextLine();
                employees.get(index).setLastName(lName);
            }
            else if(choice==3)
            {
                System.out.println("\tEnter employee ID: ");
                empID = sc.nextInt();  
                employees.get(index).setEmployeeID(empID);
            }
            else if(choice==4)
            {
                System.out.println("\tEnter employee date of Employement: ");
                String doe = sc.nextLine(); 
                employees.get(index).setDateofEmployement(doe);
            }
            else if(choice==5)
            {
                System.out.println("\tEnter employee salary: ");
                int sal = sc.nextInt();
                employees.get(index).setSalary(sal);
            }
            else if(choice==6)
            {
                System.out.println("\tEnter employee department: ");
                String dep = sc.nextLine();
                employees.get(index).setDepartment(dep);
            }
        }
        else
            System.out.println("\tEmployee with given ID not found....");
    }
    
    public void removeEmployee()
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("\tEnter employee ID: ");
        int empID = sc.nextInt();
        int index = -1;
        for (int i = 0; i < employees.size(); i++) 
        {
          if(empID == employees.get(i).getEmployeeID())
          {
              employees.remove(i);
              index = i;
              System.out.println("\tEmployee with employee ID "+empID+" has been removed....");
              break;
          }
        }
        if(index == -1)
            System.out.println("\tEmployee with given ID not found....");
    }
    
    public void listEmployee()
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("\tEnter employee ID: ");
        int empID = sc.nextInt();
        int index = -1;
        for (int i = 0; i < employees.size(); i++) 
        {
          if(empID == employees.get(i).getEmployeeID())
          {
              System.out.println("\n\tEmployee information is as follows...");
              employees.get(i).showInfo();
              index = i;
              break;
          }
        }
    }
    
    public static void main(String args[])
    {
        EMS myEMS = new EMS();
        Scanner sc= new Scanner(System.in);
        System.out.println("======Welcome to Employee Management System======");
        while(true)
        {
            System.out.println("\n1.Add Employee\n2.Update employee information\n3.Remove employee\n4.Show employee information\n5.Exit\nYour choice: ");
            int choice = sc.nextInt();
            if(choice==1)
                myEMS.addEmployee();
            else if(choice==2)
                myEMS.updateEmployee();
            else if(choice==3)
                myEMS.removeEmployee();
            else if(choice==4)
                myEMS.listEmployee();
            else if(choice==5)
                break;
            else
                System.out.println("Invalid input. Please try again....");
        }
    }
}
