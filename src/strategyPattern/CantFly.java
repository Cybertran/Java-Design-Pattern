package strategyPattern;

public class CantFly implements Flys{

	@Override
	public String fly() {
		return "can't fly";
	}

}
