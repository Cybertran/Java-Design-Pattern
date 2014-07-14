package decorator;

public class Mazzarella extends ToppingDecorator
{

    public Mazzarella(Pizza newPizza)
    {
	super(newPizza);
	System.out.println("Adding Dough");

	System.out.println("Adding Mazzarella");
    }

    @Override
    public String getDescriptions()
    {
	return tempPizaa.getDescriptions() + " , Mazzarella";
    }

    @Override
    public double getCast()
    {
	return tempPizaa.getCast() + 24;
    }

}
