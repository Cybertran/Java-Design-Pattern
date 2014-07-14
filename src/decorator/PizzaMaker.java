package decorator;

public class PizzaMaker
{

    public static void main(String[] args)
    {

	Pizza basic = new TomatoSauce(new Mazzarella(new PlainPizza()));

	System.out.println("Ingredient " + basic.getDescriptions());
	System.out.println("Price " + basic.getCast());

    }

}
