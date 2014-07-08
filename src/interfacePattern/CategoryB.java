/**
 * 
 */
package interfacePattern;

/**
 * @author jitendra
 *
 */
public class CategoryB implements SalaryCalculator
{
    private double basic;
    private double salesAmount;
    private static final double comission = .02;
    
    public CategoryB(double basic,double salesAmount){
	this.basic = basic;
	this.salesAmount = salesAmount;
    }

    @Override
    public double getSalary()
    {
	return (basic+(salesAmount*comission));
    }

}
