/**
 * 
 */
package interfaceExample;

/**
 * @author jitendra
 *
 */
public class CategoryA implements SalaryCalculator
{
    private double base;
    private double overTime;
    
    
   public  CategoryA(double base,double overTime){
	this.base = base;
	this.overTime = overTime;
    }

    /* (non-Javadoc)
     * @see interfacePattern.SalaryCalculator#getSalary()
     */
    @Override
    public double getSalary()
    {
	return (base+overTime);
    }

}
