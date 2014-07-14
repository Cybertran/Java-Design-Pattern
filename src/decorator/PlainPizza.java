/**
 * 
 */
package decorator;

/**
 * @author jitendra
 * 
 */
public class PlainPizza implements Pizza
{

    @Override
    public String getDescriptions()
    {
	return "Thin, Dough";
    }

    @Override
    public double getCast()
    {
	return 10.0;
    }

}
