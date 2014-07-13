package strategyPattern;

public class Bird extends Animal {
	
	public Bird(){
		flyType = new CanFly();
	}

}
