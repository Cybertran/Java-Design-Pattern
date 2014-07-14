package prototype;

public class TestCloning
{

    public static void main(String[] args)
    {
	CloneFactory animalMaker = new CloneFactory();
	Sheep shelly = new Sheep();
	Sheep cloned = (Sheep) animalMaker.getClone(shelly);
	System.out.println(shelly);

	System.out.println(cloned);
	System.out.println("shelly hashcode " + System.identityHashCode(shelly));
	System.out.println("clone hashcode " + System.identityHashCode(cloned));
    }

}
