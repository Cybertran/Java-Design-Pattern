package decorator;

public abstract class ToppingDecorator implements Pizza
{
    protected Pizza tempPizaa;

    public ToppingDecorator(Pizza newPizza)
    {
	tempPizaa = newPizza;

    }

    public double getCast()
    {
	return tempPizaa.getCast();
    }

    @Override
    public String getDescriptions()
    {
	return tempPizaa.getDescriptions();
    }

}
