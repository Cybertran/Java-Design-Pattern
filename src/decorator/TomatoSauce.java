package decorator;

public class TomatoSauce extends ToppingDecorator
{

    public TomatoSauce(Pizza newPizza)
    {
	super(newPizza);
	System.out.println("Adding tomatoSauce");
    }

    @Override
    public String getDescriptions()
    {
	return tempPizaa.getDescriptions() + " , TomatoSauce";
    }

    @Override
    public double getCast()
    {
	return tempPizaa.getCast() + .40;
    }

}
