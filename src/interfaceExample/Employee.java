/**
 * 
 */
package interfaceExample;

/**
 * @author jitendra
 *
 */
public class Employee
{
    private  SalaryCalculator empType;
    private String name;
    public Employee(String name,SalaryCalculator c)
    {
	this.name = name;
	this.empType = c;
    }
    
    public void display(){
	System.out.println("name = "+name);
	System.out.println( "salary = "+ empType.getSalary());
    }

}
