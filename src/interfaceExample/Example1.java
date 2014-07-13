/**
 * 
 */
package interfaceExample;

/**
 * @author jitendra
 *
 */
public class Example1
{

    /**
     * @param args
     */
    public static void main(String[] args)
    {
	SalaryCalculator c = new CategoryA(2000, 500);
	Employee e = new Employee("jitendra", c);
           e.display();
           c = new CategoryB(2000, 1500);
           e = new Employee("mahi", c);
           e.display();
    }

}
